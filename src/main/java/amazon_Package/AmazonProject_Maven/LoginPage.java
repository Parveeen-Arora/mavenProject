package amazon_Package.AmazonProject_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="ap_email")
	WebElement un_enter;
	
	@FindBy(id="continue")
	WebElement ctn_click;
	
	@FindBy(id="ap_password")
	WebElement pwd_enter;
	
	@FindBy(id="signInSubmit")
	WebElement sign_Click;
	
	public void un_enterMethod()
	{
		un_enter.sendKeys("9671972208");
	}
	
	public void ctn_clickMethod()
	{
		ctn_click.click();
	}
	
	
	public void pwd_enterMethod()
	{
		pwd_enter.sendKeys("Parveen@123");
	}
	
	public void sign_ClickMethod()
	{
		sign_Click.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
