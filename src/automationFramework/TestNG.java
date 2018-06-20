package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

@Test
public class TestNG {
	
	public WebDriver driver;
	
	public void f() throws InterruptedException {
		driver.navigate().to("http://www.DemoQA.com");

	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Juan\\Desktop\\Programs\\FireFoxDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
