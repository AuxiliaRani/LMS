package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class AddEditassignmentpage {

//private static final WebDriver AssignmentDataTableHeader = null;
	
	public static WebDriver driver = DriverFactory.getdriver();
	@FindBy(xpath = "//a[@href='/programnamebox']")
	WebElement programnamebox;
	
	@FindBy(xpath = "//a[@href='/batchnumber']")
	WebElement batchnumber;
	
	@FindBy(xpath = "//a[@href='/assignmentname']")
	WebElement assignmentname;
	
	@FindBy(xpath = "//a[@href='/assignmentdescription']")
	WebElement assignmentdescription;
	
	@FindBy(xpath = "//a[@href='/selectgradeby']")
	WebElement selectgradeby;
	
	@FindBy(xpath = "//a[@href='/assignmentduedate']")
	WebElement assignmentduedate;
	
	@FindBy(xpath = "//a[@href='/assignmentfilepath1']")
	WebElement assignmentfilepath1;
	
	@FindBy(xpath = "//a[@href='/assignmentfilepath2']")
	WebElement assignmentfilepath2;
	
	@FindBy(xpath = "//a[@href='/assignmentfilepath3']")
	WebElement assignmentfilepath3;
	
	@FindBy(xpath = "//a[@href='/cancelbutton']")
	WebElement cancelbutton;
	
	@FindBy(xpath = "//a[@href='/savebutton']")
	WebElement savebutton;
	
	
	public AddEditassignmentpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	       // method to click assignment name box 
			public void programnamebox() {
				programnamebox.click();
			}
			// method to click batch number
			public void batchnumber() {
				batchnumber.click();
			}
			// method to click assignment name
			public void assignmentname() {
				assignmentname.click();
			}
			// method to click assignment description
			public void assignmentdescription() {
				assignmentdescription.click();
			}
			// method to click select grade by
			public void selectgradeby() {
				selectgradeby.click();
			}
			// method to click assignment due date
			public void assignmentduedate() {
				selectgradeby.click();
			}
			// method to click assignment file path1
			public void assignmentfilepath1() {
				assignmentfilepath1.click();
			}
			// method to click assignment file path2
			public void assignmentfilepath2() {
				assignmentfilepath2.click();
			}
			// method to click assignment file path3
			public void assignmentfilepath3() {
				assignmentfilepath3.click();
			}
			
			// method to click assignment file path3
			public void cancelbutton() {
				cancelbutton.click();
			}
			public void savebutton() {
				savebutton.click();
			}
}
