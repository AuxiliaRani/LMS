package stepDefinitionsBatch;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;
import utilities.TestContextSetup;

public class BatchPageValidationSD {
	
TestContextSetup testContextSetup;
	
	public BatchPageValidationSD(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	
	String dashBoardURL = config.getString("DashBoardPageUrl");
	System.out.println("===****=====Priya=====*****=====" + dashBoardURL);

	String AddClassesPageUrl = config.getString("ManageClassesPageUrl");
	System.out.println("===****=====Priya=====*****=====" + AddClassesPageUrl);
	LoggerLoad.info("*****On Dashboard Page*******");
	}
	
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		testContextSetup.batch.clickBatchButton();
	    LoggerLoad.info("**********batch button clicked**********");
		
	}

	@When("Admin clicks {string} from navigation bar in the Batch Page	Validate landing")
	public void admin_clicks_from_navigation_bar_in_the_batch_page_validate_landing(String string) {
		testContextSetup.batch.verifyPageTitle();
	}

	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String string) {
		String validateClassUrl = driver.getCurrentUrl();
		validateBatchUrl.contains("Manage batch");
		  try
		  {
		  Assert.assertTrue(validateBatchUrl.contains("Manage batch"));
		  }
		  catch (Exception e){
			  LoggerLoad.info(e.getMessage());
		  }
	}

	@When("Admin clicks Batch from navigation bar in the Batch Page to Validate header")
	public void admin_clicks_from_navigation_bar_in_the_batch_page_to_validate_header(String string) {
		testContextSetup.batch.navigateToBatch();
				    
	}

	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
		testContextSetup.batch.verifyPageTitle();
	}

	@When("Admin clicks Batch from navigation bar in the Batch Page	to Validate pagination")
	public void admin_clicks_from_navigation_bar_in_the_batch_page_to_validate_pagination(String string) {
		testContextSetup.batch.navigateToBatch();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	    testContextSetup.batch.checkPaginationText();
	}

	@When("Admin clicks Batch from navigation bar in the Batch Page	to Validate data table headers")
	public void admin_clicks_from_navigation_bar_in_the_batch_page_to_validate_data_table_headers(String string) {
		testContextSetup.batch.navigateToBatch();
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status,Number of classes, Program Name, EditDelete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_number_of_classes_program_name_edit_delete() {
		testContextSetup.batch.batchDataTableHeader();
	}

	@When("Admin clicks Batch from navigation bar in the Batch Page	to Validate Delete")
	public void admin_clicks_from_navigation_bar_in_the_batch_page_to_validate_delete(String string) {
		testContextSetup.batch.navigateToBatch();
	}

	@Then("Admin should be able to see the Delete icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
		testContextSetup.batch.verifyDeleteButton();
	}

	@When("Admin clicks Batch from navigation bar in the Batch Page	to Validate  A New batch")
	public void admin_clicks_batch_from_navigation_bar_in_the_batch_page_to_validate_a_new_batch() {
		testContextSetup.batch.navigateToBatch();
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
		testContextSetup.batch.NewBatchBtnEnabled();
	}

	@When("Admin clicks {string} from navigation bar in the Batch Page	to Validate data rows checkbox")
	public void admin_clicks_from_navigation_bar_in_the_batch_page_to_validate_data_rows_checkbox(String string) {
		testContextSetup.batch.navigateToBatch();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
		testContextSetup.batch.checkboxesIsSelected();
	}

	@When("Admin clicks {string} from navigation bar in the Batch Page	to verify edit icon")
	public void admin_clicks_from_navigation_bar_in_the_batch_page_to_verify_edit_icon(String string) {
		testContextSetup.batch.navigateToBatch();
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
		testContextSetup.batch.batchEditIconEnabled();
	}

	@When("Admin clicks {string} from navigation bar in the Batch Page	to verify delete icon")
	public void admin_clicks_from_navigation_bar_in_the_batch_page_to_verify_delete_icon(String string) {
		testContextSetup.batch.navigateToBatch();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
		testContextSetup.batch.verifyDeleteButton();
	}

	@When("Admin clicks {string} button in the Batch Page	to Validate pop up")
	public void admin_clicks_button_in_the_batch_page_to_validate_pop_up(String string) throws InterruptedException {
		testContextSetup.batch.navigateToBatch();
		testContextSetup.batch.addNewBatchbuttonClick();
	}

	@Then("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {
		testContextSetup.batch.batchPopup();
	}

}
