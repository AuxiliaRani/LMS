package stepDefinitionsAssignment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageAssignmentSD12 {

	
	@Given("Admin is in manage assignment page")
	public void Admin_is_in_manage_assignment_page() {
		System.out.format("Admin is in manage assignment page");
	}
	@When("Admin click on assignment name column header to sort")
	public void Admin_click_on_assignment_name_column_header_to_sort() {
		System.out.format("Admin click on assignment name column header to sort");
	}
	@Then("Admin should see data table sorted in descending order")
	public void Admin_should_see_data_table_sorted_in_descending_order() {
		System.out.format("Admin should see data table sorted in descending order");
	}
	
	
	@Given("Admin is in manage assignment page")
	public void Admin_is_In_manage_assignment_page() {
		System.out.format("Admin is in manage assignment page");
	}
	@When("Admin double click on assignment name column header to sort")
	public void Admin_double_click_on_assignment_name_column_header_to_sort() {
		System.out.format("Admin double click on assignment name column header to sort");
	}
	@Then("Admin should see data table sorted in ascending order")
	public void Admin_should_see_data_table_sorted_in_ascending_order() {
		System.out.format("Admin should see data table sorted in ascending order");
	}
}
