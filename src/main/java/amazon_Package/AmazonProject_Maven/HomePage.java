package amazon_Package.AmazonProject_Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class HomePage 
{
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement move_Cursor;
	
	@FindBy (xpath="(//a[@class='nav-a'])[1]")
	WebElement register;
	
	
	//after login homepage methods
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement movecursor;
	
	@FindBy(xpath="//button[@class='sc-fqkvVR sc-fTFjTM jZunJN eqmAHp']")
	WebElement managprofile;
	
	@FindBy(xpath="//a[@class='sc-iGgWBj sc-fHjqPf fErbOa bdPZUm']")
	WebElement viewprofile;
	
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement pencilbutton;
	
	@FindBy(id="editProfileNameInputId")
	WebElement editname;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement conti;
	
	public void move_CursorMethod(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(move_Cursor).perform();
	}
	
	public void registerMethod()
	{
		register.click();
	}
		
	public void movecursorMethod(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(movecursor).perform();	
	}
	
	public void manageprofileMethod()
	{
		managprofile.click();
	}
	
	public void viewprofileMethod()
	{
		viewprofile.click();
	}
	
	public void pencilbuttonMethod()
	{
		pencilbutton.click();
	}
	
	public void editnameMethod(WebDriver driver)
	{
		for(int i=0; i<5; i++)
		{
			editname.sendKeys(Keys.BACK_SPACE);
		}
		editname.sendKeys("Parveen");
	}
	
	public void contiMethod()
	{
		conti.click();
	}
	
	
	//Search Product
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchpage;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	public void searchpageMethod()
	{
		searchpage.sendKeys("shoes");
	}
	
	public void searchbuttonMethod()
	{
		searchbutton.click();
	}
	
	
	//filter
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[1]")
	WebElement deliverDay;
	
	
	@FindBy(xpath="(//input[@class='s-range-input'])[2]")
	WebElement priceFilter;
	
	
	@FindBy(xpath="//span[.='9']")
	WebElement shoeSize;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[6]")
	WebElement brand;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[8]")
	WebElement brand1;
	
	@FindBy(xpath="(//div[@class='colorsprite aok-float-left'])[1]")
	WebElement colour;
	
	@FindBy(xpath="//span[.='10% Off or more']")
	WebElement discount;
	
	@FindBy(xpath="//span[.='Red Tape']")
	WebElement redtaperesult;
	
	
	public void deliverDayMethod()
	{
		deliverDay.click();
	}
	
	public void shoeSizeMethod()
	{
		shoeSize.click();
	}
	
	public void brandMethod()
	{
		brand.click();
	}
	
	public void brand1Method()
	{
		brand1.click();
	}
	
	public void redtaperesultMethod()
	{
		
		List <WebElement> w1=redtaperesult.findElements(By.xpath("//span[.='Red Tape']"));
		int len=w1.size();
		System.out.println(len);
		boolean redtape=redtaperesult.isDisplayed();
		System.out.println("Red Tape shoes are visible "+redtape);
	}
	
	public void colourMethod()
	{
		colour.click();
	}
	
	public void priceFilterMethod()
	{
		for(int i=0; i<10; i++)
		{
			priceFilter.sendKeys(Keys.ARROW_LEFT);
		}
	}
	
	public void discountMethod()
	{
		discount.click();
	}

	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
