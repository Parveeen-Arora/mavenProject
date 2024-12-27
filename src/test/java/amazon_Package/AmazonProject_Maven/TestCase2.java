package amazon_Package.AmazonProject_Maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends BrowserLaunch
{
	@Test
	public void login()
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
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
	}
}
