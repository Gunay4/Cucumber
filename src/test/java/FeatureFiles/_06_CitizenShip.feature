#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile yapınız. (Senaryo 1)
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test) (Senaryo 2)
#Ayrı sebaryoda girilen bilgiyi silme işlemini doğrulayınız (Senaryo 3)

Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShip


  Scenario: Create Citizenship
    When Create a Citizenship name as "i11mCS7qss4" shortName as "cs85"
    Then Success message should be displayed

  Scenario: Create Citizenship 2

    When Create a Citizenship name as "i11mCS7qss4" shortName as "cs85"
    Then already exists message should be displayed


  Scenario: Create Citizenship 3
    When user delete Citizenship name as "i11mCS7qss4"
    Then Success message should be displayed