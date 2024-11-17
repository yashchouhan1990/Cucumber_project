Feature: Data driven test

  Scenario Outline: Data driven test
    Given that the browser is open
    And user is on the login page
    When user enters <username> and <password>
    And usr clicks on login button
    Then user is navigated to the homepage

    Examples: 
      | username | password |
      | yash     |        5 |
