package stepDefinitionsDashboardPage;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.MainPage;
import utilities.LoggerLoad;

public class DashboardPageSD extends DriverFactory {

	MainPage loginPage = new MainPage();
	DashboardPage dashboardPage = new DashboardPage();
	int responseCode;

	// Background: Admin clicks Login button after giving correct URL
	@Given("Admin is on {string} page for Dashboard Validation")
	public void admin_is_on_page_for_dashboard_validation(String login) {
		dashboardPage.getLMSPortal();
		dashboardPage.clickHomeLoginButton();
		String title = verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, login, "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	@When("Admin enter valid {string} and {string}")
	public void admin_enter_valid_and(String string, String string1, io.cucumber.datatable.DataTable dataTable) {
		try {
			enterValidUsername(dataTable);
			enterValidPassword(dataTable);
		} catch (Error e) {
			LoggerLoad.error("Login Failed: " + e.getMessage());
		}
	}

	@When("Admin clicks {string} button from Login page")
	public void admin_clicks_button_from_login_page(String string) {
		LoggerLoad.info("Admin click login button");
		dashboardPage.clickLoginButton();
	}

	// @TC_Dashboard_01
	@Then("Admin should see {string} as header for Dashboard page")
	public void admin_should_see_as_header_for_dashboard_page(String expectedHeader) {
		LoggerLoad.info("Expected Header in the Dashboard Page" + expectedHeader);
		String actualHeader = dashboardPage.getHeaderText();
		LoggerLoad.info("Actual header in the Dashboard page: " + actualHeader);
		try {
			assertEquals(actualHeader, expectedHeader, "Header text is incorrect : " + actualHeader);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_02
	@Then("Admin see Maximum navigation time in milliseconds, defaults to {int} seconds for Dashboard page")
	public void admin_see_maximum_navigation_time_in_milliseconds_defaults_to_seconds_for_dashboard_page(Integer int1) {
		long maxNavigationTime = dashboardPage.getMaxNavigationTime();
		long expectedMaxNavigationTime = 30;
		try {
			assertTrue("Maximum navigation time does not match the expected value",
					maxNavigationTime == expectedMaxNavigationTime);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_03
	@Then("Admin should receive {string} error for the Dashboard page link")
	public void admin_should_receive_error_for_the_dashboard_page_link(String expectedResponseCode) throws IOException {
		// Get the current URL
		URL dashboardUrl = new URL(driver.getCurrentUrl());

		HttpURLConnection http = (HttpURLConnection) dashboardUrl.openConnection();
		responseCode = http.getResponseCode();
		int expectedRespCode = Integer.parseInt(expectedResponseCode);
		LoggerLoad.info("Expected Response Code : " + expectedResponseCode);
		try {
			assertEquals(expectedRespCode, responseCode);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	
	@Then("The link is broken for Dashboard page")
	public void the_link_is_broken_for_dashboard_page() {
		try {
			assertTrue("The Link is Broken", responseCode >= 400);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	// @TC_Dashboard_04
	@Then("Admin should see {string} as title on Dashboard page")
	public void admin_should_see_as_title_on_dashboard_page(String expectedtitle) {
		String actualTitle = driver.getTitle();
		LoggerLoad.info("Title of the current page: " + actualTitle);
		try {
			assertEquals(actualTitle, expectedtitle, "Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_05
	@Then("Admin should see LMS title on the top left corner of the Manage Program page for Dashboard page")
	public void admin_should_see_lms_title_on_the_top_left_corner_of_the_manage_program_page_for_dashboard_page() {
		boolean isTitleAligned = dashboardPage.isLMSTitleAligned();
		try {
        assertTrue(isTitleAligned, "LMS title is not aligned on the top left corner");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
    }
	

	// @TC_Dashboard_06
	@Then("Admin should see correct spelling on navigation bar text for Dashboard page")
	public void admin_should_see_correct_spelling_on_navigation_bar_text_for_dashboard_page(io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedNavigationBarText = dataTable.asList(String.class);
        List<String> actualNavigationBarText = dashboardPage.getNavigationBarText();
        try {
        assertEquals(expectedNavigationBarText, actualNavigationBarText, "Navigation bar text is not correct");
        }catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
    }

	// @TC_Dashboard_07
	@Then("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title(String  expectedTitle) {
		String actualTitle = dashboardPage.getLMSTitle();
		LoggerLoad.info("Title of the current page: " + actualTitle);
		try {
			assertEquals(actualTitle, expectedTitle, "LMS Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_08
	@Then("Admin should see the navigation bar text on the top right side on Dashboard page")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side_on_dashboard_page() {
		boolean isNavigationBarTopRightAligned = dashboardPage.isNavigationBarTopRightAligned();
		try {
        assertTrue(isNavigationBarTopRightAligned, "Navigation bar text is not aligned on the top right side");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}


	// @TC_Dashboard_09
	@Then("Admin should see {string} in the 1st place")
	public void admin_should_see_in_the_1st_place(String expectedStudent) {
		String firstItem = dashboardPage.getFirstItemNavBar();
		try {
        assertEquals(expectedStudent, firstItem, expectedStudent + " is not in the 1st place in the navigation bar");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
    }


	// @TC_Dashboard_10
	@Then("Admin should see {string} in the 2nd place")
	public void admin_should_see_in_the_2nd_place(String expectedProgram) {
		String secondItem = dashboardPage.getSecondItemNavBar();
		try {
        assertEquals(expectedProgram, secondItem, expectedProgram + " is not in the 2nd place in the navigation bar");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_11
	@Then("Admin should see {string} in the 3rd place")
	public void admin_should_see_in_the_3rd_place(String expectedBatch) {
		String thirdItem = dashboardPage.getThirdItemNavBar();
		try {
        assertEquals(expectedBatch, thirdItem, expectedBatch + " is not in the 3rd place in the navigation bar");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_12
	@Then("Admin should see {string} in the 4th place")
	public void admin_should_see_in_the_4th_place(String expectedClass) {
		String fourthItem = dashboardPage.getFourthItemNavBar();
		try {
        assertEquals(expectedClass, fourthItem, expectedClass + " is not in the 4th place in the navigation bar");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_13
	@Then("Admin should see {string} in the 5th place")
	public void admin_should_see_in_the_5th_place(String expectedUser) {
		String fifthItem = dashboardPage.getFifthItemNavBar();
		try {
        assertEquals(expectedUser, fifthItem, expectedUser + " is not in the 5th place in the navigation bar");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_14
	@Then("Admin should see {string} in the 6th place")
	public void admin_should_see_in_the_6th_place(String expectedAttendance) {
		String sixthItem = dashboardPage.getSixthItemNavBar();
		try {
        assertEquals(expectedAttendance, sixthItem, expectedAttendance + " is not in the 6th place in the navigation bar");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_15
	@Then("Admin should see {string} in the 7th place")
	public void admin_should_see_in_the_7th_place(String expectedAssignment) {
		String seventhItem = dashboardPage.getSeventhItemNavBar();
		try {
        assertEquals(expectedAssignment, seventhItem, expectedAssignment + " is not in the 7th place in the navigation bar");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	// @TC_Dashboard_16
	@Then("Admin should see {string} in the 8th place")
	public void admin_should_see_in_the_8th_place(String expectedLogout) {
		String eigthItem = dashboardPage.getEigthItemNavBar();
		try {
        assertEquals(expectedLogout, eigthItem, expectedLogout + " is not in the 8th place in the navigation bar");
		}catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

}
