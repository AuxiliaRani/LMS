package stepDefinitionsBatch;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.BatchModule;

public class DeleteMultipleBatchesSD {
	
	Hooks hooks;
	BatchModule batchModule;
	
	public DeleteMultipleBatchesSD(Hooks hooks)
	{
		this.hooks=hooks;
		this.batchModule = hooks.getBatchModuleObject();
	}


	@Given("None of the checkboxes in data table are selected in batch page")
	public void none_of_the_checkboxes_in_data_table_are_selected_in_batch_page() {
		
		System.out.println("no check box is selected");
	}

	@Then("The delete icon under the Manage Batch header should be disabled in batch page")
	public void the_delete_icon_under_the_manage_batch_header_should_be_disabled_in_batch_page() {
		boolean act=batchModule.isSelectedMultipleDelete();
		Assert.assertEquals(act, "False");
	    
	}

	@Given("One of the checkbox\\/ row is selected in batch page")
	public void one_of_the_checkbox_row_is_selected_in_batch_page() {
	    
		batchModule.selectMutipleCheckboxes();
	}

	@When("Click delete icon below Manage Batch header to verify single row in batch page")
	public void click_delete_icon_below_manage_batch_header_to_verify_single_row_in_batch_page() {
		batchModule.deleteMutipleBatches();
	    
	}

	@Then("The respective single row in the data table is deleted in batch page")
	public void the_respective_single_row_in_the_data_table_is_deleted_in_batch_page() {
	    
		boolean act=batchModule.isSelectedMultipleDelete();
		Assert.assertEquals(act, "true");
	}

	@Given("Two or more checkboxes\\/row is selected in batch page")
	public void two_or_more_checkboxes_row_is_selected_in_batch_page() {
	    batchModule.selectMutipleCheckboxes();
	    
	    
	}

	@When("Click delete icon below Manage Batch header  to verify multi row in batch page")
	public void click_delete_icon_below_manage_batch_header_to_verify_multi_row_in_batch_page() {
		batchModule.selectMutipleCheckboxes();
		batchModule.deleteMutipleBatches();
	    
	}

	@Then("The respective multi row in the data table is deleted in batch page")
	public void the_respective_multi_row_in_the_data_table_is_deleted_in_batch_page() throws InterruptedException {
	    
		batchModule.enterBatchNameInSearch(batchModule.prop.getProperty("deletedBatchName"));
		boolean act=batchModule.searchDeletedName(batchModule.prop.getProperty("deletedBatchName"));
		Assert.assertEquals(act, "False");
	}

}
