Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country

  Scenario: Create a Country
    When Create a country
    Then Success message should be displayed

  Scenario: Create a Country 2

    When Create a country name as "ulkeler11" code as "4543Ulker"
    Then Success message should be displayed