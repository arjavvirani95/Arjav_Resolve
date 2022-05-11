package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

import pages.Test5;

public class button5ClickAssert extends TestBase {

Test5 test5;
	
	public button5ClickAssert() throws Throwable{
		super(); 
	}
	
	@BeforeMethod
	public void setUp() throws Throwable {
		intialization();
		test5 = new Test5();
	}
	
	@Test
	public void clickButton5() throws InterruptedException {
		test5.button5();
	}
	
}

