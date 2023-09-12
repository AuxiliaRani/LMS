@LoginCredentials
Feature: Login Page Valid and Invalid Credential Validations

	Background: Admin is on the login page after clicking Login button from the home page
		Given Admin is on the "Login" page

	@TC_LoginCredentials_01
	Scenario: Validate login with valid credentials		
		When Admin enters valid "username" and "password"
			 | 	 username    | password    |
			 | Team9testuser | BddCoders@9 |
		And Clicks on "Login" button 	
    Then Admin should land on "Dashboard" page from login page
    
  @TC_LoginCredentials_02
	Scenario Outline: Validate login with invalid credentials from Excel "Sheetname" and "RowNumber"
		When Admin enters sheet "<Sheetname>" and <RowNumber>		
		Then Clicks on "Login" button 	
    
    Examples:
      | Sheetname 		      | RowNumber |
      | LoginCredentials    |     0     |
      | LoginCredentials    |     1     |
      | LoginCredentials    |     2     |
      | LoginCredentials    |     3     |
      | LoginCredentials    |     4     |
      | LoginCredentials    |     5     |
     
     
  @TC_LoginCredentials_03
	Scenario: Verify login button action through keyboard		
		When Admin enters valid "username" and "password"
			 | 	 username    | password    |
			 | Team9testuser | BddCoders@9 |
		And Clicks on "Login" button through keyboard
    Then Admin should land on "Dashboard" page from login page
    
    @TC_LoginCredentials_04
	Scenario: Verify login button action through mouse action	
		When Admin enters valid "username" and "password"
			 | 	 username    | password    |
			 | Team9testuser | BddCoders@9 |
		And Clicks on "Login" button through mouse action
    Then Admin should land on "Dashboard" page from login page
    
    
    
    
    