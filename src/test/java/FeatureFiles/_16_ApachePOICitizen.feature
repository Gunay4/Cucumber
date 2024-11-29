Feature: ApachePOI Citizen functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip

  Scenario:  Create and Delete CitizenShip from excel
    When User Create citizenship with ApachePOI
    Then User Delete citizenship with ApachePOI