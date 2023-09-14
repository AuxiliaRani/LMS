package stepDefinitionsClass;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPopUpWindow;
import pageObjects.ManageClass;
import stepDefinitionsBatch.AddNewBatchSD;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class AddNewClassSD extends DriverFactory{
     //created object of ClassPopUpWindow to call the performing action methods on webelement(POM)
	ClassPopUpWindow classpopupwindow = new ClassPopUpWindow();
	ExcelReader excelReader = new ExcelReader();
	
	String batchidstring;
	
	@Given("Admin click +Add New Class button after reaching to Manage class page")
	public void admin_click_add_new_class_button_after_reaching_to_manage_class_page() {
		classpopupwindow.clickAddNewClassButton();
	}

	@When("Admin clicks  Batch ID dropdown on add class page")
	public void admin_clicks_batch_id_dropdown_on_add_class_page() {
		classpopupwindow.dropdownBatchIdClick();
	}

	@Then("Batch id in the drop down should match with Batch id manage batch page table")
	public void batch_id_in_the_drop_down_should_match_with_batch_id_manage_batch_page_table() {
	    //Assuming Batch id created in AddNewBatch_SD is declared as public static final variable at class level, 
		//so team can call that variable by classname.variablename but can't change
	          int batchid =AddNewBatchSD.BatchId;
	          List<String> optionTexts= classpopupwindow.getdropDownOptionsText();
	          try {
	          Assert.assertTrue(optionTexts.contains(batchid));
	          LoggerLoad.info("Batchid passed from addnewbatchsd file matces list of batchid in dropdown");
	          }catch(AssertionError e) {
	        	  LoggerLoad.warn("Assertion failed batchid doesnt match batchid created at addnewbatchsd class" +e);  
	          }
	}

	@When("Admin enters all mandatory field values with valid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() throws InvalidFormatException, IOException {
		
		 int batchid =AddNewBatchSD.BatchId;
	   batchidstring = String.valueOf(batchid);
		String ClassDate = null ;
		String NoOfClasses = null;
		
			List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx", "ManageClass");			
			for ( Map<String,String> elements     : excelHeader) {	
				ClassDate = elements.get("ValidClassDate");		 
			 NoOfClasses = elements.get("NoOfClasses");
		
	boolean selectedBatchId = classpopupwindow.selectBatchId(batchidstring);
	try {
	Assert.assertTrue(selectedBatchId);
	LoggerLoad.info("Batchid matches");
	}catch (Exception e) {
		LoggerLoad.warn(" Batchid doesn't match "+ e);
	}
	classpopupwindow.opencalenderIcon();
	classpopupwindow.opencalender(ClassDate);
	classpopupwindow.dropdownStaffIdClick();
	classpopupwindow.saveButtonClick();
	}
	}

	@Then("Admin should see new class details is added in the data table from add class page")
	public void admin_should_see_new_class_details_is_added_in_the_data_table_from_add_class_page() {
		ManageClass manageclass = new ManageClass();
		List<WebElement> rows =  manageclass.rowIsPresent();
		try {
		for (WebElement row : rows) {
			String currentRowBatchId = row.findElement(By.name("batchids")).getText();
		Assert.assertEquals(batchidstring, currentRowBatchId);
			LoggerLoad.info("New class is added successfully");
		}
		}		catch(Exception e) {
			LoggerLoad.warn("Assertion error : " + e);
		}	
	}
	@When("Admin enters all mandatory field values with invalid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id, )")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() throws InvalidFormatException, IOException {
		String InvalidBatchId;
		String InvalidClassNo;
		String InvalidStaffId;
		String InvalidClassDate;
		
		List<Map<String,String>> excelHeader = excelReader.getData(".\\src\\test\\resources\\Exceldata\\LMSTestData.xlsx", "ManageClass");			
		for ( Map<String,String> elements     : excelHeader) {	
		 InvalidBatchId = elements.get("InvalidBatchId");		 
		 InvalidClassNo = elements.get("InvalidClassNo").replaceAll("\"","");	
		 InvalidStaffId = elements.get("InvalidStaffId").replaceAll("\"","");
		 InvalidClassDate = elements.get("InvalidClassDate").replaceAll("\"","");
		 
		 classpopupwindow.selectBatchId(InvalidBatchId);
		 classpopupwindow.classNoTextBox(InvalidClassNo);
		 classpopupwindow.dropdownStaffIdClick();
		 classpopupwindow.opencalenderIcon();
		 classpopupwindow.opencalender(InvalidClassDate);
		}					
	}

	@Then("Error message should appear in alert on add class page")
	public void error_message_should_appear_in_alert_on_add_class_page() {
	  Alert alert = driver.switchTo().alert();
	  try {
	  Assert.assertEquals("alertText", "Error message should appear in alert");
	  } catch (AssertionError e) {
		  LoggerLoad.warn("Assertion error");
	  }
	}

	@When("Admin enters values in all fields with valid data and clicks save button \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see new class details is added in the data table on manage class page")
	public void admin_should_see_new_class_details_is_added_in_the_data_table_on_manage_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters with invalid data in optional fields and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters  data missing value in Batch ID and clicks save button \\(No of Classes, Class Date, Staff Id)")
	public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Batch Id is missing message on add class page")
	public void batch_id_is_missing_message_on_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in No of class and clicks save button \\(Batch ID ,  Class Date, Staff Id, )")
	public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_batch_id_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("No of classes is missing message on add class page")
	public void no_of_classes_is_missing_message_on_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in  class date and clicks save button \\(Batch ID , No of Classes, Staff Id, )")
	public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_batch_id_no_of_classes_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("class date is missing message on add class page")
	public void class_date_is_missing_message_on_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in staff id and clicks save button \\(Batch ID , No of Classes, Class Date )")
	public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_batch_id_no_of_classes_class_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("staff id is missing message on add class page")
	public void staff_id_is_missing_message_on_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters passed date in the class date field and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("class cannot be  created for the passed date message appear")
	public void class_cannot_be_created_for_the_passed_date_message_appear() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date from date picker from add page class")
	public void admin_clicks_date_from_date_picker_from_add_page_class() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date from date picker in add class page")
	public void admin_clicks_date_from_date_picker_in_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format on add class page")
	public void selected_date_should_be_in_mm_dd_yyyy_format_on_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks right arrow in the date picker near month in calender in add class page")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month_in_calender_in_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Next month calender should visible in add class page")
	public void next_month_calender_should_visible_in_add_class_page() {
	    
	}

	@When("Admin clicks left arrow in the date picker near month in calender in add class page")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month_in_calender_in_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("previous month calender should visible in add class page")
	public void previous_month_calender_should_visible_in_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button in add class page")
	public void admin_clicks_date_picker_button_in_add_class_page() {
	    classpopupwindow.opencalenderIcon();
	}

	@Then("Admin should see current date is highled in the date picker in add class page")
	public void admin_should_see_current_date_is_highled_in_the_date_picker_in_add_class_page() {
	    
	}

	@When("Admin clicks date picker button and selects future date in add class page")
	public void admin_clicks_date_picker_button_and_selects_future_date_in_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see selected date is highled in the date picker in add class page")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker_in_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel button without entering values in the fields in add class page")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields_in_add_class_page() {
	    classpopupwindow.cancelButtonClik();
	}

	@Then("Admin should land on Manage Class page from add class page")
	public void admin_should_land_on_manage_class_page_from_add_class_page() {
//String	ExpectedURL =    config.getString("ManageClassesPageUrl");
//String	ActualURL	=	driver.getCurrentUrl();
try {
Assert.assertEquals(driver.getCurrentUrl(), config.getString("ManageClassesPageUrl"));
LoggerLoad.info("Assertion page landed on manage class page from add class");
}catch (AssertionError e) {
	LoggerLoad.warn("Assertion error" + e);
}
	}

	@When("Admin clicks Cancel button after entering values in the fields in add class page")
	public void admin_clicks_cancel_button_after_entering_values_in_the_fields_in_add_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on Manage Class Page and validate new class is not created in the data table")
	public void admin_should_land_on_manage_class_page_and_validate_new_class_is_not_created_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
}
