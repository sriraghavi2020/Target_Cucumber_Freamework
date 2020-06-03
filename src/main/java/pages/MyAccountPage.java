package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basic_Class.Test_BaseClass;

public class MyAccountPage extends Test_BaseClass{


	@FindBy(xpath="//a[contains(text(), 'Target Australia')]")
	WebElement logo;
	@FindBy(xpath="//a[contains(text(), 'My Personal Details')]")
	WebElement MyPersonalDetails;
	@FindBy(xpath="//a[contains(text(), 'My Order Details')]")
	WebElement MyOrderDetails;
	@FindBy(xpath="//a[contains(text(), 'My Payment Details')]")
	WebElement MyPaymentDetails;
	@FindBy(xpath="//a[contains(text(), 'My Address Details')]")
	WebElement MyAddressDetails;
	@FindBy(xpath="//a[@typeof='WebPage']")
	WebElement Home;
	@FindBy(xpath="//span[@data-title= 'Women']")
	WebElement Women;
	@FindBy(xpath="//a[contains(@href,'women/activewear')]")
	WebElement womenActivewear;
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validatelogo() {
		return logo.isDisplayed();
	}
	public MyPersonalDetailsPage PersonalDetailCheck() {
		MyPersonalDetails.click();
		return new MyPersonalDetailsPage();
	}
	
	public MyOrderDetailsPage OrderDetailCheck() {
		MyOrderDetails.click();
		return new MyOrderDetailsPage();
	}
	public MyPaymentDetailsPage PaymentDetailCheck() {
		MyPaymentDetails.click();
		return new MyPaymentDetailsPage();
	}
	public MyAddressDetailsPage AddressDetailCheck() {
		MyAddressDetails.click();
		return new MyAddressDetailsPage();
	}
	
	public HomePage homepageCheck() {
		Home.click();
		return new HomePage();
	}
	
	public WomenActiverwearPage WomenActivewear() {
		Actions action = new Actions(driver);	
		action.moveToElement(Women).build().perform();
		womenActivewear.click();
		return new WomenActiverwearPage();
	}
	
	
	
	
	
	
	
	
}
