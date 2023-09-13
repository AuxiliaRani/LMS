package stepDefintionsStudent;

import static org.testng.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Studentpage;
import utilities.LoggerLoad;

public class StudentpageNavigationSD extends DriverFactory {
	private WebDriver driver;
    private Studentpage studentPage;

   
 @Given("Admin is on student details page")
	public void admin_is_on_student_details_page() {
	 String title = Studentpage.getStudentDetailspage();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, "Student details page" , "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}
	@When("Admin clicks on program link on student  page")
	public void admin_clicks_on_program_link_on_student_page() {
		Studentpage.clickProgramLink();
	}

	@Then("Admin is redirected to Program page")
	public void admin_is_redirected_to_program_page() {
		
		try {
		 assertTrue("Admin is not redirected to the Program page.", Studentpage.isProgramPageDisplayed());
    } catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}

	}

	@When("Admin clicks on Batch link on student page")
	public void admin_clicks_on_batch_link_on_student_page() {
		Studentpage.clickBatchLink();
		LoggerLoad.info("admin is on batch");
	}

	@Then("Admin is redirected to Batch page")
	public void admin_is_redirected_to_batch_page() {
		Assert.assertTrue("Admin is not redirected to the Batch page.", Studentpage.isBatchPageDisplayed());
    }
	

	@When("Admin clicks on Class link on student page")
	public void admin_clicks_on_class_link_on_student_page() {
		Studentpage.clickClassLink();
	}

	@Then("Admin is redirected to Class page")
	public void admin_is_redirected_to_class_page() {
	   Studentpage.isClassPageDisplayed();
	}

	@When("Admin clicks on User link on student page")
	public void admin_clicks_on_user_link_on_student_page() {
	    Studentpage.clickUserLink();
	    
	}

	@Then("Admin is redirected to User page")
	public void admin_is_redirected_to_user_page() {
	    Studentpage.isUserPageDisplayed();
	}

	@When("Admin clicks on Assignment link on student page")
	public void admin_clicks_on_assignment_link_on_student_page() {
	    Studentpage.clickAssignmentLink();
	}

	@Then("Admin is redirected to Assignment page")
	public void admin_is_redirected_to_assignment_page() {
	   Studentpage.isAssignmentPageDisplayed();
	}

	@When("Admin clicks on Attendance link on student page")
	public void admin_clicks_on_attendance_link_on_student_page() {
	    Studentpage.clickAttendanceLink();
	}

	@Then("Admin is redirected to Attendance page")
	public void admin_is_redirected_to_attendance_page() {
	    Studentpage.isAttendancePageDisplayed();
	}

	@When("Admin clicks on Logout link on student page")
	public void admin_clicks_on_logout_link_on_student_page() {
	    Studentpage.clickLogoutLink();
	}

	@Then("Admin is redirected to Login page")
	public void admin_is_redirected_to_login_page() {
	    Studentpage.isLogoutPageDisplayed();
	}


	
	
	

}
