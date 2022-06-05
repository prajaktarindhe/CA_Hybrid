package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.BuyingPropertyUI;


public class BuyingPropertyPO {
	public WebDriver driver;

	public BuyingPropertyPO(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getCity() {
		return driver.findElement(BuyingPropertyUI.City);

	}
	
	public WebElement getCityName() {
		return driver.findElement(BuyingPropertyUI.CityName);

	}
	
	public WebElement getLocality() {
		return driver.findElement(BuyingPropertyUI.locality);

	}
	public WebElement getSearch() {
		return driver.findElement(BuyingPropertyUI.SearchButton);

	}
	public WebElement getPopUp() {
		return driver.findElement(BuyingPropertyUI.PopUp);

	}
	public WebElement getBuy() {
		return driver.findElement(BuyingPropertyUI.Buy);
	}
	
}
