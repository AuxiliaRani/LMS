package stepDefinitionsBatch;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.BatchModule;
import utilities.ConfigReader;


public class AddNewBatch_SD {
	
	
	
	Hooks hooks;
	BatchModule batchModule;
	
	public AddNewBatch_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.batchModule = hooks.getBatchModuleObject();
	}

	
		
	@Given("A new pop up with Batch details appears	to verify addition of new batch")
	public void a_new_pop_up_with_batch_details_appears_to_verify_addition_of_new_batch() {
		batchModule.navigateToBatch();
	    
	}

	@Then("The pop up should include the fields Name, Number of classes and Description as text box,Program Name as drop down")
	public void the_pop_up_should_include_the_fields_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down() throws InterruptedException {
		String actualHeader=batchModule.checkAddBatchHeader();
		Assert.assertEquals(actualHeader, "Batch Details");
		batchModule.addNewBatchbuttonClick();
	}

	@Then("Status as radio button, Number of classes as text box in Manage Batch page")
	public void status_as_radio_button_number_of_classes_as_text_box_in_manage_batch_page() {
		Assert.assertEquals(true, batchModule.batchDetailForm());
	}

	@Given("A new pop up with Batch details appears to check valid values with empty description in Manage Batch page")
	public void a_new_pop_up_with_batch_details_appears_to_check_valid_values_with_empty_description_in_manage_batch_page() throws InterruptedException {
		batchModule.navigateToBatch();
		batchModule.batchDetailForm();
	}

	@When("Fill in all the fields except description with valid values	and click save in Manage Batch page")
	public void fill_in_all_the_fields_except_description_with_valid_values_and_click_save_in_manage_batch_page() throws InterruptedException {
		batchModule.enterName(ConfigReader.getBatchName());
		batchModule.enterClassesNumber(ConfigReader.getNoOfClasses());
		batchModule.selectProgramName(ConfigReader.getProgramName());
		batchModule.selectStatus("Active");
		batchModule.saveForm();
	}

	@Then("The newly added batch should be present in the data table in Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page() throws InterruptedException {
		String batchNameFound = batchModule.searchBatchName(ConfigReader.getBatchName());
		Assert.assertEquals(ConfigReader.getBatchName(), batchNameFound);
	}

	@Given("A new pop up with Batch details appears to check valid values in Manage Batch page")
	public void a_new_pop_up_with_batch_details_appears_to_check_valid_values_in_manage_batch_page() throws InterruptedException {
		batchModule.navigateToBatch();
		batchModule.addNewBatchbuttonClick();
		batchModule.batchDetailForm();
	}

	@When("Fill in all the fields with valid values and click save in Manage Batch page")
	public void fill_in_all_the_fields_with_valid_values_and_click_save_in_manage_batch_page() throws InterruptedException {
		batchModule.enterName(ConfigReader.getBatchName());
		batchModule.enterClassesNumber(ConfigReader.getNoOfClasses());
		batchModule.selectProgramName(ConfigReader.getProgramName());
		batchModule.selectStatus("INACTIVE");
		batchModule.saveForm();
	}

	@Then("The newly added batch should be present in the data table in Manage Batch page with all filled values")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page_with_all_filled_values() throws InterruptedException
	{
		String batchNameFound = batchModule.searchBatchName(ConfigReader.getBatchName());
		Assert.assertEquals(ConfigReader.getBatchName(), batchNameFound);
	}
	@Given("A new pop up with Batch details appears to check invalid values in Manage Batch page")
	public void a_new_pop_up_with_batch_details_appears_to_check_invalid_values_in_manage_batch_page() throws InterruptedException {
		
		batchModule.addNewBatchbuttonClick();
		batchModule.batchDetailForm();
		
			}
	
	@When("Any of the fields have invalid values in the Batch Page	in Manage Batch page")
	public void any_of_the_fields_have_invalid_values_in_the_batch_page_in_manage_batch_page() throws InterruptedException {
		batchModule.enterName(ConfigReader.getInvalidBatchName());
		batchModule.enterClassesNumber(ConfigReader.getNoOfClasses());
		batchModule.selectProgramName(ConfigReader.getProgramName());
		batchModule.selectStatus("INACTIVE");
		batchModule.saveForm();
	}

	@Then("Error message should appear for invalid values in the Batch Page")
	public void error_message_should_appear_for_invalid_values_in_the_batch_page() throws InterruptedException {
		
		String act=batchModule.errorMsgInvalidvalues();
		 Assert.assertEquals(act,"invalid batch name");
	}

	@Given("A new pop up with Batch details appears to check blank fields in Manage Batch page")
	public void a_new_pop_up_with_batch_details_appears_to_check_blank_fields_in_manage_batch_page() throws InterruptedException {
		batchModule.addNewBatchbuttonClick();
		batchModule.batchDetailForm();
	}

	@When("Any of the mandatory fields are blank in the Batch Page	in Manage Batch page")
	public void any_of_the_mandatory_fields_are_blank_in_the_batch_page_in_manage_batch_page() throws InterruptedException {
		batchModule.enterName(ConfigReader.getblankBatchName());
		batchModule.enterClassesNumber(ConfigReader.getNoOfClasses());
		batchModule.selectProgramName(ConfigReader.getProgramName());
		batchModule.selectActive();
		batchModule.saveForm();
	}

	@Then("Error message should appear for mandatory missing values in the Batch Page")
	public void error_message_should_appear_for_mandatory_missing_values_in_the_batch_page() {
		String actualError=batchModule.checkErrorMessage();
		Assert.assertEquals(actualError, "Name is required");
	}


}
