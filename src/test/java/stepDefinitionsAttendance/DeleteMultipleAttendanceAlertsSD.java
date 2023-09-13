package stepDefinitionsAttendance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.AttendanceModule;
import utilities.LoggerLoad;

public class DeleteMultipleAttendanceAlertsSD {
	
	Hooks hooks;
	AttendanceModule attendanceModule;
	
	{
		this.hooks=hooks;
		this.attendanceModule = hooks.getAttendanceModuleObject();
		
		LoggerLoad.info("******* Multiple Delete Attendance Alert Validation ********");
	}
	
	@Given("Admin is in delete alert for attendance module09")
	public void admin_is_in_delete_alert_for_attendance_module09() {
		attendanceModule.confirmMessageDisplayed();
	}

	@When("Admin clicks yes button for attendance module09")
	public void admin_clicks_yes_button_for_attendance_module09() {
		attendanceModule.clickYesOnConfirm();
	}

	@Then("Success message and selected attendance detail are deleted from the data table for attendance module09")
	public void success_message_and_selected_attendance_detail_are_deleted_from_the_data_table_for_attendance_module09() {
		attendanceModule.VerifyYesOnConfirm();
		//attendanceModule.searchDeletedAttendance(String);
	}

	@When("Admin clicks no button for Attendance Module09")
	public void admin_clicks_no_button_for_attendance_module09() {
		attendanceModule.clickNoOnConfirm();
	}

	@Then("Redirected to attendance page and selected attendance details are not deleted from the data table for attendance module09")
	public void redirected_to_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table_for_attendance_module09() {
		attendanceModule.VerifyNoOnConfirm();
		attendanceModule.AttendanceModuleIsDisplayed();
		//attendanceModule.searchDeletedAttendance(String);
	
		
	}


}
