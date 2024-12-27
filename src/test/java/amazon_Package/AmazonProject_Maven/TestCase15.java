package amazon_Package.AmazonProject_Maven;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase15 extends ITestListeners_logic
{

	@Test(retryAnalyzer = I_Retry_Analyzer.class)
	public void productpage() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SearchPage sp=new SearchPage(driver);
		Thread.sleep(2000);
		
		sp.searchpageMethod();
		Thread.sleep(2000);
		sp.searchbuttonMethod();
		Thread.sleep(2000);
		sp.serachprdocutmethod();
		Thread.sleep(2000);
		
		Set <String> s1=driver.getWindowHandles();
		Iterator <String> i1=s1.iterator();
		String parent=i1.next();
		String child=i1.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		
		Thread.sleep(2000);
		ProdcutPage pp1=new ProdcutPage(driver);
		pp1.cartMethod();
		
		Thread.sleep(2000);
		pp1.gotocartMethod();
		
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Amazon.in Shopping Cart");
		

	}	
}
