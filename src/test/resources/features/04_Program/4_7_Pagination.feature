Feature: Pagination on Manage Program Page

Background:Admin is on Manage Program Page after logged in
Given    Admin is on Manage Program page to verify pagination

@TC_Pagination_Validation_Program_01
Scenario:Verify Next page link on Manage Program Page
When     Admin clicks Next page link on the program table in Program Page
Then   Admin should see the Pagination has "Next" link  in Program Page

@TC_Pagination_Validation_Program_02
Scenario:Verify Last page link on Manage Program Page
When     Admin clicks Last page link of  Program Page
Then  Admin should see the last page record on the table with Next page link are disabled in Program Page

@TC_Pagination_Validation_Program_03
Scenario:Verify First page link on Manage Program Page
Given    Admin is on last page of Program table
When     Admin clicks First page link of Program Page
Then  Admin should see the previous page record on the table with pagination has previous page link in Program Page

@TC_Pagination_Validation_Program_04 
Scenario:  Verify Start page link on Manage Program Page
Given    Admin is on Previous Program page
When     Admin clicks Start page link Program Page
Then    Admin should see the very first page record on the table with Previous page link are disabled in Program Page