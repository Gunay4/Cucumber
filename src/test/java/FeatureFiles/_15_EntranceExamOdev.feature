#Senaryo :
#  Entrance Exams -> Setup -> Enrance Exams Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız
#  Yukarıdaki adımları 4 farklı değer seti için tekrarlatınız.

Feature: Entrance Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create Entrance Exams and Delete

    And Click on the Element in LeftNav
      | entranceExams              |
      | setupUnderTheEntranceExams |
      | entranceExams2             |

    And Click on the Element in Dialog
      | addButton |


    And User sending the keys in Dialog
      | name | <name> |


    And Click on the Element in Dialog
      | academicPeriod       |
      | selectUserType       |
      | academicPeriodSelect |
      | gradeLevel |
      | gradeLevelSelect |
      | saveButton |

    Then Success message should be displayed

    And user delete Element from dialog
      | <name> |

    Then Success message should be displayed
    Examples:
      | name     |
      | exam45fg  |
      | exam45fg |
      | exam45fg  |




