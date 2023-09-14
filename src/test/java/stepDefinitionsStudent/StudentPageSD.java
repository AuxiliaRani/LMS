package stepDefinitionsStudent;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Studentpage;
import utilities.ConfigReader;
import utilities.LoggerLoad;
public class StudentPageSD extends DriverFactory{
	
	private WebDriver driver;
	private int responseCode;
	@Given("Admin is on dashboard page after Login for student")
	public void admin_is_on_dashboard_page_after_login_for_student() {
		String title = Studentpage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			AssertJUnit.assertEquals(title, "dashboard" , "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}
	    
	

	

	@When("Admin clicks {string} on the navigation bar for Student module")
	public void admin_clicks_on_the_navigation_bar_for_student_module(String string) {
		Studentpage.Clickstudent();
	    
	}

	

	@Then("Admin should see the Student details Page Title")
	public void admin_should_see_the_student_details_page_title() {
		 String pageTitleText = Studentpage.getpagetitle();
		
		 LoggerLoad.info("Title of the current page: " + pageTitleText);
		try {
	        
	        Assert.assertTrue("Student Details Page Title is not displayed.", pageTitleText.contains("Student Details"));

		} catch (AssertionError e) {
			
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
        
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds for Student module")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds_for_student_module(Integer int1) {
		 int actualSeconds = Studentpage.getNavigationTimeoutInSeconds();
try {
	       Assert. assertEquals("Maximum navigation time setting does not match", "30", actualSeconds);
	    } catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());}
		}

		
	    
	

	@Then("Admin should receive {string} error for the link on Student Page")
	public void admin_should_receive_error_for_the_link_on_student_page(String  expectedResponseCode) throws IOException {
		
		URL lmsLinkUrl = new URL(driver.getCurrentUrl());

		HttpURLConnection http = (HttpURLConnection) lmsLinkUrl.openConnection();
		responseCode = http.getResponseCode();
		int expectedRespCode = Integer.parseInt(expectedResponseCode);
		LoggerLoad.info("Expected Response Code : " + expectedResponseCode);
		try {
			AssertJUnit.assertEquals(expectedRespCode, responseCode);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}

	}

	@Then("The link is broken on Student Page")
	public void the_link_is_broken_on_student_page() {
		try {
			assertTrue("The Link is Broken", responseCode >= 400);
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}

	@Then("Admin should see LMS -Learning management system  as title for Student module")
	public void admin_should_see_lms_learning_management_system_as_title_for_student_module() {
		boolean title = Studentpage.isTitlelmsDisplayed();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, "LMS-Learning management system" , "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}
	

	@Then("Student Detail title should be in centre of the page")
	public void student_detail_title_should_be_in_centre_of_the_page() {
	    Studentpage.isTitleInCenter();
	}

	@Then("2dropdowns should be present in the page")
	public void dropdowns_should_be_present_in_the_page() {
		boolean areDropdownsPresent = Studentpage.areTwoDropdownsPresent();
LoggerLoad.info("two dropdowns are there");
		 try {
	            
	           assert(areDropdownsPresent); 
	        } catch (AssertionError e) {;}
		 
	}
    
	    
	

	@Then("Admin should see search box inside the drop down")
	public void admin_should_see_search_box_inside_the_drop_down() {
		boolean isSearchBoxVisible = Studentpage.isSearchBoxInsideDropdown();
		 try {
        assertTrue("Search box inside the dropdown is not visible", isSearchBoxVisible);
     } catch (AssertionError e) {;}
	
	}
	@Then("Admin should see search box inside  batch id drop down")
	public void admin_should_see_search_box_inside_batch_id_drop_down() {
		boolean isSearchBoxVisible = Studentpage.isSearchBoxInsidebatchDropdown();
		 try {
       Assert.assertTrue("Search box inside the dropdown is not visible", isSearchBoxVisible);
    } catch (AssertionError e) {;}
		
	
	}

	@Then("Admin should see correct spelling select student name")
	public void admin_should_see_correct_spelling_select_student_name() {
		String expectedLabelText = "Select Student Name"; 

        String actualLabelText = Studentpage.getSelectStudentNameText();
        try {
        assertEquals("Incorrect label text", expectedLabelText, actualLabelText);}
        catch (AssertionError e) {;}
	}

	@Then("Admin should see correct spelling select  batch id text")
	public void admin_should_see_correct_spelling_select_batch_id_text() {
		String expectedLabelText = "Select Batch ID"; 

        String actualLabelText = Studentpage.getSelectbatchidText();

        AssertJUnit.assertEquals("Incorrect label text", expectedLabelText, actualLabelText);
    }



	@Then("Admin should see only numbers inside batch id drop down")
	public void admin_should_see_only_numbers_inside_batch_id_drop_down() {
		 boolean areOnlyNumbers = Studentpage.areOnlyNumbersInBatchIdDropdown();

	     assertTrue("The batch ID dropdown contains non-numeric values", areOnlyNumbers);
	    }
	

	@Then("Admin should see select student name in gray color")
	public void admin_should_see_select_student_name_in_gray_color() {
		Studentpage.verifyStudentNameInGrayColor();
    }
	

	@Then("Admin should see select batch ID in gray color")
	public void admin_should_see_select_batch_id_in_gray_color() {
	    Studentpage.verifyBatchidInGrayColor();
	}

	@Then("Admin should see select student name in first")
	public void admin_should_see_select_student_name_in_first() {
	    Studentpage.verifySelectStudentNameIsFirst();
	}

	@Then("Admin should see select batch id in second")
	public void admin_should_see_select_batch_id_in_second() {
	    Studentpage.verifySelectbatchidIsSecond();
	}

	@Then("Admin should able to scroll down to select the name")
	public void admin_should_able_to_scroll_down_to_select_the_name() {
	    Studentpage.scrollToNameElement();
	}

	@Then("Admin should able to scroll down to select the batch id")
	public void admin_should_able_to_scroll_down_to_select_the_batch_id() {
	   Studentpage.scrollToBatchElement();
	}

	
	}
