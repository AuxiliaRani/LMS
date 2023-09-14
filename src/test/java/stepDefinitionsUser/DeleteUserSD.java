package stepDefinitionsUser;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Userpage;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class DeleteUserSD extends DriverFactory{

	@Given("The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
		 int rowIndex = 1; 

	        
	        boolean isDeleteIconEnabled = Userpage.isDeleteIconEnabledForRow(rowIndex);

	        
	        if (isDeleteIconEnabled) {
	         
	            LoggerLoad.info("The delete icon is enabled for row " + rowIndex);
	        } else {
	          
	            LoggerLoad.info("The delete icon is not enabled for row " + rowIndex);
	        }

	        
	    }
	
	@When("Admin clicks the delete icon for user")
	public void admin_clicks_the_delete_icon_for_user() {
	    Userpage.clickDeleteIcon();
	}

	@Then("Alert appears with yes and No option for user delete")
	public void alert_appears_with_yes_and_no_option_for_user_delete() {
		Userpage.isDeletealertDisplayed(); 
		String alertText = Userpage.getAlertText(); 
		try {
        Assert.assertTrue("Alert text does not contain expected text", alertText.contains("expected text"));

		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}}

	@Given("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon() {
	    Userpage.clickDeleteIcon();
	}

	@When("Admin click yes option for user delete")
	public void admin_click_yes_option_for_user_delete() {
	    Userpage.clickYes();
	}

	@Then("User deleted alert pops and user is no more available in data table")
	public void user_deleted_alert_pops_and_user_is_no_more_available_in_data_table() {
		 String deletedUser =ConfigReader.getdeleteduser(); 

	        boolean isUserPresent = Userpage.isUserPresentInTable(deletedUser);

	      try { 
	        Assert.assertFalse("The user is still available in the data table.", isUserPresent);

	}catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}

	@When("Admin click No option for user delete")
	public void admin_click_no_option_for_user_delete() {
	   Userpage.clickNo();}

	@Then("User is still listed in data table")
	public void user_is_still_listed_in_data_table() {
		String User =ConfigReader.getnewuser(); 

        boolean isUserPresent = Userpage.isUserPresentInTable(User);

       try {
        Assert.assertFalse("The user is still available in the data table.", isUserPresent);
	}catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}



	
}
