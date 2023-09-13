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
	static
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
			public static void clickassignment() {
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
			
			
			public static String footerText() {
				String footertext;
				try {
					footertext = footerText();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return footerText();
			}


			public static void Admin_enters_assignment_name_into_search_box() {
				// TODO Auto-generated method stub
				
			}


			public static void Displays_entries_with_that_assignment_name() {
				// TODO Auto-generated method stub
				
			}


			public static void Displays_empty_details_in_the_data_table() {
				// TODO Auto-generated method stub
				
			}


			public static void Displays_entries_with_that_assignment_due_date() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_see_a_popup_with_heading_Assignment_details() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_see_dropdown_option_for_Batch_Number() {
				// TODO Auto-generated method stub
				
			}


			public static void dropdown() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_see_calendar_icon_for_assignment_due_date() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_see_save_button_In_The_Assignment_detail_popup_window() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_see_cancel_button_in_the_Assignment_detail_popup_window() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_see_close_button_on_the_Assignment_details_popup_windoww() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_due_date() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_see_new_assignment_details_is_added_in_the_data_table() {
				// TODO Auto-generated method stub
				
			}


			public static void Error_message_should_appear_in_alertAssignment_due_date() {
				// TODO Auto-generated method stub
				
			}


			public static void Error_message_Should_appear_in_alert() {
				// TODO Auto-generated method stub
				
			}


			public static void Program_Name_is_missing() {
				// TODO Auto-generated method stub
				
			}


			public static void Assignment_due_date_is_missing() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_Is_in_Assignment_details_popup_window() {
				// TODO Auto-generated method stub
				
			}


			public static void Grade_by_is_missing() {
				// TODO Auto-generated method stub
				
			}


			public static void Assignment_cannot_be_created_for_the_passed_date() {
				// TODO Auto-generated method stub
				
			}


			public static List<WebElement> updatedassignmentdetails() {
				// TODO Auto-generated method stub
				return null;
			}


			public static void previous_month_calender_should_visible() {
				// TODO Auto-generated method stub
				
			}


			public static void Batch_number_is_missing() {
				// TODO Auto-generated method stub
				
			}


			public static void Assignment_name_is_missing() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_land_on_manage_assignment_page() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_land_on_manage_assignment_Page_and_validate_new_assignment_is_not_created_in_the_data_table() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_see_current_date_is_highled_in_the_date_picker() {
				// TODO Auto-generated method stub
				
			}


			public static void Admin_should_see_dialog_box() {
				// TODO Auto-generated method stub
				
			}


			public static void Alert_should_have_No_button_to_reject() {
				// TODO Auto-generated method stub
				
			}


			public static Object getValidClassTopic() {
				// TODO Auto-generated method stub
				return null;
			}


			public static void checkbox(Object clickcheckbox) {
				// TODO Auto-generated method stub
				
			}


			public static boolean OnePagedisplaydataTable() {
				// TODO Auto-generated method stub
				return false;
			}


			public static boolean RightArrowEnable() {
				// TODO Auto-generated method stub
				return false;
			}


			public static boolean LeftArrowEnable() {
				// TODO Auto-generated method stub
				return false;
			}


			public static boolean Entry5dataTable() {
				// TODO Auto-generated method stub
				return false;
			}


			public static String getStudentPage() {
				// TODO Auto-generated method stub
				return null;
			}


			public static void clickStudentbutton() {
				// TODO Auto-generated method stub
				
			}
}
			
			
			
			
			
			
			
			
			
			
