#Senaryo
#Citizenships sayfasına gidiniz.
#1 adet Citizenships kaydı yapılabildiğini doğrulayınız.
  Feature: Citizenships Functionality

    Scenario: Create Citizenship

      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully
      And Navigate to CitizenShip
      When Create a CitizenShip
      Then Success message should be displayed