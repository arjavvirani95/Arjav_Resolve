package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class Test5 extends TestBase{

	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement button5 = wait.until(
	        ExpectedConditions.visibilityOfElementLocated(By.id("test5-button"))); 
	
	public Test5() throws IOException {
		PageFactory.initElements(driver, this);
	} 
	
	public void button5() throws InterruptedException {
		
		button5.click();
	}
	
}