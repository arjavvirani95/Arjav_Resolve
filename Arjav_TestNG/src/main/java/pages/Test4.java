package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Test4 extends TestBase  {

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[4]/div[1]/button[1]")
	WebElement t4Button1;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[4]/div[1]/button[2]")
	WebElement t4Button2;
	
	public Test4() throws IOException {
		PageFactory.initElements(driver, this);
	} 
	
	public boolean button1() {
		return t4Button1.isEnabled();
	}
	
	public boolean button2() {
		return t4Button2.isEnabled();
	}
}
