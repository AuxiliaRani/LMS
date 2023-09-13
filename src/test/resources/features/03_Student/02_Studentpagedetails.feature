@studentdetails
Feature: Student Page Verification
Background: Admin is logged in and on the student Details page

  @ST18
  Scenario: Validate select student name is fading
    
 Given Admin is on student details page
 When Admin select student name from the drop down 
 Then Admin shouldn't see select student name text 
    
  @ST19
  Scenario: Validate select batch id  is fading
    
 
 When Admin select batch id from the drop down 
 Then Admin shouldn't see select batch id text  
 
  @ST20
  Scenario: Validate select student name using search box
    
 
 When Admin clicks select student name and  enters x alphabet in the search box 
 Then Admin should see student name start with x is listed below
   
    
 @ST21
  Scenario: Validate select batch id using search box
    
 
 When Admin  clicks select batch id and enter x number in the search box 
 Then Admin should see batch id start with x is listed below
   
   @ST22
  Scenario: Validate selecting only  student name  will not display any details
    

 When Admin selects only student name 
 Then Student details shouldn't be displayed
   
   
   @ST23
  Scenario: Validate selecting only  batch id  will not display any details
    
 
 When Admin selects only  batch id 
 Then Student details shouldn't be displayed
 
 
 @ST24
  Scenario: Validate selecting student name and batch id
    
 
 When Admin selects  student name and batch id
 Then Particular student informations should be display
    