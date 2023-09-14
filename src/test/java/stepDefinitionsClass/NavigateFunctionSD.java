package stepDefinitionsClass;

import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.NavigateFunction;
import utilities.LoggerLoad;

public class NavigateFunctionSD extends DriverFactory{

	NavigateFunction navigateFuction = new NavigateFunction();
	
	@When("Admin clicks Student button in the navigation bar manage class page")
	public void admin_clicks_student_button_in_the_navigation_bar_manage_class_page() {
		navigateFuction.StudentButton();
	}

	@Then("Admin should able to land on student page")
	public void admin_should_able_to_land_on_student_page() {
	   String ExpectedURL = driver.getCurrentUrl();
	  String ActualUrl =  config.getString("studentURL");
	  
	  try {
	  Assert.assertEquals(ExpectedURL, ActualUrl);
	  LoggerLoad.warn("ActualUrl matches expectedUrl"); 
	  }catch(AssertionError e) {
		 LoggerLoad.warn("ActualUrl doesn't match expectedUrl"); 
	  }
	}
	
	@When("Admin clicks Program button in the navigation bar manage class page")
	public void admin_clicks_program_button_in_the_navigation_bar_manage_class_page() {
		navigateFuction.ProgramButton();
	}

	@Then("Admin should able to land on program page")
	public void admin_should_able_to_land_on_program_page() {
		String ExpectedURL = driver.getCurrentUrl();
		  String ActualUrl =  config.getString("ProgramPageURL");
		  
		  try {
		  Assert.assertEquals(ExpectedURL, ActualUrl);
		  LoggerLoad.warn("ActualUrl matches expectedUrl"); 
		  }catch(AssertionError e) {
			 LoggerLoad.warn("ActualUrl doesn't match expectedUrl"); 
		  }
	}
	
	@When("Admin clicks Batch button in the navigation bar manage class page")
	public void admin_clicks_batch_button_in_the_navigation_bar_manage_class_page() {
		navigateFuction.BatchButton();
	}

	@Then("Admin should able to land on batch page")
	public void admin_should_able_to_land_on_batch_page() {
		String ExpectedURL = driver.getCurrentUrl();
		  String ActualUrl =  config.getString("BatchPageURL");
		  
		  try {
		  Assert.assertEquals(ExpectedURL, ActualUrl);
		  LoggerLoad.warn("ActualUrl matches expectedUrl"); 
		  }catch(AssertionError e) {
			 LoggerLoad.warn("ActualUrl doesn't match expectedUrl"); 
		  }
	}

	@When("Admin clicks User button in the navigation bar of manage class page")
	public void admin_clicks_user_button_in_the_navigation_bar_of_manage_class_page() {
		navigateFuction.UserButton();
	}
	@Then("Admin should able to land on user page")
	public void admin_should_able_to_land_on_user_page() {
		String ExpectedURL = driver.getCurrentUrl();
		  String ActualUrl =  config.getString("UserPageURL");
		  
		  try {
		  Assert.assertEquals(ExpectedURL, ActualUrl);
		  LoggerLoad.warn("ActualUrl matches expectedUrl"); 
		  }catch(AssertionError e) {
			 LoggerLoad.warn("ActualUrl doesn't match expectedUrl"); 
		  }
	}
	
	@When("Admin clicks Assignment button in the navigation bar of manage class page")
	public void admin_clicks_assignment_button_in_the_navigation_bar_of_manage_class_page() {
		navigateFuction.AssignmentButton();
	}

	@Then("Admin should able to land on Assignment page")
	public void admin_should_able_to_land_on_assignment_page() {
		String ExpectedURL = driver.getCurrentUrl();
		  String ActualUrl =  config.getString("AssignmentURL");
		  
		  try {
		  Assert.assertEquals(ExpectedURL, ActualUrl);
		  LoggerLoad.warn("ActualUrl matches expectedUrl"); 
		  }catch(AssertionError e) {
			 LoggerLoad.warn("ActualUrl doesn't match expectedUrl"); 
		  }
	}

	@When("Admin clicks Attendance button in the navigation bar of manage class page")
	public void admin_clicks_attendance_button_in_the_navigation_bar_of_manage_class_page() {
		navigateFuction.AttendanceButton();
	}
	
	@Then("Admin should able to land on Attendance page")
	public void admin_should_able_to_land_on_attendance_page() {
		String ExpectedURL = driver.getCurrentUrl();
		  String ActualUrl =  config.getString("AttendanceURL");
		  
		  try {
		  Assert.assertEquals(ExpectedURL, ActualUrl);
		  LoggerLoad.warn("ActualUrl matches expectedUrl"); 
		  }catch(AssertionError e) {
			 LoggerLoad.warn("ActualUrl doesn't match expectedUrl"); 
		  }
	}

	@When("Admin clicks Logout button in the navigation bar of manage class page")
	public void admin_clicks_logout_button_in_the_navigation_bar_of_manage_class_page() {
		navigateFuction.LogoutButton();
	}
	
	@Then("Admin should able to land on login page")
	public void admin_should_able_to_land_on_login_page() {
		String ExpectedURL = driver.getCurrentUrl();
		  String ActualUrl =  config.getString("loginpage");
		  
		  try {
		  Assert.assertEquals(ExpectedURL, ActualUrl);
		  LoggerLoad.warn("ActualUrl matches expectedUrl"); 
		  }catch(AssertionError e) {
			 LoggerLoad.warn("ActualUrl doesn't match expectedUrl"); 
		  }
	}
	
	
	
}
