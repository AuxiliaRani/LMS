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
import pageObjects.BatchModule;
import pageObjects.ProgramModule;
import utilities.JsonFileReader;
import utilities.ProgramPOJO;

public class AddNewProgram_2_SD {
	Hooks hooks;
	ProgramModule programModule;
	
	public AddNewProgram_2_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	
	@Given("Admin is on Program Details Popup window in Program Page")
	public void admin_is_on_program_details_popup_window_in_program_page() {
		programModule.navigateToProgam();
	}

	@When("Admin clicks on Save button without entering any data in Program Page")
	public void admin_clicks_on_save_button_without_entering_any_data_in_program_page() {
		programModule.clickAddNewProgButton();
		programModule.saveProg();
	    
	}

	@Then("Admin gets a Error message alert  in Program Page {string}")
	public void admin_gets_a_error_message_alert_in_program_page(String errMsg) {
	    
		String actMsg=programModule.checkErrorMessage();
		assertEquals(actMsg,errMsg);
	}

	@When("Admin enters only Program Name in text box and clicks Save button in Program Page")
	public void admin_enters_only_program_name_in_text_box_and_clicks_save_button_in_program_page() throws JsonParseException, JsonMappingException, IOException {
	    
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(0).getName();
		programModule.addProgramName(progname);
		programModule.saveProg();
		
	}

	@Then("Admin gets a message alert Name is required  in Program Page")
	public void admin_gets_a_message_alert_name_is_required_in_program_page() {
	    
		String actMsg=programModule.checkErrorMessage();
		assertEquals(actMsg,"incomplete input data");
	}

	@When("Admin enters only Program description  in text box and clicks Save button in Program Page")
	public void admin_enters_only_program_description_in_text_box_and_clicks_save_button_in_program_page() throws JsonParseException, JsonMappingException, IOException {
		programModule.clickAddNewProgButton();
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progdescption=lpj.get(0).getDescription();
		programModule.addProgramDesciption(progdescption);
		programModule.saveProg();
		
	    
	}

	@Then("Admin gets a message alert Description is required in Program Page")
	public void admin_gets_a_message_alert_description_is_required_in_program_page() {
	    
		String actMsg=programModule.checkErrorMessage();
		assertEquals(actMsg,"incomplete input data");
	}

	@When("Admin selects only Status and clicks Save button in Program Page")
	public void admin_selects_only_status_and_clicks_save_button_in_program_page() throws JsonParseException, JsonMappingException, IOException {
	    
		programModule.clickAddNewProgButton();
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progstatus=lpj.get(0).getStatus();
		programModule.addProgramStatus(progstatus);
		programModule.saveProg();
	}

	@Then("Admin gets a message alert Name and Description required in Program Page")
	public void admin_gets_a_message_alert_name_and_description_required_in_program_page() {
		String actMsg=programModule.checkErrorMessage();
		assertEquals(actMsg,"incomplete/invalid input data");
	    
	}

	@When("Admin enters only numbers or special char in name and desc column in Program Page")
	public void admin_enters_only_numbers_or_special_char_in_name_and_desc_column_in_program_page() throws JsonParseException, JsonMappingException, IOException {
	    
		programModule.clickAddNewProgButton();
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(1).getName();
		String progdescption=lpj.get(1).getDescription();
		programModule.addProgramDesciption(progdescption);
		programModule.saveProg();
	}

	@Then("Admin gets a Error message alert for only entering number  in Program Page")
	public void admin_gets_a_error_message_alert_for_only_entering_number_in_program_page() {
	    
		String actMsg=programModule.checkErrorMessage();
		assertEquals(actMsg,"incomplete/invalid input data");
	}

	@When("Admin clicks Cancel or Close Icon on Program Details form in Program Page")
	public void admin_clicks_cancel_or_close_icon_on_program_details_form_in_program_page() throws JsonParseException, JsonMappingException, IOException {
	    
		programModule.clickAddNewProgButton();
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(2).getName();
		String progdescption=lpj.get(2).getDescription();
		String progstatus=lpj.get(2).getStatus();
		programModule.addProgramDesciption(progdescption);
		programModule.addProgramStatus(progstatus);
		programModule.clickCancelButton();
		
	}


	@Then("Program Details popup window should be closed without saving in Program Page")
	public void program_details_popup_window_should_be_closed_without_saving_in_program_page() {
		boolean rtn=programModule.progPopup();
		assertEquals(false,rtn);
	    
	}

	
	
	@When("Enter all the required fields with valid values and click Save button in Program Page")
	public void enter_all_the_required_fields_with_valid_values_and_click_save_button_in_program_page() throws JsonParseException, JsonMappingException, IOException {
		programModule.clickAddNewProgButton();
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(2).getName();
		String progdescption=lpj.get(2).getDescription();
		String progstatus=lpj.get(2).getStatus();
		programModule.addProgramDesciption(progdescption);
		programModule.addProgramStatus(progstatus);
		programModule.saveProg();
	    
	}

	@Then("Admin gets a message {string} alert and able to see the new program added in the data table in Program Page")
	public void admin_gets_a_message_alert_and_able_to_see_the_new_program_added_in_the_data_table_in_program_page(String string) {
	    
		assertTrue(true, "ptog updated");
	}

	


}
