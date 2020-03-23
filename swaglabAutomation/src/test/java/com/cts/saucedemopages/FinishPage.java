package com.cts.saucedemopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {
	public static String checkingFinishText(WebDriver driver)
	{
		String finishText =driver.findElement(By.xpath("//div[text()='Finish']")).getText();
		return finishText;
	}
	public static String successfulOrderMsg(WebDriver driver)
	{
		String successText =driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']")).getText();
		return successText;
	}

}
