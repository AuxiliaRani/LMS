package stepDefinitionsAssignment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageAssignmentSD5 {

	
	@Given("Admin is in manage assignment page")
	public void Admin_is_in_manage_assignment_page() {
	System.out.format("Admin is in manage assignment page");
	}
	@When("Admin clicks Edit button in data table")
	public void Admin_clicks_Edit_button_in_data_table() {
		System.out.format("Admin clicks Edit button in data table");
	}
	@Then("Edit popup window appears with heading Assignment Details")
	public void Edit_popup_window_appears_with_heading_Assignment_Details() {
		System.out.format("Edit popup window appears with heading Assignment Details");
	}

	
	@Given("Admin is in manage assignment page")
	public void Admin_is_in_Manage_assignment_page(){
		System.out.format("Admin is in manage assignment page");
	}	
	@When("Admin clicks Edit button from one of the row in data table")
	public void Admin_clicks_Edit_button_from_one_of_the_row_in_data_table() {
		System.out.format("Admin clicks Edit button ");
	}
	@Then("Edit popup window appears with same row values in the all fields")
	public void Edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
		System.out.format("Edit popup window appears");
	}

}
