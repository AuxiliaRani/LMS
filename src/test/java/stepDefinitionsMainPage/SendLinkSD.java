package stepDefinitionsMainPage;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MainPage;
import utilities.LoggerLoad;

public class SendLinkSD {

	MainPage homePage = new MainPage();

	// Background(Admin Clicks on Forgot Username and Password after reaching Login
	// page)
	@Given("Admin is in {string} page")
	public void admin_is_in_page(String forgtUserPwd) {
		homePage.getLoginPage();
		homePage.clickForgotUserPwd();
		String title = homePage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, forgtUserPwd, "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_SendLink_01
	@When("Admin enters valid {string} and clicks {string} button")
	public void admin_enters_valid_and_clicks_button(String string, String string2,
			io.cucumber.datatable.DataTable dataTable) {

	}

	@Then("Admin should receive link in mail to Reset Username\\/Password")
	public void admin_should_receive_link_in_mail_to_reset_username_password() {

	}

	// @TC_SendLink_02
	@When("Admin enters invalid {string} and clicks {string} button")
	public void admin_enters_invalid_and_clicks_button(String string, String string2,
			io.cucumber.datatable.DataTable dataTable) {

	}

	@Then("Admin should not receive link in mail to Reset Username\\/Password")
	public void admin_should_not_receive_link_in_mail_to_reset_username_password() {

	}

}
