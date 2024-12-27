package amazon_Package.AmazonProject_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage
{
	@FindBy(xpath="//a[@class='a-link-normal expand-panel-button celwidget']")
	WebElement add;
	
	@FindBy(id="add-new-address-popover-link")
	WebElement addChange;
	
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[1]")
	WebElement name;
	
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[2]")
	WebElement mob;
	
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[3]")
	WebElement pin;
	
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[4]")
	WebElement hno;
	
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[5]")
	WebElement area;
	
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[6]")
	WebElement landmark;
	
	@FindBy(xpath="(//input[@class='a-input-text address-ui-widgets-desktop-form-field-full-width addrui-form-text-input'])[7]")
	WebElement city;
	
	@FindBy(xpath="(//span[@class='a-button-text a-declarative'])[2]")
	WebElement state;
	
	@FindBy(xpath="(//div[@class='a-popover-inner a-lgtbox-vertical-scroll']/ul/li)[12]")
	WebElement state_selection;
	
	
	public void addMethod()
	{
		add.click();
	}
	
	public void addChangeMethod()
	{
		addChange.click();
	}
	
	public void nameMethod()
	{
		name.sendKeys("Parveen Arora");
	}
	
	public void mobMethod()
	{
		mob.sendKeys("9671972208");
	}
	
	public void pinMethod()
	{
		pin.sendKeys("124113");
	}
	
	public void hnoMethod()
	{
		hno.sendKeys("876");
	}
	
	public void areaMethod()
	{
		area.sendKeys("Kahnaur chowk");
	}
	
	public void landmarkMethod()
	{
		landmark.sendKeys("near bitto tailor");
	}
	
	public void cityMethod()
	{
		city.sendKeys("Rohtak");
	}
	
	public void stateMethod(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(state).perform();
	}
	
	public void state_selectionMethod()
	{
		state_selection.click();
	}
	
	
	//Payment change methods for TC12
	
	@FindBy(id="payChangeButtonId")
	WebElement payment_Change;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement creditDebit;
	
	@FindBy(xpath="//input[@class='a-input-text a-form-normal a-width-large a-span9 pmts-claim-code']")
	WebElement coupen;
	
	@FindBy(name="ppw-claimCodeApplyPressed")
	WebElement applybutton;
	
	public void creditDebitMethod()
	{
		creditDebit.click();
	}
	
	public void payment_ChangeMethod()
	{
		payment_Change.click();
	}
	
	public void coupenMethod()
	{
		coupen.sendKeys("parveen");
	}
	
	public void applybuttonMethod()
	{
		applybutton.click();
	}
	
	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
