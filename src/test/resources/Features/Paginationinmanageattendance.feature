Feature: Pagination in manage attendance
Background:
Given Admin is logged into homepage in attendance
Scenario: Verify sheet one is displayed on default in data table in attendance
    When Admin clicks Attendance link on the navigation bar in attendance
    Then Data table should display page 1 when entries available on page in attendance

  Scenario: Verify right arrow is enable when sheet one is displayed in data table in attendance
    When Admin clicks Attendance link on the navigation bar in attendance
    Then Right arrow should be enabled in page one when entries are more than 5 available in attendance

  Scenario: Verify left arrow is disable when sheet one is displayed in data table in attendance
    When Admin clicks Attendance link on the navigation bar in attendance
    Then Left arrow should be disabled in page one  when entries are more than 5 available in attendance

  Scenario: Verify right arrow is enable when sheet two is displayed in data table when entries are more than 10 in attendance
    When Admin clicks Attendance link on the navigation bar in attendance
    Then Right arrow should be enabled in page two when entries are more than 10 available in attendance

  Scenario: Verify left arrow is enable when sheet two is displayed in data table in attendance
    When Admin clicks Attendance link on the navigation bar in attendance
    Then Left arrow should be enabled in page two in attendance

  Scenario: Verify right arrow is disable when sheet two is displayed in data table when entries are less than 10 in attendance
    When Admin clicks Attendance link on the navigation bar in attendance
    Then Right arrow should be disabled in page two when entries are less than 10 available in attendance

  Scenario: Verify pagination controls enabled in attendance
    When Admin clicks Attendance link on the navigation bar in attendance
    Then entries are more than 5 in data table pagination controls enabled in attendance

  Scenario: Verify pagination controls disabled in attendance
    When Admin clicks Attendance link on the navigation bar in attendance
    Then entries are less than 5 in data table pagination controls disabled in attendance