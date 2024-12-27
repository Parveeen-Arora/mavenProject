package amazon_Package.AmazonProject_Maven;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListeners_logic.class)
public class TestCase11 extends ITestListeners_logic
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
		
		HomePage hp=new HomePage(driver);
		hp.move_CursorMethod(driver);
		
		HomePageTC2 hp2=new HomePageTC2(driver);
		hp2.ctnMethod();
		
		LoginPage lp=new LoginPage(driver);
		lp.un_enterMethod();
		lp.ctn_clickMethod();
		lp.pwd_enterMethod();
		lp.sign_ClickMethod();
		SearchPage sp=new SearchPage(driver);
		sp.searchpageMethod();
		Thread.sleep(2000);
		
		
		sp.searchbuttonMethod();
		
		hp.deliverDayMethod();
		hp.brand1Method();
		hp.priceFilterMethod();
		
		ProdcutPage pp1=new ProdcutPage(driver);
		pp1.gobuttonMethod();
		
		Thread.sleep(5000);
		sp.serachprdocutmethod();
		
		
		Set<String>s1=driver.getWindowHandles();
		
		Iterator<String> i1=	s1.iterator();
		String parent=	i1.next();
		String child=i1.next();
		
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
//		Thread.sleep(5000);
//		pp1.quantityMethod(driver);
//		pp1.quanMethod();
		Thread.sleep(1000);
		
		pp1.cartMethod();
		Thread.sleep(2000);
		
		pp1.gotocartMethod();
		
		Thread.sleep(2000);
		
		CartPage cp=new CartPage(driver);
		cp.cartremoveMethod();
		Thread.sleep(2000);
		
		cp.proceedMethod();
		
		Thread.sleep(2000);
		
		PaymentPage pp2=new PaymentPage(driver);
		pp2.addMethod();
		
		Thread.sleep(3000);
		
		pp2.addChangeMethod();
		Thread.sleep(2000);
		
		pp2.nameMethod();
		
		pp2.mobMethod();
		pp2.pinMethod();
		pp2.hnoMethod();
		pp2.areaMethod();
		pp2.landmarkMethod();
		pp2.cityMethod();
		pp2.stateMethod(driver);
		Thread.sleep(2000);
		
//		pp2.state_selectionMethod();
		
//		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");		
		
	}

}
