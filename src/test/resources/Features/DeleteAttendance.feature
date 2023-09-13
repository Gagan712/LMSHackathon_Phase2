Feature: Delete Attendance Validation
 
Scenario: Verify Delete attendance alert
    Given Admin is on the manage attendance page
    When Admin clicks the delete button in data table row level
    Then Admin should see alert message

  Scenario: Verify  accept enabled in alert
    Given Admin is on the manage attendance page
    When Admin clicks the delete button in data table row level
    Then Alert should have a "yes" button to accept

  Scenario: Verify reject enabled in alert
    Given Admin is on the manage attendance page
    When Admin clicks the delete button in data table row level
    Then Alert should have a "No" button to reject

  Scenario: Validate accept in alert
    Given Admin is in delete alert after clicking on delete button
    When Admin clicks the yes button
    Then Success message and selected attendance details are deleted from the data table

  Scenario: Validate reject in alert
    Given Admin is in delete alert after clicking on delete button
    When Admin clicks the no button
    Then Redirected attendance page and selected attendance details are not deleted from the data table
 Scenario: Verify delete multiple class  button is enabled
    Given Admin is on the manage attendance page
    When Admin clicks single row level check box in the data table
    Then Admin should see delete icon below the header is enabled

  Scenario: verify tick mark is visible after clicking on check box for single data
    Given Admin is on the manage attendance page
    When Admin clicks single row level check box in the data table
    Then Admin should see tick mark in check box

  Scenario: verify admin able to click multiple check box
    Given Admin is on the manage attendance page
    When Admin clicks multiple row level check box in the data table
    Then Admin should see tick mark in check box  of the selected rows

  Scenario: Verify accept alert in delete multiple attendance by selecting single checkbox
    Given Admin is in delete alert after clicks delete button under header after selecting the check box
    When Admin clicks the yes button
    Then Success message and selected attendance details are deleted from the data table

  Scenario: Verify reject alert in delete multiple attendance by selecting single checkbox
    Given Admin is in delete alert after clicks delete button under header after selecting the check box
    When Admin clicks the no button
    Then Redirected attendance page and selected attendance details are not deleted from the data table

  Scenario: Verify accept alert in delete multiple attendance by selecting multiple checkbox
    Given Admin is in delete alert after clicks delete button under header after selecting multiple the check boxes
    When Admin clicks the yes button
    Then Success message and selected attendance details are deleted from the data table

  Scenario: Verify reject alert in delete multiple attendance by selecting multiple checkbox
    Given Admin is in delete alert after clicks delete button under header after selecting multiple the check boxes
    When Admin clicks the no button
    Then Redirected attendance page and selected attendance details are not deleted from the data table