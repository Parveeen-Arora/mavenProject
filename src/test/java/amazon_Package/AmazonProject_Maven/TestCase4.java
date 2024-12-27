package amazon_Package.AmazonProject_Maven;

import org.testng.annotations.Test;

public class TestCase4 extends BrowserLaunch
{
	@Test
	public void editprofile()
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
		
		//after login methods
		hp.movecursorMethod(driver);
		hp.manageprofileMethod();
		hp.viewprofileMethod();
		hp.pencilbuttonMethod();
		hp.editnameMethod(driver);
		hp.contiMethod();
		
		
//		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	}
}
