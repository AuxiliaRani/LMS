package stepDefinitionsAttendance;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.AttendanceModule;
import utilities.LoggerLoad;

public class DeleteMultipleAttendanceElementsSD {
	
	Hooks hooks;
	AttendanceModule attendanceModule;
	
	public DeleteMultipleAttendanceElementsSD(Hooks hooks) {
		

	{
		this.hooks=hooks;
		this.attendanceModule = hooks.getAttendanceModuleObject();
		
		LoggerLoad.info("******* Multiple Delete Attendance Validation ********");
	}
	
	}
	
	@Given("Admin is in manage attendance page08")
	public void admin_is_in_manage_attendance_page08() {
		
		attendanceModule.clickAttandanceButton();
		attendanceModule.AttendanceModuleIsDisplayed();
	    
	}

	@When("Admin clicks single row level check box in the data table for attendance module08")
	public void Admin_clicks_single_row_level_check_box_in_the_data_table_for_attendance_module08() {
		attendanceModule.rowLevelDeleteAttendance();
		
	}

	@Then("Admin should see delete icon below the header is enabled for attendance module08")
	public void admin_should_see_delete_icon_below_the_header_is_enabled_for_attendance_module08() {
		attendanceModule.rowLevelDeleteAttendanceEnabled();
	}

	@When("Admin clicks single  row level check box in the data table for Attendance Module08")
	public void admin_clicks_single_row_level_check_box_in_the_data_table_for_attendance_module08() {
		attendanceModule.rowLevelDeleteAttendance();
	}

	@Then("Admin should see tick mark in check box for attendance module08")
	public void admin_should_see_tick_mark_in_check_box_for_attendance_module08() {
		attendanceModule.singleCheckboxisSelected();
	}

	@When("Admin clicks multiple row level check box in the data table for attendance module08")
	public void admin_clicks_multiple_row_level_check_box_in_the_data_table_for_attendance_module08() {
	   
		attendanceModule.selectMutipleCheckboxes();
		
	}

	@Then("Admin should see tick mark in check box of the selected rows for attendance module08")
	public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows_for_attendance_module08() {
		
		attendanceModule.checkboxesIsSelected();
	}

}
