package stepDefinitionsUser;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Userpage;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class DeleteMultipleUserSD extends DriverFactory{
	
	@Given("None of the checkboxes in data table are selected for multiple user delete")
	public void none_of_the_checkboxes_in_data_table_are_selected_for_multiple_user_delete() {
		boolean areCheckboxesUnchecked = Userpage.areAllCheckboxesUnchecked();

        
        if (areCheckboxesUnchecked) {
            
            LoggerLoad.info("None of the checkboxes are selected for multiple user delete.");
        } else {
            
        	LoggerLoad.info ("Some checkboxes are selected for multiple user delete.");
        }

        
    }
	

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String ManageUser) {
		boolean isDeleteIconDisabled = Userpage.isDeleteIconUnderHeaderDisabled(ManageUser);

        
        if (isDeleteIconDisabled) {
            
        	LoggerLoad.info("The delete icon under the '" + ManageUser + "' header is disabled.");
        } else {
           
        	LoggerLoad.info("The delete icon under the '" + ManageUser + "' header is enabled.");
        }

	}

	@Given("One of the checkbox\\/ row is selected")
	public void one_of_the_checkbox_row_is_selected() {
		boolean isAtLeastOneCheckboxSelected = Userpage.isAtLeastOneCheckboxSelected();

        
        if (isAtLeastOneCheckboxSelected) {
           
        	LoggerLoad.info("At least one checkbox/row is selected.");
        } else {
            
        	LoggerLoad.info("No checkboxes/rows are selected.");
        }

	}

	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header(String Manageuser) {
		Userpage.clickDeleteIconBelowHeader(Manageuser);

	}

	@Then("The respective row in the data table is deleted for multiple user")
	public void the_respective_row_in_the_data_table_is_deleted_for_multiple_user() {
		 String deletedUser =ConfigReader.getdeleteduser(); 

	        
	        boolean isUserPresent = Userpage.isUserPresentInTablemultipleusers(deletedUser);

	      try {  
	        Assert.assertFalse("The user is still available in the data table.", isUserPresent);

	}catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}

	@Given("Two or more checkboxes\\/row is selected")
	public void two_or_more_checkboxes_row_is_selected() {
		 boolean areAtLeastTwoCheckboxesSelected = Userpage.areAtLeastTwoCheckboxesSelected();

	        
	        if (areAtLeastTwoCheckboxesSelected) {
	            
	        	LoggerLoad.info("Two or more checkboxes/rows are selected.");
	        } else {
	            
	        	LoggerLoad.info("Less than two checkboxes/rows are selected.");}
	}

	@When("Click delete icon below {string} header for deleting multiple user")
	public void click_delete_icon_below_header_for_deleting_multiple_user(String ManageUser) {
		
	      
	        Userpage.clickDeleteIconBelowHeader(ManageUser);

	}

	@Then("The respective row in the data table is deleted for users")
	public void the_respective_row_in_the_data_table_is_deleted_for_users() {
		String deletedUser =ConfigReader.getdeleteduser(); 

        
        boolean isUserPresent = Userpage.isUserPresentInTable(deletedUser);

       try {
        Assert.assertFalse("The user is still available in the data table.", isUserPresent);

	}catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}


	


}
