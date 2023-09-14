package stepDefinitionsAssignment;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class ManageAssignment11 {
	
	@Then("Redirected to assignment page and selected assignment details11 are deleted from the data table")
	public void Redirected_to_assignment_page_and_selected_assignment_details11_are_deleted_from_the_data_table() {
		System.out.format("Redirected to assignment page and selected assignment details are deleted ");
		try { 
			Assert.assertTrue(ManageAssignmentSD10.selectdelete());}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" delete " + e);
		  	  }
		  	LoggerLoad.info(" Deleted ");
	}

	
	@Then("Redirected to assignment page and selected assignment details11 are not deleted from the data table")
	public void Redirected_to_assignment_page_and_selected_assignment_details11_are_not_deleted_from_the_data_table() {
		System.out.format("Redirected to assignment page and selected assignment details are not deleted");
		
		try { 
			Assert.assertTrue(ManageAssignmentSD10.selectdelete());}
		  	  catch(AssertionError e) {
		  		 LoggerLoad.info(" disable delete " + e);
		  	  }
		  	LoggerLoad.info("not deleted");
	
	}


}
