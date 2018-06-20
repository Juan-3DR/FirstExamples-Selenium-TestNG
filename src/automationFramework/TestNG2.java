package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

@Test
public class TestNG2 {
	
	WebDriver driver;
	
	public void f() throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		// driver = new FirefoxDriver().navigate().to("http://www.DemoQA.com");
		driver.navigate().to("http://www.DemoQA.com");

		//Thread.sleep(5000);
	}

	@BeforeMethod
	public void beforeMethod() {

		String exePath = "C:\\Users\\Juan\\Desktop\\Programs\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	}

	@AfterMethod
	public void afterMethod() {
		//WebDriver driver = new ChromeDriver();
		driver.close();
	}

}
