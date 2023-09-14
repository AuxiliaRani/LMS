package stepDefinitionsProgram;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.ProgramModule;

public class DeleteProgram_SD {
	
	Hooks hooks;
	ProgramModule programModule;
	public DeleteProgram_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	@Given("Admin is on Manage Program Page for verifying delete progrm")
	public void admin_is_on_manage_program_page_for_verifying_delete_progrm() {
	    
		programModule.navigateToProgam();
		programModule.verifyPageTitleProgam();
	}

	@When("Admin clicks Delete button on the data table for any row")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
	    
		programModule.ClickRowDelete2();
	}

	@Then("Admin should see a alert open with heading Confirm along with  YES and NO button for deletion in Program Page")
	public void admin_should_see_a_alert_open_with_heading_confirm_along_with_yes_and_no_button_for_deletion_in_program_page() {
		boolean actmsg=programModule.deletePopup();
		assertEquals(true,actmsg );
	    
	}

	@When("Admin clicks Delete button on the data table for any row to verify confirm before delete in Program Page")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row_to_verify_confirm_before_delete_in_program_page() {
		programModule.ClickRowDelete1();
	    
	}

	@Then("Admin should see a message Are you sure you want to delete Program name? in Program Page")
	public void admin_should_see_a_message_are_you_sure_you_want_to_delete_program_name_in_program_page() {
	    
		String actmsg=programModule.confrmDeleteMessage();
		assertEquals(actmsg, "confirm delete");
	}


}
