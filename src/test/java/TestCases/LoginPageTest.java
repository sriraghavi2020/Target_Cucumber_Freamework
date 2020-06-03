package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basic_Class.Test_BaseClass;

import pages.LoginPage;
import pages.MyAccountPage;

public class LoginPageTest extends Test_BaseClass{
	
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	
	
@BeforeMethod
public void setUp() {
	initialization();
	loginpage = new LoginPage();
}
@Test(priority=1)
public void LoginpageTitleTest() {
	String Title = loginpage.validateTitle();
	Assert.assertEquals(Title, "My Account | Target Australia");
}
@Test(priority=2)
public void logoTest() {
	boolean b1 = loginpage.validatelogo();
	Assert.assertEquals(b1, true);
}
@Test(priority=3)
public void loginTest() {
	
	myaccountpage = loginpage.login(Test_BaseClass.readPropsFile("email"), Test_BaseClass.readPropsFile("password"));
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
