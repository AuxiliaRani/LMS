package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class DeleteClassVerificationValidaion {

	public DeleteClassVerificationValidaion() {
		PageFactory.initElements(driver, this);
	}		
	public static WebDriver driver = DriverFactory.getdriver();

	@FindBy(xpath = ("//*[@id='deleteicon']"))
	WebElement deleteIcononmanageclasspage;
	
	@FindBy(xpath = ("//*[@id='successmessage']"))
	WebElement successmessage;
	
	public void clickdeleteonmanageclass() {
		deleteIcononmanageclasspage.click();
	}
	
	public String captureSuccessMessage() {
	return	successmessage.getText();
	}
	
	
}
