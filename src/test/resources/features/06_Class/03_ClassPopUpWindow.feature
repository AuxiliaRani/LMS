Feature: Class detail Popup window verification.

  Background: Admin logged into LMS portal and clicks class button on the navigation bar
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button

@TC_ClassPopUpWindow_01
  Scenario: Verify class details popup window opens with title Add Classes Page
    Then Admin should see a popup  with  heading "class details" on add classes page

@TC_ClassPopUpWindow_02
  Scenario: Verify input fields in class details popup window
    Then Admin should see input fields Text (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)

@TC_ClassPopUpWindow_03
  Scenario: Verify text box present in class details popup window
    Then Admin should see textbox should be  present in Class details popup window

@TC_ClassPopUpWindow_04
  Scenario: Verify drop down in Batch Id  in class details popup window
    Then Admin should see dropdown option for Batch ID in Class details popup window

@TC_ClassPopUpWindow_05
  Scenario: Verify drop down in Staff Id  in class details popup window
    Then Admin should see dropdown option for Staff Id in Class details popup window

@TC_ClassPopUpWindow_06
  Scenario: Verify calendar icon in class date  in class details popup window
    Then Admin should see calendar icon for class date in Class details popup window

@TC_ClassPopUpWindow_07
  Scenario: Verify save button is present in class details popup window
    Then Admin should see save button in the class detail popup window

@TC_ClassPopUpWindow_08
  Scenario: Verify cancel button is present in class details popup window
    Then Admin should see cancel button in the class detail popup window

@TC_ClassPopUpWindow_09
  Scenario: Verify close button in class details popup window
    Then Admin should see close button on the class details popup window
