package com.cts.saucedemopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
    private static By clickOnAboutLoc =	By.linkText("About");
   
	public static void clickOnAbout(WebDriver driver)
	{
		driver.findElement(clickOnAboutLoc).click();
	}


	public static String getTitle(WebDriver driver)
	{
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	
	
}
