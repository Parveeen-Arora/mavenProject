package amazon_Package.AmazonProject_Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase5 extends BrowserLaunch
{
	@Test
	public void searchProduct()
	{
		HomePage hp=new HomePage(driver);
		hp.move_CursorMethod(driver);
	
		HomePageTC2 hp1=new HomePageTC2(driver);
		hp1.ctnMethod();
		
		LoginPage lp=new LoginPage(driver);
		lp.un_enterMethod();
		lp.ctn_clickMethod();
		lp.pwd_enterMethod();
		lp.sign_ClickMethod();
		
		hp.searchpageMethod();
		hp.searchbuttonMethod();
		
		List <WebElement> w1=driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']"));
		int count=w1.size();
		System.out.println(count);
		Assert.assertEquals(count>50, true);
		
		
	}

}
