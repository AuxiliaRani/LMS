package stepDefinitionsAttendance;



import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myHooks.Hooks;
import pageObjects.AttendanceModule;
import utilities.ConfigReader;
import utilities.LoggerLoad;
//import utilities.TestContextSetup;
import org.openqa.selenium.Point;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ManageAttendanceSD {
	
		
		Hooks hooks;
		AttendanceModule attendanceModule;
		
		public ManageAttendanceSD(Hooks hooks) {
		{
			this.hooks=hooks;
			this.attendanceModule = hooks.getAttendanceModuleObject();
		}
		
	
	System.out.println("===****=====Attendance Module=====*****=====");
	
	}
	
	@Given("Admin is on dashboard page after Login for Attendance module")
	public void admin_is_on_dashboard_page_after_login_for_attendance_module() {
	   
		attendanceModule.navigateToAttendance();
		
	    LoggerLoad.info("**********Navigate to Attendance Module**********");
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
	
		attendanceModule.verifyPageTitle();
	}

	@Then("Admin should see the Manage attendance in header")
	public void admin_should_see_the_manage_attendance_in_header() {
		attendanceModule.checkAddAttendanceHeader();
		
		String actualHeader=attendanceModule.checkAddAttendanceHeader();
		Assert.assertEquals(actualHeader, "Manage Attendance Page");
		
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds for Attendance module")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds_for_attendance_module(Integer int1) {
	    
		long startTime = System.currentTimeMillis();
		attendanceModule.clickAttandanceButton();
		 boolean isDisplayed =  attendanceModule.AttendanceModuleIsDisplayed();
		 
		 if(!isDisplayed)
		 {
			 LoggerLoad.info("Attendance Module is not displayed");
		 }
		
		 long endTime = System.currentTimeMillis();
		 long loadTime = endTime-startTime;	
		 
		 double loadtimein_seconds = ((loadTime/1000)%60);
		 
		 System.out.println("Page load time in milliseconds: " + loadTime);
		 LoggerLoad.info("Page load time is :"+ loadTime);
		 
		 if(loadtimein_seconds > 30)
		 {
			 LoggerLoad.info("Maximum navigation time has crossed"); 
		 }
	}

	@Then("The link is broken HTTP response >= {int} for Attendance module")
	public void the_link_is_broken_http_response_for_attendance_module(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see LMS -Learning management system  as title for Attendance module")
	public void admin_should_see_lms_learning_management_system_as_title_for_attendance_module() {
		
		String LMSTitle = attendanceModule.verifyPageTitle();
		Assert.assertEquals(LMSTitle, "Learning Management System");
		
	}

	@Then("Manage attendance header should be in left side of the page")
	public void manage_attendance_header_should_be_in_left_side_of_the_page() {
		
		Point Header_Location = attendanceModule.attendanceHeaderLocation();
		
		LoggerLoad.info("Header's Position from left side is: "+Header_Location.getX()+" pixels.");
		System.out.println("Header's Position from left side is: "+Header_Location.getX()+" pixels.");
	
	}

	@Then("Admin should see correct spelling for the all the fields on manage attendance page")
	public void admin_should_see_correct_spelling_for_the_all_the_fields_on_manage_attendance_page() {
	   
		
	}

	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String string) {
		
		if(attendanceModule.deleteMultipleButtonEnabled())
		{
			LoggerLoad.info("Delete Multiple record icon should be disabled");
		}
		else
		{
			LoggerLoad.info("Test passed");
		}
		
		assertFalse(attendanceModule.deleteMultipleButtonEnabled());  	
			
	}

	@Then("Admin should see search bar on the attendance page")
	public void admin_should_see_search_bar_on_the_attendance_page() {
		
		assertTrue(attendanceModule.searchBarVisible());   
		
	}

	@Then("Admin should see +Add New Attendance button on the attendance page")
	public void admin_should_see_add_new_attendance_button_on_the_attendance_page() {
	   
		assertTrue(attendanceModule.addNewAttendancebuttonVisible());
	}

	@Then("Admin should see data table on the Manage Attendance Page With following column headers - Check box symbol,Class ID, Student Id,Preasent, Edit,Delete")
	public void admin_should_see_data_table_on_the_manage_attendance_page_with_following_column_headers_check_box_symbol_class_id_student_id_preasent_edit_delete() {
	   
		assertTrue(attendanceModule.addNewAttendancebuttonVisible());
		
	}

	@Then("Edit Icon in each row of data table only when entries are available for Attendance Module")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available_for_attendance_module() throws InterruptedException {
	
		    int noOfRecords;
		
			noOfRecords = attendanceModule.verifyNumberOfRecords();
			
			if(noOfRecords>0)
			{
		    attendanceModule.verifyEditButton();
		    }
			
		
	}

	@Then("Delete Icon in each row of data table only  when entries are available for Attendance Module")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available_for_attendance_module() throws InterruptedException {
	 
		
		    int noOfRecords;
			
			noOfRecords = attendanceModule.verifyNumberOfRecords();
			
			if(noOfRecords>0)
			{
		    attendanceModule.verifyDeleteButton();
		    }
	}

	@Then("Admin cant see delete Icon in data table for Attendance Module")
	public void admin_cant_see_delete_icon_in_data_table_for_attendance_module() throws InterruptedException {
		   int noOfRecords;
			
					noOfRecords = attendanceModule.verifyNumberOfRecords();
					
					if(noOfRecords==0)
					{
				    attendanceModule.verifyDeleteButton();
				    }
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete for Attendance Module")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete_for_attendance_module() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see check box in the all rows  of data table for Attendance Module")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table_for_attendance_module() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Above the footer Admin should see the text as {string} below the table for Attendance Module")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table_for_attendance_module(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the pagination controls under the data table for Attendance Module")
	public void admin_should_see_the_pagination_controls_under_the_data_table_for_attendance_module() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the text with total number classes in the data table for Attendance Module")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table_for_attendance_module() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
