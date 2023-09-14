package stepDefinitionsUser;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Userpage;
import utilities.LoggerLoad;

public class UserPageSD extends DriverFactory {

	
	@Given("Admin is on dashboard page after Login for user page")
	public void admin_is_on_dashboard_page_after_login_for_user_page() {
		String dashboardTitle = Userpage.getDashboardTitleText();
		LoggerLoad.info("Title of the current page: " + dashboardTitle);
		try {
		assertEquals(dashboardTitle,"Manage Program", "Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	 }
	

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
	    Userpage.clickuserLink();
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
		 boolean isAssignstaffVisible = Userpage.isAssignstaffVisible();
try {
	     Assert.assertTrue("Assignstaff is not visible", isAssignstaffVisible);
	} catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}

	@Then("Admin should be able to see the search text box on user page")
	public void admin_should_be_able_to_see_the_search_text_box_on_user_page() {
	    boolean isSearchboxvisible=Userpage.isSearchboxVisible();
	    try {
	    Assert.assertTrue("Searchbox is not visible", isSearchboxvisible);
	} catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}

	@Then("Each row in the data table should have a checkbox on user page")
	public void each_row_in_the_data_table_should_have_a_checkbox_on_user_page() {
		boolean checkboxesPresentInAllRows = Userpage.areCheckboxesPresentInAllRows();
   try {
        Assert.assertTrue("Not all rows have checkboxes", checkboxesPresentInAllRows);
    } catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}

	@Then("Each row in the data table should have a edit icon that is enabled on user page")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled_on_user_page() {
		
		boolean editIconsEnabledInAllRows = Userpage.areEditIconsEnabledInAllRows();
try {
        
        Assert.assertTrue("Not all rows have enabled edit icons", editIconsEnabledInAllRows);
    } catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}
	

	@Then("Each row in the data table should have a delete icon that is enabled on user page")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled_on_user_page() {
		 
		boolean deleteIconsEnabledInAllRows = Userpage.areDeleteIconsEnabledInAllRows();

       try { 
        Assert.assertTrue("Not all rows have enabled delete icons", deleteIconsEnabledInAllRows);
    } catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}}

	@Given("Admin is on dashboard page after Login and Admin clicks {string} from navigation bar")
	public void admin_is_on_dashboard_page_after_login_and_admin_clicks_from_navigation_bar(String string) {
	    Userpage.clickuserLink();
	}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
		Userpage.clicknewUser();
	}

	@Then("A new pop up with User details appears")
	public void a_new_pop_up_with_user_details_appears() {
		boolean isPopupDisplayed = Userpage.isPopupDisplayed();
try {
        Assert.assertTrue("User details pop-up is not displayed.", isPopupDisplayed);
	}  catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}


	
}}
