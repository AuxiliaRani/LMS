package stepDefinitionsAttendance;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.AttendanceModule;
import utilities.LoggerLoad;

public class SingleDeleteAttendanceAlertValidation {

	Hooks hooks;
	AttendanceModule attendanceModule;
	
	{
		this.hooks=hooks;
		this.attendanceModule = hooks.getAttendanceModuleObject();
		
		LoggerLoad.info("******* Single Delete Attendance Alert Validation ********");
	}

	
	@Given("Admin is in delete alert for Attendance Module07")
	public void admin_is_in_delete_alert_for_attendance_module07() {
		attendanceModule.confirmMessageDisplayed();
	}

	@When("Admin clicks yes button for Attendance Module07")
	public void admin_clicks_yes_button_for_attendance_module07() {
		attendanceModule.clickYesOnConfirm();
	}

	@Then("Success message and selected attendance details are deleted from the data table07")
	public void success_message_and_selected_attendance_details_are_deleted_from_the_data_table07() {
	   
		attendanceModule.VerifyYesOnConfirm();
	}

	@When("Admin clicks no button for Attendance Module07")
	public void admin_clicks_no_button_for_attendance_module07() {
		attendanceModule.clickNoOnConfirm();
	}

	@Then("Redirected attendance page and selected attendance details are not deleted from the data table07")
	public void redirected_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table07() {
		attendanceModule.VerifyNoOnConfirm();
	}




}
