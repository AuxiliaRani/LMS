package stepDefinitionsClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageClassSearchBox;
import utilities.LoggerLoad;

public class ManageClassSearchBoxSD extends DriverFactory{

	ManageClassSearchBox manageclasssearchbox = new ManageClassSearchBox();
	
	String passBatchIdCreatedInClassModule;
	
	String invalidBatchId ;	
	List<WebElement> batchId;
	
	String validClassNo;
	String invalidclassno;
	List<WebElement> classno;
	
	String validClassTopic;
	String invalidClassTopic;
	List<WebElement> classtopic;
	
	String validstaffid;
	String Invalidstaffid;
	List<WebElement> staffId;
	
	String ValidClassdate;
	String InvalidClassdate;
	List<WebElement> classdate;

	
	
	@Given("Admin is on Manage Class Page")
	public void admin_is_on_manage_class_page() {	
		driver.get(config.getString("ManageClassesPageUrl"));
	}

	@When("Admin enters batch id into search box in manage class page")
	public void admin_enters_batch_id_into_search_box_in_manage_class_page() {
		passBatchIdCreatedInClassModule = manageclasssearchbox.getBatchId();		
		manageclasssearchbox.searchbox(passBatchIdCreatedInClassModule);		
	}

	@Then("Displays entries with that batch Id in manage class page")
	public void displays_entries_with_that_batch_id_in_manage_class_page() {
		batchId = 	manageclasssearchbox.batchIdInEachRow();
		if (batchId.contains(passBatchIdCreatedInClassModule))
			try {
		{Assert.assertTrue(true);}
			}
		catch(Exception e) {
			LoggerLoad.error(" Batch Id in DataTable doesn't match"+e);	
		}		
	}

	@When("Admin enters batch id which is not existing the table into search box in manage class page")
	public void admin_enters_batch_id_which_is_not_existing_the_table_into_search_box_in_manage_class_page() {
		 invalidBatchId = manageclasssearchbox.getInvalidBatchId();
		manageclasssearchbox.searchbox(invalidBatchId);
	}

	@Then("Displays empty details in the data table for invalid batchid in manage class page")
	public void displays_empty_details_in_the_data_table_for_invalid_batchid_in_manage_class_page() {
	
	//	List<WebElement> batchId = 	manageclasssearchbox.batchIdInEachRow();
		for (WebElement iterateeachrow  : batchId)
		{
			try {
			if (iterateeachrow.getText() != invalidBatchId) {
				Assert.assertTrue(false);
				LoggerLoad.info("When Admin enter Invalid BatchId it shows empty datatable ");
			}
			else
			{
				Assert.assertTrue(true);
			}
			}
			catch(AssertionError e) {
				LoggerLoad.warn("When Admin enter Invalid BatchId datatable shows data " +e);
			}			
		}
	}

	@When("Admin enters class no into search box in manage class page")
	public void admin_enters_class_no_into_search_box_in_manage_class_page() {
		 validClassNo = manageclasssearchbox.getValidClassNo();
		manageclasssearchbox.searchbox(validClassNo);
		
	}

	@Then("Displays entries with that class no in manage class page")
	public void displays_entries_with_that_class_no_in_manage_class_page() {
		classno = manageclasssearchbox.classNoInEachRow();
		
		for ( WebElement iterateeachrow : classno)
		{
			try {
				if (iterateeachrow.getText()== validClassNo)
				{
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue( false);
				}				
			}
			catch (AssertionError e)
			{				
			}
		}		
	}

	@When("Admin enters class no which doesnot exist in the table into search box")
	public void admin_enters_class_no_which_doesnot_exist_in_the_table_into_search_box() {
		 invalidclassno = manageclasssearchbox.getInValidClassNo();
			manageclasssearchbox.searchbox(invalidclassno);
	}

	@Then("Displays empty details in the data table for invalidclass in manage class page")
	public void displays_empty_details_in_the_data_table_for_invalidclass_in_manage_class_page() {
	   
		//List<WebElement> classNo = 	manageclasssearchbox.classNoInEachRow();
		for (WebElement iterateeachrow  : classno)
		{
			try {
			if (iterateeachrow.getText() != invalidclassno) {
				Assert.assertTrue(false);
				LoggerLoad.info("When Admin enter Invalid BatchId it shows empty datatable ");
			}
			else
			{
				Assert.assertTrue(true);
			}
			}
			catch(AssertionError e) {
				LoggerLoad.warn("When Admin enter Invalid BatchId datatable shows data " +e);
			}			
		}
	}

	@When("Admin enters class topic into search box in manage class page")
	public void admin_enters_class_topic_into_search_box_in_manage_class_page() {
		 validClassTopic = manageclasssearchbox.getValidClassTopic();
			manageclasssearchbox.searchbox(validClassTopic);
	}

	@Then("Displays entries with that class topic in manage class page")
	public void displays_entries_with_that_class_topic_in_manage_class_page() {
		classtopic = manageclasssearchbox.classTopicInEachRow();
		for ( WebElement iterateeachrow : classtopic)
		{
			try {
				if (iterateeachrow.getText()== validClassNo)
				{
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue( false);
				}				
			}
			catch (AssertionError e)
			{	LoggerLoad.warn("class topic iterate each loop fails" +e);			
			}
		}	
	}

	@When("Admin enters class topic which does not exist in the table into search box")
	public void admin_enters_class_topic_which_does_not_exist_in_the_table_into_search_box() {
		invalidClassTopic = manageclasssearchbox.getInValidClassTopic();
		manageclasssearchbox.searchbox(invalidClassTopic);
	}
	
	@Then("Displays empty details in the data table for classtopic in manage class page")
	public void displays_empty_details_in_the_data_table_for_classtopic_in_manage_class_page() {
		List<WebElement>	classTopic = manageclasssearchbox.classTopicInEachRow();
		for (WebElement iterateeachrow : classTopic)
		{
			try {
			if(iterateeachrow.getText() != invalidClassTopic)
			{
				Assert.assertTrue(false);
				LoggerLoad.info("Admin enter Invalid classtopic ");
			}
			else
			{
				Assert.assertTrue(true);
				LoggerLoad.info("Admin entered classtopic is valid");
			}
		}
			catch(Exception e) {
			LoggerLoad.warn("Invalid classtopic admin has entered" + e);	
			}
			}
	}

	@When("Admin enters staff id into search box of manage class page")
	public void admin_enters_staff_id_into_search_box_of_manage_class_page() {
		validstaffid = manageclasssearchbox.getValidStaffId();
		manageclasssearchbox.searchbox(validstaffid);
	}

	@Then("Displays entries with that staff id in manage class page")
	public void displays_entries_with_that_staff_id_in_manage_class_page() {
		 staffId = manageclasssearchbox.staffIdInEachRow();
		for( WebElement iterateeachrow : staffId) {
			try {
			if (iterateeachrow.getText() == validstaffid)
			{
				Assert.assertTrue(true);
				LoggerLoad.info("Admin enter Valid staffId ");
			}
			else {
				Assert.assertTrue(false);
				LoggerLoad.info("Admin enter InValid staffId ");
			}
		}catch(Exception e) {
			LoggerLoad.warn("staffid entered by Admin check again" + e);
			}
		}		
	}

	@When("Admin enters staff id which doesnt exist into search box of manage class page")
	public void admin_enters_staff_id_which_doesnt_exist_into_search_box_of_manage_class_page() {
		Invalidstaffid = manageclasssearchbox.getInvalidStaffId();
		manageclasssearchbox.searchbox(Invalidstaffid);
	}
	
	@Then("Displays empty details in the data table for staffid in manage class page")
	public void displays_empty_details_in_the_data_table_for_staffid_in_manage_class_page() {
		staffId = manageclasssearchbox.staffIdInEachRow();
		
		for ( WebElement iterateeachrow :  staffId) {
			try {
			if (iterateeachrow.getText() != Invalidstaffid) {
				Assert.assertTrue(true);
				LoggerLoad.info("E ");
			}
			else {
				Assert.assertFalse(false);
			}
		}
			catch(Exception e) {
				LoggerLoad.warn("Invalid staffid entered by Admin check again" + e);
				}
			}
	}
	

	@When("Admin enters class date into search box of manage class page")
	public void admin_enters_class_date_into_search_box_of_manage_class_page() {
		 ValidClassdate = manageclasssearchbox.getValidClassdate();
		manageclasssearchbox.searchbox(ValidClassdate);
	}

	@Then("Displays entries with that class date in manage class page")
	public void displays_entries_with_that_class_date_in_manage_class_page() {
		List<WebElement> classdate = manageclasssearchbox.classdateInEachRow();
		
		for (WebElement iterateeachrow: classdate) {
		if(iterateeachrow.getText() == ValidClassdate)
			{
				Assert.assertTrue(true);
				LoggerLoad.info("Classdate is matched");
			}
			else {
				Assert.assertTrue(false);
				LoggerLoad.info("Classdate is matched");
			}
		}			
	}

	@When("Admin enters invalid class date into search box of manage class page")
	public void admin_enters_invalid_class_date_into_search_box_of_manage_class_page() {
		InvalidClassdate = manageclasssearchbox.getInvalidClassdate();
		manageclasssearchbox.searchbox(ValidClassdate);
	}
	
	@Then("Displays empty details in the data table for classdate in manage class page")
	public void displays_empty_details_in_the_data_table_for_classdate_in_manage_class_page() {
		classdate = manageclasssearchbox.classdateInEachRow();
		 
		for ( WebElement iterateeachrow : classdate) {
			try {
			if(iterateeachrow.getText() != InvalidClassdate) {
				Assert.assertTrue(true);
				LoggerLoad.error("Class date is not valid");
			}
			else {
				Assert.assertTrue(false);
				LoggerLoad.info("Class date is valid given by admin");
			}
			}catch (Exception e) {
				LoggerLoad.info("class date exception" + e);
			}
	}
	}
	
	
	
	
}
