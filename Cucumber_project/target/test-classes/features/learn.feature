# Author
#Date
@SmokeScenario
Feature: feature to test the login functionality

  @SmokeTest
  Scenario: Check login is successful with the valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario Outline: Check login is successful with the valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | user1    | pwd1     |
      | user2    | pwd2     |
