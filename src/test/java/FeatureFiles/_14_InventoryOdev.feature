#Inventory Bölümündeki
#Item Categories Çalışmasını test ediniz
#girişi yapıp , sonrasında silmesini yapınız
#YENİ
#[20:25]
#5 farklı değer için senaryoyu test ediniz

Feature: DataTable ve Senaryo Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create New Item Category and Delete

    And Click on the Element in LeftNav
      | inventory              |
      | setupUnderTheInventory |
      | ItemCategories         |

    And Click on the Element in Dialog
      | addButton |


    And User sending the keys in Dialog
      | name | <name> |


    And Click on the Element in Dialog
      | userType       |
      | selectUserType |
      | saveButton     |

    Then Success message should be displayed

    And user delete Element from dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name     |
      | fen45fg  |
      | fern45fg |
      | fner888  |
      | fne345fg |
      | fne345fg |
