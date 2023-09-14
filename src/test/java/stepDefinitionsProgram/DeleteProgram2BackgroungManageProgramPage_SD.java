package stepDefinitionsProgram;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.ProgramModule;

public class DeleteProgram2BackgroungManageProgramPage_SD {
	Hooks hooks;
	ProgramModule programModule;
	public DeleteProgram2BackgroungManageProgramPage_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	
	@Given("Admin is on Confirm Deletion alert of program page")
	public void admin_is_on_confirm_deletion_alert_of_program_page() {
	    
		programModule.navigateToProgam();
	}

	@When("Admin clicks YES button on the alert in Program Page to delete")
	public void admin_clicks_yes_button_on_the_alert_in_program_page_to_delete() {
		programModule.ClickRowDelete1();
	    
	}

	@Then("Admin gets a message {string} alert and able to see that program deleted in the data table in Program Page")
	public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table_in_program_page(String successMsg) {
	    
		
		Assert.assertEquals(programModule.getHeader(),"Delete Confirm");
	}

	@When("Admin clicks NO button on the alert in Program Page to delete")
	public void admin_clicks_no_button_on_the_alert_in_program_page_to_delete() {
		programModule.ConfNo();
	    
	}

	@Then("Admin can see the deletion alert disappears without deleting in Program Page")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting_in_program_page() {
	    
		Assert.assertEquals(programModule.recordsAvailable1(),null);
	}

	@When("Admin clicks Cancel\\/Close Icon on Deletion alert in Program Pages")
	public void admin_clicks_cancel_close_icon_on_deletion_alert_in_program_pages() {
		programModule.clickcancelConfirm();
	    
	}

	@Then("Admin can see the deletion alert disappears without any changes in Program Page")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes_in_program_page() {
		Assert.assertEquals(programModule.recordsAvailable1(),null);
	    
	}

}
