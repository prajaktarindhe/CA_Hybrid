package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.HomePageUI;


public class HomePagePO {
	public WebDriver driver;

	public HomePagePO(WebDriver driver) {

		this.driver = driver;
	}
	public WebElement geHome() {
		return driver.findElement(HomePageUI.Home);

	}
}
