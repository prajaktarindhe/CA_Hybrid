package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.CommercialPropertyUI;


public class CommercialPropertyPO {
	
	public WebDriver driver;

	public CommercialPropertyPO(WebDriver driver) {

		this.driver = driver;
	}
	
	
	public WebElement getCommercial() {
		  
		return driver.findElement(CommercialPropertyUI.Commercial);

	}
	public WebElement getCity() {
		return driver.findElement(CommercialPropertyUI.City);

	}
	
	public WebElement getCityName() {
		return driver.findElement(CommercialPropertyUI.CityName);

	}
	
	public WebElement getLocality() {
		return driver.findElement(CommercialPropertyUI.locality);

	}
	public WebElement getSearch() {
		return driver.findElement(CommercialPropertyUI.SearchButton);

	}
	public WebElement getPopUp() {
		return driver.findElement(CommercialPropertyUI.PopUp);

	}

}
