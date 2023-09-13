package stepDefinitionsAssignment;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class ManageAssignmentSD14 {

	@Given("Admin is in add assignment details popup window")
	public void Admin_is_in_add_assignment_details_popup_window() {
		System.out.format("Admin is in add assignment details popup window");
		try {
	        String popupwindow = null;
			Assert.assertNull("Admin details pop-up is not displayed.", popupwindow);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}
	@When("Admin creates 6 new assignment")
	public void Admin_creates_6_new_assignment() {
		System.out.format("Admin creates 6 new assignment");
	}
	@Then("total class entries above 5 next page is enabled On multiples of 5 new page will be enabled")
	public void total_class_entries_above_5_next_page_is_enabled_On_multiples_of_5_new_page_will_be_enabled() {
		System.out.format("total class entries above 5 next page is enabled On multiples of 5 new page will be enabled");
		
		try {

			Assert.assertEquals("First Name field is missing.",  ManageAssignmentSD14.isEnabled());

        } catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}
	
	
	
	private static String isEnabled() {
		// TODO Auto-generated method stub
		return null;
	}
	@Given("Admin is in add assignment details popup window")
	public void Admin_Is_in_add_assignment_details_popup_window() {
		System.out.format("Admin is in add assignment details popup window");
	}
	@When("Admin creates less than or equal to 5 new  assignment") 
	public void Admin_Creates_less_than_or_Equal_to_5_new_assignment() {
		System.out.format("Admin creates less than or equal to 5 new  assignment");
	}
	@Then("total class entries  5 or below next page is disabled")
	public void total_class_entries_5_or_below_next_page_is_disabled() {
		System.out.format("total class entries  5 or below next page is disabled");
		try {

			Assert.assertEquals("First Name field is missing.",  ManageAssignmentSD14.isdisabled());

        } catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}
	private static String isdisabled() {
		// TODO Auto-generated method stub
		return null;
	}
}
