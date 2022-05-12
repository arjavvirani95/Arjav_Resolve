package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class Test5 extends TestBase{
	
	
	WebElement buttonfive = driver.findElement(By.xpath("//button[@id='test5-button']"));

	Point p = buttonfive.getLocation();
    int X = p.getX();
    int Y = p.getY();
    //scroll with Javascript Executor
    JavascriptExecutor j = (JavascriptExecutor) driver;
    j.executeScript("window.scrollBy(" + X + ", " + Y + ");");
    
		
	
	public Test5() throws IOException {
		PageFactory.initElements(driver, this);
	} 
	
	public void button5() throws InterruptedException {
		
		buttonfive.click();
	}
	
}