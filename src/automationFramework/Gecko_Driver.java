package automationFramework;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko_Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Juan\\Desktop\\Programs\\FireFoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com");
		//driver.get("http://demoqa.com/frames-and-windows/");
		//driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		
		//String Title = driver.getPageSource();
		
		
		driver.navigate().to("http://www.DemoQA.com");
		
		
		Thread.sleep(5000);
		driver.close();
		
		//System.out.println(Title);
		
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://demoqa.com/frames-and-windows/");
		//driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		//driver.close();
	}

}
