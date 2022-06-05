package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.AvoidBrokerUI;

public class AvoidBrokerPO {
	public WebDriver driver;

	public AvoidBrokerPO(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getBroker() {
//		List<WebElement> List = driver.findElements(AvoidBrokerUI.broker);
//		return List.get(0);
		return driver.findElement(AvoidBrokerUI.broker);
		
	}

	public WebElement getTitle() {
		return driver.findElement(AvoidBrokerUI.title);
	}

	public WebElement getMenu() {
		return driver.findElement(AvoidBrokerUI.menu);
	}
}