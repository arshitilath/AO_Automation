package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ProductFilteredPage {
	
	public WebDriver driver;

	public ProductFilteredPage(WebDriver driver) {
				
		this.driver=driver;		
	}
	
	public WebElement getBrand()
	{		
		WebDriverWait pleaseWait = new WebDriverWait(driver,10);		
		pleaseWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class ='text-display mb-5']")));
		
		return driver.findElement(By.xpath("//h1[@class ='text-display mb-5']"));
	}
	
	public WebElement selectColour()
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[@id ='Colour-facet_fv_black-Black']/following-sibling::div[1]"))).build().perform();
		return driver.findElement(By.xpath("//input[@id ='Colour-facet_fv_black-Black']/following-sibling::div[1]"));
	}
	
	public List<WebElement> verifySelection() throws InterruptedException 
	{
		Thread.sleep(1000L);
		return driver.findElements(By.xpath("//div[@data-testid='product-card-list-view']//h2"));					

	}	
	
}
