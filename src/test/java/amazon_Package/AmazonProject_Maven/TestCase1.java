package amazon_Package.AmazonProject_Maven;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListeners_logic.class)
public class TestCase1 extends ITestListeners_logic 
{
	@Test
	public void registration() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage hp=new HomePage(driver);
		hp.move_CursorMethod(driver);
		hp.registerMethod();
		
		RegistrationPage rp=new RegistrationPage(driver);
		rp.unMethod();
		rp.mobileMethod();
		rp.pwdMethod();
		rp.ctnMethod();
	}
}
