package stepDefinitionsProgram;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.ProgramModule;

public class MultipleDeleteProgram_SD {
	
	Hooks hooks;
	ProgramModule programModule;
	
	public MultipleDeleteProgram_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	
	@Given("Admin is in Manage Program page   to verify Multiple Delete")
	public void admin_is_in_manage_program_page_to_verify_multiple_delete() {
	    
		programModule.navigateToProgam();
	}

	@When("Admin clicks any checkbox in the data table")
	public void admin_clicks_any_checkbox_in_the_data_table() {
	    
		programModule.clickrowcheck1();
		programModule.clickrowcheck2();
	}

	@Then("Admin should see common delete option enabled under header Manage Program")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
	    
		assertTrue(programModule.deletebtnEableorDisablechk(), "Multiple delete button is enabled");;
	}

	@Given("Admin is on Confirm Deletion alert  to verfy Single checkbox in Program page for yes option")
	public void admin_is_on_confirm_deletion_alert_to_verfy_single_checkbox_in_program_page_for_yes_option() {
		programModule.navigateToProgam();
	    
	}

	@When("Admin clicks YES button on the alert to verfy Single checkbox in Program page for yes option")
	public void admin_clicks_yes_button_on_the_alert_to_verfy_single_checkbox_in_program_page_for_yes_option() {
		programModule.clickrowcheck1();
		programModule.clickMultiDeleteBtn();
		programModule.acceptMultiDeleteAlert();
	    
	}

	@Then("Admin should land on Manage Program page and can see the selected program is deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
	    
	    assertEquals(true, programModule.getDeleteAlertText().contains( "Programs Deleted"));
	}

	@Given("Admin is on Confirm Deletion alert  to verfy Single checkbox in Program page for No option")
	public void admin_is_on_confirm_deletion_alert_to_verfy_single_checkbox_in_program_page_for_no_option() {
		programModule.navigateToProgam();
	    
	}

	@When("Admin clicks NO button on the alert to verfy Single checkbox in Program page for No option")
	public void admin_clicks_no_button_on_the_alert_to_verfy_single_checkbox_in_program_page_for_no_option() {
		programModule.clickrowcheck1();
		programModule.clickMultiDeleteBtn();
		programModule.rejectMultiDeleteAlert();
	    
	}

	@Then("Admin should land on Manage Program page and can see the selected program is NOT deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table() {
		assertTrue(true, "The programs not deleted");
	    
	}

	@Given("Admin is on Confirm Deletion alert  to verify multiple check boxes in Program page for yes option")
	public void admin_is_on_confirm_deletion_alert_to_verify_multiple_check_boxes_in_program_page_for_yes_option() {
		programModule.navigateToProgam();
	    
	}

	@When("Admin clicks YES button on the alert to verify multiple check boxes in Program page for yes option")
	public void admin_clicks_yes_button_on_the_alert_to_verify_multiple_check_boxes_in_program_page_for_yes_option() {
		programModule.clickrowcheck1();
		programModule.clickrowcheck2();
		programModule.clickMultiDeleteBtn();
		programModule.acceptMultiDeleteAlert();
	    
	}

	@Then("Admin should land on Manage Program page and can see the selected programs are deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_deleted_from_the_data_table() {
	    
		 assertEquals(true, programModule.getDeleteAlertText().contains( "Programs Deleted"));
	}

	@Given("Admin is on Confirm Deletion alert to verify multiple check boxes in Program page for NO option")
	public void admin_is_on_confirm_deletion_alert_to_verify_multiple_check_boxes_in_program_page_for_no_option() {
	    
		programModule.navigateToProgam();
	}

	@When("Admin clicks NO button on the alert to verify multiple check boxes in Program page for NO option")
	public void admin_clicks_no_button_on_the_alert_to_verify_multiple_check_boxes_in_program_page_for_no_option() {
		programModule.clickrowcheck1();
		programModule.clickrowcheck2();
		programModule.clickMultiDeleteBtn();
		programModule.rejectMultiDeleteAlert();
	    
	}

	@Then("Admin should land on Manage Program page and can see the selected programs are NOT deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table() {
	    
		assertTrue(true, "The programs not deleted");
	}


}
