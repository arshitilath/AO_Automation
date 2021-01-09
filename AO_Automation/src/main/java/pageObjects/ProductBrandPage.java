package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductBrandPage {
	
	public WebDriver driver;

	public ProductBrandPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;		
	}
	
	public WebElement getTitle()
	{
		
		return driver.findElement(By.xpath("//h1[@class = 'main-title text-display-lg']"));
	}
	
	public List<WebElement> selectBrand()
	{
		
		return driver.findElements(By.xpath("//ul[@id ='brands']//a"));
	}

}
