package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basic_Class.Test_BaseClass;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.MyAddressDetailsPage;
import pages.MyOrderDetailsPage;
import pages.MyPaymentDetailsPage;
import pages.MyPersonalDetailsPage;
import pages.WomenActiverwearPage;


public class MyAccountPageTest extends Test_BaseClass{
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	MyPersonalDetailsPage mypersonaldetailspage;
	MyOrderDetailsPage myorderdetailspage;
	MyPaymentDetailsPage mypaymentdetailspage;
	MyAddressDetailsPage myaddressdetailspage;
	HomePage homepage;
	WomenActiverwearPage womenactivewearpage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		//myaccountpage = new MyAccountPage();
		loginpage = new LoginPage();
		myaccountpage= loginpage.login(Test_BaseClass.readPropsFile("email"), Test_BaseClass.readPropsFile("password"));
	
	}
	
	@Test(priority=1)
	public void MyaccountpageTitleTest() {
		String Title = myaccountpage.validateTitle();
		Assert.assertEquals(Title, "My Account | Target Australia");
	}
	@Test(priority=2)
	public void logoTest() {
		boolean b1 = myaccountpage.validatelogo();
		Assert.assertEquals(b1, true);
	}
	@Test(priority=3)
	
	public void ClickOnMyPersonalDetailsPage() {
		mypersonaldetailspage = myaccountpage.PersonalDetailCheck(); 
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	
@Test(priority=4)
	
	public void ClickOnMyOrderDetailsPage() {
	myorderdetailspage = myaccountpage.OrderDetailCheck(); 
	String Title = driver.getTitle();
	System.out.println(Title);
	}
@Test(priority=5)

public void ClickOnMyPaymentDetailsPage() {
	mypaymentdetailspage = myaccountpage.PaymentDetailCheck(); 
	String Title = driver.getTitle();
	System.out.println(Title);
}
@Test(priority=6)

public void ClickOnMyAddressDetailsPage() {
	myaddressdetailspage = myaccountpage.AddressDetailCheck(); 
	String Title = driver.getTitle();
	System.out.println(Title);
}
@Test(priority=6)
	public void ClickOnHomePage() {
		homepage = myaccountpage.homepageCheck();
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	
@Test(priority=7)
public void ClickOnWomenActivewearPage() {
	womenactivewearpage = myaccountpage.WomenActivewear();
	String Title = driver.getTitle();
	System.out.println(Title);
}
	
	
	
@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
