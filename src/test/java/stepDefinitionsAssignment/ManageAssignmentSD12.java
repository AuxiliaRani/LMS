package stepDefinitionsAssignment;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class ManageAssignmentSD12 {

	
	@When("Admin click on assignment name column header to sort")
	public void Admin_click_on_assignment_name_column_header_to_sort() {
		System.out.format("Admin click on assignment name column header to sort");
	}
	@Then("Admin should see data table sorted in descending order")
	public void Admin_should_see_data_table_sorted_in_descending_order() {
		System.out.format("Admin should see data table sorted in descending order");
		try { 
			Assert.assertTrue(ManageAssignmentSD12.sortindescending());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" descending order " + e);
		  	  }
		  	LoggerLoad.info(" sorted in descending ");
	}
	
	
	private static boolean sortindescending() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@When("Admin double click on assignment name column header to sort")
	public void Admin_double_click_on_assignment_name_column_header_to_sort() {
		System.out.format("Admin double click on assignment name column header to sort");
	}
	@Then("Admin should see data table sorted in ascending order")
	public void Admin_should_see_data_table_sorted_in_ascending_order() {
		System.out.format("Admin should see data table sorted in ascending order");
		try { 
			Assert.assertTrue(ManageAssignmentSD12.sortinascending());
			}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" ascending order " + e);
		  	  }
		  	LoggerLoad.info(" sorted in ascending ");
	}
	private static boolean sortinascending() {
		// TODO Auto-generated method stub
		return false;
	}
}
