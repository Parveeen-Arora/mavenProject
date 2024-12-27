package amazon_Package.AmazonProject_Maven;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase3 extends BrowserLaunch
{
	@Test
	public void inorrectUN()
	{
		HomePage hp=new HomePage(driver);
		hp.move_CursorMethod(driver);
	
		HomePageTC2 hp1=new HomePageTC2(driver);
		hp1.ctnMethod();
		
		LoginPage_Incorrect lpi=new LoginPage_Incorrect(driver);
		lpi.un_enterMethod();
		lpi.ctn_clickMethod();
		lpi.pwd_enterMethod();
		lpi.sign_ClickMethod();
		
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	}
}