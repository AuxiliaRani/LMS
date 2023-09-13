package stepDefinitionsAttendance;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.AttendanceModule;
import utilities.LoggerLoad;

public class SingleDeleteValidationSD {
	
	Hooks hooks;
	AttendanceModule attendanceModule;
	
	public SingleDeleteValidationSD(Hooks hooks) {
		

	{
		this.hooks=hooks;
		this.attendanceModule = hooks.getAttendanceModuleObject();
		
		LoggerLoad.info("******* Single Delete Attendance Validation ********");
	}
	
	} 
	@Given("Admin is in manage attendance page06")
	public void admin_is_in_manage_attendance_page06() {
		
		attendanceModule.clickAttandanceButton();
		attendanceModule.AttendanceModuleIsDisplayed();
		
	    
	}

	@When("Admin clicks delete button in data table row level06")
	public void admin_clicks_delete_button_in_data_table_row_level06() {
		attendanceModule.deleteAttendance();
	}

	@Then("Admin should see alert06")
	public void admin_should_see_alert06() {
	    
		attendanceModule.confirmMessageDisplayed();
	}

	@Then("Alert should have {string} button to accept06")
	public void alert_should_have_button_to_accept06(String string) {
		attendanceModule.clickYesOnConfirm();
	}

	@Then("Alert should have {string} button to reject06")
	public void alert_should_have_button_to_reject06(String string) {
	    
		attendanceModule.clickNoOnConfirm();
	}

	
}
