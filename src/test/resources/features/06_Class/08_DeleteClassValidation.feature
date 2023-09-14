Feature: Delete Class Validation

Background: Admin clicks row level delete button after landing to manage class page
Given Admin is in delete alert of manage class page

@TC_DeleteClassValidation_01
Scenario: Validate accept in alert of manage class page
When Admin clicks yes button of manage class page
Then Success message and validate particular class details are deleted from the data table of manage class page

@TC_DeleteClassValidation_02
Scenario: Validate reject in alert of manage class page
When Admin clicks no button of manage class page
Then Admin should land on manage class page and validate particular class details are not deleted from the data table from manage class page