package com.cts.saucedemopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage {

	
	private static By addToCartLoc =By.xpath("(//button[@class='btn_primary btn_inventory'])[1]");
	private static By cartLoc =	By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']");
	private static By menuLoc = By.xpath("//button[text()='Open Menu']");
	private static By productTextLoc=By.xpath("//div[text()='Products']");

	
	
    public static void clickOnAddToCart(WebDriver driver)
    {
    	driver.findElement(addToCartLoc).click();
    }
   
	public static String productsInCart(WebDriver driver) {
		String number = driver.findElement(cartLoc).getText();
		if(number.equalsIgnoreCase("1")) {
			String cartT = "true";
	    	 return cartT; 
		}
		else {
			 String cartF = "false";
	    	 return cartF;
		}
	}
	public static void clickOnCartSymbol(WebDriver driver)
    {
    	driver.findElement(cartLoc).click();
    	
    }
	public static String gettingTitleOfPage(WebDriver driver)
	{
		String headerText =driver.findElement(productTextLoc).getText();
		return headerText;	
	}
	public static void clickOnMenuButton(WebDriver driver)
	{
		driver.findElement(menuLoc).click();
		
	}
}
