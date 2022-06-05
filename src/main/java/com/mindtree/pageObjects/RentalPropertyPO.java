package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.RentalPropertyUI;



public class RentalPropertyPO {
	public WebDriver driver;

	public RentalPropertyPO(WebDriver driver) {

		this.driver = driver;
	}
	public WebElement getRent() {
		
		return driver.findElement(RentalPropertyUI.Rent);

	}
	public WebElement getLocality() {
		return driver.findElement(RentalPropertyUI.locality);

	}

	public WebElement getSearch() {
		return driver.findElement(RentalPropertyUI.SearchButton);

	}
	public WebElement getPopUp() {
		return driver.findElement(RentalPropertyUI.PopUp);

	}

}
