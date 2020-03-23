package com.cts.saucedemopages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCart {

	private static By yourCartLoc =By.xpath("//div[@class='cart_quantity']");
	private static By continueLoc=By.xpath("//a[text()='Continue Shopping']");
	private static By checkOutLoc=By.linkText("CHECKOUT");
	
	public static String productsInCart(WebDriver driver) {
		String prosNumber = driver.findElement(yourCartLoc).getText();
		int productsNumber = Integer.parseInt(prosNumber);
		if(productsNumber > 0) {
			return "true";
		}
		else {
			return "false";
		}
	}
	public static void continueShopping(WebDriver driver)
	{
		driver.findElement(continueLoc).click();
	}
	public static void checkOut(WebDriver driver)
	{
		driver.findElement(checkOutLoc).click();
	}
}