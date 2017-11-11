#  Developer edition signup: https://developer.salesforce.com/signup
#  Temporary email service: https://www.guerrillamail.com
#
#  Guidelines:
#    * Use the Cucumber tool of your choice
#    * Use the Selenium version of your choice
#    * Don’t use a headless browser
#    * Share a git repository that includes instructions for running the test
#    * complete within 36 hours less

Feature: Signup for an Salesforce Developer Account
  Scenario: Register with a temporary email address
    Given I register for a Salesforce Developer account
#    When I confirm my account email
#    And I complete the registration process by setting a password
#    Then I should be on the Salesforce Developer instance homepage
