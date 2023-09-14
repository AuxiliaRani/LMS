package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class UploadAssignmentPage {
	
	//private static final WebDriver AssignmentDataTableHeader = null;
	
	public static WebDriver driver = DriverFactory.getdriver();
	
	@FindBy(xpath = "//a[@href='/uploadsearchpathbox']")
	WebElement uploadsearchpathbox;
	@FindBy(xpath = "//a[@href='/selectassignmentbox']")
	WebElement selectassignmentbox;
	@FindBy(xpath = "//a[@href='/clickupload']")
	WebElement clickupload;
	@FindBy(xpath = "//a[@href='/clickcancel']")
	WebElement clickcancel;

	public UploadAssignmentPage() {
		PageFactory.initElements(driver, this);


}
	
				// method to click upload assignment button
				public void uploadsearchpathbox() {
					uploadsearchpathbox.click();
				}
				
				// method to select assignment button
				public void selectassignmentbox() {
					selectassignmentbox.click();
				}
				
				// method to click upload button
				public void clickupload() {
					clickupload.click();
				}
				
				// method to click upload button
				public void clickcancel() {
					clickcancel.click();
				}
}