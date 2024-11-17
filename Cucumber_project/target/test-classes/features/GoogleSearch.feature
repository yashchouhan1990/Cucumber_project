@tag
Feature: Check google search functionality

  @tag1
  Scenario: Validate Google Search working
    Given browser is open
    And user is on the google search page
    When user enters a text in google search box
    And hits Enter
    Then user is navigated to the Search Results page
