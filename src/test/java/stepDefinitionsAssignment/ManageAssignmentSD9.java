package stepDefinitionsAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageAssignment;

public class ManageAssignmentSD9 {
	
	@Given("Admin is in manage assignment page")
	public void Admin_is_in_manage_assignment_page() {
		System.out.format("Admin is in manage assignment page");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get(" ManageAssignmentPageUrl");
	}
	@When("Admin clicks single  row level check box in the data table")
	public void Admin_clicks_single_row_level_check_box_in_the_data_table() {
		System.out.format("Admin clicks single  row level check box in the data table");
		 Object clickcheckbox = ManageAssignment.getValidClassTopic();
		 ManageAssignment.checkbox(clickcheckbox);
	}
	@Then("Admin should see delete icon below the header is enabled")
	public void Admin_should_see_delete_icon_below_the_header_is_enabled() {
		System.out.format("Admin should see delete icon below the header is enabled");
		  throw new io.cucumber.java.PendingException();
	}


}
