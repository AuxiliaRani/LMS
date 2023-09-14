
Feature: Admin Add New Program

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar
Given Admin is on Manage Program Page

@TC_Add_New_Program_01
Scenario: Validate Program Details Popup window in Program page
When Admin clicks A New Program button in Program Page
Then Admin should see a popup open for Program details with empty form along with SAVE and CANCEL button and Close X Icon on the top right corner of the window in Program Page


@TC_Add_New_Program_02
Scenario: Validate input fields and their text boxes in Program details form in Program page
When Admin clicks A New Program button in Program Page
Then Admin should see two input fields and their respective text boxes in the program details window in Program Page

@TC_Add_New_Program_03
Scenario: Validate radio button for Program Status	in Program page
When Admin clicks A New Program button in Program Page
Then Admin should see two radio button for Program Status in Program Page
