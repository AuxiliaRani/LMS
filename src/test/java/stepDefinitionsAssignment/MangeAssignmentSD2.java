package stepDefinitionsAssignment;


import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageAssignment;
import utilities.LoggerLoad;


public class MangeAssignmentSD2 {
	
		
		@Given("Admin is on manage assignment page")
		public void Admin_is_on_manage_assignment_page() {
			System.out.format("Manage assignment");
			LoggerLoad.info("Title of the current page: " );
			try {
				assertEquals( "LMS", "Manage Assignment");
			} catch (AssertionError e) {
				LoggerLoad.error("Assertion failed: " + e.getMessage());
			}
			
		}
		@When("Admin enters assignment name into search box")
		public void Admin_enters_assignment_name_into_search_box() {
			System.out.format("enter assignment");
			
		}
		@Then("Displays entries with that assignment name")
		public void Displays_entries_with_that_assignment_name(){
			System.out.format("display entries");
			 LoggerLoad.info("Displays entries with that assignment name");
				try {
					ManageAssignment.Displays_entries_with_that_assignment_name();
				} catch (Error e) {
					LoggerLoad.error(e.getMessage());
				}
		}
		
		
		
		@When("Admin enters assignment name is not existing the table into search box")
		public void Admi_enters_assignment_name_is_not_existing_the_table_into_search_box() {
			System.out.format("enter assignment is not in existing table");
		}
		@Then("Displays empty details in the data table for search box")
		public void Displays_empty_details_in_the_data_table_for_search_box() {
			System.out.format("empty Details");
			 LoggerLoad.info("Displays empty details in the data table");
				try {
					ManageAssignment.Displays_empty_details_in_the_data_table();
				} catch (Error e) {
					LoggerLoad.error(e.getMessage());
				}
		}
		
		
		
		@When("Admin enters assignment description into search box")
		public void Admin_enters_assignment_description_into_search_box() {
			System.out.format("Admin Enter assignment");
		}
		@Then("Displays entries with that assignment description")
		public void Displays_entries_with_that_assignment_description() {
			System.out.format("Display Entries");
			 LoggerLoad.info("Displays entries with that assignment name");
				try {
					ManageAssignment.Displays_entries_with_that_assignment_name();
				} catch (Error e) {
					LoggerLoad.error(e.getMessage());
				}
		}
		
		
		
		@When("Admin enters assignment description which is not existing the table into search box")
		public void Admin_enters_assignment_description_which_is_not_existing_the_table_into_search_box() {
			System.out.format("Enter assignment description");
		}
		@Then("Displays empty details in the data table for search box1")
		public void Displays_empty_details_in_the_Data_table_for_search_box1() {
			System.out.format("Display empty Details");
			LoggerLoad.info("Displays empty details in the data table");
			try {
				ManageAssignment.Displays_empty_details_in_the_data_table();
			} catch (Error e) {
				LoggerLoad.error(e.getMessage());
			}
		}
		
		
		@When("Admin enters assignment due date into search box")
		public void Admin_enters_assignment_due_date_into_search_box(){
			System.out.format("Due Date");
		}
		@Then("Displays entries with that assignment due date")
		public void Displays_entries_with_that_assignment_due_date() {
			System.out.format("Display Entries with date");
			 LoggerLoad.info("Displays entries with that assignment due date");
				try {
					ManageAssignment.Displays_entries_with_that_assignment_due_date();
				} catch (Error e) {
					LoggerLoad.error(e.getMessage());
				}
		}
		
		
		@When("Admin enters assignment due date which is not existing the table into search box")
		public void Admin_enters_assignment_due_date_which_is_not_existing_the_table_into_search_box() {
			System.out.format("Admin enters assignment due date");
		}
		@Then("Displays empty details in the data table for search box2")
		public void Displays_empty_details_in_the_data_Table_for_search_box2() {
			System.out.format("Display empty deatails");
			LoggerLoad.info("Displays empty details in the data table");
			try {
				ManageAssignment.Displays_empty_details_in_the_data_table();
			} catch (Error e) {
				LoggerLoad.error(e.getMessage());
			}
		}
		
		
		@When("Admin Enters Grade value Into search box")
		public void Admin_Enters_Grade_value_Into_search_box(){
			System.out.format("Admin Enters Grade value");
		}
		@Then("Displays entries with that assignment grade")
		public void Displays_entries_with_that_assignment_grade() {
			System.out.format("Display entries");
			 LoggerLoad.info("Displays entries with that assignment name");
				try {
					ManageAssignment.Displays_entries_with_that_assignment_name();
				} catch (Error e) {
					LoggerLoad.error(e.getMessage());
				}
		}
		
		
		
		@When("Admin enters grade value which is not existing the table into search box")
		public void Admin_enters_Grade_value_Which_Is_Not_existing_the_table_into_search_box() {
			System.out.format("Admin enters grade value which is not existing the table");
		}
		@Then("Displays empty details in the data table for search box3")
		public void Displays_Empty_details_in_the_data_table_for_search_box3() {
			System.out.format("Displays empty details in Display the data table");
			LoggerLoad.info("Displays empty details in the data table");
			try {
				ManageAssignment.Displays_empty_details_in_the_data_table();
			} catch (Error e) {
				LoggerLoad.error(e.getMessage());
			}
		}
	}




