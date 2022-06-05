package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIStrore.PaintingPageUI;


public class PaintingPagePO {
	
	public WebDriver driver;

	public PaintingPagePO(WebDriver driver) {

		this.driver = driver;
	}
	public WebElement getMenu() {
		return driver.findElement(PaintingPageUI.Menu);

	}
	public WebElement getPainting() {
		List<WebElement> list = driver.findElements(PaintingPageUI.Painting);
		return list.get(1);

	}
	public WebElement getCity() {
		return driver.findElement(PaintingPageUI.City);

	}
	public WebElement getCleaning() {
		return driver.findElement(PaintingPageUI.cleaning);

	}
	public WebElement getTitle() {
		return driver.findElement(PaintingPageUI.title);

	}

}
