package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

import pages.Test4;

public class test4Button extends TestBase {

	Test4 test4;
	
	public test4Button() throws Throwable{
		super(); 
	}
	
	@BeforeMethod
	public void setUp() throws Throwable {
		intialization();
		test4 = new Test4();
	}
	
	@Test
	public void buttonEnable() {
		boolean flag = test4.button1();
		Assert.assertTrue(flag, "Button is Disabled");
	}
	
	@Test
	public void buttonDisable() {
		boolean flag = test4.button2(); 
		Assert.assertFalse(flag, "Button is Enabled");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

