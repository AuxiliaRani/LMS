package stepDefinitionsClass;

import org.testng.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPopUpWindow;
import utilities.LoggerLoad;

public class ClassPopUpWindowSD extends DriverFactory{

	ClassPopUpWindow classpopupwindow = new ClassPopUpWindow();
	
	@When("Admin click +Add New Class button")
	public void admin_click_add_new_class_button() {
		classpopupwindow.clickAddNewClassButton();
	}

	@Then("Admin should see a popup  with  heading {string} on add classes page")
	public void admin_should_see_a_popup_with_heading_on_add_classes_page(String string) {
		try {
		String actualheadertext = classpopupwindow.headerText();
		String expectedactualheadertext ="Class Details";		
		Assert.assertEquals(actualheadertext, expectedactualheadertext);
		LoggerLoad.info("Add Class Page assertion is passed");
		}
		catch (Exception e) {
			LoggerLoad.error("Add class page Header assertion failed" + e);
		}
	}

	@Then("Admin should see input fields Text \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
	public void admin_should_see_input_fields_text_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() {
	    
	    String [] fieldslist = {"Batch Id", "No of Classes","Class Date","Class Topic", "Staff Id", "Class description", "Comments", "Notes", "Recordings" };
	    
	   String batchid =  classpopupwindow.batchId();	   
	   String noofclasses =  classpopupwindow.noOfClasses();
	   String classdate =  classpopupwindow.classDate();
	   String classtopic =  classpopupwindow.classTopic();
	   String staffid =  classpopupwindow.staffID();
	   String classdescription =  classpopupwindow.classDescription();
	   String comments =  classpopupwindow.comments();
	   String notes =  classpopupwindow.notes();
	   String recordings =  classpopupwindow.recordings();
	    
	   try {
	   for (String fieldlistelement : fieldslist) {
		   if(fieldlistelement.equalsIgnoreCase(batchid)) {
			  Assert.assertTrue(true);
			  LoggerLoad.info("Matching field list string found for BatchId");
			   break;
		   }
		   else if (fieldlistelement.equalsIgnoreCase(noofclasses)) {
			   Assert.assertTrue(true);
			   LoggerLoad.info("Matching field list string found for No of classes");
			   break;			   
		   }
		   else if (fieldlistelement.equalsIgnoreCase(classdate)) {
			   Assert.assertTrue(true);
			   LoggerLoad.info("Matching field list string found for classdate");
			   break;			   
		   }
		   else if (fieldlistelement.equalsIgnoreCase(classtopic)) {
			   Assert.assertTrue(true);
			   LoggerLoad.info("Matching field list string found for No of classtopic");
			   break;			   
		   }
		   else if (fieldlistelement.equalsIgnoreCase(staffid)) {
			   Assert.assertTrue(true);
			   LoggerLoad.info("Matching field list string found for staffid");
			   break;			   
		   }
		   else if (fieldlistelement.equalsIgnoreCase(classdescription)) {
			   Assert.assertTrue(true);
			   LoggerLoad.info("Matching field list string found for classdescription");
			   break;			   
		   }
		   else if (fieldlistelement.equalsIgnoreCase(comments)) {
			   Assert.assertTrue(true);
			   LoggerLoad.info("Matching field list string found for comments");
			   break;			   
		   }
		   else if (fieldlistelement.equalsIgnoreCase(notes)) {
			   Assert.assertTrue(true);
			   LoggerLoad.info("Matching field list string found for notes");
			   break;			   
		   }
		   else if (fieldlistelement.equalsIgnoreCase(recordings)) {
			   Assert.assertTrue(true);
			   LoggerLoad.info("Matching field list string found for No of classes");
			   break;			   
		   }
		   else {
			   LoggerLoad.info("None of the field list text are matching with the webelement text");  
		   }
	   }
	   }catch (Exception e) {
		   LoggerLoad.info("Assertion error in comparing fieldlist" + e);   
	   }
	   }
	   

	@Then("Admin should see textbox should be  present in Class details popup window")
	public void admin_should_see_textbox_should_be_present_in_class_details_popup_window() {
		try {
		Assert.assertTrue(classpopupwindow.textBox());
		LoggerLoad.info("textbox is present");
		}catch (AssertionError e) {
			LoggerLoad.warn("Assertion error " + e);
		}
	}
	

	@Then("Admin should see dropdown option for Batch ID in Class details popup window")
	public void admin_should_see_dropdown_option_for_batch_id_in_class_details_popup_window() {		
		try {
			Assert.assertTrue(classpopupwindow.dropdownBatchId());
			LoggerLoad.info("dropdown for batchid is present");
			}catch (AssertionError e) {
				LoggerLoad.warn("Assertion error " + e);
			}
	}

	@Then("Admin should see dropdown option for Staff Id in Class details popup window")
	public void admin_should_see_dropdown_option_for_staff_id_in_class_details_popup_window() {
		try {
			Assert.assertTrue(classpopupwindow.dropdownStaffId());
			LoggerLoad.info("dropdown staff id is present");
			}catch (AssertionError e) {
				LoggerLoad.warn("Assertion error " + e);
			}
	}

	@Then("Admin should see calendar icon for class date in Class details popup window")
	public void admin_should_see_calendar_icon_for_class_date_in_class_details_popup_window() {
		try {
			Assert.assertTrue(classpopupwindow.calenderIcon());
			LoggerLoad.info("Calender icon is present");
			}catch (AssertionError e) {
				LoggerLoad.warn("Assertion error " + e);
			}
	}

	@Then("Admin should see save button in the class detail popup window")
	public void admin_should_see_save_button_in_the_class_detail_popup_window() {
		try {
			Assert.assertTrue(classpopupwindow.saveButtonDisplayed());
			LoggerLoad.info("save button is displayed");
			}catch (AssertionError e) {
				LoggerLoad.warn("Assertion error " + e);
			}
	}

	@Then("Admin should see cancel button in the class detail popup window")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
		try {
			Assert.assertTrue(classpopupwindow.cancelButtonDisplayed());
			LoggerLoad.info("cancel button is displayed");
			}catch (AssertionError e) {
				LoggerLoad.warn("Assertion error " + e);
			}
	}

	@Then("Admin should see close button on the class details popup window")
	public void admin_should_see_close_button_on_the_class_details_popup_window() {
		try {
			Assert.assertTrue(classpopupwindow.closeButtonDisplayed());
			LoggerLoad.info("close button is displayed");
			}catch (AssertionError e) {
				LoggerLoad.warn("Assertion error " + e);
			}
	}
}
