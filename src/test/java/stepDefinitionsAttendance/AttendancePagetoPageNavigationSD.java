package stepDefinitionsAttendance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.AttendanceModule;
import utilities.LoggerLoad;

public class AttendancePagetoPageNavigationSD {
	
	Hooks hooks;
	AttendanceModule attendanceModule;
	
	{
		this.hooks=hooks;
		this.attendanceModule = hooks.getAttendanceModuleObject();
		
		LoggerLoad.info("******* Attendance Page to Page Navigations ********");
	}
	
	
	@Given("Admin is in manage attendance page for attendance module13")
	public void admin_is_in_manage_attendance_page_for_attendance_module13() {
		
		attendanceModule.AttendanceModuleIsDisplayed();
	    
	}

	@When("Admin clicks {string} button in the navigation bar for attendance module13")
	public void admin_clicks_button_in_the_navigation_bar_for_attendance_module13(String string) {
		attendanceModule.clickAttandanceButton();
		
	}

	@Then("Admin should able to land on student page for attendance module13")
	public void admin_should_able_to_land_on_student_page_for_attendance_module13() {
		attendanceModule.clickOnNavigationBarStudent();
		attendanceModule.verifyStudentPageNavigation();
		
	}

	@Then("Admin should able to land on program page for attendance module13")
	public void admin_should_able_to_land_on_program_page_for_attendance_module13() {
		attendanceModule.clickOnNavigationBarProg();
		attendanceModule.verifyProgramPageNavigation();
	}

	@Then("Admin should able to land on batch page for attendance module13")
	public void admin_should_able_to_land_on_batch_page_for_attendance_module13() {
		attendanceModule.clickOnNavigationBarBatch();
		attendanceModule.verifyBatchPageNavigation();
	}

	@Then("Admin should able to land on user page for attendance module13")
	public void admin_should_able_to_land_on_user_page_for_attendance_module13() {
		attendanceModule.clickOnNavigationBarUser();
		attendanceModule.verifyUserPageNavigation();
	}

	@Then("Admin should able to land on Assignment page for attendance module13")
	public void admin_should_able_to_land_on_assignment_page_for_attendance_module13() {
		attendanceModule.clickOnNavigationBarAssignment();
		attendanceModule.verifyAssignmentPageNavigation();
	}

	@Then("Admin should able to land on class page for attendance module13")
	public void admin_should_able_to_land_on_class_page_for_attendance_module13() {
		attendanceModule.clickOnNavigationBarClass();
		attendanceModule.verifyClassPageNavigation();
	}

	@Then("Admin should able to land on login page for attendance module13")
	public void admin_should_able_to_land_on_login_page_for_attendance_module13() {
		
		attendanceModule.clickOnNavigationBarLogout();
		attendanceModule.verifyLogoutToLoginPageNavigation();
	   
	}




}
