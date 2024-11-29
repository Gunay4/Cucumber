# CitizenShip menusunun kayıt ve silme özelliğini
# (DataTable ile) 5 farklı değer seti ile çalıştırınız.

Feature: DataTable ve Senaryo Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create CitizenShip and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |


    And User sending the keys in Dialog
      | name      | <name>      |
      | shortName | <shortNames> |


    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And user delete Element from dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name       | shortNames |
      | fenern45f1 | fnr444    |
      | fenern45f1 | fnr444    |
      | fenern45f1 | fnr444    |
      | fenern45f1 | fnr444    |

