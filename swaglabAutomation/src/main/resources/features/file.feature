Feature: SauceDemoPage 
	In order to order a product in Saucedemo page
    As a e-commerce vendor
    I want to get access to the portal
  
  Background:
  Given I have a browser with sauceDemoPage 
	When I enter userName as 'standard_user' and I enter password as  'secret_sauce' 
	
Scenario: Login with ValidCredentials 
	
	Then I should access to the portal 
	
		Scenario: Adding products to cart 
#	Given I have a browser with sauceDemoPage and open products page 
	When I click on add to cart button 
	Then products should be added to the cart 
	
Scenario: Displaying ordered products 
#	Given I have a browser with sauceDemoPage and open products page 
	When I click on cart symbol 
	Then ordered products should be displayed with product details 
	
Scenario: clicking on continue shopping 
#	Given 	I have a browser with sauceDemoPage and open products page 
	When  I click on continue shopping  button 
	Then products page should be displayed 
	
Scenario: clicking on CheckOut 
#	Given 	I have a browser with sauceDemoPage and open products page 
	When  I click on CheckOut button 
	Then information  page should be displayed 
	
Scenario: Entering your Information 
#	Given 	I have a browser with sauceDemoPage and open products page 
	When  I enter firstName as 'nimmi' and lastname as 'jimmi' and zipCode as '522612' 
	Then overView  page should be displayed 
	