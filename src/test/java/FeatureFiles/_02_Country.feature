Feature: Country Functionality

  Scenario: Create a Country


    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country
    When Create a country
    Then Success message should be displayed
