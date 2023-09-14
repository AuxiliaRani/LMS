Feature: Edit Class Validation

  Background: Admin clicks Edit button in manage class after reaching manage class page
    Given Admin is in  Edit class detail popup window

  Scenario: Validate admin able to update class with valid data in mandatory fields for manage class page
    When Admin enters all mandatory field values with valid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then Admin should see particular class details is updated in the data table on manage class page

  Scenario: Validate admin able to update class with invalid data in mandatory fields or manage class page
    When Admin enters all mandatory field values with invalid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id, )
    Then Error message should appear in alert on manage class page

  Scenario: Validate admin able to  update class with valid data  in all fields in manage class page
    When Admin enters values in all fields with valid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)
    Then Admin should see particular class details is updated in the data table on main class page

  Scenario: Validate admin able to  update class with invalid data  in all fields
    When Admin enters with invalid data in optional fields and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then Error message should appear in alert is displayed

  Scenario: Validate admin able to update class missing Batch Id
    When Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id)
    Then Batch Id is missing message is displayed

  Scenario: Validate admin able to update  class missing No of Class
    When Admin enters data missing value in No of class and clicks save button (Batch ID ,  Class Date, Staff Id, )
    Then No of classes is missing message is displayed

  Scenario: Validate admin able to update class missing Class Date
    When Admin enters data missing value in  class date and clicks save button (Batch ID , No of Classes, Staff Id, )
    Then class date is missing message is displayed

  Scenario: Validate admin able to update class missing staff id
    When Admin enters data missing value in staff id and clicks save button (Batch ID , No of Classes, Class Date )
    Then staff id is missing message is displayed

  Scenario: Validate  admin able to update class passing past date
    When Admin enters passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then class cannot be updated for the passed date message is displayed

  Scenario: Validate cancel button function in Edit class details popup window
    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on Manage Class page from popup window

  Scenario: Validate cancel button function in Edit class details popup window with values in field
    When Admin clicks Cancel button entering values in the fields
    Then Admin should land on Manage Class Page and validate particular class details are not changed  in the data table
