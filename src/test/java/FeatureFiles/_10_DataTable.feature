Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Country

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | name | abnersi21 |
      | code | code555   |


    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And user delete Element from dialog
      | abnersi21 |

    Then Success message should be displayed


  Scenario: Create a CitizenShip and Delete

    And Click on the Element in LeftNav
      | setup       |
      | parameters  |
      | citizenship |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | name      | fdfderw1  |
      | shortName | short3555 |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed

    And user delete Element from dialog
      | fdfderw1 |

    Then Success message should be displayed


  Scenario: Fee Functionality and Delete

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | name            | is437723 |
      | code            | 18863    |
      | integrationCode | 10087    |
      | priorityCode    | 1233     |

    And Click on the Element in Dialog
      | toggleBar |
      | saveClose |

    Then Success message should be displayed

    And user delete Element from dialog
      | is437723 |

    Then Success message should be displayed





