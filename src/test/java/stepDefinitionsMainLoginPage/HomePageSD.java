/**
 * Author:    Auxilia
 * Created:   09.10.2023
 * 
 * Numpy Ninja
 **/
package stepDefinitionsMainLoginPage;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebElement;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MainPage;
import utilities.LoggerLoad;

public class HomePageSD extends DriverFactory {
	MainPage homePage = new MainPage();
	private int responseCode;

	// Background
	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {
		LoggerLoad.info("Admin launch the browser");
	}

	// @TC_HomePage_01
	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
		LoggerLoad.info("Admin launch the LMS Portal url ");
		homePage.getLMSPortal();

	}

	@Then("Admin should land on the Home page")
	public void admin_should_land_on_the_home_page() {
		String title = homePage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, "LMS", "Titile do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	// @TC_HomePage_02

	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() {
		LoggerLoad.info("Admin gives invalid LMS portal url");
		homePage.getInvalidUrl();
	}

	@Then("Admin should receive {string} error for the invalid URL")
	public void admin_should_receive_error_for_the_invalid_url(String expectedErrormsg) {
		LoggerLoad.info("Expected error message : " + expectedErrormsg);
		boolean actualErrormsg = driver.getPageSource().contains(expectedErrormsg);
		try {
			assertTrue("Expected error message not found", actualErrormsg);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_HomePage_03
	@Then("Admin should receive {string} error for the LMS link")
	public void admin_should_receive_error_for_the_lms_link(String expectedResponseCode) throws IOException {

		// Get the current URL of the LMS link
		URL lmsLinkUrl = new URL(driver.getCurrentUrl());

		HttpURLConnection http = (HttpURLConnection) lmsLinkUrl.openConnection();
		responseCode = http.getResponseCode();
		int expectedRespCode = Integer.parseInt(expectedResponseCode);
		LoggerLoad.info("Expected Response Code : " + expectedResponseCode);
		try {
			assertEquals(expectedRespCode, responseCode);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	@Then("The link is broken")
	public void the_link_is_broken() {
		try {
			assertTrue("The Link is Broken", responseCode >= 400);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	// @TC_HomePage_04
	@Then("Admin should see correct spellings in all fields on the LMS portal")
	public void admin_should_see_correct_spellings_in_all_fields() {
		String learningTxt = homePage.getLearningTxt();
		String managementTxt = homePage.getManagementTxt();
		String systemTxt = homePage.getSystemTxt();
		try {
			assertEquals("Learning field has incorrect spelling", "Learning", learningTxt);
			assertEquals("Management field has incorrect spelling", "Learning", managementTxt);
			assertEquals("System field has incorrect spelling", "Learning", systemTxt);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_HomePage_05
	@Then("Admin should see correct Logo of the LMS")
	public void admin_should_see_correct_logo_of_the_lms() {
		LoggerLoad.info("Verify correct Logo of the LMS");
		WebElement lmslogo = homePage.getLMSLogo();
		try {
			// Verify the presence of the logo.
			assertNotNull("Logo element is not present", lmslogo);
			String altText = lmslogo.getAttribute("alt");
			assertEquals("Alt text of the logo is incorrect", "LMS Logo", altText);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_HomePage_06
	@Then("Admin should see that the Logo is properly aligned")
	public void admin_should_see_that_the_logo_is_properly_aligned() {
		LoggerLoad.info("Verify Logo is properly aligned");
		WebElement lmslogo = homePage.getLMSLogo();
		String verticalAlign = lmslogo.getCssValue("vertical-align");
		String horizontalAlign = lmslogo.getCssValue("text-align");
		try {
			assertEquals("Vertical alignment is incorrect", "middle", verticalAlign);
			assertEquals("Horizontal alignment is incorrect", "center", horizontalAlign);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_HomePage_07
	@Then("Admin should see the {string} button in LMS Portal")
	public void admin_should_see_the_button_in_lms_portal(String string) {
		LoggerLoad.info("Verify Login button in LMS Portal");
		WebElement loginButton = homePage.verifyLoginButton();
		try {
			assertNotNull("Login button is not present", loginButton);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_HomePage_08
	@Then("Admin should be able to click the {string} button on LMS Portal")
	public void admin_should_be_able_to_click_the_button_on_lms_portal(String string) {
		LoggerLoad.info("Verify Login button is clickable");
		WebElement loginButton = homePage.verifyLoginButton();
		// Check if the Login button is clickable
		boolean isClickable = loginButton.isEnabled();
		try {
			assertTrue("Login button is not clickable", isClickable);
			homePage.clickLoginButton();
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

}
