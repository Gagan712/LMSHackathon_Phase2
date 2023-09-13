Feature:
Navigation function validation from manage attendance page to other pages  
Background:
 Given Admin is on a manage attendance page in attendance
 
 Scenario: Verify admin is able to navigate from manage attendance to student page in attendance
    When Admin clicks Student button in the navigation bar in attendance
    Then Admin should able to land on student page in attendance

  Scenario: Verify admin is able to navigate from manage attendance to program page in attendance
    When Admin clicks Program button in the navigation bar in attendance
    Then Admin should able to land on program page in attendance

  Scenario: Verify admin is able to navigate from manage attendance to batch page in attendance
    When Admin clicks Batch button in the navigation bar in attendance
    Then Admin should able to land on batch page in attendance

  Scenario: Verify admin is able to navigate from manage attendance to user page in attendance
    When Admin clicks User button in the navigation bar in attendance
    Then Admin should able to land on user page in attendance

  Scenario: Verify admin is able to navigate from manage attendance to assignment page in attendance
    When Admin clicks Assignment button in the navigation bar in attendance
    Then Admin should able to land on Assignment page in attendance

  Scenario: Verify admin is able to navigate from manage attendance to class page in attendance
    When Admin clicks Class button in the navigation bar in attendance
    Then Admin should able to land on Class page in attendance

  Scenario: Verify adminshould able to do logout function from manage attendance in attendance
    When Admin clicks Logout button in the navigation bar in attendance
    Then Admin should able to land on login page in attendance
