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

public class ManageProgramValidation_2_SD {
	Hooks hooks;
	ProgramModule programModule;
	
	public ManageProgramValidation_2_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	
	@Given("Admin\\/User\\/Staff  is on Manage Program page")
	public void admin_user_staff_is_on_manage_program_page() {
		programModule.navigateToProgam();
	    
	}

	@Then("Admin should see the text as {string} along with Pagination icon below the table.")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String footerexpected) {
		String footeractual=programModule.totalRecords();
		assertEquals(footeractual, footerexpected);
	    
	}

	@Then("x- starting record number on that page y-ending record number on that page z- Total number of records")
	public void x_starting_record_number_on_that_page_y_ending_record_number_on_that_page_z_total_number_of_records() throws InterruptedException {
		
		int recActual=programModule.verifyNumberOfRecords();
		assertEquals(recActual, "total record is 4457");
		
	}

	@Then("Admin should see the footer as {string} z- Total number of records on Program Page")
	public void admin_should_see_the_footer_as_z_total_number_of_records_on_program_page(String string) {
		String recActual=programModule.recordsAvailable();
		assertEquals(recActual, "total 4457 program");
		
	}

	@Then("Admin should see a Delete button on the top left hand side as Disabled on Program Page")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled_on_program_page() {
	    boolean act=programModule.progDeleteBtnEnabled();
	    assertEquals(true, act);
	}

	@When("Admin Clicks on  {string} button in Manage Program page")
	public void admin_clicks_on_button_in_manage_program_page(String string) {
		programModule.clickAddNewProgButton();
	    
	}

	@Then("Admin should see a {string} button on the program page above the data table  in Manage Program page")
	public void admin_should_see_a_button_on_the_program_page_above_the_data_table_in_manage_program_page(String string) {
		
		boolean rtn1=programModule.addNewProgBtnEnabled();
			assertEquals(true,rtn1);
			
	}

	@Then("Admin should see the number of records rows of data in the table displayed on the page are {int}")
	public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
		boolean rtn=programModule.progPopup();
		assertEquals(true,rtn);
	    
	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched  in Manage Program page")
	public void admin_user_staff_enters_program_name_to_be_searched_in_manage_program_page() throws JsonParseException, JsonMappingException, IOException {
		boolean rtn1=programModule.getSearchbtnenabled();
		assertEquals(true,rtn1);
		
	}

	@Then("Admin should see data table on the Manage Program Page with following column headers Program Name, Program Description, Program Status, Edit,Delete")
	public void admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers_program_name_program_description_program_status_edit_delete() throws JsonParseException, JsonMappingException, IOException {
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(0).getName();
		assertEquals(programModule.searchProgram(progname , "Name"),true);
	}

	@When("Admin\\/User\\/Staff enters Program Status to be searched   in Manage Program page")
	public void admin_user_staff_enters_program_status_to_be_searched_in_manage_program_page() {
		boolean rtn1=programModule.getSearchbtnenabled();
		assertEquals(true,rtn1);
	    
	}

	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete  in Manage Program page")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete_in_manage_program_page() throws JsonParseException, JsonMappingException, IOException {
		List<ProgramPOJO> lpj=JsonFileReader.readJosnDataFromFile();
		String progname=lpj.get(0).getDescription();
		assertEquals(programModule.searchProgram(progname , "Desc"),true);
	}



}
