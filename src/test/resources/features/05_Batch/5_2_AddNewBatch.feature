Feature: Admin validate Adding new Batch

@TC_Add_new_Batch_01 
Scenario: Check if the fields exist in pop in the Batch Page
Given A new pop up with Batch details appears	to verify addition of new batch
Then The pop up should include the fields Name, Number of classes and Description as text box,Program Name as drop down
And Status as radio button, Number of classes as text box in Manage Batch page

@TC_Add_new_Batch_02
Scenario: Check if description is optional field in the Batch Page
Given A new pop up with Batch details appears to check valid values with empty description in Manage Batch page
When Fill in all the fields except description with valid values	and click save in Manage Batch page
Then The newly added batch should be present in the data table in Manage Batch page

@TC_Add_new_Batch_03
Scenario: Check if the program details are added in data table in the Batch Page
Given A new pop up with Batch details appears to check valid values in Manage Batch page
When Fill in all the fields with valid values and click save in Manage Batch page
Then The newly added batch should be present in the data table in Manage Batch page with all filled values

@TC_Add_new_Batch_04
Scenario: Check for error messages for invalid fields in the Batch Page
Given A new pop up with Batch details appears to check invalid values in Manage Batch page
When Any of the fields have invalid values in the Batch Page	in Manage Batch page
Then Error message should appear for invalid values in the Batch Page	

@TC_Add_new_Batch_05
Scenario: Check for error messages for mandatory fields in the Batch Page
Given A new pop up with Batch details appears to check blank fields in Manage Batch page
When Any of the mandatory fields are blank in the Batch Page	in Manage Batch page
Then Error message should appear for mandatory missing values in the Batch Page