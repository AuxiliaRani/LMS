package stepDefinitionsAssignment;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageAssignment;
import utilities.LoggerLoad;

public class ManageAssignmentSD15 {


	@When("Admin clicks Student button in the navigation bar from assignment page")
	public void Admin_clicks_Student_button_in_the_navigation_bar_from_assignment_page() {
		System.out.format("Admin clicks Student button in the navigation bar");
		ManageAssignment.clickStudentbutton();
	}
	@Then("Admin should able to land on student page from assignment page")
	public void Admin_should_able_to_land_on_student_page_from_assignment_page() {
		System.out.format("Admin should able to land on student page");
		try {
		    
			String StudentPage = null;
			Assert.assertEquals("land on student page", StudentPage);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
	}
	
	
	@When("Admin clicks Program button in the navigation bar from assignment page")
	public void Admin_clicks_Program_button_in_the_navigation_bar_from_assignment_page() {
		System.out.format("Admin clicks Program button in the navigation bar");
	}
	@Then("Admin should able to land on program page from assignment page")
	public void Admin_should_able_to_land_on_program_page_from_assignment_page() {
		System.out.format("Admin should able to land on program page");
try {
		    
			String programPage = null;
			Assert.assertEquals("land on student page", programPage);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
	}
	
	@When("Admin clicks Batch button in the navigation bar from assignment page")
	public void Admin_clicks_Batch_button_in_the_navigation_bar_from_assignment_page() {
		System.out.format("Admin clicks Batch button in the navigation bar");
	}
	@Then("Admin should able to land on batch page from assignment page")
	public void Admin_should_able_to_land_on_batch_page_from_assignment_page() {
		System.out.format("Admin should able to land on batch page");
try {
		    
			String BatchPage = null;
			Assert.assertEquals("land on student page", BatchPage);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
	}

	
	
	@When("Admin clicks User button in the navigation bar from assignment page")
	public void Admin_clicks_User_button_in_the_navigation_bar_from_assignment_page() {
		System.out.format("Admin clicks User button in the navigation bar");
	}
	@Then("Admin should able to land on user page from assignment page")
	public void Admin_should_able_to_land_on_user_page_from_assignment_page() {
	   System.out.format("Admin should able to land on user page");
	   try {
		    
			String UserPage = null;
			Assert.assertEquals("land on student page", UserPage);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
	}
	
	@When("Admin clicks class button in the navigation bar from assignment page")
	public void Admin_clicks_class_button_in_the_navigation_bar_from_assignment_page() {
		System.out.format ("Admin clicks class button in the navigation bar");
	}
	@Then("Admin should able to land on class page from assignment page")
	public void Admin_should_able_to_land_on_class_page_from_assignment_page() {
		System.out.format("Admin should able to land on class page");
try {
		    
			String Classpage = null;
			Assert.assertEquals("land on student page", Classpage);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
		
	}
	

	@When("Admin clicks Attendance button in the navigation bar from assignment page")
	public void Admin_clicks_Attendance_button_in_the_navigation_bar_from_assignment_page() {
		System.out.format ("Admin clicks \" Attendance\" button in the navigation bar");
	}
	@Then("Admin should able to land on Attendance page from assignment page")
	public void Admin_should_able_to_land_on_Attendance_page_from_assignment_page() {
		System.out.format("Admin should able to land on Attendance page");
try {
		    
			String AttendancePage = null;
			Assert.assertEquals("land on student page", AttendancePage );
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
	}

	@When("Admin clicks Logout button in the navigation bar from assignment page")
	public void Admin_clicks_Logout_button_in_the_navigation_bar_from_assignment_page() {
		System.out.format("Admin clicks Logout buton in the navigation bar");
	}
	@Then("Admin should able to land on login page from assignment page")
	public void Admin_should_able_to_land_on_login_page_from_assignment_page() {
		System.out.format("Admin should able to land on login page");
try {
		    
			String LoginPage = null;
			Assert.assertEquals("land on login page", LoginPage);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
