package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

import pages.Test3;

public class dropownTest3 extends TestBase {
	
	Test3 test3;
	public dropownTest3() throws Throwable{
		super(); 
	}
	
	@BeforeMethod
	public void setUp() throws Throwable {
		intialization();
		test3 = new Test3();
	}
	
	//@Test
	public void listIemt2() {
		String ActualStr = test3.buttonText(); 
		assertEquals(ActualStr, "Option 1");
		System.out.println(ActualStr);
		
	}
	
	@Test
	public void opt3Sel() {
		test3.selOpt3();
	}
	
	//@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}