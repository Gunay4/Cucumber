Feature: Datatable Ornek

  Scenario: User write
    When write username "gunay"
    When write username and password "gunay" and "1234"


    And Write username as Datatable
      | gunay   |
      | ayse    |
      | mustafa |
      | mehmet  |
      | ali     |

    And Write username and password as Datatable
      | gunay   | 1277 |
      | ayse    | 5677 |
      | mustafa | 7891 |
      | mehmet  | 1245 |
      | ali     | 6322 |


#  dataProvider (TestNG için), Senaryo Outline (cucumber)
#  görevi verilen her değer için, tüm senayo çalışır

#  DataTable ise , sadece bir step e, çoklu parametre vermek
#  için kullanılır, sadece 1 kez tüm parametreleri stepin içine atar