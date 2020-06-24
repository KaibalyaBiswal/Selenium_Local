Feature: Verify the login functionality

  Scenario: Login by giving the valid credentials
    Given Navigate to login page
    When user enter valid username and valid password
    And click on login button
    Then It should show the home page
    And It should logout the application
    And It should quit the browser