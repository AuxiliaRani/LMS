package stepDefinitionsAssignment;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageAssignment;
import utilities.LoggerLoad;

public class ManageAssignmentSD3 {
	
	
	@When("Admin click +Add new assignment button")
	public void Admin_click_Add_new_assignment_button(){
		System.out.format("Admin click +Add new assignment button");
	}
	@Then("Admin should see a popup  with  heading Assignment details")
	public void Admin_should_see_a_popup_with_heading_Assignment_details() {
		System.out.format("Admin should see a popup");
		LoggerLoad.info("Admin should see a popup  with  heading Assignment details");
		try {
			ManageAssignment.Admin_should_see_a_popup_with_heading_Assignment_details();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	
	@When("Admin click +Add new assignment button")
	public void Admin_click_Add_New_assignment_button() {
		System.out.format("Admin click +Add new assignment button");
	}
	
	@Then("Admin should see input fields Text (Program name, batch number,Assignment Name, \n"
			+ "			Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, \n"
			+ "			Assignment file 3, Assignment file 4, Assignment file 5)")
						
	public void	Admin_should_see_input_fields_Text_Program_name_batch_number_Assignment_Name_nAssignment_Description_grade_by_Assignment_due_date_Assignment_File1_Assignment_file2_nAssignment_file3_Assignment_file4_Assignment_file5 () {
		
		System.out.format("Admin should see input fields Text Program name batch number Assignment Name,Assignment Description, gradeby ,Assignment due date, Assignment File1,Assignment file2,\n"
				+ "				Assignment file3, Assignment file4,Assignment file5");	
				}
	
	
	
	@When("Admin click +Add new assignment button")
	public void Admin_Click_Add_New_Assignment_Button(){
		System.out.format("Admin click +Add new assignment button");
	}
	
	@Then("8 textbox should be  present in Assignment details popup window")
	public void textbox_should_be_present_in_Assignment_details_popup_window() {
		System.out.format("Assignment details popup window");
		LoggerLoad.info("8 textbox should be  present in Assignment details popup window");
		try {
			ManageAssignment.Admin_should_see_a_popup_with_heading_Assignment_details();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin click +Add new assignment button")
	public void Admin_Click_add_New_Assignment_Button(){
		System.out.format("Admin click +Add new assignment button");
	}
	@Then("Admin should see  dropdown option for Batch Number")
	public void Admin_should_see_dropdown_option_for_Batch_Number() {
		System.out.format("Admin should see  dropdown option for Batch Number");
		LoggerLoad.info("Admin should see  dropdown option for Batch Number");
		try {
			ManageAssignment.Admin_should_see_dropdown_option_for_Batch_Number();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin click +Add new assignment button")
	public void Admin_click_Add_new_assignment_Button() {
		System.out.format("Admin click +Add new assignment button");
	}
	@Then("Admin should see  dropdown option for Program name")
	public void Admin_should_see_dropdown_option_for_Program_name() {
		System.out.format("Admin should see  dropdown option");
		LoggerLoad.info("Admin should see  dropdown option for Program name");
		try {
			ManageAssignment.dropdown();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin click +Add new assignment button")
	public void Admin_Click_Add_new_assignment_Button(){
		System.out.format("Admin click +Add new assignment button");
	}
	@Then("Admin should see  calendar icon for assignment due date")
	public void Admin_should_see_calendar_icon_for_assignment_due_date() {
		System.out.format("Admin should see  calendar icon");
		LoggerLoad.info("Admin should see  calendar icon for assignment due date");
		try {
			ManageAssignment.Admin_should_see_calendar_icon_for_assignment_due_date();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	@When("Admin click +Add new assignment button")
	public void Admin_Click_Add_New_assignment_button(){
		System.out.format("Admin click +Add new assignment button");
	}
	@Then("Admin should see  save button in the Assignment detail popup window")
	public void Admin_should_see_save_button_in_the_Assignment_detail_popup_window() {
		System.out.format("Admin should see  save button");
	}
	
	
	@When("Admin click +Add new assignment button")
	public void Admin_Click_Add_new_assignment_button() {
		System.out.format("Admin click +Add new assignment button");
	}
	@Then("Admin should see  save button in the Assignment detail popup window")
	public void Admin_should_see_save_button_In_The_Assignment_detail_popup_window() {
		System.out.format("Admin should see save button");
		LoggerLoad.info("Admin should see  save button in the Assignment detail popup window");
		try {
			ManageAssignment. Admin_should_see_save_button_In_The_Assignment_detail_popup_window();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin click +Add new assignment button")
	public void Admin_Click_Add_New_assignment_Button() {
		System.out.format("Admin click +Add new assignment button");
	}
	@Then("Admin should see  cancel button in the Assignment detail popup window")
	public void Admin_should_see_cancel_button_in_the_Assignment_detail_popup_window() {
		System.out.format("Admin should see  cancel button in the Assignment detail popup window");
		LoggerLoad.info("Admin should see  cancel button in the Assignment detail popup window");
		try {
			ManageAssignment. Admin_should_see_cancel_button_in_the_Assignment_detail_popup_window();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
	
	
	@When("Admin click +Add new assignment button")
	public void Admin_Click_Add_New_Assignment_button() {
		System.out.format("Admin click +Add new assignment button");
	}
	@Then("Admin should see close button on the Assignment details popup window")
	public void Admin_should_see_close_button_on_the_Assignment_details_popup_window() {
		System.out.format("Admin should see close button");
		LoggerLoad.info("Admin should see close button on the Assignment details popup window");
		try {
			ManageAssignment. Admin_should_see_close_button_on_the_Assignment_details_popup_windoww();
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}
}	



