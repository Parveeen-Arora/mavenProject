package amazon_Package.AmazonProject_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Result_Page 
{
	@FindBy(xpath="//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']")
	WebElement name;
	
	@FindBy(xpath="//span[@class='a-price-whole']")
	WebElement price;
	
	public void nameMethod()
	{
		boolean name1=	name.isDisplayed();
		System.out.println("Product name is present on the page -> "+name1);
	}
	
	public void priceMethod()
	{
		boolean price1=price.isDisplayed();
		System.out.println("Price is visible on the page -> "+price1);
	}
	
	public Search_Result_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
