package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class NavigateFunction {

	public NavigateFunction() {
		PageFactory.initElements(driver, this);
	}
		
	public static WebDriver driver = DriverFactory.getdriver();
	

	
	@FindBy(xpath = "//*[@value='Student']")
	WebElement StudentButton;	
	
	@FindBy(xpath = "//*[@value='Program']")
	WebElement ProgramButton;	
	
	@FindBy(xpath = "//*[@value='Batch']")
	WebElement BatchButton;	
	
	@FindBy(xpath = "//*[@value='User']")
	WebElement UserButton;	
	
	@FindBy(xpath = "//*[@value='Assignment']")
	WebElement AssignmentButton;	
	
	@FindBy(xpath = "//*[@value='Attendance']")
	WebElement AttendanceButton;	
	
	@FindBy(xpath = "//*[@value='Logout']")
	WebElement LogoutButton;	
	
	public void StudentButton() {
		StudentButton.click();
	}
	
	public void ProgramButton() {
		ProgramButton.click();
	}
	
	public void BatchButton() {
		BatchButton.click();
	}
	
	public void UserButton() {
		UserButton.click();
	}
	
	public void AssignmentButton() {
		AssignmentButton.click();
	}
	
	public void AttendanceButton() {
		AttendanceButton.click();
	}
	
	public void LogoutButton() {
		LogoutButton.click();
	}
	

	
	
	
	
	
	
}
