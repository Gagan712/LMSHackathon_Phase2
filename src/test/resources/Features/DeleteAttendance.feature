Feature: Delete Attendance Validation
 
Scenario: Verify Delete attendance alert
    Given Admin is on the manage attendance page in attendance
    When Admin clicks the delete button in data table row level in attendance
    Then Admin should see alert message in attendance

  Scenario: Verify  accept enabled in alert
    Given Admin is on the manage attendance page in attendance
    When Admin clicks the delete button in data table row level in attendance
    Then Alert should have a "yes" button to accept in attendance

  Scenario: Verify reject enabled in alert
    Given Admin is on the manage attendance page in attendance
    When Admin clicks the delete button in data table row level in attendance
    Then Alert should have a "No" button to reject in attendance

  Scenario: Validate accept in alert
    Given Admin is in delete alert after clicking on delete button in attendance
    When Admin clicks the yes button in attendance
    Then Success message and selected attendance details are deleted from the data table in attendance

  Scenario: Validate reject in alert
    Given Admin is in delete alert after clicking on delete button in attendance
    When Admin clicks the no button in attendance
    Then Redirected attendance page and selected attendance details are not deleted from the data table in attendance
 Scenario: Verify delete multiple class  button is enabled 
    Given Admin is on the manage attendance page in attendance
    When Admin clicks single row level check box in the data table in attendance
    Then Admin should see delete icon below the header is enabled in attendance

  Scenario: verify tick mark is visible after clicking on check box for single data
    Given Admin is on the manage attendance page in attendance
    When Admin clicks single row level check box in the data table in attendance
    Then Admin should see tick mark in check box in attendance

  Scenario: verify admin able to click multiple check box
    Given Admin is on the manage attendance page in attendance
    When Admin clicks multiple row level check box in the data table in attendance
    Then Admin should see tick mark in check box  of the selected rows in attendance

  Scenario: Verify accept alert in delete multiple attendance by selecting single checkbox
    Given Admin is in delete alert after clicks delete button under header after selecting the check box in attendance
    When Admin clicks the yes button in attendance
    Then Success message and selected attendance details are deleted from the data table in attendance

  Scenario: Verify reject alert in delete multiple attendance by selecting single checkbox
    Given Admin is in delete alert after clicks delete button under header after selecting the check box in attendance
    When Admin clicks the no button in attendance
    Then Redirected attendance page and selected attendance details are not deleted from the data table in attendance

  Scenario: Verify accept alert in delete multiple attendance by selecting multiple checkbox
    Given Admin is in delete alert after clicks delete button under header after selecting multiple the check boxes in attendance
    When Admin clicks the yes button in attendance
    Then Success message and selected attendance details are deleted from the data table in attendance

  Scenario: Verify reject alert in delete multiple attendance by selecting multiple checkbox
    Given Admin is in delete alert after clicks delete button under header after selecting multiple the check boxes in attendance
    When Admin clicks the no button in attendance
    Then Redirected attendance page and selected attendance details are not deleted from the data table in attendance