package amazon_Package.AmazonProject_Maven;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch
{
	static WebDriver driver;
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void quitbrowser()
	{
//		driver.quit();
	}
}
