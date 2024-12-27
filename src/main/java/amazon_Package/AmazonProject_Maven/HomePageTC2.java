package amazon_Package.AmazonProject_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageTC2 
{
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement ctn;
	
	
	
	public void ctnMethod()
	{
		ctn.click();
	}
	
	
	
	public HomePageTC2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
