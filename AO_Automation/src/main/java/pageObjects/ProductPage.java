package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Arshi Tilath
 * This is ProductPage - the user is on this page after searching for "washing machine"
 */
public class ProductPage {
	
	public WebDriver driver;

	//Constructor
	public ProductPage(WebDriver driver) {
		
		this.driver=driver;		
	}
	
	/*The below method gets the heading title of the page which is used to verify the user has navigated to the WashingMachines result page*/
	public WebElement getTitle()
	{
		
		return driver.findElement(By.xpath("//h1[@class = 'main-title text-display-lg']"));
	}
	
	/*The below method captures the list of brands available on the web page under the Shop for top brands panel*/
	public List<WebElement> selectBrand()
	{
		
		return driver.findElements(By.xpath("//ul[@id ='brands']//a"));
	}

}
