package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	  public WebDriver driver;
	
	  public WebDriver initializeDriver()
	  {

		  System.setProperty("webdriver.chrome.driver", "C:\\software\\Drivers\\chromedriver.exe");
		  driver= new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);			

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  return driver;

	  }

}
