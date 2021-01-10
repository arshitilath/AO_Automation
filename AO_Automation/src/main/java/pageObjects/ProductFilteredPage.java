package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Arshi Tilath
 * This is ProductFilterPage - The user is on this page after selecting the brand and then colour filter is applied
 * The results displayed on this page are based on the brand and colour selected
 */


public class ProductFilteredPage {
	
	public WebDriver driver;
	
	//Constructor for passing driver information
	public ProductFilteredPage(WebDriver driver) {				
		this.driver=driver;		
	}
	
	/*The below method is to verify the user is navigated to the selected brand results page */
	public WebElement verifyBrand()
	{		
		WebDriverWait pleaseWait = new WebDriverWait(driver,10);		
		pleaseWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class ='text-display mb-5']")));
		
		return driver.findElement(By.xpath("//h1[@class ='text-display mb-5']"));
	}	
	
	/*The below method returns the list of colour options available on the web page in the filter navigation on the left*/
	public List<WebElement> selectColour()
	{
		Actions action = new Actions(driver);		
		action.moveToElement(driver.findElement(By.xpath("//div[@data-facet-name='Colour']//fieldset//label"))).build().perform();		
		return driver.findElements(By.xpath("//div[@data-facet-name='Colour']//fieldset//label"));
	}
	
	/*The below method returns the filtered list of washing machine titles/names, and used to verify if it matches the colour selected*/
	public List<WebElement> verifySelection() throws InterruptedException 
	{
		Thread.sleep(1000L);
		return driver.findElements(By.xpath("//div[@data-testid='product-card-list-view']//h2"));					

	}	
	
}
