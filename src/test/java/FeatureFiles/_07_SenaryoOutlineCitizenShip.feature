Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario Outline: Create Citizenship
    When Create a Citizenship name as "<name>" shortName as "<shortname>"
    Then Success message should be displayed
    When Create a Citizenship name as "<name>" shortName as "<shortname>"
    Then already exists message should be displayed
    When user delete Citizenship name as "<name>"
    Then Success message should be displayed


    Examples:
      | name      | shortname |
      | i11mCS77kk | cs55short |
      | i11mCS77kk | cs55short |
      | i11mCS77kk | cs55short |
      | i11mCS77kk | cs55short |
      | i11mCS77kk | cs55short |


     #  dataProvider (TestNG için), Senaryo Outline (cucumber)
     #  görevi verilen her değer için, tüm senayo çalışır