package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "C:\\Users\\Juan\\Desktop\\Programs\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		String Title = driver.getTitle();
		Thread.sleep(5000);
		driver.quit();
		
		System.out.println(Title);
	}

}
