package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Test1 extends TestBase{

	
	//Page Factory - OR:dfsdfdfdsfdsf
	@FindBy(id="inputEmail")
	WebElement email;
	
	@FindBy(id="inputPassword")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement signin;
	
	
	//Initialization of page Object (Page factory)
	public Test1() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateTestPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateEmailField() {
		return email.isDisplayed();
	}
	
	public boolean validatePasswordField() {
		return password.isDisplayed();
	}
	
	public boolean validateSignInButton() {
		return signin.isDisplayed();
	}
	
	public void login(String em, String pass) {
		email.sendKeys(em);
		password.sendKeys(pass);
	}
}
