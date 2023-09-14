package stepDefinitionsProgram;

import static org.testng.Assert.assertEquals;

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

public class ManageProgramValidation_3_SD {
	Hooks hooks;
	ProgramModule programModule;
	
	public ManageProgramValidation_3_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	@Given("Admin  is on Manage Program page for search button validation")
	public void admin_is_on_manage_program_page_for_search_button_validation() {
	    
		programModule.navigateToProgam();
		
	}

	@When("Admin enters Program Status to be searched  in Manage Program page")
	public void admin_enters_program_status_to_be_searched_in_manage_program_page() {
		programModule.clickSearchButton();	    
	}

	@Then("Admin should see check box on the left side in all rows of the data table  in Manage Program page")
	public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table_in_manage_program_page() throws JsonParseException, JsonMappingException, IOException {
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(0).getStatus();
		assertEquals(programModule.searchProgram(progname , "Status"),true);
	    
	}

	@When("Admin enters Program Status to be searched")
	public void admin_enters_program_status_to_be_searched() {
	    
	    
	}

	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	    
		assertEquals(true, programModule.editBtnEnabled());
		assertEquals(true, programModule.deleteBtnEnabled());
	}


	@Then("Admin should see Search bar with text as {string}  in Manage Program page")
	public void admin_should_see_search_bar_with_text_as_in_manage_program_page(String string) {
	    
		assertEquals(true, programModule.getSearchbtnenabled());
	}

	

	@When("Admin enters the keywords not present in the data table on the Search box in Manage Program page")
	public void admin_enters_the_keywords_not_present_in_the_data_table_on_the_search_box_in_manage_program_page() {
	    
		programModule.getSearchbtnenabled();
	}

	@Then("Admin should see zero entries on the data table in Manage Program page")
	public void admin_should_see_zero_entries_on_the_data_table_in_manage_program_page() throws JsonParseException, JsonMappingException, IOException {
	    
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(1).getName();
		assertEquals(programModule.searchProgram(progname , "Name"),false);
	}


}
