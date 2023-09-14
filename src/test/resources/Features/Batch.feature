Feature: Batch Page Validation

Background: The Admin is logged in to LMS portal
    Given Admin is on Home page of lms portal
    When Admin enter valid username as "Ninja" and password "Automators"
    And Admin click on login button
    Then Admin redirected to Dashboard Page

  Scenario: Validate landing in Batch page
    Given Batch_Admin is on dashboard page after Login
    When Batch_Admin clicks "Batch" from navigation bar
    Then Batch_Admin should see the "Manage Batch" in the URL

  Scenario: Validate Header landing in Batch page
    Given Batch_Admin is on dashboard page after Login
    When Batch_Admin clicks "Batch" from navigation bar
    Then Batch_Admin should see the pagination controls under the data table

  Scenario: Validate pagination in the Batch Page
    Given Batch_Admin is on dashboard page after Login
    When Batch_Admin clicks "Batch" from navigation bar
    Then Batch_Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete

  Scenario: Validate Delete button in Batch Page
    Given Batch_Admin is on dashboard page after Login
    When Batch_Admin clicks "Batch" from navigation bar
    Then Batch_Admin should be able to see the "Delete" icon button that is disabled

  Scenario: Validate "+ A New batch" in Batch Page
    Given Batch_Admin is on dashboard page after Login
    When Batch_Admin clicks "Batch" from navigation bar
    Then Batch_Admin should be able to see the "+ A New batch" button

  Scenario: Validate data rows
    Given Batch_Admin is on dashboard page after Login
    When Batch_Admin clicks "Batch" from navigation bar
    Then Batch_Admin Each row in the data table should have a checkbox

  Scenario: Validate data rows
    Given Batch_Admin is on dashboard page after Login
    When Batch_Admin clicks "Batch" from navigation bar
    Then Batch_Admin Each row in the data table should have a edit icon that is enabled

  Scenario: Validate data rows
    Given Batch_Admin is on dashboard page after Login
    When Batch_Admin clicks "Batch" from navigation bar
    Then Batch_Admin Each row in the data table should have a delete icon that is enabled

  Scenario: Validate pop up for adding batch
    Given Batch_Admin is on dashboard page after Login
    When Batch_Admin clicks "Batch" from navigation bar
    Then Batch_Admin A new pop up with Batch details appears

  #Feature: Add new Batch
  #Background: Logged on the LMS portalBatch_Admin is on dashboard page after LoginBatch_Admin clicks "Batch" from navigation bar
  #Batch_Admin clicks "+ A New Batch" button
  Scenario: Check if the fields exist in pop
    Given Batch_Admin A new pop up with Batch details appears
    When Batch_Admin Fill in all the fields except description with valid values and click save
  #  Then Batch_Admin The newly added batch should be present in the data table in Manage Batch page

  Scenario: Check if description is optional field
    Given Batch_Admin A new pop up with Batch details appears
    When Batch_Admin Fill in all the fields with valid values and click save
  #  Then Batch_Admin The newly added batch should be present in the data table in Manage Batch page

  Scenario: Check if the program details are added in data table
    Given Batch_Admin A new pop up with Batch details appears
    When Batch_Admin any of the fields have invalid values
    Then Batch_Admin Error message should appear

  Scenario: Check for error messages for invalid fields
    Given Batch_Admin A new pop up with Batch details appears
    When Batch_Admin Any of the mandatory fields are blank
    Then Batch_Admin Error message should appear

  #Feature: Delete Batch
  #Background: Logged on the LMS portalBatch_Admin is on dashboard page after Login
  #Batch_Admin clicks "Batch" from navigation bar
  Scenario: Validate row level delete icon
    Given Batch_Admin The delete icon on row level in data table is enabled
    When Batch_Admin clicks the delete icon
  #  Then Batch_Admin Alert appears with yes and No option

  Scenario: Validate accept  alert
    Given Batch_Admin clicks the delete icon
    When Batch_Admin You click yes option
 #   Then Batch_Admin Batch deleted alert pops and batch is no more available in data table

  Scenario: Validate reject alert
    Given Batch_Admin clicks the delete icon
    When Batch_Admin you click No option
  #  Then Batch_Admin Batch is still listed in data table

  #Feature: Delete Mulbple batches
  Scenario: Check for single row delete
    Given Batch_Admin None of the checkboxes in data table are selected
    Then Batch_Admin The delete icon under the "Manage Batch" header should be disabled

  Scenario: Check for single row delete
 #   Given Batch_Admin One of the checkbox/ row is selected
    When Batch_Admin Click delete icon below "Manage Batch" header
    Then Batch_Admin The respective row in the data table is deleted

  Scenario: Check for multi row delete
    Given Batch_Admin Two or more checkboxes/row is selected
    When Batch_Admin Click delete icon below "Manage Batch" header

  #Then The respective row in the data table is deleted
  #Feature: Edit batch
  Scenario: Validate row level edit icon
    Given The edit icon on row level in data table is enabled
    When Batch_Admin clicks the edit icon
    Then Batch_Admin A new pop up with Batch details appears

  Scenario: Check if the fields are updated
    Given Batch_Admin clicks the edit icon
    When Batch_Admin Update the fields with valid values and click save
    Then Batch_Admin The updated batch details should appear on the data table

  Scenario: Check if the update throws error with invalid valued
    #Given Batch_Admin clicks the edit icon
    #When Update the fields with invalid values and click save
    Then Batch_Admin Error message should appear
 
  Scenario: Check if you get error message when mandatory fields are erased
    #Given Batch_Admin clicks the edit icon
#    When Batch_Admin Erase data from mandatory field

  #Then Error message should appear
  Scenario: Check if description field is optional in update
    #Given Batch_Admin clicks the edit icon
 #   When Batch_Admin Erase data from description field
    Then Batch_Admin The updated batch details should appear on the data table
    
    
    
    
    
    
