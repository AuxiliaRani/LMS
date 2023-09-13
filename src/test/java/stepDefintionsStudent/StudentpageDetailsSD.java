package stepDefintionsStudent;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import factory.DriverFactory;
import pageObjects.Studentpage;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentpageDetailsSD extends DriverFactory{
	
	
	  private WebDriver driver;
	@Given("Admin is on student details page of studentdetails")
	public void admin_is_on_student_details_page_of_studentdetails() {
		
		Studentpage.getStudentDetailspage();
		String title = Studentpage.verifyPageTitle();
		LoggerLoad.info("Title of the current page: " + title);
		try {
			assertEquals(title, "LMS", "Page Title do not match");
		} catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
	}
	

	@When("Admin select student name from the drop down")
	public void admin_select_student_name_from_the_drop_down() {
		 String selectedStudentName =ConfigReader.getStudentname(); 
	        Studentpage.selectStudentNameFromDropdown(selectedStudentName);

	}

	@Then("Admin shouldn't see select student name text")
	public void admin_shouldn_t_see_select_student_name_text() {
		boolean isTextVisible = Studentpage.isSelectStudentNameTextVisible();
		try {
        assertFalse("Expected 'select student name' text to be not visible", isTextVisible);

	}
		catch (AssertionError e) {
			LoggerLoad.error("Assertion failed: " + e.getMessage());
		}
		}
	@When("Admin select batch id from the drop down")
	public void admin_select_batch_id_from_the_drop_down() {
		int selectedBatchId =ConfigReader.getbatchid();
        Studentpage.selectBatchidFromDropdown(selectedBatchId);
	}

	@Then("Admin shouldn't see select batch id text")
	public void admin_shouldn_t_see_select_batch_id_text() {
		boolean isTextVisible = Studentpage.isSelectBatchIdTextVisible();
		try {
        assertFalse("Expected 'select batch id' text to be not visible", isTextVisible);

	}catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
	}

	@When("Admin clicks select student name and  enters x alphabet in the search box")
	public void admin_clicks_select_student_name_and_enters_x_alphabet_in_the_search_box() {
		Studentpage.clickSelectStudentNameDropdown();
       Studentpage.enterTextInSearchBox("x");

	}

	@Then("Admin should see student name start with x is listed below")
	public void admin_should_see_student_name_start_with_x_is_listed_below() {
		 
		Studentpage.clickSelectStudentNameDropdown();

        
        List<WebElement> studentNamesStartingWithX = Studentpage.getStudentNamesStartingWithX();
try {
       assertTrue("No student names starting with 'x' found", studentNamesStartingWithX.size() > 0);

	}
catch (AssertionError e) {
	LoggerLoad.error("Assertion failed: " + e.getMessage());
}
}

	@When("Admin  clicks select batch id and enter x number in the search box")
	public void admin_clicks_select_batch_id_and_enter_x_number_in_the_search_box() {
		Studentpage.clickSelectBatchIdDropdown();

      Studentpage.enterTextInSearchBox("X");
	}

	@Then("Admin should see batch id start with x is listed below")
	public void admin_should_see_batch_id_start_with_x_is_listed_below() {
		Studentpage.clickSelectBatchIdDropdown();

        
        List<WebElement> batchIdsStartingWithX = Studentpage.getBatchIdsStartingWithX();
try {
        
        assertTrue("No batch IDs starting with 'x' found", batchIdsStartingWithX.size() > 0);
	}
catch (AssertionError e) {
	LoggerLoad.error("Assertion failed: " + e.getMessage());
}
}
	@When("Admin selects only student name")
	public void admin_selects_only_student_name() {
		Studentpage.selectStudentNameOption();
	}

	@Then("Student details shouldn't be displayed")
	public void student_details_shouldn_t_be_displayed() {
		boolean areStudentDetailsDisplayed = Studentpage.isStudentDetailspageisDisplayed();
		try {
        assertFalse("Expected student details to be not displayed", areStudentDetailsDisplayed);

	}catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
	}

	@When("Admin selects only  batch id")
	public void admin_selects_only_batch_id() {
	    Studentpage.selectBatchidFromDropdown(ConfigReader.getbatchid());
	    Studentpage.clickSubmitbactid();
	}

	@When("Admin selects  student name and batch id")
	public void admin_selects_student_name_and_batch_id() {
	    Studentpage.clickSelectStudentNameDropdown();
	    Studentpage.clickSelectBatchIdDropdown();
	    Studentpage.selectStudentNameOption();
	    Studentpage.selectBatchidFromDropdown(0);
	}

	@Then("Particular student informations should be display")
	public void particular_student_informations_should_be_display() {
		String expectedStudentName = ConfigReader.getStudentname(); 
        int expectedBatchId =ConfigReader.getbatchid(); 
	
	try {

      Assert.assertEquals(expectedStudentName, Studentpage.getStudentName());
       Assert.assertEquals(expectedBatchId, Studentpage.getBatchId());
       // Assert.assertTrue(Studentpage.isStudentInfoTableDisplayed());
	} catch (AssertionError e) {
		LoggerLoad.error("Assertion failed: " + e.getMessage());
	}
	}

}
	


