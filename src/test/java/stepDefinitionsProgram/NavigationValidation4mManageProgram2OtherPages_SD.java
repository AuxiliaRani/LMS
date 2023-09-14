package stepDefinitionsProgram;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.ProgramModule;

public class NavigationValidation4mManageProgram2OtherPages_SD {
	Hooks hooks;
	ProgramModule programModule;
	
	public NavigationValidation4mManageProgram2OtherPages_SD(Hooks hooks)
	{
		this.hooks=hooks;
		this.programModule = hooks.getProgramModuleObject();
	}
	@Given("Admin is on Manage Program page for validating Navigation")
	public void admin_is_on_manage_program_page_for_validating_navigation() {
		programModule.navigateToProgam();
	    
	}

	@When("Admin clicks on Student link on Manage Program page")
	public void admin_clicks_on_student_link_on_manage_program_page() {
	    
		programModule.navigateToStudent();
	}

	@Then("Admin is re-directed to Student page")
	public void admin_is_re_directed_to_student_page() {
	    
		String pagename=programModule.verifyPageTitleProgam();
		assertEquals(pagename, "Student");
	}

	@When("Admin clicks on Batch link on Manage Program page")
	public void admin_clicks_on_batch_link_on_manage_program_page() {
		programModule.navigateToProgam();
		programModule.navigateToBatch();
	}

	@Then("Admin is re-directed to Batch page from Program page")
	public void admin_is_re_directed_to_batch_page_from_program_page() {
	    
		String pagename=programModule.verifyPageTitleProgam();
		assertEquals(pagename, "Batch");
	}

	@When("Admin clicks on Class link on Manage Program page")
	public void admin_clicks_on_class_link_on_manage_program_page() {
		programModule.navigateToProgam();
		programModule.navigateToClass();
	}

	@Then("Admin is re-directed to Class page from Program page")
	public void admin_is_re_directed_to_class_page_from_program_page() {
		String pagename=programModule.verifyPageTitleProgam();
		assertEquals(pagename, "Class");
	    
	}

	@When("Admin clicks on User link on Manage Program page")
	public void admin_clicks_on_user_link_on_manage_program_page() {
		programModule.navigateToProgam();
		programModule.navigateToUser();
	}

	@Then("Admin is re-directed to User page from Program page")
	public void admin_is_re_directed_to_user_page_from_program_page() {
		String pagename=programModule.verifyPageTitleProgam();
		assertEquals(pagename, "User");
	    
	}

	@When("Admin clicks on Assignment link on Manage Program page")
	public void admin_clicks_on_assignment_link_on_manage_program_page() {
		programModule.navigateToProgam();
		programModule.navigateToAssignment();
	}

	@Then("Admin is re-directed to Assignment page from Program page")
	public void admin_is_re_directed_to_assignment_page_from_program_page() {
		
		String pagename=programModule.verifyPageTitleProgam();
		assertEquals(pagename, "Assignment");
	}

	@When("Admin clicks on Attendance link on Manage Program page")
	public void admin_clicks_on_attendance_link_on_manage_program_page() {
		programModule.navigateToProgam();
		programModule.navigateToAttendance();
	}

	@Then("Admin is re-directed to Attendance page  from Program page")
	public void admin_is_re_directed_to_attendance_page_from_program_page() {
		
		String pagename=programModule.verifyPageTitleProgam();
		assertEquals(pagename, "Attendance");
	}

	@When("Admin clicks on Logout link on Manage Program page")
	public void admin_clicks_on_logout_link_on_manage_program_page() {
		programModule.navigateToProgam();
		programModule.navigateToLogout();
	}

	@Then("Admin is re-directed to Login page from Program page")
	public void admin_is_re_directed_to_login_page_from_program_page() {
	    
		String pagename=programModule.verifyPageTitleProgam();
		assertEquals(pagename, "Program");
	}


}
