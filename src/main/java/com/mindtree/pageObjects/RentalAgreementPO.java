package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.RentalAgreementUI;


public class RentalAgreementPO {
	
	public WebDriver driver;

	public RentalAgreementPO(WebDriver driver) {

		this.driver = driver;
	}
	public WebElement getMenu() {
		return driver.findElement(RentalAgreementUI.Menu);
	 

	}
	public WebElement getRA() {
		List<WebElement> list = driver.findElements(RentalAgreementUI.Rental);
		return list.get(0);
	}
	public WebElement getCity(){
		return driver.findElement(RentalAgreementUI.City);
	}
	public WebElement getText(){
		return driver.findElement(RentalAgreementUI.Text);
	}
	public WebElement getPop(){
		return driver.findElement(RentalAgreementUI.popup);
	}

}
