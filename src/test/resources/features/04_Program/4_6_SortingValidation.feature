Feature: Sorting(Data Ordering) Validation

Background: Admin is on Manage Program Page after clicks Program on the navigation bar

@TC_Sorting_Validation_Program_01
Scenario: Validates Sorting data ordering  on the Program Data table
Given Admin is on Manage Program page  to verify sort icon of program name columns
When Admin clicks the sort icon of program name column     
Then   The data get sorted on the table based on the program name column values in ascending order  in Program Page 

@TC_Sorting_Validation_Program_02 
Scenario: Validates Sorting data ordering  on the Program Data table
Given The data is in the ascending order on the table based on Program Name column
When  Admin clicks the sort icon of program name column for descending order in Program Page
Then  The data get sorted on the table based on the program name column values in descending order in Program Page

@TC_Sorting_Validation_Program_03 
Scenario: Validates Sorting on the Program Data table
Given Admin is on Manage Program page to verify sort icon of program Desc column
When  Admin clicks the sort icon of program asce column
Then The data get sorted on the table based on the program description column values in ascending order in Program Page

@TC_Sorting_Validation_Program_04 
Scenario: Validates data ordering on the Program Data table
Given The data is in the ascending order on the table based on Program Description column
When  Admin clicks the sort icon of program Desc column
Then The data get sorted on the table based on the program description column values in descending order in Program Page

@TC_Sorting_Validation_Program_05
Scenario: Validates Sorting on the Program Data table
Given Admin is on Manage Program page to verify sort icon of program Status column
When  Admin clicks the sort icon of program Status column to verify ascending order in program page
Then  The data get sorted on the table based on the program status column values in ascending order in Program Page


@TC_Sorting_Validation_Program_06
Scenario: Validates Sorting or data ordering on the Program Data table
Given The data is in the ascending order on the table based on Program Status column
When  Admin clicks the sort icon of program Status column to verify descending order in program page
Then  The data get sorted on the table based on the program status column values in descending order in Program Page