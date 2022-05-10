Feature: New user registration
  @test
  Scenario: User navigation to registration page

    Given user is navigated to OpenCart website
    When user navigates to the My Account tab and clicks on Register tab
    And user is successfully navigated to the Register Account page
    And user enters all required fileds into personal detailed section
    And user selects on subscribe button
    And user clicks on checkbox
    Then user clicks on continue tab


