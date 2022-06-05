package com.mindtree.appUIStrore;

import org.openqa.selenium.By;

public class BuyingPropertyUI {
	
	public static By City = By.xpath("//*[@class = 'heading-5']");
	public static By CityName = By.xpath("//*[@class='css-dvua67-singleValue nb-select__single-value']");
	public static By locality =By.id("listPageSearchLocality");
	public static By SearchButton = By.xpath("//*[@class='prop-search-button btn btn-primary btn-lg']");
	public static By PopUp = By.xpath("//*[@class='leave-intent-close-icon']");
	public static By Buy = By.xpath("//*[@id='app']/div/div/div[1]/div[3]/div[1]");
}
