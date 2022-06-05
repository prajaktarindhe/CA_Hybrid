package com.mindtree.pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.appUIStrore.CareersPageUI;

public class CareersPage {

	public WebDriver driver;

	public CareersPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getmenu() {
		return driver.findElement(CareersPageUI.menu);
	}

	public WebElement getcareers() {
		List<WebElement> List = driver.findElements(CareersPageUI.careers);
		return List.get(8);
	}

	public WebElement gettitle() {
		List<WebElement> List = driver.findElements(CareersPageUI.title);
		return List.get(0);
	}
	
	public WebElement getlogo() {
		return driver.findElement(CareersPageUI.logo);
	}

}
