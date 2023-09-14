package stepDefinitionsProgram;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.ProgramModule;
import utilities.JsonFileReader;
import utilities.ProgramPOJO;

public class EditProgramDetails_SD {
	
	Hooks hooks;
	ProgramModule programModule;
	
	public EditProgramDetails_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	
	@Given("Admin is on Program Details Popup window to Edit")
	public void admin_is_on_program_details_popup_window_to_edit() {
	    
		programModule.navigateToProgam();
	}

	@When("Admin clicks Edit button on the data table for any row in Program Page")
	public void admin_clicks_edit_button_on_the_data_table_for_any_row_in_program_page() {
	    
		programModule.ClickRowEdit1();
	}

	@Then("Admin should see a popup open for Program details to edit in Program Page")
	public void admin_should_see_a_popup_open_for_program_details_to_edit_in_program_page() {
		assertTrue(programModule.programPopup());
	}

	@Given("Admin is on Program Details Popup window to Edit Program Name in Program Page")
	public void admin_is_on_program_details_popup_window_to_edit_program_name_in_program_page() {
		programModule.navigateToProgam();
		programModule.ClickRowEdit1();
	}

	@When("Admin edits the Name column and clicks save button in Program Page")
	public void admin_edits_the_name_column_and_clicks_save_button_in_program_page() throws JsonParseException, JsonMappingException, IOException {
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(0).getName();
		programModule.addProgramName(progname);
		programModule.saveProg();
	    
	}

	@Then("Admin gets a message {string} alert and able to see the updated name in the table for the particular program in Program Page")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program_in_program_page(String string) {
	    
	    assertEquals("Program Saved", programModule.getSaveAlertText());
	}

	@Given("Admin is on Program Details Popup window to Edit Program description in Program Page")
	public void admin_is_on_program_details_popup_window_to_edit_program_description_in_program_page() {
		programModule.navigateToProgam();
		programModule.ClickRowEdit1();
	    
	}

	@When("Admin edits the Description column and clicks save button in Program Page")
	public void admin_edits_the_description_column_and_clicks_save_button_in_program_page() throws JsonParseException, JsonMappingException, IOException {
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String desc=lpj.get(0).getDescription();
		programModule.addProgramDesciption(desc);
		programModule.saveProg();
	    
	}

	@Then("Admin gets a message Successful Program description Updated alert and able to see the updated Program description in the table for the particular program in Program Page")
	public void admin_gets_a_message_successful_program_description_updated_alert_and_able_to_see_the_updated_program_description_in_the_table_for_the_particular_program_in_program_page() {
		assertEquals("Program Saved", programModule.getSaveAlertText());
	    
	}

	@Given("Admin is on Program Details Popup window to Edit to verify Change Program Status in Program Page")
	public void admin_is_on_program_details_popup_window_to_edit_to_verify_change_program_status_in_program_page() {
	    
		programModule.navigateToProgam();
		programModule.ClickRowEdit1();
	}

	@When("Admin changes the Status and clicks save button in Program Page")
	public void admin_changes_the_status_and_clicks_save_button_in_program_page() throws JsonParseException, JsonMappingException, IOException {
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		programModule.addProgramStatus(lpj.get(0).getStatus());
		programModule.saveProg();
	    
	}

	@Then("Admin gets a message Successful Program Updated alert and able to see the updated status in the table for the particular program in Program Page")
	public void admin_gets_a_message_successful_program_updated_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program_in_program_page() {
	    
		assertEquals("Program Saved", programModule.getSaveAlertText());
	}

	@Given("Admin is on Program Details Popup window to Edit with invalid values in Program Page")
	public void admin_is_on_program_details_popup_window_to_edit_with_invalid_values_in_program_page() {
	    
		programModule.navigateToProgam();
		programModule.ClickRowEdit1();
	}

	@When("Admin enters only numbers or special char in name and desc column in Program Page to edit")
	public void admin_enters_only_numbers_or_special_char_in_name_and_desc_column_in_program_page_to_edit() throws JsonParseException, JsonMappingException, IOException {
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(1).getName();
		programModule.addProgramName(progname);
	    
	}

	@Then("Admin gets a Error message alert for only entering numbers in Program Page")
	public void admin_gets_a_error_message_alert_for_only_entering_numbers_in_program_page() {
		String actMsg=programModule.checkErrorMessage();
		assertEquals(actMsg,"incomplete/invalid input data");
	}

	@Given("Admin is on Program Details Popup window to Edit to verify cancel button in Program Page")
	public void admin_is_on_program_details_popup_window_to_edit_to_verify_cancel_button_in_program_page() {
		programModule.navigateToProgam();
		programModule.ClickRowEdit2();
	    
	}

	@When("Admin clicks  Cancel button on edit popup in Program Page")
	public void admin_clicks_cancel_button_on_edit_popup_in_program_page() throws JsonParseException, JsonMappingException, IOException {
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(0).getName();
		programModule.addProgramName(progname);
		programModule.clickCancelButton();
	}

	@Then("Admin can see the Program details popup disappears and can see nothing changed for particular program in Program Page")
	public void admin_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program_in_program_page() {
		boolean rtn=programModule.progPopup();
		assertEquals(false,rtn);
	}

	@Given("Admin is on Program Details Popup window to Edit  to verify save button in Program Page")
	public void admin_is_on_program_details_popup_window_to_edit_to_verify_save_button_in_program_page() {
		programModule.navigateToProgam();
		programModule.ClickRowEdit1();
	    
	}

	@When("Admin clicks Save button on edit popup in Program Page")
	public void admin_clicks_save_button_on_edit_popup_in_program_page() throws JsonParseException, JsonMappingException, IOException {
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String desc=lpj.get(0).getDescription();
		programModule.addProgramDesciption(desc);
		programModule.addProgramName(lpj.get(0).getName());
		programModule.addProgramStatus(lpj.get(0).getStatus());
		programModule.saveProg();
	}

	@Then("Admin gets a message Successful Program Updated alert and able to see the updated details in the table for the particular program in Program Page")
	public void admin_gets_a_message_successful_program_updated_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program_in_program_page() {
		assertEquals("Program Saved", programModule.getSaveAlertText());
	    
	}
}
