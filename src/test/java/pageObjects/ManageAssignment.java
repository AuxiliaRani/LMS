package pageObjects;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.swing.ImageIcon;

import org.apache.poi.ss.usermodel.Footer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.LoggerLoad;

public class ManageAssignment {
	
	private static final WebDriver AssignmentDataTableHeader = null;


	public static WebDriver driver = DriverFactory.getdriver();

	
	@FindBy(xpath = "//a[@href='/assignment']")
	WebElement assignmentButton;
	@FindBy(xpath = "//*[@value='searchBox']")
	WebElement searchBox;
	@FindBy(xpath = "//*[@id='id_Addnewassignmentbutton']")
	WebElement Addnewassignmentbutton;
	@FindBy(xpath = "//*[@id='uploadassignmentbutton']")
	WebElement uploadassignmentbutton;
	@FindBy(xpath = "//*[@class='clicksEditbutton']")
	WebElement clicksEditbutton;
	@FindBy(xpath = "//*[@class='clickdeletebutton']")
	WebElement clickdeletebutton;
	@FindBy(xpath = "//*[@class='clickassignmentNamebutton']")
	WebElement clickassignmentNamebutton;
	@FindBy(xpath = "//*[@class='clicksdeletebutton']")
	WebElement clicksdeletebutton;
	@FindBy(xpath = "//*[@class='assignmentdescription']")
	WebElement assignmentdescription;
	@FindBy(xpath = "//*[@class='clicksAssignmentduedate']")
	WebElement clicksAssignmentduedate;
	@FindBy(xpath = "//*[@class='clickassignmentgradebutton']")
	WebElement clickassignmentgradebutton;
	
	public ManageAssignment() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	       // method to click assignment button
			public void clickassignment() {
				assignmentButton.click();
			}
			//method to click serchBox Button
			public void clicksearchBox() {
				searchBox.click();
			}
	        //method check upload assignment is displayed
			public boolean assignmentbutton()
			{
				boolean b = uploadassignmentbutton.isDisplayed();
			return b;
			}
			 //method to check Add new assignment button is displayed
			public boolean Addnewassignmentbutton()
			{
				boolean b = Addnewassignmentbutton.isDisplayed();
			return b;
			}
			
			//method to check Edit assignment button is displayed
			public boolean clicksEditbutton()
			{
				boolean b = clicksEditbutton.isDisplayed();
			return b;
			}
			//method to check delete assignment button is displayed
			public boolean clickdeletebutton()
			{
				boolean b = clickdeletebutton.isDisplayed();
			return b;
			}
			//method to check assignment name button is displayed
			public boolean clickassignmentNamebutton()
			{
				boolean b = clickassignmentNamebutton.isDisplayed();
			return b;
			}
			//method to check assignment description name button is displayed
			public boolean assignmentdescription()
			{
				boolean b = assignmentdescription.isDisplayed();
			return b;
			}
			//method to check assignment due date  button is displayed
			public boolean clicksAssignmentduedate()
			{
				boolean b = clicksAssignmentduedate.isDisplayed();
			return b;
			}
			//method to check assignment grade button is displayed
			public boolean clickassignmentgradebutton()
			{
				boolean b = clickassignmentgradebutton.isDisplayed();
			return b;
			}
			// method to getText of WebElement manageclassHeader
			public static String getText() {
				String text = ManageAssignment.getText();
				return text;
			}
			
			
			
			//method to getText for each tableHeader (WebElement )
			public List<String> AssignmentDataTableHeader() {
				//AssignmentsDataTableHeader.click();
				List<WebElement> headerCells = AssignmentDataTableHeader.findElements(By.tagName("th"));
				List<String> headerText = null;
				
				for (WebElement hc :headerCells)
				{
					headerText.add(hc.getText());
				}
				return headerText;
			}
			
			
			public List<WebElement> AssignmentDataTableHeaderWithSortIcon() {
				//classDataTableHeader.click();
				List<WebElement> headerCells = AssignmentDataTableHeader.findElements(By.tagName("th"));		
				return headerCells;
			}
			//url
			public List<WebElement> rowIsPresent() {			
				List<WebElement> dataTableRows = AssignmentDataTableHeader.findElements(By.tagName("tr"));
				return dataTableRows;
			}
			
			
			public String footerText() {
				String footertext;
				try {
					footertext = footerText();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return footerText();
			}
}
			
			
			
			
			
			
			
			
			
			
