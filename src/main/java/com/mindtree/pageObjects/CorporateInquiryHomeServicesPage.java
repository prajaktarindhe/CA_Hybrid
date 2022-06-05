package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.CareersPageUI;
import com.mindtree.appUIStrore.CorporateInquiryHomeServicesPageUI;
import com.mindtree.appUIStrore.SellerPlanPageUI;

public class CorporateInquiryHomeServicesPage {
	public WebDriver driver;

	public CorporateInquiryHomeServicesPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getmenu() {
		return driver.findElement(CorporateInquiryHomeServicesPageUI.menu);
	}

	public WebElement getcorporate_inquiry() {
		List<WebElement> List = driver.findElements(CorporateInquiryHomeServicesPageUI.corporateinquiry);
		return List.get(9);
	}

	public WebElement gethome_service() {
		return driver.findElement(CorporateInquiryHomeServicesPageUI.homeservice);

	}
	
	public WebElement getlogo() {
		return driver.findElement(CorporateInquiryHomeServicesPageUI.logo);
	}

	

}
