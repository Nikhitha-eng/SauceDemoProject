package com.cts.saucedemopages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckOutOverView {
	private static By clickOnFinishLoc =By.linkText("FINISH");

	public static String checkingOverViewpage(WebDriver driver)
	{
	String overViewText= driver.findElement(By.xpath("//div[text()='Checkout: Overview']")).getText();
	return overViewText;
	}
	public static void clickingOnFinish(WebDriver driver)
	{
		driver.findElement(clickOnFinishLoc).click();
	}

}
