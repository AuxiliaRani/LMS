@Userpageaddnewuser
Feature: Add new user
Background:  "Logged on the LMS portal
             Admin is on dashboard page after Login
             Admin clicks ""User"" from navigation bar
              Admin clicks ""+ A New User"" button"

@Uspg6
  Scenario: Check if the fields exist in pop
    Given A new pop up with user details appears
     
    Then   The pop up should include the fields First Name,Middle name, Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone and user comments as text box User Role, Role status, visa status as drop down
           
    
@Uspg7
  Scenario Outline: Check if Middle name, linkedIn url, email, user comments.under graduate,post graduate,time zone are optional 
    
    When  Fill in all the fields "<sheetName>",<rownumber>
    And   click submit
    Then The newly added user should be present in the data table in Manage User page
        
        
 Examples:
        
        |sheetName| rownumber|
        |AddNewuserdetails | 0      |
        
        
    
    @Uspg8
  Scenario Outline: Check if the program details are added in data table
    
    When Fill in all the fields with valid values  "<sheetName>","<rownumber>"and click submit
        
    Then The newly added user should be present in the data table in Manage User page
    
    Examples:
        
        |sheetName| rownumber|
        |AddNewuserdetails |  0        |
        
    
    
 @Uspg9
  Scenario Outline: Check for error messages for invalid fields
    
    When any of the fields have invalid values"<sheetname>","<rownumber>"
        
    Then Error message should appear
     Examples:
        
        |sheetName| rownumber|
        |AddNewuserdetails | 0        |
       
    
    @Uspg10
  Scenario Outline: Check for error messages for mandatory fields
    
     When Any of the mandatory fields are blank "<sheetName>","<rownumber>"
     Then Error message should appear for Userpage with mandatoryfieldblank
     
Examples:
        
        |sheetName| rownumber|
        |AddNewuserdetails |0        |
        
    
    
    
    