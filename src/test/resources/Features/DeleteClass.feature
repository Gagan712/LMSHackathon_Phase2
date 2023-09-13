Feature: Delete Class Validation

  Scenario: Verify Delete class alert in class
  Given Admin is in Manage class page in class
    When Admin clicks delete button in data table row level in class
    Then Admin should see alert in class


  Scenario: Verify  accept enabled in alert in class
    Given Admin is in Manage class page in class
    When Admin clicks delete button in data table row level in class
    Then Alert should have "yes" button to accept in class 

     Scenario: Verify reject enabled in alert in class
     Given Admin is in Manage class page in class
    When Admin clicks delete button in data table row level in class
    Then Alert should have "No" button to reject in class

  Scenario: Validate accept in alert in class
Given Admin is in delete alert in class
When Admin clicks yes button in class
Then Success message and validate particular class details are deleted from the data table in class


 Scenario: Validate reject in alert in class
Given Admin is in delete alert in class
When Admin clicks no button in class
Then Admin should land on manage class page and validate particular class details are not deleted from the data table in class

