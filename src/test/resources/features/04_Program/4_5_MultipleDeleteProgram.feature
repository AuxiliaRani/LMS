Feature: Multiple Delete Program

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar

@TC_Delete_Multiple_Program_01
Scenario: Validate Common Delete button enabled after clicking on any checkbox in Program page
Given Admin is in Manage Program page   to verify Multiple Delete
When   Admin clicks any checkbox in the data table  
Then  Admin should see common delete option enabled under header Manage Program   


#Background: Admin clicks delete button under header after selecting the check box in the data table

@TC_Delete_Multiple_Program_02
Scenario: Validate multiple program deletion by selecting Single checkbox in Program page for yes option
Given Admin is on Confirm Deletion alert  to verfy Single checkbox in Program page for yes option
When  Admin clicks YES button on the alert to verfy Single checkbox in Program page for yes option
Then  Admin should land on Manage Program page and can see the selected program is deleted from the data table

@TC_Delete_Multiple_Program_03
Scenario: Validate multiple program deletion by selecting Single checkbox in Program page for No option
Given  Admin is on Confirm Deletion alert  to verfy Single checkbox in Program page for No option
When     Admin clicks NO button on the alert to verfy Single checkbox in Program page for No option
Then     Admin should land on Manage Program page and can see the selected program is NOT deleted from the data table


#Background: Admin clicks delete button under header after selecting multiple checkboxes in the data table

@TC_Delete_Multiple_Program_04
Scenario: Validate multiple program deletion by selecting multiple check boxes in Program page for yes option
Given  Admin is on Confirm Deletion alert  to verify multiple check boxes in Program page for yes option
When    Admin clicks YES button on the alert to verify multiple check boxes in Program page for yes option
Then   Admin should land on Manage Program page and can see the selected programs are deleted from the data table

@TC_Delete_Multiple_Program_05
Scenario: Validate multiple program deletion by selecting multiple check boxes in Program page for No option
Given   Admin is on Confirm Deletion alert to verify multiple check boxes in Program page for NO option
When    Admin clicks NO button on the alert to verify multiple check boxes in Program page for NO option
Then Admin should land on Manage Program page and can see the selected programs are NOT deleted from the data table