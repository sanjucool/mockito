Feature: Title of your feature I want to use this template for my feature file

  Scenario: check login is successfully with valid credential
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigated to the home page
