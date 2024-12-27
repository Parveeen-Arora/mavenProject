package amazon_Package.AmazonProject_Maven;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestCase6 extends BrowserLaunch
{
	@Test
	public void searchresult_with_Filters()
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
		
		hp.deliverDayMethod();
		hp.shoeSizeMethod();
		
//		hp.brandMethod();
		hp.brand1Method();
		
		hp.redtaperesultMethod();
		
		Assert.assertEquals(6, 5);
		
//		hp.priceFilterMethod();
		
//		hp.discountMethod();
	}
		
		
}
