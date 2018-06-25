package automationFramework;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviders {
	
    //private static WebDriver driver;
	@DataProvider(name = "Authentication")
  
	
	public static Object[][] credentials() {
		 
	return new Object[][] { { "testuser_1", "Test@123" }, 
		{ "testuser_2", "Test@123" }};
 
  }
	
	@Test(dataProvider = "Authentication")
  public void f(String sUsername, String sPassword) throws InterruptedException {
		
		  //driver = new FirefoxDriver();
		//Init, getting the page
		String exePath = "C:\\Users\\Juan\\Desktop\\Programs\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		  
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://www.store.demoqa.com");
	 
	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	      driver.findElement(By.id("log")).sendKeys(sUsername);
	 
	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
	      driver.findElement(By.id("login")).click();
	 
	      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

	      driver.close();
  }
}
