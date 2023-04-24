Feature: Verify Login feature of Naukri

  Scenario: Verify Login with valid username and valid password
    Given user should be in login page
    When user enter valid username and valid password
    When click on login button
    Then user should be logged in
    And close the browser

  Scenario: Verify Login with valid username and invalid password
    Given user should be in login page
    When user enter valid username and invalid password
    When click on login button
    Then user should not be logged in
    And close the browser
    
