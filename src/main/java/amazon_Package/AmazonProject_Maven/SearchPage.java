package amazon_Package.AmazonProject_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchPage
{
	@FindBy(id="twotabsearchtextbox")
	WebElement searchpage;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]")
	WebElement serachprdocut;
	
	public void searchpageMethod()
	{
		searchpage.sendKeys("shoes");
	}
	
	public void searchbuttonMethod()
	{
		searchbutton.click();
	}
	
	public void serachprdocutmethod()
	{
		serachprdocut.click();
		
		
	}
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
