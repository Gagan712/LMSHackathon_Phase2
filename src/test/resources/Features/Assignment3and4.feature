Feature: Add new assignment

  Background: 
    Given Logged on the LMS portal as admin

  Scenario: Validate admin able to add new assignment with valid data in mandatory fields
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters all mandatory field values with valid data and clicks save button ( Program name, batch number,Assignment Name, grade by, Assignment due date)
    Then Admin should see new assignment details is added in the data table


  Scenario: Validate admin able to add new assignment with invalid data in mandatory fields
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters all mandatory field values with invalid data and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment due date )
    Then Error message should appear in alert


  Scenario: Validate admin able to add new assignment with valid data  in all fields
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters values in all fields with valid data and clicks save button (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see new assignment details is added in the data table


  Scenario: Validate admin able to add new assignment with invalid data  in optional fields
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters with invalid data in optional fields and clicks save button (Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see Error message should appear in alert


  
  Scenario: Validate admin able to add new assignment missing due date
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters  data missing value in program name and clicks save button (batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see Program Name is missing

  Scenario: Validate admin able to add new assignment missing grade by
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters data missing value in Batch number and clicks save button (Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see Batch number is missing

  Scenario: Validate  admin able to add new assignment passing past date
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters data missing value in Assignment name and clicks save button (Program name, batch number,Assignment Name,  grade by, Assignment Due date )
    Then Admin should see Assignment name is missing


  Scenario: Validate date picker
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters data missing value in Assignment due date and clicks save button ( Program name, batch number,Assignment Name, grade by)
    Then Admin should see Assignment due date is missing


 
  Scenario: Validate right arrow in data picker to navigate to next month
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters data missing value in grade by  and clicks save button (Program name, batch number,Assignment Name, Assignment due date)
    Then Admin should see Grade by is missing
    
 Scenario: validate date picker should be correct format
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin enters passed date in the due date field and clicks save button ( Program name, batch number,Assignment Name,  grade by, Assignment Due date )
    Then Admin should see Assignment cannot be created for the passed date

  Scenario: Validate current date is highlighted in the date picker
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin clicks date from date picker
    Then Admin should see selected date should be their in class date text box


Scenario: Validate left arrow in data picker to navigate to previous month
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin clicks date from date picker
     Then Admin should see selected date should be in  mm/dd/yyyy format

  Scenario: Validate selected date is highlighted in the date picker
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin clicks right arrow in the date picker near month
    Then Admin should see Next month calender should visible


Scenario: Validate admin able to add new assignment missing program name
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin clicks left arrow in the date picker near month
    Then Admin should see previous month calender should visible


  Scenario: Validate admin able to add new assignment missing batch number
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin clicks date picker button
    Then Admin should see current date is highled in the date picker


  Scenario: Validate admin able to add new assignment missing assignment name
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin clicks date picker button and selects future date
    Then Admin should see selected date is highled in the date picker



  Scenario: Validate cancel button function in assignment details popup window
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on manage assignment page
	

  Scenario: Validate cancel button function in assignment details popup window with values in field
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on +Add new Assignment button
    When Admin clicks Cancel button entering values in the fields
    Then Admin should land on manage assignment Page and validate new assignment is not created in the data table



#Feature: Edit new assignment

  Scenario: Verify Edit assignment popup window
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin clicks Edit button in data table 
    Then Edit popup window appears with heading Assignment Details

Scenario: Verify values in popup window
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin clicks Edit button from one of the row in data table 
    Then Edit popup window appears with heading Assignment Details


Scenario: Validate admin is able to update assigment with valid data in mandatory fields
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin enters all mandatory field values with valid data and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment due date )
    Then Admin should see updated assignment details is added in the data table


Scenario: Validate admin is able to update assigment with invalid data in mandatory fields
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin enters all mandatory field values with invalid data and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment due date )
    Then Error message should appear in alert

    Scenario: Validate admin is able to update assigment with valid data  in all fields
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin enters values in all fields with valid data and clicks save button (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see updated assignment details is edited in the data table



  Scenario: Validate admin is able to update assigment with invalid data  in optional fields
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin enters with invalid data in optional fields and clicks save button (Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see Error message should appear in alert


  
  Scenario: Validate admin is able to update assigment missing Program name
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin enters  data missing value in program name and clicks save button (batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see Program Name is missing

  Scenario: Validate admin is able to update assigment missing Batch number
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin enters data missing value in Batch number and clicks save button (Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see Batch number is missing

  Scenario: Validate  admin is able to update assigment missing assignment name
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin enters data missing value in Assignment name and clicks save button (Program name, batch number,Assignment Name,  grade by, Assignment Due date )
    Then Admin should see Assignment name is missing


Scenario: Validate  admin is able to update assigment missing grade by
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin enters data missing value in Assignment due date and clicks save button ( Program name, batch number,Assignment Name, grade by)
    Then Admin should see Grade by is missing

Scenario: Validate  admin able to update assignment passing past date 
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin enters passed date in the due date field and clicks save button ( Program name, batch number,Assignment Name,  grade by, Assignment Due date )
    Then Assignment cannot be updated for the passed date

  Scenario: Validate cancel button function in assignment details popup window
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on manage assignment page


Scenario: Validate cancel button function in assignment details popup window with values in field
    Given Admin is on Manage assignment page after clicking assignment button
    When Admin click on edit Assignment button
    When Admin clicks Cancel button entering values in the fields
    Then Admin should land on manage assignment Page and validate new assignment is not created in the data table


 
  