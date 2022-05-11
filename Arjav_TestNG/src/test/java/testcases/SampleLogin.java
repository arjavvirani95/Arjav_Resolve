package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

import pages.Test1;

public class SampleLogin extends TestBase {

	Test1 test1;
	
	public SampleLogin() throws Throwable{
		super(); 
		//calling super class constructor which is TestBase class constructor
	}
	
	@BeforeMethod
	public void setUp() throws Throwable {
		intialization();
		test1 = new Test1();
	}
	
	//@Test
	public void homePageTitleTest() {
		String title = test1.validateTestPageTitle();
		Assert.assertEquals(title, "Home");
	}
	
	//@Test(priority = 1)
	public void emailFieldTest() {
		boolean flag = test1.validateEmailField();
		Assert.assertTrue(flag);
	}
	
	//@Test(priority = 2)
	public void passwordFieldTest() {
		boolean flag = test1.validatePasswordField();
		Assert.assertTrue(flag);
	}
	
	//@Test(priority = 3)
	public void signInButtonTest() {
		boolean flag = test1.validateSignInButton();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginTest() {
		test1.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	//@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}