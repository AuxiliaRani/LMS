Feature: Manage Class Page Text Validation.

  Background: Logged on the LMS portal as Admin

  Scenario: Validate text in manage class page
    Given Admin is on dashboard page after Login
    When Admin clicks Class button on the navigation bar and get all text from the portal page for manage class
    Then Admin should see correct spelling for the all the fields for manage class
