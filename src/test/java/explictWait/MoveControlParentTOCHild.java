package explictWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MoveControlParentTOCHild
{
	@Test
	public void movecontrol() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		Thread.sleep(2000);
		List <WebElement> e1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		
		int len=e1.size();
		System.out.println(len);
		
		for(int i=0; i<len; i++)
		{
			WebElement e2= e1.get(i);
			String auto= e2.getText();
			System.out.println(auto);
		}
		
		e1.get(1).click();
		
		Thread.sleep(2000);
		
		WebElement e3= driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]"));
		e3.click();
		
		Thread.sleep(2000);
		Set <String> s1=driver.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		String parent=i1.next();
		String child=i1.next();
		Thread.sleep(2000);
		
		System.out.println(parent);
		System.out.println(child);
		
		driver.switchTo().window(child);
		
		driver.findElement(By.id("add-to-cart-button")).click();
	}
}
