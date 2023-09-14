package stepDefinitionsBatch;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.BatchModule;

public class DeleteBatchSD {
	Hooks hooks;
	BatchModule batchModule;
	
	public DeleteBatchSD(Hooks hooks)
	{
		this.hooks=hooks;
		this.batchModule = hooks.getBatchModuleObject();
	}

	@Given("The delete icon on row level in data table is enabled in Delete Batch page")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled_in_delete_batch_page() {
		batchModule.verifyDeleteButton();
		
	}

	@When("Admin clicks the delete icon in  Batch page")
	public void admin_clicks_the_delete_icon_in_batch_page() {
		batchModule.deleteBatch();
	}

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() {
		batchModule.confirmMessageDisplayed();
		String actual=batchModule.deleteHeader();
		Assert.assertEquals(actual, "Delete Confirm");
	}

	@Given("Admin clicks the delete icon to verify Yes option in Delete Batch page")
	public void admin_clicks_the_delete_icon_to_verify_yes_option_in_delete_batch_page() {
		batchModule.verifyDeleteButton();
		batchModule.deleteBatch();
		
	}

	@When("Admin click yes option in Batch page")
	public void admin_click_yes_option_in_batch_page() {
		batchModule.clickYesOnConfirm();
		
		
	}

	@Then("Batch deleted alert pops and batch is no more available in data table")
	public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table() throws InterruptedException {
		String actual=batchModule.confirmMessageDisplayed();
		Assert.assertEquals(actual, "Successful batch deleted");
		batchModule.enterBatchNameInSearch(batchModule.prop.getProperty("deletedBatchName"));
		boolean act=batchModule.searchDeletedName(batchModule.prop.getProperty("deletedBatchName"));
		Assert.assertEquals(act, "False");
		
	}

	@Given("Admin clicks the delete icon to verify No option in Delete Batch page")
	public void admin_clicks_the_delete_icon_to_verify_no_option_in_delete_batch_page() {
		batchModule.deleteBatch();
	}

	@When("Admin click No option in Batch page")
	public void admin_click_no_option_in_batch_page() {
		batchModule.clickNoOnConfirm();
	}

	@Then("Batch is still listed in data table")
	public void batch_is_still_listed_in_data_table() {
		batchModule.recordsAvailable();	}
}
