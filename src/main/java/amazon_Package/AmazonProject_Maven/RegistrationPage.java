package amazon_Package.AmazonProject_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage 
{
	@FindBy(name="customerName")
	WebElement un;
	
	@FindBy(id="ap_phone_number")
	WebElement mobile;
	
	@FindBy(id="ap_password")
	WebElement pwd;
	
	@FindBy(id="continue")
	WebElement ctn;
	
	public void unMethod()
	{
		un.sendKeys("Parveen Arora");
	}
	
	public void mobileMethod()
	{
		mobile.sendKeys("9671972208");
	}
	
	public void pwdMethod()
	{
		pwd.sendKeys("Parveen@123");
	}
	
	public void ctnMethod()
	{
		ctn.click();
	}
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
