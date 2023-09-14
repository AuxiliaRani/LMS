 @studentpagenavigation
Feature: Navigation Validation from student page to other Pages
Background: Admin is logged in and on the student Details page

  @ST25
  Scenario: Program link on navigation bar
    
 Given Admin is on student details page
 When Admin clicks on program link on student  page
 Then Admin is redirected to Program page
 
 
 @ST26
  Scenario: Batch link on navigation bar
    
 
 When Admin clicks on Batch link on student page
 Then Admin is redirected to Batch page
 
  @ST27
  Scenario: Class link on navigation bar
    
 
 When Admin clicks on Class link on student page
 Then Admin is redirected to Class page
 
  @ST28
  Scenario: User link on navigation bar
    
 
 When Admin clicks on User link on student page
 Then Admin is redirected to User page
 
 @ST29
  Scenario: Assignment link on navigation bar
    
 
 When Admin clicks on Assignment link on student page
 Then Admin is redirected to Assignment page
 
 
 @ST30
  Scenario: Attendance link on navigation bar
    
 
 When Admin clicks on Attendance link on student page
 Then Admin is redirected to Attendance page
 
 @ST31
  Scenario: Logout link on navigation bar
    
 
 When Admin clicks on Logout link on student page
 Then Admin is redirected to Login page
 
 
    
    
    