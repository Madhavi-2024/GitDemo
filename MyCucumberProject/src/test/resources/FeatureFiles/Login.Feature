Feature: Weblogin
  Scenario: User should be able to login
    Given The user is on login page
    When The user enters the valid creditionals
    And Clicks submit
    Then The user has logged successfully.
