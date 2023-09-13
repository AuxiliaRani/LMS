package stepDefinitionsAttendance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.AttendanceModule;
import utilities.LoggerLoad;


public class DeleteMultipleAttendanceAlertValidationsSD {
	
	Hooks hooks;
	AttendanceModule attendanceModule;
	
	{
		this.hooks=hooks;
		this.attendanceModule = hooks.getAttendanceModuleObject();
		
		LoggerLoad.info("******* Multiple Delete Attendance Alert Validations ********");
	}
	
	@Given("Admin is in delete alert for attendance module10")
	public void admin_is_in_delete_alert_for_attendance_module10() {
		attendanceModule.confirmMessageDisplayed();
	}

	@When("Admin clicks yes button for attendance module10")
	public void admin_clicks_yes_button_for_attendance_module10() {
		attendanceModule.clickYesOnConfirm();
	}

	@Then("Success message and validate particular attendance details are deleted from the data table for attendance module10")
	public void success_message_and_validate_particular_attendance_details_are_deleted_from_the_data_table_for_attendance_module10() {
		attendanceModule.VerifyYesOnConfirm();
	}

	@When("Admin clicks on No button for Attendance Module09")
	public void admin_clicks_on_no_button_for_attendance_module09() {
		attendanceModule.clickNoOnConfirm();
	}

	@Then("Redirected to attendance page and selected attendance details are not deleted from the data table for attendance module10")
	public void redirected_to_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table_for_attendance_module10() {
		attendanceModule.VerifyNoOnConfirm();
		attendanceModule.AttendanceModuleIsDisplayed();
	}

}
