package stepDefinitionsUser;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Userpage;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class EditUserSD extends DriverFactory{

	@Given("The edit icon on row level in data table is enabled for user")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled_for_user() {
		boolean isEditIconEnabled;
		    isEditIconEnabled = Userpage.isEditIconEnabledForUser("username");
		    try {
		     Assert.assertTrue("The edit icon is not enabled for user: " + "username", isEditIconEnabled);
	} catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}

	@When("Admin clicks the edit icon in userpage")
	public void admin_clicks_the_edit_icon_in_userpage() {
	   Userpage.clickEditIcon();
	}

	@Then("A new pop up with User details appears for userpage")
	public void a_new_pop_up_with_user_details_appears_for_userpage() {
		boolean isPopupDisplayed = Userpage.isUserDetailsPopupDisplayed();
try {
       Assert.assertTrue("The User details popup is not displayed", isPopupDisplayed);
    }catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}
	

	@Given("Admin clicks the edit icon for user")
	public void admin_clicks_the_edit_icon_for_user() {
		Userpage.clickEditIcon();
	}

	@When("Update the fields with valid values and click submit for user")
	public void update_the_fields_with_valid_values_and_click_submit_for_user() {
		String location=ConfigReader.getlocation();
		Userpage.updateUserInfo(location);
	}

	@Then("The updated user details should appear on the data table")
	public void the_updated_user_details_should_appear_on_the_data_table() {
		
		
		 String updatedlocation =ConfigReader.getlocation();
	       
	        

	        boolean areUserDetailsUpdated = Userpage.isUserDetailsUpdated(updatedlocation);
try {
	        Assert.assertTrue("The updated user details are not found in the data table", areUserDetailsUpdated);
	    }catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}}
	

	@When("Update the fields with invalid values and click submit for user")
	public void update_the_fields_with_invalid_values_and_click_submit_for_user() {
		String location="invalid";
		Userpage.updateUserInfo(location);
	}

	@Then("Error message should appear for user")
	public void error_message_should_appear_for_user() {
		String expectedErrorMessage = "Invalid data. Please check the fields."; 

        String actualErrorMessage = Userpage.getErrorMessageText();
try {
        Assert.assertTrue("Error message does not match the expected message", actualErrorMessage.contains(expectedErrorMessage));
    }catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}
	

	@When("Erase data from mandatory field for user")
	public void erase_data_from_mandatory_field_for_user() {
		Userpage.eraseFirstNameField();
    }
	

	@Then("Error message should appear for user mandotry fields erased")
	public void error_message_should_appear_for_user_mandotry_fields_erased() {
		String expectedErrorMessage = "Mandatory fields cannot be empty."; 

        String actualErrorMessage = Userpage.getErrorMessageText();
try {
       Assert.assertTrue("Error message does not match the expected message", actualErrorMessage.contains(expectedErrorMessage));
    }catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}
	

	@When("Erase data from description field for user")
	public void erase_data_from_description_field_for_user() {
	    Userpage.erasedescriptionField();
	}

	@Then("The updated user details should appear on the data table for user")
	public void the_updated_user_details_should_appear_on_the_data_table_for_user() {
		String updatedlocation=ConfigReader.getlocation();
		boolean areUserDetailsUpdated = Userpage.isUserDetailsUpdated(updatedlocation);
try {
        Assert.assertTrue("The updated user details are not found in the data table", areUserDetailsUpdated);
    }catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}
	}

	

