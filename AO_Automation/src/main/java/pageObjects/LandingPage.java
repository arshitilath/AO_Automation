package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Arshi Tilath
 * This is Landing Page - the first page the user lands on after launching ao.com on a browser
 */

public class LandingPage {
	
	public WebDriver driver;
	
	/* Constructor to pass the driver information*/
	public LandingPage(WebDriver driver) {		
		
		this.driver=driver;		
	}
	
	/*This method is to find the search box web element on the landing page to input Washing Machine as text*/
	public WebElement getSearchBox()
	{
		 return driver.findElement(By.xpath("//input[@id = 'siteSearch-input']"));
	
	}

	/*This method is to find the search icon web element on the landing page to perform the search action*/
	public WebElement getSubmitButton()
	{
		return driver.findElement(By.cssSelector("button[data-tag-name='submit search']"));
	}
}
