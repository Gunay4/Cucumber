#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile 2 farklı senaryo ile kayıt yapınız.

Feature: Citizenships Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario: Create Citizenship
    When Create a Citizenship name as "Temnsa" shortName as "5345"
    Then Success message should be displayed

  Scenario: Create Citizenship 2

    When Create a Citizenship name as "Teml76" shortName as "49902"
    Then Success message should be displayed