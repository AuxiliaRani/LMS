
package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.LoggerLoad;

public class AttendanceDetailsPage {
	
	public AttendanceDetailsPage() {
		PageFactory.initElements(driver, this);
	}
		
	public static WebDriver driver = DriverFactory.getdriver();

	
	@FindBy(xpath = ("//*[@id='programDropdownText']"))
	WebElement programDropdownText;
	
	@FindBy(xpath = ("//*[@id='classDropdownText']"))
	WebElement classDropdownText;
	
	@FindBy(xpath = ("//*[@id='studentDropdownText']"))
	WebElement studentDropdownText;
	
	@FindBy(xpath = ("//*[@id='attendanceDropdownText']"))
	WebElement attendanceDropdownText;
	
	@FindBy(xpath = ("//*[@id='datePicker']"))
	WebElement datePicker;
	
	
	@FindBy(xpath = ("//*[@id='cancelButton']"))
	WebElement cancelButton;
	
	@FindBy(xpath = ("//*[@id='saveButton']"))
	WebElement saveButton;
	

	
}// Class ends
