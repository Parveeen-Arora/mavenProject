package amazon_Package.AmazonProject_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdcutPage 
{
	@FindBy(xpath="//span[@id='wishListMainButton']")
	
	WebElement price;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement gobutton;
	
	@FindBy(id="a-autoid-16")
	WebElement quantity;
	
	@FindBy(id="add-to-cart-button")
	WebElement cart;
	
	@FindBy(xpath="(//div[@class='a-popover-inner']/ul/li)[3]")
	WebElement quan;
	
	@FindBy(xpath="//span[@class='a-button a-spacing-top-base a-button-span12 a-button-base celwidget']")
	WebElement gotocart;
	
	public void priceMethod()
	{
		price.click();
	}
	
	public void gobuttonMethod()
	{
		gobutton.click();
	}

	public void quantityMethod(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(quantity).perform();
		a1.keyDown((CharSequence) quantity);
	}
	
	public void quanMethod()
	{
		quan.click();
	}
	public void cartMethod()
	{
		cart.click();
	}
	
	public void gotocartMethod()
	{
		gotocart.click();
	}
	public ProdcutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
