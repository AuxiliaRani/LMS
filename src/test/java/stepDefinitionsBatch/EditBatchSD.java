package stepDefinitionsBatch;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.BatchModule;
import utilities.ConfigReader;

public class EditBatchSD {
	
	Hooks hooks;
	BatchModule batchModule;
	
	public EditBatchSD(Hooks hooks)
	{
		this.hooks=hooks;
		this.batchModule = hooks.getBatchModuleObject();
	}

	
	@Given("The edit icon on row level in data table is enabled in batch page")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled_in_batch_page() {
		batchModule.navigateToBatch();
	}

	@When("Admin clicks the edit icon in batch page")
	public void admin_clicks_the_edit_icon_in_batch_page() {
		batchModule.clickOnEdit();
	    
	}

	@Then("A new pop up with Batch details appears in batch page")
	public void a_new_pop_up_with_batch_details_appears_in_batch_page() {
	    Assert.assertEquals(true, batchModule.batchEditIconEnabled());
	    
	}
//Description             | Program Name   | Number of classes     | Status |
	@Given("Admin clicks the edit icon to Update valid values {string} , {string} , {string}, {string} ,{string}> of in batch page")
	public void admin_clicks_the_edit_icon_to_update_valid_values_of_in_batch_page(String name, String description, String programName, String noOfClasses, String status) throws InterruptedException {
		batchModule.clickOnEdit();
		batchModule.enterName(name);
		batchModule.enterDescription(description);
		batchModule.enterClassesNumber(noOfClasses);
		batchModule.selectProgramName(programName);
		batchModule.selectStatus(status);
		
	}

	@When("Update the fields with valid values and click save in batch page")
	public void update_the_fields_with_valid_values_and_click_save_in_batch_page() throws InterruptedException {
		batchModule.saveForm();
	}

	@Then("The updated batch details should appear on the data table in batch page with updated value {string}")
	public void the_updated_batch_details_should_appear_on_the_data_table_in_batch_page_with_updated_value(String name) throws InterruptedException {
		String batchNameFound = batchModule.searchBatchName(name);
		Assert.assertEquals(ConfigReader.getBatchName(), batchNameFound);	    
	}

	@Given("Admin clicks the edit icon to Update invalid values  as {string} , {string} , {string}, {string} ,{string}> in batch page")
	public void admin_clicks_the_edit_icon_to_update_invalid_values_as_in_batch_page(String name, String description, String programName, String noOfClasses, String status, String errorMsg) throws InterruptedException {
		batchModule.enterName(name);
		batchModule.enterDescription(description);
		batchModule.enterClassesNumber(noOfClasses);
		batchModule.selectProgramName(programName);
		batchModule.selectStatus(status);
	    
	}

	@When("Update the fields with invalid values and click save in batch page")
	public void update_the_fields_with_invalid_values_and_click_save_in_batch_page() throws InterruptedException {
		batchModule.saveForm();
	    
	}

	@Then("Error message should appear {string} invaild values in batch page")
	public void error_message_should_appear_invaild_values_in_batch_page(String string) {
		String act=batchModule.errorMsgInvalidvalues();
		 Assert.assertEquals(act,"invalid batch name");
	}

	@Given("Admin clicks the edit icon to erase data from mandatory field in batch page")
	public void admin_clicks_the_edit_icon_to_erase_data_from_mandatory_field_in_batch_page() {
		batchModule.clickOnEdit();
	    
	}

	@When("Erase data from mandatory field in batch page")
	public void erase_data_from_mandatory_field_in_batch_page() throws InterruptedException {
		batchModule.editNamewithEmptyValue();
		batchModule.saveForm();
	
	}

	@Then("Error message should appear for dwlwting manadatory field in batch page")
	public void error_message_should_appear_for_dwlwting_manadatory_field_in_batch_page() {
		String act=batchModule.errorMsgforblankvaluesEdit();
		 Assert.assertEquals(act,"mandatory field can not be blank");
		
	    
	}

	@Given("Admin clicks the edit icon to erase data from description field in batch page")
	public void admin_clicks_the_edit_icon_to_erase_data_from_description_field_in_batch_page() {
		batchModule.clickOnEdit();
	    
	}

	@When("Erase data from description field in batch page")
	public void erase_data_from_description_field_in_batch_page() throws InterruptedException {
		batchModule.editDescriptionBlankValue();
		batchModule.saveForm();
	    
	}

	@Then("The updated batch details should appear on the data table in batch page")
	public void the_updated_batch_details_should_appear_on_the_data_table_in_batch_page() {
	    
		assertTrue(false, "batch updated");
	}
}
