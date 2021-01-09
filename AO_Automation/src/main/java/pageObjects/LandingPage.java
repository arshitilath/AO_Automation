package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	public WebElement getSearchBox()
	{
		 return driver.findElement(By.xpath("//input[@id = 'siteSearch-input']"));
	
	}

	public WebElement getSubmitButton()
	{
		return driver.findElement(By.cssSelector("button[data-tag-name='submit search']"));
	}
}
