package amazon_Package.AmazonProject_Maven;

import org.testng.annotations.Test;

public class TestCase7 extends BrowserLaunch
{
	@Test
	public void product_Dispaly_page()
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
		
		Search_Result_Page srp=new Search_Result_Page(driver);
		srp.nameMethod();
		srp.priceMethod();
		
		
		//reviews pending 
				
		
		
	}
}
