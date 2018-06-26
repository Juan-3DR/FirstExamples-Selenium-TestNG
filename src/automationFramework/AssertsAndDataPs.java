package automationFramework;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class AssertsAndDataPs {
	
	@DataProvider(name = "Authentication")
  	public static Object[][] credentials() {
	return new Object[][] { { "test@user1.com", "Test@123" }, 
		{ "test@user2.com", "Test@123" }};
  }
	
	
  @Test(dataProvider = "Authentication")
  public void f(String sUsername, String sPassword) throws InterruptedException {
	  
	  
		//Init, getting the page
		String exePath = "C:\\Users\\Juan\\Desktop\\Programs\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		  
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("https://sitescan-legacy-staging.3dr.com/auth");
	 
	      
	    //Input the data
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/"
	      		+ "div[2]/input")).sendKeys(sUsername);
	 
	      
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/"
		      		+ "div[3]/input")).sendKeys(sPassword);
	 
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/button")).click();
	      //---------------------------End of input the data
	      
	      	//Finding the banner
		    WebElement banner = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/"
		    		+ "form/div[2]/div"));

		    //Is there?
		    Assert.assertTrue(banner.isDisplayed());
		    
		    //Getting the color of the banner
		    String headerColor = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/"
		    		+ "form/div[2]/div")).getCssValue("color");
		    //Converting the color to hex
		    String hex = Color.fromString(headerColor).asHex();
		    
		    //Expected color
		    String bannerColor = "#cd0930";
		    
		    //Assert the color of the banner
		    Assert.assertEquals(hex, bannerColor,"Error<--------");
		    
		    //Expected text
		    String btext = "Incorrect username or password";
		    
			//Getting the text of the banner
		    String bannerText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div"
		    		+ "/form/div[2]/div")).getText();
		    
		    //Assert the text of the banner
		    Assert.assertEquals(btext, bannerText,"Error<--------");
		    
		    //Thread.sleep(2000);
			driver.quit();
	  
  }
}
