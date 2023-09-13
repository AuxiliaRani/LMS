

@studentpage
Feature: Student Page Verification
Background: Logged on the LMS portal as Admin

  @ST1
  Scenario: Validate the title of the pageforstudent
    
 Given Admin is on dashboard page after Login for student
 When Admin clicks "Student" on the navigation bar
 Then Admin should see the Student details Page Title
    
  @ST2
  Scenario: Validate response time from dashboard page to student page
   Then  Maximum navigation time in milliseconds, defaults to 30 seconds
   
  @ST3
  Scenario: Validate the broken link
  Then Admin should receive "HTTP response code greater than or equal to 400" error for the link
  And The link is broken
    
   @ST4
  Scenario: Verify LMS title 
  Then Admin should see LMS -Learning management system  as title 
    
     @ST5
  Scenario: Verify the alignment of the Student detail title
  
    Then Student Detail title should be in centre of the page
    
     @ST6
  Scenario: Validate drop down is present in the page
  
    Then  2dropdowns should be present in the page
    
    
    
     @ST7
  Scenario: Validate search bar in select student name drop down
 
    Then Admin should see search box inside the drop down 
    
    
    @ST8
  Scenario: Validate search bar in select batch id drop down
  
    Then Admin should see search box inside  batch id drop down 
    
    @ST9
  Scenario: Validate text spelling student name
  Then Admin should see correct spelling select student name
    
    
    @ST10
  Scenario: Validate text spelling select batch id
  Then Admin should see correct spelling select  batch id text
    
     @ST11
  Scenario: Validate only numbers inside select batch id
  
  Then Admin should see only numbers inside batch id drop down
    
    @ST12
  Scenario: Validate gray color in student name drop down
 
    Then Admin should see select student name in gray color
    
    @ST13
  Scenario: Validate gray color in batch id drop down
  
    Then Admin should see select batch ID in gray color
    
    @ST14
  Scenario: Validate first drop down label is select student name
 
    Then Admin should see select student name in first
    
    @ST15
  Scenario: Validate second drop down label is select batch id
 
    Then Admin should see select batch id in second
    
    @ST16
  Scenario: Validate scroll down inside student name dropdown
  
   Then Admin should able to scroll down to select the name
    
    
    @ST17
  Scenario: Validate scroll down inside batch id dropdown
  
    Then Admin should able to scroll down to select the batch id
    