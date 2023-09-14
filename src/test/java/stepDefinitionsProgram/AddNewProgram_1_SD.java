package stepDefinitionsProgram;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;

import static org.testng.Assert.assertEquals;

import pageObjects.ProgramModule;


public class AddNewProgram_1_SD {
	Hooks hooks;
	ProgramModule programModule;
	public AddNewProgram_1_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	
	@Given("Admin is on Manage Program Page")
	public void admin_is_on_manage_program_page() {
		programModule.navigateToProgam();
		
	}

	@When("Admin clicks A New Program button in Program Page")
	public void admin_clicks_a_new_program_button_in_program_page() {
	    
		programModule.clickAddNewProgButton();
	
	    
	}

	@Then("Admin should see a popup open for Program details with empty form along with SAVE and CANCEL button and Close X Icon on the top right corner of the window in Program Page")
	public void admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window_in_program_page() {
		boolean rtn=programModule.progPopup();
		assertEquals(false,rtn);
		boolean rtn1=programModule.progSaveBtnEnabled();
			assertEquals(true,rtn1);
		
	}

	@Then("Admin should see two input fields and their respective text boxes in the program details window in Program Page")
	public void admin_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window_in_program_page() {
		
		boolean rtn1=programModule.progChkBoxEnabled();
		assertEquals(true,rtn1);
		
	}

	@Then("Admin should see two radio button for Program Status in Program Page")
	public void admin_should_see_two_radio_button_for_program_status_in_program_page() {
		boolean rtn1=programModule.progradioBtnEnabled();
		assertEquals(true,rtn1);
		
	}



}
