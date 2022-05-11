package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Test2 extends TestBase {

	
	@FindBy(xpath="//div[@id='test-2-div']/ul/li")
	List<WebElement> allelements;
	
	@FindBy(xpath="//li[contains(text(),'List Item 2')]")
	WebElement item2;
	
	public Test2() throws IOException {
		PageFactory.initElements(driver, this);
	} 
	
	public int allListsize() { 
		return allelements.size();
	}
	
	public void printAllList() {
		for (WebElement element: allelements) {
		      System.out.println(element.getText());
		}
	}
	
	public String list2Item() {  
		return item2.getText();
	}
	 
	
	
}
