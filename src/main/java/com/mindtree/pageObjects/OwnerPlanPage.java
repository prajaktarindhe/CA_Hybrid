package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.appUIStrore.OwnerPageUI;
import com.mindtree.appUIStrore.CareersPageUI;

public class OwnerPlanPage {

	public WebDriver driver;

	public OwnerPlanPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getmenu() {
		return driver.findElement(OwnerPageUI.menu);
	}

	public WebElement getownerplan() {
		List<WebElement> List = driver.findElements(OwnerPageUI.ownerplan);
		return List.get(5);
	}

	public WebElement getplantitle() {
		List<WebElement> List = driver.findElements(OwnerPageUI.plantitle);
		return List.get(0);

	}
	
	public WebElement getplanamount() {
		List<WebElement> List = driver.findElements(OwnerPageUI.planamount);
		return List.get(0);

	}
	
	public WebElement getlogo() {
		return driver.findElement(OwnerPageUI.logo);
	}
	


}
