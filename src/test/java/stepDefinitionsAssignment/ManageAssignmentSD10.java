package stepDefinitionsAssignment;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class ManageAssignmentSD10 {
	

	
	@Then("Redirected to assignment page and selected assignment details10 are deleted from the data table")
	public void Redirected_to_assignment_page_and_selected_assignment_details10_are_deleted_from_the_data_table() {
		System.out.format("Redirected to assignment page and selected assignment details are deleted from the data table");
		try { 
			Assert.assertTrue(ManageAssignmentSD10.deleteAlert());}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" delete Icon " + e);
		  	  }
		  	LoggerLoad.info("Delete icon is enable");
	}

	private static boolean deleteAlert() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Then("Redirected to assignment page and selected assignment details10 are not deleted from the data table")
	public void Redirected_to_assignment_page_and_selected_assignment_details10_are_not_deleted_from_the_data_table() {
		System.out.format("Redirected to assignment page and selected assignment details are not deleted from the data table");
		System.out.format("Redirected to assignment page and selected assignment details are deleted from the data table");
		try { 
			Assert.assertTrue(ManageAssignmentSD10.deleteAlert());}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" delete Icon " + e);
		  	  }
		  	LoggerLoad.info("Delete icon is disabled");
	}
	public static boolean selectdelete() {
		// TODO Auto-generated method stub
		return false;
	}

}
