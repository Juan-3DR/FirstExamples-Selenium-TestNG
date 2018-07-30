package automationFramework;

//import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color; //Supports colors in hex

import org.testng.Assert;

import org.testng.annotations.Test;

public class Asserts {

//	private static WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		/*
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");

		// Here driver will try to find out My Account link on the application

		WebElement searchBar = driver.findElement(By.xpath("/html/body/div[2]/div/div/header/"
			+ "nav/form/fieldset/input[1]"));

		// Test will only continue, if the below statement is true

		// This is to check whether the link is displayed or not

		Assert.assertTrue(searchBar.isDisplayed());

		// My Account will be clicked only if the above condition is true

		searchBar.click();
		
		//driver= new FirefoxDriver();

		Assert.assertEquals("ONLINE STORE | Toolsqa Dummy Test site", driver.getTitle());
		
		
		Thread.sleep(2000);
		driver.quit();
		*/
		//---------------------------
		
		//Init, getting the page
		String exePath = "C:\\Users\\Juan\\Desktop\\Programs\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://sitescan-legacy-staging.3dr.com/auth");
		
		//Input the data
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/"
	      		+ "div[2]/input")).sendKeys("Example@ex.com");
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/"
	      		+ "div[3]/input")).sendKeys("example");
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/form/button")).click();
		//----------------
	      Thread.sleep(1000);
		
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
	    
	    
	    Assert.assertEquals(btext, bannerText,"Error<--------");
	    //Thread.sleep(2000);
		//driver.quit();
		
		
	}
}
