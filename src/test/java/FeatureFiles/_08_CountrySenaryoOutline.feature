# TODO : Country menusu create,delete olarak, Senaryo outline şeklinde 5 kez çalıştırınız

Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country


  Scenario Outline: Create a Country
    When Create a country name as "<name>" code as "<code>"
    Then Success message should be displayed
    When Create a country name as "<name>" code as "<code>"
    Then already exists message should be displayed
    When user delete Country name as "<name>"
    Then Success message should be displayed

    Examples:

      | name      | code    |
      | i11pt45S10 | 45cod2  |
      | i11pt68810 | 455cod3 |
