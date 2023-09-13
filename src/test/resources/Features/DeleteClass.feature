Feature: Delete Class Validation

  Scenario: Verify Delete class alert
  Given Admin is in Manage class page
    When Admin clicks delete button in data table row level
    Then Admin should see alert


  Scenario: Verify  accept enabled in alert
    Given Admin is in Manage class page
    When Admin clicks delete button in data table row level
    Then Alert should have "yes" button to accept 

     Scenario: Verify reject enabled in alert
     Given Admin is in Manage class page
    When Admin clicks delete button in data table row level
    Then Alert should have "No" button to reject

  Scenario: Validate accept in alert
Given Admin is in delete alert
When Admin clicks yes button
Then Success message and validate particular class details are deleted from the data table


 Scenario: Validate reject in alert
Given Admin is in delete alert
When Admin clicks no button
Then Admin should land on manage class page and validate particular class details are not deleted from the data table

