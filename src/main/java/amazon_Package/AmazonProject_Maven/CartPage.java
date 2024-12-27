package amazon_Package.AmazonProject_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
	@FindBy(xpath="//input[@value='Delete']")
	WebElement cartremove;
	
	@FindBy(xpath="(//span[@class='a-icon a-icon-small-add'])[1]")
	WebElement increase;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceed;
	
	public void cartremoveMethod()
	{
		cartremove.click();
	}
	
	public void increaseMethod()
	{
		for(int i=0; i<2; i++)
		{
			increase.click();
		}	
	}
	public void proceedMethod()
	{
		proceed.click();
	}
	public CartPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
