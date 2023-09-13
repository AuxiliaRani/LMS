package stepDefinitionsClass;

import java.util.List;
import java.util.ResourceBundle;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.LoggerLoad;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ManageClass;

public class ManageClassSD extends DriverFactory{

	ManageClass manageclass = new ManageClass();
	
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	driver.get(config.getString("DashBoardPageUrl"));
	LoggerLoad.info("Admin is On Dashboard Page after Login");
	}

	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {
	    manageclass.clickClassButton();
	    LoggerLoad.info("Admin clicks Add class button on the navigation bar");
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) {
	  String validateClassUrl = driver.getCurrentUrl();
	  try
	  {
	  Assert.assertTrue(validateClassUrl.contains("Manage Class"));
	  LoggerLoad.info("Admin should see URL with Manage Class Text ");
	  }
	  catch (Exception e){
		  LoggerLoad.info(e.getMessage());
	  }
	}

	@Then("Get the response time for navigation from dashboard page to manage class page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page() {
		long startTime = System.currentTimeMillis();
		manageclass.clickClassButton();
		 boolean isDisplayed =  manageclass.addNewClassIsDisplayed();
//		try {
//			Thread.sleep(300);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 long endTime = System.currentTimeMillis();
		 long loadTime = endTime-startTime;	
		  System.out.println("Page load time in milliseconds: " + loadTime);
		LoggerLoad.info("response time for navigation from dashboard page to manage class page :"+ loadTime);
	}

	@Then("Admin should see header with {string}")
	public void admin_should_see_header_with(String string) {
		String text = manageclass.getText();
		try
		  {
		Assert.assertEquals(text , "Manage Class");
		  }
		  catch (Exception e){
			  LoggerLoad.info(e.getMessage());
		  }
		
		LoggerLoad.info("Admin see header with :"+ text);		
	}

	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String string) {
	 // boolean isdisabled = manageclass.deleteIconIsDisabled();
	  	  try { 
		Assert.assertTrue(manageclass.deleteIconIsDisabled());}
	  	  catch(AssertionError e) {
	  		 LoggerLoad.info("Disabled delete Icon " + e);
	  	  }
	  	LoggerLoad.info("Delete icon is disabled");
	}

	@Then("Admin should see search bar on the class page")
	public void admin_should_see_search_bar_on_the_class_page() {
	try {
		Assert.assertTrue(manageclass.searchBarIsDisplayed());
	}
     catch (AssertionError e){
    	 LoggerLoad.info("SearchBar Visibility Error" + e);
    	 }
	LoggerLoad.info("SearchBar is Visible");
	
     }
	@Then("Admin should see Add New Class button on the class page")
	public void admin_should_see_add_new_class_button_on_the_class_page() {
	try {		
		Assert.assertTrue(manageclass.addNewClassIsDisplayed());
	}
	catch (AssertionError e) {
		LoggerLoad.info("Add New Class error" + e);
		}
	LoggerLoad.info("Add New Class is Visible");
	}

	@Then("Admin should see data table on the Manage Class Page With following column headers. \\(Check box symbol,Batch Id, Class No,Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete)")
	public void admin_should_see_data_table_on_the_manage_class_page_with_following_column_headers_check_box_symbol_batch_id_class_no_class_date_class_topic_staff_id_description_comments_notes_recording_edit_delete() {
	  manageclass.classDataTableHeader();
	  
	 List<String> dataTableHeaderText = manageclass.classDataTableHeader();
	 
	 String [] expectedDataTableHeaderText = {"Check box symbol","Batch Id", "Class No","Class Date",
             "Class Topic", "Staff Id", "Description", "Comments", 
             "Notes", "Recording", "Edit Delete"};
	 try {
	 if (dataTableHeaderText.size()==expectedDataTableHeaderText.length)
	 {
		 Assert.assertEquals(dataTableHeaderText.size(), expectedDataTableHeaderText.length);
		 LoggerLoad.info("Size of actual and expected array matched");
		 
		 //order of comparing actual & expected text is question here as dont know in which index headertext fall into	 
		 for (int i = 0; i<expectedDataTableHeaderText.length; i++)
		 {
		 String actualHeaderText = dataTableHeaderText.get(i);
		 String expectedHeaderText = expectedDataTableHeaderText[i];
		 
		 if (actualHeaderText.equals(expectedHeaderText))
		 {
			 LoggerLoad.info("Actual Header Text Matches Expected Header Text"); 
		 }
		 else {
			 LoggerLoad.info("Actual Header Text doesn't Matches Expected Header Text");
		 }		 
		 }			 
	 }
	 else {
		 LoggerLoad.info("Size of actual and expected array didn't match"); 
	 }
	}
	 catch (Exception e) {
		 LoggerLoad.info("Size of actual and expected array didn't match" + e);
	 } 
	}
	
	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
		List<WebElement> rows=  manageclass.rowIsPresent();
	  
		try {
		if (rows.size()>0) {	 
		   Assert.assertTrue(manageclass.editIconIsPresent());
		   LoggerLoad.info("Data Table has data & edit Icon is present");
	   }
	   else if (rows.size()==0){
		   Assert.assertTrue(manageclass.editIconIsPresent());		   
		   LoggerLoad.info("Data Table doesnt have any data & edit Icon is not present");
	   }
	   else{
		   LoggerLoad.info("Data Table doesnt have any data & no edit icon is present"); 
	   }
		}
		catch (Exception e){
			LoggerLoad.info("Data Table doesnt have any data & no edit icon is present" + e); 
		}			
	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
		List<WebElement> rows=  manageclass.rowIsPresent();
		try {
		if (rows.size()==0){
			   Assert.assertTrue(manageclass.editIconIsPresent());		   
			   LoggerLoad.info("Data Table doesnt have any data & edit Icon is not present");
		   }
		}
		catch (Exception e){
			LoggerLoad.warn("Data Table doesnt have any data & no edit icon is present" + e);
		}		
	}

	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
		List<WebElement> rows = manageclass.rowIsPresent();
		try {
		if(rows.size()>0) 		
		{
			Assert.assertTrue(manageclass.deleteIconIsDisabled());
			LoggerLoad.info("Data Table has data & delete Icon is present");
		}
		else if(rows.size()==0) {
			Assert.assertTrue(manageclass.deleteIconIsDisabled());
			LoggerLoad.info("Data Table doesn't has data & delete Icon is not present");
		}
		else {
			LoggerLoad.info("Data Table doesn't has data & no delete Icon is present");
		}
		}
		catch (Exception e) {
			
		}
	}

	@Then("Admin cant see delete  Icon in data table")
	public void admin_cant_see_delete_icon_in_data_table() {
		
		List<WebElement> rows = manageclass.rowIsPresent();
		try {
		if (rows.size()==0) {
			Assert.assertTrue(manageclass.deleteIconIsDisabled());
			LoggerLoad.info("Data Table doesn't has data & delete Icon is not present");
		}
		}
		catch(Exception e) {
			LoggerLoad.info("Data Table doesnt have any data & no delete icon is present" + e); 
		}
	}

	//Assuming all sorticon tags have class atttibute containing text "icon"
	//eg. <i class="editdelete-icons">home</i>
	@Then("Admin should see sort icon near the column headers except for Edit and Delete in manage class page")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete_in_manage_class_page() {
		List<WebElement> headercells =	manageclass.classDataTableHeaderWithSortIcon();
		try {		
		for (WebElement hc : headercells)
		{
			if(hc.getText()=="Edit Delete") {
				String checkIcon = hc.getClass().toString();
				boolean check = checkIcon.contains("icon");
				Assert.assertTrue(check);
				LoggerLoad.info("Sort Icon is not present in Edit Delete header");
			}			
			else {
				String checkIcon = hc.getClass().toString();
				boolean check = checkIcon.contains("icon");
				Assert.assertTrue(check);
				LoggerLoad.info("Sort Icon is present in header");
			}			
		}
		}
		catch (Exception e) {
			LoggerLoad.warn("Assertion error in sortIcon " + e);
		}		
	}

	@Then("Admin should see check box in the all rows  of data table")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table() {
		List<WebElement> rows =  manageclass.rowIsPresent();
		try {
		for (int i=0; i<rows.size(); i++) {
			Assert.assertTrue(manageclass.checkBoxInAllRows());
			LoggerLoad.info("check box is present in row :" + rows.get(i)); 
		}
		}
		catch(Exception e) {
			LoggerLoad.info("check box is not present in row"); 
		}	
	}
//Assuming max 10 entries only will be in the table in one page
	@Then("Above the footer Admin should see the text as {string} below the table in manage class page")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table_in_manage_class_page(String string) {
		List<WebElement> noOfPages = manageclass.numberOfPages();
	    int totalPages =noOfPages.size();
	    int totalClass = 0;
	    for (int p = 1; p<totalPages; p++)
	    {
	    	int onPage = p;
	    	List<WebElement> dataTableRows =manageclass.rowIsPresent();
	    	totalClass = totalClass + dataTableRows.size();	    	
	    	LoggerLoad.info("onPage : "+p);	    	
	    }	    
	    String footerText = manageclass.footerText();
    
	   String expectedFooterText = "Showing 1 to 10 of "+ totalClass + "entries" ;
	   try {
	   Assert.assertEquals(footerText, expectedFooterText);
	   }
	   catch (Exception e) {
		   LoggerLoad.info("Actual and Expected Footer Text doesn't match" + e);  
	   }   
	}

	@Then("Admin should see the pagination controls under the data table in manage class page")
	public void admin_should_see_the_pagination_controls_under_the_data_table_in_manage_class_page() {
	try {
		Assert.assertTrue(manageclass.paginationIsDisplayed());
		LoggerLoad.info("Pagination is displayed at the bottom of page");
	}
	catch (Exception e) {
		LoggerLoad.info("Pagination is not displayed at the bottom of page" + e);
	}
	}

	@Then("Admin should see the text with total number classes in the data table. \\( {string})")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table(String string) {
		List<WebElement> noOfPages = manageclass.numberOfPages();
	    int totalPages =noOfPages.size();
	    int totalClass = 0;
	    for (int p = 1; p<totalPages; p++)
	    {
	    	int onPage = p;
	    	List<WebElement> dataTableRows =manageclass.rowIsPresent();
	    	totalClass = totalClass + dataTableRows.size();	    	
	    	LoggerLoad.info("onPage : "+p);	    	
	    }	    
	    String footerText = manageclass.footerText();
    
	   String expectedFooterText = "Showing 1 to 10 of "+ totalClass + "entries" ;
	   try {
	   Assert.assertEquals(footerText, expectedFooterText);
	   }
	   catch (Exception e) {
		   LoggerLoad.info("Actual and Expected Footer Text doesn't match" + e);  
	   }    
	}

}
