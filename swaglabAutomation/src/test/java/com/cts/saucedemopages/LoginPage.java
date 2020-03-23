package com.cts.saucedemopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private static By userNameLoc =	By.id("user-name");
    private static By passwordLoc  = By.id("password");
    private static By clickOnLoginLoc =   By.xpath("//input[@value='LOGIN']");
    private static By errorLoc =By.xpath("//h3[@data-test='error']");
  

	public static void enterUserName(WebDriver driver,String userName)
	{
		 driver.findElement(userNameLoc).sendKeys(userName);	
	}
	
	public static void enterPassword(WebDriver driver,String password)
	{
		driver.findElement(passwordLoc).sendKeys(password);
	}
	public static void clickOnLogin(WebDriver driver)
	{
		driver.findElement(clickOnLoginLoc).click();
	}
	
	public static String errorMessage(WebDriver driver)
	{
		String errorMSg =driver.findElement(errorLoc).getText();
		return errorMSg;
	}
	
	
}
