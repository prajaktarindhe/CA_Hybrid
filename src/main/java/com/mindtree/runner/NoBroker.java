package com.mindtree.runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.mindtree.pageObjects.OwnerPlanPage;
import com.mindtree.pageObjects.PaintingPagePO;
import com.mindtree.pageObjects.RentalPropertyPO;
import com.mindtree.pageObjects.AvoidBrokerPO;
import com.mindtree.pageObjects.BuyingPropertyPO;
import com.mindtree.pageObjects.CareersPage;
import com.mindtree.pageObjects.CommercialPropertyPO;
import com.mindtree.pageObjects.CorporateInquiryHomeServicesPage;
import com.mindtree.pageObjects.CorporateInquiryPackersMoversPage;
import com.mindtree.pageObjects.HomePagePO;
import com.mindtree.pageObjects.SellerPlanPage;
import com.mindtree.reusableComponent.WebDriverHelper;
import com.mindtree.utility.ReadPropertyFile;
import com.mindtree.utility.RetreiveExcelData;

public class NoBroker {

	Logger log = LogManager.getLogger(NoBroker.class.getName());

	WebDriver driver = null;
	ReadPropertyFile rp = null;

	@Test(priority = 1)
	public void homePageLanding() throws Exception {

		rp = new ReadPropertyFile();
		driver = WebDriverHelper.initializeDriver();
		log.info("Browser opened successfully");
		driver.get(rp.getUrl());
		driver.manage().window().maximize();
		log.info("url hited");
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void BuyingProperty() throws InterruptedException, IOException {

		BuyingPropertyPO bp = new BuyingPropertyPO(driver);
		bp.getBuy().click();

		Thread.sleep(4000);
		RetreiveExcelData re = new RetreiveExcelData();
		ArrayList<String> loc = RetreiveExcelData.getData("Buy");
		for (int i = 1; i < loc.size(); i++) {
			bp.getLocality().sendKeys(loc.get(i));

		}

		Thread.sleep(4000);
		bp.getLocality().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		bp.getLocality().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		log.info("Locality has been set to White Field");
		bp.getSearch().click();
		log.info("Buying Properties in White Field Banglore are visible");
		Thread.sleep(4000);

	}

	@Test(priority = 3)
	public void RentalProperty() throws InterruptedException, IOException {
		HomePagePO hp = new HomePagePO(driver);
		RentalPropertyPO rp = new RentalPropertyPO(driver);
		hp.geHome().click();
		rp.getRent().click();
		rp.getLocality().sendKeys("MG Road");

		Thread.sleep(4000);
		rp.getLocality().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		rp.getLocality().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		log.info("Locality has been set to WhiteField");
		rp.getSearch().click();

		log.info("Buying Properties in MG Road Banglore are visible");
		Thread.sleep(4000);

	}

	@Test(priority = 4)
	public void CommercialProperty() throws InterruptedException, IOException {
		HomePagePO hp = new HomePagePO(driver);
		hp.geHome().click();
		CommercialPropertyPO cp = new CommercialPropertyPO(driver);
		cp.getCommercial().click();

		RetreiveExcelData re = new RetreiveExcelData();
		ArrayList<String> loc = RetreiveExcelData.getData("Commercial");
		for (int i = 1; i < loc.size(); i++) {
			cp.getLocality().sendKeys(loc.get(i));

		}

		Thread.sleep(3000);
		cp.getLocality().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		cp.getLocality().sendKeys(Keys.ENTER);
		log.info("Locality has been set to Tipu Sultan");
		Thread.sleep(3000);
		cp.getSearch().click();
		log.info("Commercial Properties in Tipu Sultan Banglore are visible");
		Thread.sleep(4000);
	}

	@Test(priority = 5)
	public void Painting_Cleaning() throws InterruptedException {
		HomePagePO hp = new HomePagePO(driver);
		hp.geHome().click();
		PaintingPagePO pp = new PaintingPagePO(driver);
		pp.getMenu().click();
		Thread.sleep(4000);
		pp.getPainting().click();
		Thread.sleep(3000);
		pp.getCity().click();

		pp.getCleaning().click();
		Thread.sleep(3000);
		if (pp.getTitle().getText().contains("Best Home Cleaning")) {
			log.info("Painting and cleaning page is showing");
		}

	}

	@Test(priority = 6)
	public void AvoidBroker() throws InterruptedException {

		HomePagePO hp = new HomePagePO(driver);
		hp.geHome().click();

		Thread.sleep(3000);
		AvoidBrokerPO ab = new AvoidBrokerPO(driver);
		ab.getBroker().click();
		if (ab.getTitle().getText().contains("Benefits of NoBroker.in")) {
			log.info("Avoid Broker Page has been showned up");
		}
	}

	@Test(priority = 7)
	public void Careers_Page() throws IOException, InterruptedException {
		CareersPage CP = new CareersPage(driver);
		CP.getlogo().click();
		Thread.sleep(3000);
		CP.getmenu().click();
		Thread.sleep(3000);
		CP.getcareers().click();
		Thread.sleep(3000);
		log.info("Navigated to Careers Page");
		if (CP.gettitle().getText().contains("Careers at NoBroker"))
			Assert.assertTrue(true);
		Thread.sleep(3000);
		log.info("Verified title of Careers Page");

	}

	@Test(priority = 8)
	public void Seller_Plan_Page() throws IOException, InterruptedException {
		SellerPlanPage SP = new SellerPlanPage(driver);
		SP.getlogo().click();
		SP.getmenu().click();
		Thread.sleep(3000);
		SP.getsellerplan().click();
		Thread.sleep(3000);
		log.info("Navigated to Seller Plan Page");
		if (SP.getplantitle().getText().contains("MoneyBack Plan"))
			Assert.assertTrue(true);
		Thread.sleep(3000);
		log.info("Verified title of plan at Seller Plan Page");

		if (SP.getplanamount().getText().contains("₹16,499"))
			Assert.assertTrue(true);
		Thread.sleep(3000);
		log.info("Verified amount of plan at Seller Plan Page");

	}

	@Test(priority = 9)
	public void Owner_Plan_Page() throws IOException, InterruptedException {
		OwnerPlanPage OP = new OwnerPlanPage(driver);
		OP.getlogo().click();
		Thread.sleep(3000);

		OP.getmenu().click();
		Thread.sleep(3000);
		OP.getownerplan().click();
		Thread.sleep(3000);
		log.info("Navigated to Owner Plan Page");
		if (OP.getplantitle().getText().contains("Relax Plan"))
			Assert.assertTrue(true);
		Thread.sleep(3000);
		log.info("Verified title of plan at Owner Plan Page");

		if (OP.getplanamount().getText().contains("₹2,999"))
			Assert.assertTrue(true);
		Thread.sleep(3000);
		log.info("Verified amount of plan at Owner Plan Page");

	}

	@Test(priority = 10)
	public void CorporateInquiry_Home_Services_Page() throws IOException, InterruptedException {
		CorporateInquiryHomeServicesPage CH = new CorporateInquiryHomeServicesPage(driver);
		CH.getlogo().click();
		Thread.sleep(3000);
		CH.getmenu().click();
		Thread.sleep(3000);
		CH.getcorporate_inquiry().click();
		Thread.sleep(3000);
		log.info("Navigated to Corportae Inquiry Page");
		CH.gethome_service().click();
		Thread.sleep(3000);
		log.info("Clicked on the home services option");
		Thread.sleep(3000);

	}

	@Test(priority = 11)
	public void CorporateInquiry_Packers_Movers_Page() throws IOException, InterruptedException {
		CorporateInquiryPackersMoversPage CP = new CorporateInquiryPackersMoversPage(driver);
		CP.getpackers_movers().click();
		Thread.sleep(3000);
		log.info("Clicked on the Packers and movers option");
		if (CP.gettitle().getText().contains("Packers & Movers"))
			Assert.assertTrue(true);
		Thread.sleep(3000);
		log.info("Verified title at Packers and Movers Page");

	}

	@AfterTest
	public void closeDriver() {
		driver.close();
		driver = null;
	}

}
