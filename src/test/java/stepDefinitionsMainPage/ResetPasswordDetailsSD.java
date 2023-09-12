package stepDefinitionsMainPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResetPasswordDetailsSD {

	
	//@TC_ResetPasswordDetails_01
	@When("Admin clicks on {string} field")
	public void admin_clicks_on_field(String string) {
	    
	    
	}

	@Then("Admin should see text box is in enabled state")
	public void admin_should_see_text_box_is_in_enabled_state() {
	    
	    
	}

	//@TC_ResetPasswordDetails_02
	@When("Admin enters same valid password on <newpassword> and <retypepassword>")
	public void admin_enters_same_valid_password_on_newpassword_and_retypepassword(io.cucumber.datatable.DataTable dataTable) {
	    
	    
	}

	//@TC_ResetPasswordDetails_03
	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	    
	    
	}

	@Then("Admin should receive {string}. Please click here to login")
	public void admin_should_receive_please_click_here_to_login(String string) {
	    
	    
	}

	//@TC_ResetPasswordDetails_04
	@When("Admin enters invalid same password on <newpassword> and <retypepassword>")
	public void admin_enters_invalid_same_password_on_newpassword_and_retypepassword(io.cucumber.datatable.DataTable dataTable) {
	   
	    
	}

	@Then("Admin should see error message {string}")
	public void admin_should_see_error_message(String string) {
	    
	    
	}

	//@TC_ResetPasswordDetails_05
	@When("Admin clicks on {string} button with empty fields")
	public void admin_clicks_on_button_with_empty_fields(String string) {
	    
	    
	}

	//@TC_ResetPasswordDetails_06
	@When("Admin enters mismatch values on <newpassword> and <retypepassword>")
	public void admin_enters_mismatch_values_on_newpassword_and_retypepassword(io.cucumber.datatable.DataTable dataTable) {
	    
	    
	}


}
