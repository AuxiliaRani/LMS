package stepDefinitionsAttendance;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.AttendanceModule;
import utilities.LoggerLoad;

public class AddNewAttendanceSD {
	

	Hooks hooks;
	AttendanceModule attendanceModule;
	
	public AddNewAttendanceSD(Hooks hooks) {
	{
		this.hooks=hooks;
		this.attendanceModule = hooks.getAttendanceModuleObject();
	}
	
	}
	
	@Given("Admin is in attendance details popup window04")
	public void admin_is_in_attendance_details_popup_window(Integer int1) {
	    
        attendanceModule.attendanceDetailForm();
		
	    LoggerLoad.info("********** Attendance Details Page **********");
	}

	@When("Admin fills all the values and click save for Attendance module")
	public void admin_fills_all_the_values_and_click_save_for_attendance_module() {
		
		
		attendanceModule.selectProgramName();
		attendanceModule.selectClassName();
		attendanceModule.selectStudentName();
		attendanceModule.selectAttendance();
		attendanceModule.selectDate();
		
		try {
			attendanceModule.saveForm();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	@Then("Admin should see success message in popup window and sees new attendance details in manage attendance details DB for Attendance module")
	public void admin_should_see_success_message_in_popup_window_and_sees_new_attendance_details_in_manage_attendance_details_db_for_attendance_module() {
	   
		try {
			attendanceModule.popupWindowSave();
			attendanceModule.verifySuccessMessage();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("Admin fills values missing program name and click save for Attendance module")
	public void admin_fills_values_missing_program_name_and_click_save_for_attendance_module() {
	   
		//No program name
		attendanceModule.selectClassName();
		attendanceModule.selectStudentName();
		attendanceModule.selectAttendance();
		attendanceModule.selectDate();
		
		try {
			attendanceModule.saveForm();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	@Then("Program name is missing for Attendance module")
	public void program_name_is_missing_for_attendance_module() {
		
		attendanceModule.missingMandatoryProg();
	   
		
	}

	@When("Admin fills values missing class name and click save for Attendance module")
	public void admin_fills_values_missing_class_name_and_click_save_for_attendance_module() {
		
				attendanceModule.selectProgramName();
				attendanceModule.selectStudentName();
				attendanceModule.selectAttendance();
				attendanceModule.selectDate();
				
				try {
					attendanceModule.saveForm();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	}

	@Then("class name is missing for Attendance module")
	public void class_name_is_missing_for_attendance_module() {
		
		attendanceModule.missingMandatoryClass();
	}

	@When("Admin fills values missing student name and click save for Attendance module")
	public void admin_fills_values_missing_student_name_and_click_save_for_attendance_module() {
		
		attendanceModule.selectProgramName();
		attendanceModule.selectClassName();

		attendanceModule.selectAttendance();
		attendanceModule.selectDate();
		
		try {
			attendanceModule.saveForm();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("student name is missing for Attendance module")
	public void student_name_is_missing_for_attendance_module() {
		attendanceModule.missingMandatoryStudent();
	}

	@When("Admin fills values missing attendance and click save for Attendance module")
	public void admin_fills_values_missing_attendance_and_click_save_for_attendance_module() {
		
		attendanceModule.selectProgramName();
		attendanceModule.selectClassName();
		attendanceModule.selectStudentName();
		
		attendanceModule.selectDate();
		
		try {
			attendanceModule.saveForm();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("Attendance is missing for Attendance module")
	public void attendance_is_missing_for_attendance_module() {
		attendanceModule.missingMandatoryAttendance();
	}

	@When("Admin fills values missing attendance date  and click save for Attendance module")
	public void admin_fills_values_missing_attendance_date_and_click_save_for_attendance_module() {
	    
		attendanceModule.selectProgramName();
		attendanceModule.selectClassName();
		attendanceModule.selectStudentName();
		attendanceModule.selectAttendance();
		
		
		try {
			attendanceModule.saveForm();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("Attendance date is missing for Attendance module")
	public void attendance_date_is_missing_for_attendance_module() {
		
		attendanceModule.missingMandatoryDate();
	}

	@When("Admin fills values with future date  and click save for Attendance module")
	public void admin_fills_values_with_future_date_and_click_save_for_attendance_module() {
	    
		attendanceModule.selectProgramName();
		attendanceModule.selectClassName();
		attendanceModule.selectStudentName();
		attendanceModule.selectAttendance();
		attendanceModule.selectFutureDate();
		
		try {
			attendanceModule.saveForm();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@Then("Invalidate attendance date for Attendance module")
	public void invalidate_attendance_date_for_attendance_module() {
	   
		attendanceModule.futureDateError();
	}




}
