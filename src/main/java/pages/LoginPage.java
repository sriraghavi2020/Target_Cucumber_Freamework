package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basic_Class.Test_BaseClass;

public class LoginPage extends Test_BaseClass{
	@FindBy(name="j_username")
	WebElement username;
	
	@FindBy(name="j_password")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginBtn;

	@FindBy(xpath="//a[contains(text(), 'Target Australia')]")
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validatelogo() {
		return logo.isDisplayed();
	}
	
	public MyAccountPage login(String urs, String pwd) {
		username.sendKeys(urs);
		password.sendKeys(pwd);
		loginBtn.click();
		return new MyAccountPage();
	}
	
}
