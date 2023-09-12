Feature: Add New Class Verification

  Background: Logged on the LMS portal as Admin
    Given Admin click +Add New Class button after reaching to Manage class page

    Scenario: Validate all batch id is reflecting in the dropdown on add class page
    When Admin clicks  Batch ID dropdown on add class page
    Then Batch id in the drop down should match with Batch id manage batch page table
    
    Scenario: Validate admin able to add new class with valid data in mandatory fields
    When Admin enters all mandatory field values with valid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then Admin should see new class details is added in the data table from add class page
    
    Scenario: Validate admin able to add new class with invalid data in mandatory fields
    When Admin enters all mandatory field values with invalid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id, )
    Then Error message should appear in alert on add class page
    
    Scenario: Validate admin able to add new class with valid data  in all fields
    When Admin enters values in all fields with valid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)
    Then Admin should see new class details is added in the data table on manage class page
    
    Scenario: Validate admin able to add new class with invalid data  in optional fields
    When Admin enters with invalid data in optional fields and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then Error message should appear in alert on add class page
    
    Scenario: Validate admin able to add new class missing Batch Id
    When Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id)
    Then Batch Id is missing message on add class page
    
    Scenario: Validate admin able to add new class missing No of Class
    When Admin enters data missing value in No of class and clicks save button (Batch ID ,  Class Date, Staff Id, )
    Then No of classes is missing message on add class page
    
    Scenario: Validate admin able to add new class missing Class Date
    When Admin enters data missing value in  class date and clicks save button (Batch ID , No of Classes, Staff Id, )
    Then class date is missing message on add class page
    
    Scenario: Validate admin able to add new class missing staff id
    When Admin enters data missing value in staff id and clicks save button (Batch ID , No of Classes, Class Date )
    Then staff id is missing message on add class page
    
    Scenario: Validate  admin able to add new class for passed past date 
    When Admin enters passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then class cannot be  created for the passed date message appear
    
    Scenario: Validate date picker for add new class
    When Admin clicks date from date picker from add page class
    Then selected date should be their in class date text box 
    
    Scenario: validate date picker should be correct format for add new class
    When Admin clicks date from date picker in add class page
    Then selected date should be in  mm/dd/yyyy format on add class page
    
    Scenario: Validate right arrow in data picker to navigate to next month in add new class
    When Admin clicks right arrow in the date picker near month in calender in add class page
    Then Next month calender should visible in add class page
    
    Scenario: Validate left arrow in data picker to navigate to previous month in add class page
    When Admin clicks left arrow in the date picker near month in calender in add class page
    Then previous month calender should visible in add class page
    
    Scenario: Validate current date is highlighted in the date picker in add class page
    When Admin clicks date picker button in add class page
    Then Admin should see current date is highled in the date picker in add class page
    
    Scenario: Validate selected date is highlighted in the date picker in add class page
    When Admin clicks date picker button and selects future date in add class page
    Then Admin should see selected date is highled in the date picker in add class page
    
    Scenario: Validate cancel button function in class details popup window in add class page
    When Admin clicks Cancel button without entering values in the fields in add class page
    Then Admin should land on Manage Class page from add class page
    
    Scenario: Validate cancel button function in add class page 
    When Admin clicks Cancel button after entering values in the fields in add class page
    Then Admin should land on Manage Class Page and validate new class is not created in the data table
  