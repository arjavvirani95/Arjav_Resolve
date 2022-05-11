package testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

import pages.Test2;

public class listTest2 extends TestBase {

	Test2 test2;
	
	public listTest2() throws Throwable{
		super(); 
	}
	
	@BeforeMethod
	public void setUp() throws Throwable {
		intialization();
		test2 = new Test2();
	}
	  
	@Test
	public void allListSize() {
		int i = test2.allListsize(); 
		Assert.assertEquals(3, i);
	}
	
	@Test
	public void printAllList() {
		test2.printAllList();
	}
	
	@Test
	public void listIemt2() {
		String ActualStr = test2.list2Item();
		assertTrue(ActualStr.contains("List Item 2"));
		assertTrue(ActualStr.contains("6"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
