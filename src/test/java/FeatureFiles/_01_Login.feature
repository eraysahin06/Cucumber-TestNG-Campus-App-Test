Feature: Login Functionality

  Scenario: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password
    And Click on Login button
    Then Verify user is logged in successfully