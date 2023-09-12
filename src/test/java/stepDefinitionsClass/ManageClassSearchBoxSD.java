package stepDefinitionsClass;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageClassSearchBox;

public class ManageClassSearchBoxSD extends DriverFactory{

	ManageClassSearchBox manageclasssearchbox = new ManageClassSearchBox();
	
	@Given("Admin is on Manage Class Page")
	public void admin_is_on_manage_class_page() {
		String manageclass = config.getString("ManageClassesPageUrl");
		System.out.println("===****=====sudha=====*****=====" + manageclass);
		
	}

	@When("Admin enters batch id into search box in manage class page")
	public void admin_enters_batch_id_into_search_box_in_manage_class_page() {
		manageclasssearchbox.clickClassButton(0);
	}

	@Then("Displays entries with that batch Id in manage class page")
	public void displays_entries_with_that_batch_id_in_manage_class_page() {
	    
	}

	@When("Admin enters batch id which is not existing the table into search box in manage class page")
	public void admin_enters_batch_id_which_is_not_existing_the_table_into_search_box_in_manage_class_page() {
	    
	}

	@Then("Displays empty details in the data table in manage class page")
	public void displays_empty_details_in_the_data_table_in_manage_class_page() {
	    
	}

	@When("Admin enters class no into search box in manage class page")
	public void admin_enters_class_no_into_search_box_in_manage_class_page() {
	   
	}

	@Then("Displays entries with that class no in manage class page")
	public void displays_entries_with_that_class_no_in_manage_class_page() {
	    
	}

	@When("Admin enters class no which doesnot exist in the table into search box")
	public void admin_enters_class_no_which_doesnot_exist_in_the_table_into_search_box() {
	    
	}

	@Then("Displays empty details in the data table on page")
	public void displays_empty_details_in_the_data_table_on_page() {
	   
	}

	@When("Admin enters class topic into search box in manage class page")
	public void admin_enters_class_topic_into_search_box_in_manage_class_page() {
	    
	}

	@Then("Displays entries with that class topic in manage class page")
	public void displays_entries_with_that_class_topic_in_manage_class_page() {
	   
	}

	@When("Admin enters class topic which does not exist in the table into search box")
	public void admin_enters_class_topic_which_does_not_exist_in_the_table_into_search_box() {
	  
	}

	@When("Admin enters staff id into search box of manage class page")
	public void admin_enters_staff_id_into_search_box_of_manage_class_page() {
	   
	}

	@Then("Displays entries with that staff id in manage class page")
	public void displays_entries_with_that_staff_id_in_manage_class_page() {
	    
	}

	@When("Admin enters staff id which doesnt exist into search box of manage class page")
	public void admin_enters_staff_id_which_doesnt_exist_into_search_box_of_manage_class_page() {
	   
	}

	@When("Admin enters class date into search box of manage class page")
	public void admin_enters_class_date_into_search_box_of_manage_class_page() {
	    
	}

	@Then("Displays entries with that class date in manage class page")
	public void displays_entries_with_that_class_date_in_manage_class_page() {
	    
	}

	@When("Admin enters invalid class date into search box of manage class page")
	public void admin_enters_invalid_class_date_into_search_box_of_manage_class_page() {
	    
	}
	
	
	
	
}
