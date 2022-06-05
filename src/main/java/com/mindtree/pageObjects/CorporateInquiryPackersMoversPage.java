package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.CareersPageUI;
import com.mindtree.appUIStrore.CorporateInquiryHomeServicesPageUI;
import com.mindtree.appUIStrore.CorporateInquiryPackersMoversPageUI;

public class CorporateInquiryPackersMoversPage {
	public WebDriver driver;

	public CorporateInquiryPackersMoversPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getmenu() {
		return driver.findElement(CorporateInquiryPackersMoversPageUI.menu);
	}

	public WebElement getcorporate_inquiry() {
		List<WebElement> List = driver.findElements(CorporateInquiryPackersMoversPageUI.corporateinquiry);
		return List.get(9);
	}

	public WebElement getpackers_movers() {
		return driver.findElement(CorporateInquiryPackersMoversPageUI.packersmovers);

	}
	
	public WebElement gettitle() {
		List<WebElement> List = driver.findElements(CorporateInquiryPackersMoversPageUI.title);
		return List.get(0);
	}

	public WebElement getlogo() {
		return driver.findElement(CorporateInquiryPackersMoversPageUI.logo);
	}
}
