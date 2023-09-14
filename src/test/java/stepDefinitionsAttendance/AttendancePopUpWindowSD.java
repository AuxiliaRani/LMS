package stepDefinitionsAttendance;




import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Point;
import org.testng.Assert;

//import Cucumber.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.AttendanceModule;
import utilities.LoggerLoad;

public class AttendancePopUpWindowSD {
	
	Hooks hooks;
	AttendanceModule attendanceModule;
	
	{
		this.hooks=hooks;
		this.attendanceModule = hooks.getAttendanceModuleObject();
		
		LoggerLoad.info("******* Attendance Pop up window Validations ********");
	}
	
	@Given("Admin is in manage attendance page02")
	public void admin_is_in_manage_attendance_page02() {
		attendanceModule.clickAttandanceButton();
		attendanceModule.AttendanceModuleIsDisplayed();
	}

	@When("Admin clicks plus a new attendance button02")
	public void admin_clicks_a_new_attendance_button02() throws InterruptedException {
		
		attendanceModule.addNewAttendancebuttonClick();
		
	}

	@Then("Admin should see correct spellings in the label for Attendance module")
	public void admin_should_see_correct_spellings_in_the_label_for_attendance_module() {
		
		attendanceModule.attendanceDetailForm();
		attendanceModule.checkSpellingAddAttendanceLable();
	}

	@Then("There should be {int} dropdowns present for Attendance module")
	public void there_should_be_dropdowns_present_for_attendance_module(Integer Expected_dropdowns) {
	    
		int total_dropdowns =0;
		
		if (attendanceModule.programDrpIsDisplayed() && attendanceModule.classDrpIsDisplayed() &&
				attendanceModule.studentDrpIsDisplayed() &&
				attendanceModule.attendanceDrpIsDisplayed())
			total_dropdowns =4;
		else
			LoggerLoad.info("Some of the dropdowns are misssing");
		
		
		Assert.assertEquals(total_dropdowns, Expected_dropdowns);
		
		
	}

	@Then("Admin should see close button on the attendance details popup window for Attendance module")
	public void admin_should_see_close_button_on_the_attendance_details_popup_window_for_attendance_module() {
	    
		attendanceModule.closeButtonDisplayed();
		
		
	}

	@Then("Close button should on the top right corner for Attendance module")
	public void close_button_should_on_the_top_right_corner_for_attendance_module() {
		
		attendanceModule.VerifylocationCloseButton();
		
	
	    
	}

	@Then("First dropdown box {string} text  should be present for Attendance module")
	public void first_dropdown_box_text_should_be_present_for_attendance_module(String string) {
	    
		attendanceModule.verifyTextselectProgtxtLable();
	}

	@Then("Second dropdown box {string} text  should be present for Attendance module")
	public void second_dropdown_box_text_should_be_present_for_attendance_module(String string) {
		attendanceModule.verifyTextselectClasstxtLable();
	}

	@Then("Third dropdown box {string} text  should be present for Attendance module")
	public void third_dropdown_box_text_should_be_present_for_attendance_module(String string) {
		attendanceModule.verifyTextselectStudenttxtLable();
	}

	@Then("Fourth dropdown box {string} text  should be present for Attendance module")
	public void fourth_dropdown_box_text_should_be_present_for_attendance_module(String string) {
		attendanceModule.verifyTextselectAttendancetxtLable();
	}

	@Then("Admin  should text in gray color for Attendance module")
	public void admin_should_text_in_gray_color_for_attendance_module() {
		attendanceModule.isAdminTxtGray();
		
	}

	@Then("Admin should see  save button in the class detail popup window for Attendance module")
	public void admin_should_see_save_button_in_the_class_detail_popup_window_for_attendance_module() {
		attendanceModule.saveButtonDisplayed();
	}

	@Then("Admin should see  cancel button in the class detail popup window for Attendance module")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window_for_attendance_module() {
		attendanceModule.cancelButtonDisplayed();
	}

	@Then("Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date for Attendance module")
	public void order_of_the_label_should_be_program_name_class_name_student_name_attendance_attendance_date_for_attendance_module() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
