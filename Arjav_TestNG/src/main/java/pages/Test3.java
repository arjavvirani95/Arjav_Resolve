package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Test3 extends TestBase {

	@FindBy(xpath="//button[@id='dropdownMenuButton']")
	WebElement buttonText;
	
	@FindBy(linkText = "Option 3")
	WebElement option3;
	
	public Test3() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String buttonText() {  
		return buttonText.getText();
	}
	
	public void selOpt3() {
		buttonText.click();
		option3.click();
	}
	
	
}