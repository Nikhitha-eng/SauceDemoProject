package com.cts.saucedemopages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutInfoPage {
	private static By firstnameLoc=By.id("first-name");
	private static By lastnameLoc=By.id("last-name");
	private static By zipCodeLoc=By.id("postal-code");
	private static By continueLoc=By.xpath("//input[@type='submit']");
	private static By cancelLoc=By.linkText("CANCEL");

	public static void enteringFirstName(WebDriver driver,String firstName) {
		driver.findElement(firstnameLoc).sendKeys(firstName);
	}
	public static void enteringLastName(WebDriver driver,String lastname) {
		driver.findElement(lastnameLoc).sendKeys(lastname);
	}
	public static void enteringZipCode(WebDriver driver,String zipCode) {
		driver.findElement(zipCodeLoc).sendKeys(zipCode);
	}
	public static void clickOnContinue(WebDriver driver) {
		driver.findElement(continueLoc).click();
	}
	public static void clickOnCancel(WebDriver driver) {
		driver.findElement(cancelLoc).click();
	}
	public static String checkingInfoPage(WebDriver driver)
	{
		String infoText = driver.findElement(By.xpath("//div[text()='Checkout: Your Information']")).getText();
		return infoText;
	}
}
