package stepDefinitionsDashboardPage;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import utilities.LoggerLoad;

public class LogoutSD {

	DashboardPage dashboardPage = new DashboardPage();
	
	//@TC_Logout_01
	@Given("Admin is on {string} page for logout")
	public void admin_is_on_page_for_logout(String expectedDashboard) {
		String actualPage = dashboardPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + actualPage);
		try {
			assertEquals(actualPage, expectedDashboard, "Title of the current page do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	    
	}

	@When("Admin clicks {string} button on navigation bar")
	public void admin_clicks_button_on_navigation_bar(String string) {
		LoggerLoad.info("Admin clicks on Logout button from the navigation bar");
		dashboardPage.clickLogoutButton();
	    
	}

	@Then("Admin should land on {string} page after clicking logout")
	public void admin_should_land_on_page_after_clicking_logout(String expectedLogin) {
	    
		String actualPage = dashboardPage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + actualPage);
		try {
			assertEquals(actualPage, expectedLogin, "Title of the current page do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}		
		LoggerLoad.info("Admin is redirected to the Login Page with the message");
		LoggerLoad.info("Actual Message displayed in the browser : " + dashboardPage.getMsg());
		try {
			assertEquals(dashboardPage.getMsg(), "Logged Successfully", "Logout failed");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}
}
