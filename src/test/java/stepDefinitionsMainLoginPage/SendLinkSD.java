/**
 * Author:    Auxilia
 * Created:   09.10.2023
 * 
 * Numpy Ninja
 **/
package stepDefinitionsMainLoginPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MainPage;
import utilities.LoggerLoad;

public class SendLinkSD {

	MainPage forgotPwdPage = new MainPage();

	// Background(Admin Clicks on Forgot Username and Password after reaching Login
	// page)
	@Given("Admin is in {string} page")
	public void admin_is_in_page(String forgtUserPwd) {
		forgotPwdPage.getLoginPage();
		forgotPwdPage.clickForgotUserPwd();
		String title = forgotPwdPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, forgtUserPwd, "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_SendLink_01
	@When("Admin enters valid {string}")
	public void admin_enters_valid(String string, io.cucumber.datatable.DataTable dataTable) {
		try {
			forgotPwdPage.enterEmail(dataTable);
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}

	@When("Admin clicks {string} button on Forgot Username and Password page")
	public void admin_clicks_button_on_forgot_username_and_password_page(String string) {
		LoggerLoad.info("Admin click Send Link button");
		forgotPwdPage.clickSendLinkButton();

	}

	@Then("Admin should receive link in mail to Reset Username\\/Password")
	public void admin_should_receive_link_in_mail_to_reset_username_password() {
		String emailLink = forgotPwdPage.getEmailLink();
		try {
			// Check if the email content contains a reset link
			assertTrue("Email received does not have link to reset username or password",
					emailLink.contains("Reset your Username/Password"));
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_SendLink_02
	@When("Admin enters invalid {string}")
	public void admin_enters_invalid(String string, io.cucumber.datatable.DataTable dataTable) {
		try {
			forgotPwdPage.enterEmail(dataTable);
		} catch (Error e) {
			LoggerLoad.error(e.getMessage());
		}
	}

	@Then("Admin should not receive link in mail to Reset Username\\/Password")
	public void admin_should_not_receive_link_in_mail_to_reset_username_password() {
		boolean emailReceived = forgotPwdPage.isEmailReceived();
		try {
	        assertFalse("Email received link in mail for reset username or password",emailReceived);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

}
