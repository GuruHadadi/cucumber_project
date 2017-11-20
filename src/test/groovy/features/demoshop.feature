Feature: Demo web shop test scenarios
  Scenario: Login scenario
    Given I am in login page
    When I enter my credentials
    Then I land on the home page of demo shop
