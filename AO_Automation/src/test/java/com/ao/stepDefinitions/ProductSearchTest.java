package com.ao.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import pageObjects.LandingPage;
import pageObjects.ProductFilteredPage;
import pageObjects.ProductPage;
import resources.base;

/**
 * @author Arshi Tilath
 * This class is a stepDefiniton for executing the scenarios under AO automation feature 
 */

public class ProductSearchTest extends base {
	WebDriver driver;
	String brandSelected;
	String colourSelected;
	
	
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
	   
		ProductPage products = new ProductPage(driver);
		Assert.assertEquals(products.getTitle().getText(), "Washing Machines");	    
	}
	
	/*In the below step - the Brand Name is passed as a parameter from the feature file and compared against the list of available brand options on the webPage,
	  on finding a match the click operation is performed to select the brand */
	
	@When("User clicks on a {string} brand under the shop for top brands list")
	public void user_clicks_on_a_brand_under_the_shop_for_top_brands_list(String brand) {
		ProductPage products = new ProductPage(driver);		
		products.selectBrand();		
		brandSelected = brand;
		
		for(int i =0; i< products.selectBrand().size();i++) {
			String brandsAvailable = products.selectBrand().get(i).getText();
			if(brandsAvailable.contains(brand)) {
				products.selectBrand().get(i).click();
			}
		}	    
	}

	@Then("Verify if the user is navigated to the lister page of selected brand")
	public void verify_if_the_user_is_navigated_to_the_lister_page_of_that_brand() {		
		
		ProductFilteredPage brandPage = new ProductFilteredPage(driver);
		Assert.assertEquals(brandPage.verifyBrand().getText(), brandSelected+ " Washing Machines");			
	}
	
	/*In the below step - the Colour is passed as a parameter from the feature file and compared against the list of available Colour options on the webPage,
	  on finding a match the click operation is performed to select the colour*/

	@When("User uses filter navigation on the left to filter products by {string} colour feature")
	public void user_uses_filter_navigation_on_the_left_to_filter_products_by_a_feature(String colour) throws Throwable {
		ProductFilteredPage brandPage = new ProductFilteredPage(driver);
		
		colourSelected = colour;
		brandPage.selectColour();
		for(int i =0; i< brandPage.selectColour().size();i++) {
			String coloursAvailable = brandPage.selectColour().get(i).getAttribute("for");

			if(coloursAvailable.contains(colourSelected)) {
				Actions action = new Actions(driver);				
				action.moveToElement(driver.findElement(By.xpath("//div[@data-facet-name='Colour']//fieldset//label"))).build().perform();
				brandPage.selectColour().get(i).click();	  
			}
		}		   
	}

	/*The below step is looping through the filtered list of product titles/names to verify if they matched the colour selected*/
	@Then("Verify the results are successfully filtered based on selected colour")
	public void verify_the_results_are_successfully_filtered_based_on_colour() throws Throwable {
		ProductFilteredPage brandPage = new ProductFilteredPage(driver);	

		int listSize = brandPage.verifySelection().size();
		for(int i=0; i < listSize; i++) {					
			Assert.assertTrue(brandPage.verifySelection().get(i).getText().contains("- "+colourSelected+" -"));
		}
		
		System.out.println("Search successful for "+brandSelected+ " washing machine with "+colourSelected+ " colour");
	}
	
	@Then("Close browsers")
	public void close_browsers() throws Throwable { 	    
	    
	    driver.quit();
	}

}
