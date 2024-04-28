Feature: Login functionality

  @smoke
  Scenario: Login using valid userid
    Given Username and password field should be present on the landing page
    When I enter valid user credentials on the website
    Then I should be able to login status 200

  @integration
  Scenario: Login using invalid userid
    Given Username and password field should be present on the landing page
    When I enter invalid userid on the website
    Then I should not be able to login status 401

  @regression
  Scenario: Login using invalid password
    Given Username and password field should be present on the landing page
    When I enter invalid password on the website
    Then I should not be able to login status 401
