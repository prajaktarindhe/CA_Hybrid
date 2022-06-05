package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.CareersPageUI;
import com.mindtree.appUIStrore.SellerPlanPageUI;

public class SellerPlanPage {

	public WebDriver driver;

	public SellerPlanPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getmenu() {
		return driver.findElement(SellerPlanPageUI.menu);
	}

	public WebElement getsellerplan() {
		List<WebElement> List = driver.findElements(SellerPlanPageUI.sellerplan);
		return List.get(7);
	}

	public WebElement getplantitle() {
		List<WebElement> List = driver.findElements(SellerPlanPageUI.plantitle);
		return List.get(0);
	}

	public WebElement getplanamount() {
		List<WebElement> List = driver.findElements(SellerPlanPageUI.planamount);
		return List.get(0);
	}

	public WebElement getlogo() {
		return driver.findElement(SellerPlanPageUI.logo);
	}
}
