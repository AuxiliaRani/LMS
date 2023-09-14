package stepDefinitionsAssignment;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class ManageAssignmentSD5 extends DriverFactory {
	
	ManageAssignmentSD5 manageAssignment = new ManageAssignmentSD5();

	
	@Given("Admin is in manage assignment page")
	public void Admin_is_in_manage_assignment_page() {
	System.out.format("Admin is in manage assignment page");
	LoggerLoad.info("Admin is On Dashboard Page after Login");
	}
	@When("Admin clicks Edit button in data table")
	public void Admin_clicks_Edit_button_in_data_table() {
		System.out.format("Admin clicks Edit button in data table");
	}
	@Then("Edit popup window appears with heading Assignment Details")
	public void Edit_popup_window_appears_with_heading_Assignment_Details() {
		System.out.format("Edit popup window appears with heading Assignment Details");
		long startTime = System.currentTimeMillis();
		ManageAssignmentSD5.clickClassButton();
		 boolean isDisplayed =  manageAssignment.Edit_popup_window_appears();
	try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 long endTime = System.currentTimeMillis();
		 long loadTime = endTime-startTime;	
		  System.out.println("Page load time in milliseconds: " + loadTime);
		LoggerLoad.info("age :Edit popup window appears with heading Assignment Details"+ loadTime);
	}

	
	private boolean Edit_popup_window_appears() {
		// TODO Auto-generated method stub
		return false;
	}
	private static void clickClassButton() {
		// TODO Auto-generated method stub
		
	}
	
	@When("Admin clicks Edit button from one of the row in data table")
	public void Admin_clicks_Edit_button_from_one_of_the_row_in_data_table() {
		System.out.format("Admin clicks Edit button ");
	}
	@Then("Edit popup window appears with same row values in the all fields")
	public void Edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
		System.out.format("Edit popup window appears");
		long startTime = System.currentTimeMillis();
		ManageAssignmentSD5.clickClassButton();
		 boolean isDisplayed =  manageAssignment.Edit_popup_window_appears();
	try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 long endTime = System.currentTimeMillis();
		 long loadTime = endTime-startTime;	
		  System.out.println("Page load time in milliseconds: " + loadTime);
		LoggerLoad.info("Edit popup window appears with same row values in the all fields:"+ loadTime);
	}
	}


