package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author Arshi Tilath
 * This class is a base class for initialising the webDriver
 */

public class base {
	
	  public WebDriver driver;
	
	  public WebDriver initializeDriver()
	  {

		  System.setProperty("webdriver.chrome.driver", "C:\\AO_Automation-master\\AO_Automation\\chromedriver.exe");
		  driver= new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);			

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  return driver;

	  }

}
