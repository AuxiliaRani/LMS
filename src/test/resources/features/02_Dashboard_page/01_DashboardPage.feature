@Dashboard
Feature: Dashboard Page

	Background: Admin clicks Login butter after giving correct URL
		Given Admin is on "Login" page
		When Admin enter valid credentials and clicks "Login" button 
		
	@TC_Dashboard_01
	Scenario: Verify Admin lands on Manage Program as Dashboard page after login
    Then Admin should see "Manage program" as header 
   
  @TC_Dashboard_02
	Scenario: Verify the response time
    Then  Admin see Maximum navigation time in milliseconds, defaults to 30 seconds
    
  @TC_Dashboard_03
	Scenario: Verify broken link
    Then Admin should receive "Https response code greater than or equal to 400" error for the link
    And The link is broken     
    
  @TC_Dashboard_04
	Scenario: Verify LMS title 
    Then Admin should see "LMS - Learning Management System" as title 
    
  @TC_Dashboard_05
	Scenario: Verify LMS title alignment
    Then Admin should see LMS title on the top left corner of the Manage Program page
      
  @TC_Dashboard_06
	Scenario: Validate navigation bar text
    Then Admin should see correct spelling on navigation bar text
   
  @TC_Dashboard_07
	Scenario: Validate LMS title has correct spelling and space
    Then Admin should see correct spelling and space in LMS title  
    
  @TC_Dashboard_08
	Scenario: Validate alignment for navigation bar
    Then Admin should see the navigation bar text on the top right side   
    
  @TC_Dashboard_09
	Scenario: Validate navigation bar order 1st Student
    Then Admin should see "Student" in the 1st place
 
  @TC_Dashboard_10
	Scenario: Validate navigation bar order 2nd Program
    Then Admin should see "Program" in the 2nd place
     
  @TC_Dashboard_11
	Scenario: Validate navigation bar order 3rd Batch
    Then Admin should see "Batch" in the 3rd place     
     
  @TC_Dashboard_12
	Scenario: Validate navigation bar order 4th Class
    Then Admin should see "Class" in the 4th place     
     
  @TC_Dashboard_13
	Scenario: Validate navigation bar order 5th User
    Then Admin should see "User" in the 5th place
     
  @TC_Dashboard_14
	Scenario: Validate navigation bar order 6th Assignment
    Then Admin should see "Assignment" in the 6th place    
     
  @TC_Dashboard_15
	Scenario: Validate navigation bar order 7th Attendance
    Then Admin should see "Attendance" in the 7th place
     
	@TC_Dashboard_16
	Scenario: Validate navigation bar order 8th Logout
    Then Admin should see "Logout" in the 8th place
  
     	