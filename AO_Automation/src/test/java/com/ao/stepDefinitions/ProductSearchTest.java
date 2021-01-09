package com.ao.stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import pageObjects.LandingPage;
import pageObjects.ProductFilteredPage;
import pageObjects.ProductBrandPage;
import resources.base;

public class ProductSearchTest extends base {
	WebDriver driver;
	String brandSelected;
	
	@Given("User navigates to AO.COM Site")
	public void initialize_the_browser_with_chrome() throws Throwable {
		 driver =initializeDriver();
		 driver.get("https://ao.com/");		
	}

	@When("User enters washing machine in search products edit box and clicks on search icon")
	public void user_enters_washing_machine_in_search_products_edit_box_and_clicks_on_search_icon() throws InterruptedException {
		
		LandingPage landPage = new LandingPage(driver);
		landPage.getSearchBox().sendKeys("Washing Machine");
		landPage.getSubmitButton().click();
	}

	@Then("Verify that user is on washing machines results page")
	public void verify_that_user_is_returned_with_results_of_washing_machines() {
	   
		ProductBrandPage products = new ProductBrandPage(driver);
		Assert.assertEquals(products.getTitle().getText(), "Washing Machines");	    
	}
	
	@When("User clicks on a brand under shop for top brands")
	public void user_clicks_on_a_brand_under_shop_for_top_brands() {
		ProductBrandPage products = new ProductBrandPage(driver);		
		
		brandSelected = products.selectBrand().get(1).getText();
		products.selectBrand().get(1).click();
		
	}

	@Then("Verify if the user is navigated to the lister page of that brand")
	public void verify_if_the_user_is_navigated_to_the_lister_page_of_that_brand() {		
		
		ProductFilteredPage brandPage = new ProductFilteredPage(driver);
		Assert.assertEquals(brandPage.getBrand().getText(), brandSelected+ " Washing Machines");			
	}

	@When("User uses filter navigation on the left to filter products by a feature")
	public void user_uses_filter_navigation_on_the_left_to_filter_products_by_a_feature() throws Throwable {
		ProductFilteredPage brandPage = new ProductFilteredPage(driver);
		brandPage.selectColour().click();	    
	}

	@Then("Verify the results are successfully filtered based on users selection criteria")
	public void verify_the_results_are_successfully_filtered_based_on_users_selection_criteria() throws Throwable {
		ProductFilteredPage brandPage = new ProductFilteredPage(driver);	

		int listSize = brandPage.verifySelection().size();
		for(int i=0; i < listSize; i++) {			

			Assert.assertTrue(brandPage.verifySelection().get(i).getText().contains(" Black "));
		}		
		
	}
	
	@Then("Close browsers")
	public void close_browsers() throws Throwable { 	    
	    
	    driver.quit();
	}

}
