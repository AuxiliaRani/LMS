/**
 * Author:    Auxilia
 * Created:   09.12.2023
 * 
 * Numpy Ninja
 **/
package stepDefinitionsMainLoginPage;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MainPage;
import utilities.LoggerLoad;

public class ResetPasswordDetailsSD {

	MainPage resetPwdPage = new MainPage();

	// @TC_ResetPasswordDetails_01
	@When("Admin clicks on {string} field")
	public void admin_clicks_on_field(String string) {
		resetPwdPage.clickTypeNewPwd();

	}

	@Then("Admin should see Type in new Password text box is in enabled state")
	public void admin_should_see_type_in_new_password_text_box_is_in_enabled_state() {
		boolean isTypeNewPwdEnabled = resetPwdPage.isTypeNewPwd();
		try {
			assertFalse("Type in new Password is not in Enabled state", isTypeNewPwdEnabled);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	// @TC_ResetPasswordDetails_02
	@Then("Admin should see ReType Password text box is in enabled state")
	public void admin_should_see_retype_password_text_box_is_in_enabled_state() {
		boolean isRetypePwdEnabled = resetPwdPage.isRetypePwd();
		try {
			assertFalse("ReType Password is not in Enabled state", isRetypePwdEnabled);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	// @TC_ResetPasswordDetails_03
	@When("Admin enters same valid password on {string} and {string}")
	public void admin_enters_same_valid_password_on_and(String string, String string1,
			io.cucumber.datatable.DataTable dataTable) {
		LoggerLoad.info("Admin enter values in new password and retype password");
		resetPwdPage.enterNewPassword(dataTable);
		resetPwdPage.enterRetypePassword(dataTable);

	}

	@When("Admin clicks {string} button on Reset Password Page")
	public void admin_clicks_button_on_reset_password_page(String string) {
		LoggerLoad.info("Admin clicks the submit button");
		resetPwdPage.clickSubmitButton();

	}

	@Then("Admin should receive {string}")
	public void admin_should_receive(String expectedSuccessMsg) {
		LoggerLoad.info("Admin is redirected to Login Page ");
		LoggerLoad.info("Expected Success Message : " + expectedSuccessMsg);
		LoggerLoad.info("Actual Message displayed in the browser : " + resetPwdPage.getMsg());
		try {
			assertEquals(resetPwdPage.getMsg(), expectedSuccessMsg, "Password reset failed");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_ResetPasswordDetails_04
	@When("Admin enters invalid same password on {string} and {string}")
	public void admin_enters_invalid_same_password_on_and(String string, String string1,
			io.cucumber.datatable.DataTable dataTable) {
		LoggerLoad.info("Admin enter invalid same values in new password and retype password");
		resetPwdPage.enterNewPassword(dataTable);
		resetPwdPage.enterRetypePassword(dataTable);

	}

	@Then("Admin should see error message {string}")
	public void admin_should_see_error_message(String expErrorMsg) {
		LoggerLoad.info("Expected Error Message : " + expErrorMsg);
		LoggerLoad.info("Actual Message displayed in the browser : " + resetPwdPage.getMsg());
		try {
			assertEquals(resetPwdPage.getMsg(), expErrorMsg);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	// @TC_ResetPasswordDetails_05
	@When("Admin clicks on {string} button with empty fields")
	public void admin_clicks_on_button_with_empty_fields(String string) {
		LoggerLoad.info("User Clicks the Submit Button without entering any values in password Fields");
		resetPwdPage.clickSubmitButton();

	}

	// @TC_ResetPasswordDetails_06
	@When("Admin enters mismatch values on {string} and {string}")
	public void admin_enters_mismatch_values_on_and(String string, String string1,
			io.cucumber.datatable.DataTable dataTable) {
		LoggerLoad.info("Admin enter mismatch values in new password and retype password");
		resetPwdPage.enterNewPassword(dataTable);
		resetPwdPage.enterRetypePassword(dataTable);

	}

}
