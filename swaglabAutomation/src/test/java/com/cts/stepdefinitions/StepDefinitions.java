package com.cts.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.saucedemopages.CheckOutInfoPage;
import com.cts.saucedemopages.CheckOutOverView;
import com.cts.saucedemopages.FinishPage;
import com.cts.saucedemopages.LoginPage;
import com.cts.saucedemopages.MenuPage;
import com.cts.saucedemopages.ProductsPage;
import com.cts.saucedemopages.YourCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	public WebDriver driver;

	@Given("I have a browser with sauceDemoPage")
	public void i_have_a_browser_with_sauceDemoPage() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
	}

	@When("I enter userName as {string} and I enter password as  {string}")
	public void i_enter_userName_as_and_I_enter_password_as11(String userName, String password) {
		LoginPage.enterUserName(driver, "standard_user");
		LoginPage.enterPassword(driver, "secret_sauce");
		LoginPage.clickOnLogin(driver);
	}

	@Then("I should access to the portal")
	public void i_should_access_to_the_portal() {

		String actualTitle = MenuPage.getTitle(driver);
		Assert.assertEquals("Swag Labs", actualTitle);

	}

	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
		ProductsPage.clickOnAddToCart(driver);
	}

	@Then("products should be added to the cart")
	public void products_should_be_added_to_the_cart() {
		String cartNum = ProductsPage.productsInCart(driver);
		Assert.assertEquals("true", cartNum);
	}

	@When("I click on cart symbol")
	public void i_click_on_cart_symbol() {
		ProductsPage.clickOnAddToCart(driver);
		ProductsPage.clickOnCartSymbol(driver);
	}

	@Then("ordered products should be displayed with product details")
	public void ordered_products_should_be_displayed_with_product_details() {
		String numberProducts = YourCart.productsInCart(driver);
		Assert.assertEquals("true", numberProducts);
	}

	@When("I click on continue shopping  button")
	public void i_click_on_continue_shopping_button() throws InterruptedException {
		ProductsPage.clickOnAddToCart(driver);
		ProductsPage.clickOnCartSymbol(driver);
		Thread.sleep(5000);
		YourCart.continueShopping(driver);
	}

	@Then("products page should be displayed")
	public void products_page_should_be_displayed() {
		String pageText = ProductsPage.gettingTitleOfPage(driver);
		Assert.assertEquals("Products", pageText);
	}

	@When("I click on CheckOut button")
	public void i_click_on_CheckOut_button() {
		ProductsPage.clickOnAddToCart(driver);
		ProductsPage.clickOnCartSymbol(driver);
		YourCart.checkOut(driver);
	}

	@Then("information  page should be displayed")
	public void information_page_should_be_displayed() {
		String infoPageText = CheckOutInfoPage.checkingInfoPage(driver);
		Assert.assertEquals("Checkout: Your Information", infoPageText);
	}

	@When("I enter firstName as {string} and lastname as {string} and zipCode as {string}")
	public void i_enter_firstName_as_and_lastname_as_and_zipCode_as(String firstName, String lastname, String zipCode) {
		ProductsPage.clickOnAddToCart(driver);
		ProductsPage.clickOnCartSymbol(driver);
		YourCart.checkOut(driver);
		CheckOutInfoPage.enteringFirstName(driver, firstName);
		CheckOutInfoPage.enteringLastName(driver, lastname);
		CheckOutInfoPage.enteringZipCode(driver, zipCode);
		CheckOutInfoPage.clickOnContinue(driver);
	}

	@Then("overView  page should be displayed")
	public void overview_page_should_be_displayed() {
		String overText = CheckOutOverView.checkingOverViewpage(driver);
		Assert.assertEquals("Checkout: Overview", overText);
	}
	
//	@When("I enter firstName as {string} and lastname as {string} and zipCode as {string}  and click on continue and then finish")
//	public void i_enter_firstName_as_and_lastname_as_and_zipCode_as_and_click_on_continue_and_then_finish(String firstName, String lastname, String zipCode) {
//		ProductsPage.clickOnAddToCart(driver);
//		ProductsPage.clickOnCartSymbol(driver);
//		YourCart.checkOut(driver);
//		CheckOutInfoPage.enteringFirstName(driver, firstName);
//		CheckOutInfoPage.enteringLastName(driver, lastname);
//		CheckOutInfoPage.enteringZipCode(driver, zipCode);
//		CheckOutInfoPage.clickOnContinue(driver);
//		CheckOutOverView.clickingOnFinish(driver);
//	}
//
//
//	@Then("finish page should be opened")
//	public void finish_page_should_be_opened() {
//		String finish = FinishPage.checkingFinishText(driver);
//	  Assert.assertEquals("Finish", finish);
//	}

//	@Then("thank you for order message should be displayed")
//	public void thank_you_for_order_message_should_be_displayed() {
//	  FinishPage.successfulOrderMsg(driver);
//	}

}
