@LoginCredentials
Feature: Login Page Valid and Invalid Credential Validations

	Background: Admin is on the login page after clicking Login button from the home page
		Given Admin is on the "Login" page

	@TC_LoginCredentials_01
	Scenario: Validate login with valid credentials
		When Admin enters valid "<username>" and ""<password>"
			 | 	 username    | password    |
			 | Team9testuser | BddCoders@9 |
		And Clicks on "Login" button 	
    Then Admin should land on "Dashboard" page
    
  @TC_LoginCredentials_02
	Scenario: Validate login with invalid creadentials
		When Admin enters invalid "<username>" and "<password>"
			 | username | password |
			 | testuser | team@9%^ |
		And Clicks on "Login" button 	
    Then Admin should see error message "Please Check the Username/Password"
    
  @TC_LoginCredentials_03
	Scenario: Validate login with valid Username and invalid Password
		When Admin enters valid "<username>" and invalid "<password>" 
			 | 	 username    | password  |
			 | Team9testuser |  team@9%^ |
		And Clicks on "Login" button 	
    Then Admin should see error message "Please Check the Password"
	
	@TC_LoginCredentials_04
	Scenario: Validate login with invalid Username and valid Password
		When Admin enters invalid "<username>" and valid "<password>" 
			 | username |  password    |
			 | testuser |  BddCoders@9 |
		And Clicks on "Login" button 	
    Then Admin should see error message "Please Check the Username"
         
  @TC_LoginCredentials_05
	Scenario: Validate login with empty username
		When Admin enters only valid "<password>" with username field empty
			| password    |
			| BddCoders@9 |
		And Clicks on "Login" button 	
    Then Admin should see error message "Please Check the Username"
    
    
  @TC_LoginCredentials_06
	Scenario: Validate login with empty password
		When Admin enters only  "<username>" with password field empty
			 | 	 username    |
			 | Team9testuser |
		And Clicks on "Login" button 	
    Then Admin should see error message "Please Check the Username"
    
  @TC_LoginCredentials_07
	Scenario: Validate login with empty username and password
		When Admin clicks on "Login" button with empty username and password fields
    Then Admin should see error message "Please Check the Username/Password"
     
  @TC_LoginCredentials_08
	Scenario: Verify login button action through keyboard
		When Admin enters valid "<username>" and "<password>" 
			 | 	 username    | password    |
			 | Team9testuser | BddCoders@9 |
		And Clicks on "Login" button through keyboard
    Then Admin should land on "Dashboard" page
    
    @TC_LoginCredentials_09
	Scenario: Verify login button action through mouse action
		When Admin enters valid "<username>" and "<password>" 
			 | 	 username    | password    |
			 | Team9testuser | BddCoders@9 |
		And Clicks on "Login" button through mouse action
    Then Admin should land on "Dashboard" page
    
    
    
    
    