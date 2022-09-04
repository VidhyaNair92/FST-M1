@activity4

Feature: Login Test

  Scenario: Testing Login without Examples
    Given User is on Login page
    When User enters "admin" and "password"
    And close the Browser