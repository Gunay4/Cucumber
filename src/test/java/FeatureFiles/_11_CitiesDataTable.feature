#Cities menusunun kayıt, Tekrar Aynı Kayıt(Negatif test) ve silme özelliğini test ediniz

Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  @RegressionTest @SmokeTest
  Scenario: Create and Delete Cities

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | cities     |

    And Click on the Element in Dialog
      | addButton     |
      | countrySelect |
      | selectCity    |


    And User sending the keys in Dialog
      | name | city33t943211sd23 |


    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And user delete Element from dialog
      | city33t943211sd23 |

    Then Success message should be displayed


