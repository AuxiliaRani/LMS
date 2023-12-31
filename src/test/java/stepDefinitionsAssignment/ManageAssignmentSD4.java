package stepDefinitionsAssignment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageAssignment;
import utilities.LoggerLoad;

public class ManageAssignmentSD4 {
	
	ManageAssignmentSD4 manageclass = new ManageAssignmentSD4();
	
	@Given("Admin is in  assignment details popup window")
	public void Admin_is_in_assignment_details_popup_window() {
		System.out.format("Admin is in  assignment details popup window");
		LoggerLoad.info("Admin should see  cancel button in the Assignment detail popup window");
		try {
			ManageAssignment. Admin_should_see_cancel_button_in_the_Assignment_detail_popup_window();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	@When("Admin enters all mandatory field values with valid data and clicks save button ( Program name, batch number,Assignment Name, grade by, Assignment due date)")
	public void Admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_due_date(){
		System.out.format("Admin enters all mandatory field");
		LoggerLoad.info("Admin enters all mandatory field values with valid data and clicks save button ");
		try {
			ManageAssignment.Admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_due_date();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	@Then("Admin should see new assignment details is added in the data table")
	public void Admin_should_see_new_assignment_details_is_added_in_the_data_table() {
		System.out.format("Admin should see new assignment details is added in the data table");
		LoggerLoad.info("Admin should see new assignment details is added in the data table");
		try {
			ManageAssignment.Admin_should_see_new_assignment_details_is_added_in_the_data_table();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin enters all mandatory field values with invalid data and clicks save button Program name, batch number,Assignment Name, grade by, Assignment due date")
	public void Admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_due_date() {
		System.out.format("Admin enters all mandatory field");
	}
	@Then("Error message should appear in alert")
	public void Error_message_should_appear_in_alert() {
		System.out.format("Error message should appear in alert");
		LoggerLoad.info("Error message should appear in alert ");
		try {
			ManageAssignment.Error_message_should_appear_in_alertAssignment_due_date();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin enters values in all fields with valid data and clicks save button Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5")
	public void Admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_Program_name_batch_number_Assignment_Name_Assignment_Description_grade_by_Assignment_due_date_Assignment_File1_Assignment_file_2_Assignment_file_3_Assignment_file_4_Assignment_file_5() {
		System.out.format("Admin enters values in all fields with valid data and clicks save button ");
	}
	
	
	@When("Admin enters with invalid data in optional fields and clicks save button Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5")
	public void Admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_Assignment_File1_Assignment_file_2_Assignment_file_3_Assignment_file_4_Assignment_file_5() {
		System.out.format("Admin enters with invalid data in optional fields and clicks save button Assignment");
	}

	
	
	@When("Admin enters  data missing value in program name and clicks save button batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5")
	public void Admin_enters_data_missing_value_in_program_name_and_clicks_save_button_batch_number_Assignment_Name_Assignment_Description_grade_by_Assignment_due_date_Assignment_File1_Assignment_file_2_Assignment_file_3_Assignment_file_4_Assignment_file_5() {
		System.out.format("Admin enters  data missing value in program name and clicks save button batch number");
	}
	@Then("Program Name is missing")
	public void Program_Name_is_missing() {
		System.out.format("Program Name is missing");
		LoggerLoad.info("Program Name is missing");
		try {
			ManageAssignment.Program_Name_is_missing();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin enters data missing value in Batch number and clicks save button Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5")
	public void Admin_enters_data_missing_value_in_Batch_number_and_clicks_save_button_Program_name_Assignment_Name_Assignment_Description_grade_by_Assignment_due_date_Assignment_File1_Assignment_file_2_Assignment_file_3_Assignment_file_4_Assignment_file_5() {
		System.out.format("Admin enters data missing value in Batch number and clicks save button");
	}
	@Then("Batch number is missing")
	public void Batch_number_is_missing() {
		System.out.format("Batch number is missing");
		LoggerLoad.info("Batch number is missing");
		try {
			//ManageAssignment.();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	
	@When("Admin enters data missing value in Assignment name and clicks save button Program name, batch number,Assignment Name, grade by, Assignment Due date")
	public void Admin_enters_data_missing_value_in_Assignment_name_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_Due_date() {
		System.out.format("Admin enters data missing value in Assignment name and clicks save button Program name");
	}
	@Then("Assignment name is missing")
	public void Assignment_name_is_missing() {
		System.out.format("Assignment name is missing");
		LoggerLoad.info("Assignment name is missing");
		try {
			ManageAssignment.Program_Name_is_missing();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
		
	}
	
	
	@When("Admin enters data missing value in Assignment due date and clicks save button ( Program name, batch number,Assignment Name, grade by)")
	public void	Admin_enters_data_missing_value_in_Assignment_due_date_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by(){
		System.out.format("Admin enters data missing value in Assignment due date and clicks save button");
	}
	@Then("Assignment due date is missing")
	public void Assignment_due_date_is_missing() {
		System.out.format("Assignment due date is missing");
		LoggerLoad.info("Assignment due date is missing");
		try {
			ManageAssignment. Assignment_due_date_is_missing();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin enters data missing value in grade by  and clicks save button Program name, batch number,Assignment Name, Assignment due date")
	public void Admin_enters_data_missing_value_in_grade_by_and_clicks_save_button_Program_name_batch_number_Assignment_Name_Assignment_due_date() {
		System.out.format("Admin enters data missing value in grade");
	}
	@Then("Grade by is missing")
	public void Grade_by_is_missing() {
		System.out.format("Grade by is missing");
		LoggerLoad.info("Grade by is missing");
		try {
			ManageAssignment. Grade_by_is_missing();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}

	
	@When("Admin enters passed date in the due date field and clicks save button Program name, batch number,Assignment Name,grade by,Assignment Due date")
	public void Admin_enters_passed_date_in_the_due_date_field_and_clicks_save_button_Program_name_batch_number_Assignment_Name_grade_by_Assignment_Due_date() {
		System.out.format("Admin enters passed date in the due date field and clicks save button");
	}
	@Then("Assignment cannot be created for the passed date")
	public void Assignment_cannot_be_created_for_the_passed_date() {
		System.out.format("Assignment cannot be created for the passed date");
		LoggerLoad.info("Assignment cannot be created for the passed date");
		try {
			ManageAssignment. Assignment_cannot_be_created_for_the_passed_date();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin clicks date from date picker on assignment")
	public void Admin_clicks_date_from_date_picker_on_assignment() {
		System.out.format("Admin clicks date from date picker");
	}
	@Then("selected date should be their in class date text box on assignment")
	public void selected_date_should_be_their_in_class_date_text_box_on_assignment() {
		System.out.format("selected date should be their in class date text box");
		LoggerLoad.info("Assignment cannot be created for the passed date");
		try {
			ManageAssignment. Assignment_cannot_be_created_for_the_passed_date();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}

	
	@Then("selected date should be in  mm/dd/yyyy format on assignment")
	public void Selected_date_should_be_in_mm_dd_yyyy_format_on_assignment(){
		System.out.format("selected date should be in  mm/dd/yyyy format");
		LoggerLoad.info("selected date should be in  mm/dd/yyyy format");
		try {
			ManageAssignment. Assignment_cannot_be_created_for_the_passed_date();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin clicks right arrow in the date picker near month on assignment")
	public void Admin_clicks_right_arrow_in_the_date_picker_near_month_on_assignment() {
		System.out.format("Admin clicks right arrow in the date picker near month");
	}
	@Then("Next month calender should visible on assignment")
	public void Next_month_calender_should_visible() {
		System.out.format("Next month calender should visible");
	}
	
	
	@When("Admin clicks left arrow in the date picker near month on assignment")
	public void Admin_clicks_left_arrow_in_the_date_picker_near_month_on_assignment() {
		System.out.format("Admin clicks left arrow in the date picker near month");
	}
	@Then("previous month calender should visible on assignment")
	public void previous_month_calender_should_visible_on_assignment() {
		System.out.format("previous month calender should visible");
		LoggerLoad.info("previous month calender should visible");
		try {
			ManageAssignment. previous_month_calender_should_visible();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	
	@Then("Admin should see current date is highled in the date picker on assignment")
	public void Admin_should_see_current_date_is_highled_in_the_date_picker_on_assignment() {
		System.out.format("Admin should see current date");
		LoggerLoad.info("Admin should see current date is highled in the date picker");
		try {
			ManageAssignment. Admin_should_see_current_date_is_highled_in_the_date_picker();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	@When("Admin clicks date picker button and selects future date on assignment")
	public void Admin_clicks_date_picker_button_and_selects_futur_date_on_assignment() {
		System.out.format("Admin clicks date picker button and selects future date");
	}
	@Then("Admin should see selected date is highled in the date picker on assignment")
	public void Admin_should_see_selected_date_is_highled_in_the_date_picker_on_assignment() {
		System.out.format("Admin should see selected date is highled in the date picker");
		LoggerLoad.info("Admin should see current date is highled in the date picker");
		try {
			ManageAssignment. Admin_should_see_current_date_is_highled_in_the_date_picker();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	@When("Admin clicks Cancel button without entering values in the fields on manage assignment page")
	public void Admin_clicks_Cancel_button_without_entering_values_in_the_fields_on_manage_assignment_page() {
		System.out.format("Admin clicks Cancel button without entering values in the fields");
	}
	
	@Then("Admin should land on manage assignment page")
	public void Admin_should_land_on_manage_assignment_page() {
		System.out.format("Admin should land on manage assignment pag");
		LoggerLoad.info("Admin should land on manage assignment page");
		try {
			ManageAssignment. Admin_should_land_on_manage_assignment_page();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin clicks Cancel button entering values in the fields")
	public void Admin_clicks_cancel_button_entering_values_in_the_fields() {
		System.out.format("Admin clicks Cancel button entering values in the fields");
	}
	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
	public void Admin_should_land_on_manage_ssignment_age_and_Validate_new_assignment_is_not_created_in_the_data_table() {
		System.out.format("Admin should land on manage assignment Page and validate new assignment is not created in the data table");
		LoggerLoad.info("Admin should land on manage assignment Page and validate new assignment is not created in the data table");
		try {
			ManageAssignment.Admin_should_land_on_manage_assignment_Page_and_validate_new_assignment_is_not_created_in_the_data_table();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
}
