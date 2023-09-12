package stepDefinitionsBatch;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.TestContextSetup;

public class AddNewBatch_SD {
	
	
	
	TestContextSetup testContextSetup;
	public AddNewBatch_SD(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
		
	@Given("A new pop up with Batch details appears	to verify addition of new batch")
	public void a_new_pop_up_with_batch_details_appears_to_verify_addition_of_new_batch() {
		testContextSetup.batch.navigateToBatch();
	    
	}

	@Then("The pop up should include the fields Name, Number of classes and Description as text box,Program Name as drop down")
	public void the_pop_up_should_include_the_fields_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down() throws InterruptedException {
		String actualHeader=testContextSetup.batch.checkAddBatchHeader();
		Assert.assertEquals(actualHeader, "Batch Details");
		testContextSetup.batch.addNewBatchbuttonClick();
	}

	@Then("Status as radio button, Number of classes as text box in Manage Batch page")
	public void status_as_radio_button_number_of_classes_as_text_box_in_manage_batch_page() {
		
	
	}

	@Given("A new pop up with Batch details appears to check valid values with empty description in Manage Batch page")
	public void a_new_pop_up_with_batch_details_appears_to_check_valid_values_with_empty_description_in_manage_batch_page() {
	    
	}

	@When("Fill in all the fields except description with valid values	and click save in Manage Batch page")
	public void fill_in_all_the_fields_except_description_with_valid_values_and_click_save_in_manage_batch_page() throws InterruptedException {
		testContextSetup.batch.saveForm();
	}

	@Then("The newly added batch should be present in the data table in Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page() {
	    
	}

	@Given("A new pop up with Batch details appears to check valid values in Manage Batch page")
	public void a_new_pop_up_with_batch_details_appears_to_check_valid_values_in_manage_batch_page() {
	    
	}

	@When("Fill in all the fields with valid values and click save in Manage Batch page")
	public void fill_in_all_the_fields_with_valid_values_and_click_save_in_manage_batch_page() {
	    
	}

	@Given("A new pop up with Batch details appears to check invalid values in Manage Batch page")
	public void a_new_pop_up_with_batch_details_appears_to_check_invalid_values_in_manage_batch_page() {
	    
	}

	@When("Any of the fields have invalid values in the Batch Page	in Manage Batch page")
	public void any_of_the_fields_have_invalid_values_in_the_batch_page_in_manage_batch_page() {
	   
	}

	@Then("Error message should appear for invalid values in the Batch Page")
	public void error_message_should_appear_for_invalid_values_in_the_batch_page() {
	    
	}

	@Given("A new pop up with Batch details appears to check blank fields in Manage Batch page")
	public void a_new_pop_up_with_batch_details_appears_to_check_blank_fields_in_manage_batch_page() {
	    
	}

	@When("Any of the mandatory fields are blank in the Batch Page	in Manage Batch page")
	public void any_of_the_mandatory_fields_are_blank_in_the_batch_page_in_manage_batch_page() {
	    
	}

	@Then("Error message should appear for mandatory missing values in the Batch Page")
	public void error_message_should_appear_for_mandatory_missing_values_in_the_batch_page() {
	    
	}


}
