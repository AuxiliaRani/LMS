Feature: Delete Class Verification

Background: Admin logged into LMS portal and clicks class button on the navigation bar 
Given Admin is in Manage class page
When Admin clicks delete button in data table row level in manage class page

@TC_DeleteClassVerification_01
Scenario: Verify Delete class alert in manage class page
Then Admin should see alert on manage class page

@TC_DeleteClassVerification_02
Scenario: Verify  accept enabled in alert in manage class page
Then Alert should have "yes" button to accept on manage class page

@TC_DeleteClassVerification_03
Scenario: Verify reject enabled in alert in manage class page
Then Alert should have "No" button to reject on manage class page