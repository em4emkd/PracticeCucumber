Feature: Validation of login scenarios

  Scenario: User login
    Given user is navigated to OpenCart website
    When user enters valid credentials
    And user clicks on login button
    Then user is successfully logged in