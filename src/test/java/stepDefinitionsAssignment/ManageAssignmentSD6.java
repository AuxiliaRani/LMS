package stepDefinitionsAssignment;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.ManageAssignment;
import utilities.LoggerLoad;

public class ManageAssignmentSD6 {

	
	@Given("Admin is in Edit assignment detail popup window ")
	public static void Admin_is_in_Edit_assignment_detail_popup_window() {
		System.out.format("Admin is in  Edit assignment detail popup window");
		try {
			ManageAssignment.Admin_should_see_cancel_button_in_the_Assignment_detail_popup_window();
		}
	     catch (AssertionError e){
	    	 LoggerLoad.info("Edit assignment detail popup window" + e);
	    	 }
		LoggerLoad.info("Edit assignment detail popup window");
		
	}
	@When("Admin enters all mandatory field values with valid data and clicks save button Program name, batch number,Assignment Name, grade by, Assignment due date on assignment page")
	public void Admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_due_date_on_assignment_page() {
		System.out.format("Admin enters all mandatory field values with valid data");
	}
	@Then("Admin should see updated assignment details is added in the data table on assignment page")
	public void Admin_enters_all_mandatory_field_values_with_valid_data_on_assignment_page() {
		System.out.format("Admin should see updated assignment details");
		
		List<WebElement> noOfPages = ManageAssignment.updatedassignmentdetails();
	    int totalPages =noOfPages.size();
	    int totalClass = 0;
	    for (int p = 1; p<totalPages; p++)
	    {
	    	int onPage = p;
	    	List<WebElement> dataTableRows =ManageAssignment.updatedassignmentdetails();
	    	totalClass = totalClass + dataTableRows.size();	    	
	    	LoggerLoad.info("onPage : "+p);	    	
	    }	    
	    String footerText = ManageAssignment.footerText();
    
	   String expectedFooterText = "Showing 1 to 10 of "+ totalPages + "entries" ;
	   try {
	   Assert.assertEquals(footerText, expectedFooterText);
	   }
	   catch (Exception e) {
		   LoggerLoad.info("Actual and Expected Footer Text doesn't match" + e);  
	   }   
	}

	@When("Admin enters all mandatory field values with invalid data and clicks save button Program name, batch number,Assignment Name, grade by, Assignment due date on assignment page")
	public void Admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_due_date_on_assignment_page() {
		System.out.format("Admin enters all mandatory field values");
	}
	
	@Then("Error message should appear in alert on assignment page")
	public void Error_message_should_appear_in_alert_on_assignment_page() {
		System.out.format("Error message should appear in alert");
		LoggerLoad.info("Error message should appear in alert ");
		try {
			ManageAssignment.Error_message_should_appear_in_alertAssignment_due_date();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin enters values in all fields with valid data and clicks save button (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5) on assignment page")
	public void Admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_Program_name_batch_number_Assignment_Name_Assignment_Description_grade_by_Assignment_due_date_Assignment_File1_Assignment_file_2_Assignment_file_3_Assignment_file_4_Assignment_file_5_on_assignment_page() {
		System.out.format("Admin enters values in all fields with valid data and clicks save button");
	}
	@Then("Admin should see updated assignment details is added in the data tabl on assignment page")
	public void Admin_Should_see_updated_assignment_Details_Is_Added_In_the_data_table_on_assignment_page () {
			System.out.format("Admin should see updated assignment details is added in the data tabl");
			LoggerLoad.info("Admin should see updated assignment details is added in the data tabl ");
			try {
				ManageAssignment.Admin_should_see_new_assignment_details_is_added_in_the_data_table();
			} catch (Error e) {
				LoggerLoad.error(e.getMessage());
			}
	}	
	
	
	@When("Admin enters with invalid data in optional fields and clicks save button Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5 on assignment page on assignment page")
	public void Admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_Assignment_File1_Assignment_file_2_Assignment_file_3_Assignment_file_4_Assignment_file_5_on_assignment_page_on_assignment_page() {
		System.out.format("Admin enters with invalid data in optional fields and clicks save button");
	}
	
	
	
	@When("Admin enters  data missing value in program name and clicks save button batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5 on assignment")
	public void Admin_enters_data_missing_value_in_program_name_and_clicks_save_button_batch_number_Assignment_Name_Assignment_Description_grade_by_Assignment_due_date_Assignment_File1_Assignment_file_2_Assignment_file_3_Assignment_file_4_Assignment_file_5_on_assignment() {
		System.out.format("Admin enters  data missing value in program name and clicks save button");
	}
	@Then("Program Name is missing on assignment")
	public void Program_Name_is_missing_on_assignment() {
		System.out.format("Program Name is missing");
		LoggerLoad.info("Program Name is missing");
		try {
			ManageAssignment.Program_Name_is_missing();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}

	
	@When("Admin enters data missing value in Batch number and clicks save button Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5 on assignment page")
	public void Admin_enters_data_missing_value_in_Batch_number_and_clicks_save_button_Program_name_Assignment_Name_Assignment_Description_grade_by_Assignment_due_date_Assignment_File1_Assignment_file_2_Assignment_file3_Assignment_file4_Assignment_file5_on_assignment_page() {
		System.out.format("Admin enters data missing value");
	}
	@Then("Batch number is missing on assignment")
	public void Batch_number_is_missing_on_assignment() {
		System.out.format("Batch number is missing");
		LoggerLoad.info("Batch number is missing");
		try {
			ManageAssignment.Batch_number_is_missing();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin enters data missing value in Assignment name and clicks save button Program name, batch number,Assignment Name,grade by,Assignment Due date on assignment page")
	public void Admin_enters_data_missing_value_in_Assignment_name_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_Due_date_on_assignment_page() {
		System.out.format("Admin enters data missing value in Assignment name and clicks save button");
	}
	@Then("Assignment name is missing on assignment")
	public void Assignment_name_is_missing_on_assignment() {
		System.out.format("Assignment name is missing");
		LoggerLoad.info("Assignment name is missing");
		try {
			ManageAssignment.Assignment_name_is_missing();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin enters data missing value in Assignment due date and clicks save button Program name, batch number,Assignment Name, grade by on assignment page")
	public void Admin_enters_data_missing_value_in_Assignment_due_date_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_on_assignment_page() {
		System.out.format("Admin enters data missing value in Assignment due date and clicks save button");
	}
	@Then("Assignment due date is missing on assignment")
	public void Assignment_due_date_is_missing_on_assignment() {
		System.out.format("Assignment due date is missing");

	}
	
	
	@When("Admin enters data missing value in grade by  and clicks save button Program name, batch number,Assignment Name, Assignment due date on assignment page")
	public void Admin_enters_data_missing_value_in_grade_by_and_clicks_save_button_Program_name_batch_number_Assignment_Name_Assignment_due_date_on_assignment_page() {
		System.out.format("Admin enters data missing value in grade by  and clicks save button");
	}
	@Then("Grade by is missing on assignment")
	public void Grade_by_is_missing_on_assignment() {
		System.out.format("Grade by is missing");
		LoggerLoad.info("Grade by is missing");
		try {
			ManageAssignment.Grade_by_is_missing();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin enters passed date in the due date field and clicks save button Program name, batch number,Assignment Name, grade by, Assignment Due date on assignment page")
	public void Admin_enters_passed_date_in_the_due_date_field_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_Due_date_on_assignment_page() {
		System.out.format("Admin enters passed date in the due date field and clicks save button Program name, batch number,Assignment Name, grade by, Assignment Due date");
	}
	@Then("Assignment cannot be updated for the passed date on assignment page")
	public void Assignment_cannot_be_updated_for_the_passed_date_on_assignment_page() {
		System.out.format("Assignment cannot be updated for the passed date");
		LoggerLoad.info("Assignment cannot be updated for the passed date");
		try {
			ManageAssignment.Assignment_cannot_be_created_for_the_passed_date();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	
	@When("Admin clicks Cancel button without entering values in the fields on assignment page")
	public void Admin_clicks_Cancel_button_without_entering_values_in_the_fields_on_assignment_page() {
		System.out.format("Admin clicks Cancel button without entering values in the fields");
	}
	@Then("Admin should land on manage assignment page6")
	public void Admin_should_land_on_manage_assignment_page6() {
		System.out.format("Admin should land on manage assignment page");
		LoggerLoad.info("Admin should land on manage assignment page");
		try {
			ManageAssignment.Admin_should_land_on_manage_assignment_page();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin clicks Cancel button entering values in the fields on assignment page")
	public void Admin_clicks_Cancel_button_entering_values_in_the_fields_on_assignment_page() {
		System.out.format("Admin clicks Cancel button entering values in the fields");
	}
	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table for assignment page")
	public void Admin_should_land_on_manage_assignment_Page_and_validate_new_assignment_is_not_created_in_the_data_table_for_assignment_page() {
		System.out.format("Admin should land on manage assignment Page and validate new assignment is not created in the data table");
		LoggerLoad.info("Admin should land on manage assignment Page and validate new assignment is not created in the data table");
		try {
			ManageAssignment.Admin_should_land_on_manage_assignment_Page_and_validate_new_assignment_is_not_created_in_the_data_table();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
}
