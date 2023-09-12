Feature: Verify sort function in manage class page

  Background: 
    Given Logged on the LMS portal as admin

  Scenario: Verify sort function in data table for descending order
    Given Admin is on ManageClass page after clicking class button
    When Admin click on Batch id column header to sort
    Then Admin should see data table sorted in descending order

  Scenario: Verify sort function in data table for ascending order
    Given Admin is on ManageClass page after clicking class button
    When Admin double click on Batch id column header to sort
    Then Admin should see data table sorted in ascending  order

  Scenario: Verify sheet one is displayed on default in data table
    Given Admin is on ManageClass page after clicking class button
    Then Data table should display one page  when entries available

  Scenario: Verify sheet one is displayed on default in data table
    Given Admin is on ManageClass page after clicking class button
    Then Right arrow should be enabled in page one  when entries are more than "5" available

  Scenario: Verify sheet one is displayed on default in data table
    Given Admin is on ManageClass page after clicking class button
    Then Left arrow should be disabled in page one when entries are more than "5" available

  Scenario: Verify sheet one is displayed on default in data table
    Given Admin is on ManageClass page after clicking class button
    Then Right arrow should be enabled in page two when entries are more than "10" available

  Scenario: Verify sheet one is displayed on default in data table
    Given Admin is on ManageClass page after clicking class button
    Then Left arrow should be enabled in page two

  #Feature:Navigation function validation from manage class page to other pages
  Scenario: Verify admin is able to navigate from manage class to student page
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks " Student" button in the navigation bar
    Then Admin should able to land on "student" page

  Scenario: Verify admin is able to navigate from manage class to program page
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks " Program" button in the navigation bar
    Then Admin should able to land on "program" page

  Scenario: Verify admin is able to navigate from manage class to program page
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks "Batch" button in the navigation bar
    Then Admin should able to land on "batch" page

  Scenario: Verify admin is able to navigate from manage class to program page
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks "User" button in the navigation bar
    Then Admin should able to land on "User" page

  Scenario: Verify admin is able to navigate from manage class to assignment page
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks " Assignment" button in the navigation bar
    Then Admin should able to land on "Assignment" page

  Scenario: Verify admin is able to navigate from manage class to attendance page
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks " Attendance" button in the navigation bar
    Then Admin should able to land on "Attendance" page

  Scenario: Verify adminshould able to do logout function from manage class
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks "Logout" button in the navigation bar
    Then Admin should able to land on "Login" page

  #Feature:Delete multiple class validation
  Scenario: Verify delete multiple class  button is enabled
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks single  row level check box in the data table
    Then Admin should see delete icon below the header is enabled

  Scenario: verify tick mark is visible after clicking on check box
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks single  row level check box in the data table
    Then Admin should see tick mark in check box

  Scenario: verify admin able to click multiple check box
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks multiple row level check box in the data table
    Then Admin should see tick mark in check box  of the selected rows

  Scenario: Verify accept alert in delete multiple class function by selecting single checkbox
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks delete button under header after selecting the check box in the data table
    When Admin is in delete alert and clicks yes button
    Then Success message "Classes deleted" and validate particular class details are deleted from the data table

  Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks delete button under header after selecting the check box in the data table
    When Admin is in delete alert and clicks no button
    Then Admin should land on manage class page and validate particular "class" details are not deleted from the data table

  Scenario: Verify accept alert in delete multiple class function by selecting multiple checkbox
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks delete button under header after selecting the multiple check box in the data table
    And Admin is in delete alert and clicks yes button
    Then Admin should land on manage class page and validate particular "class" details are not deleted from the data table

  Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
    Given Admin is on ManageClass page after clicking class button
    When Admin clicks delete button under header after selecting the multiple check box in the data table
    And Admin is in delete alert and clicks no button
    Then Admin should land on manage class page and validate particular "class" details are not deleted from the data table
