Feature: Manage Program Validation

  Background: The Admin is logged in to LMS portal
    Given Admin is on Home page of lms portal
    When Admin enter valid username as "Ninja" and password "Automators"
    And Admin click on login button
    Then Admin redirected to Dashboard Page

  Scenario: Validate landing in Program page
    Given Program_Admin is on dashboard page after Login
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see URL with "Manage Program"

  Scenario: Program Validate the heading
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see a heading with text "Manage Program" on the page

  Scenario: Validate the text and pagination icon below the data table
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see the text as "Showing x to y of z entries" along with Pagination icon below the table.

  Scenario: Validating the default state of Delete button
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see a Delete button on the top left hand side as Disabled

  Scenario: Validate Add New Program
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see a +A New Program button on the program page above the data table

  Scenario: Validate that number of records (rows of data in the table) displayed
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see the number of records (rows of data in the table) displayed on the page are 5

  Scenario: Verify data table on the Program page
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see the sort arrow icon beside to each column header except Edit and Delete

  Scenario: Verify Sort arrow icon on the data table
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see check box on the left side in all rows of the data table

  Scenario: Verify Sort arrow icon on the data table
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see data table on the Manage Program Page with following column headers (Program Name, Program Description, Program Status, Edit,Delete)

  Scenario: Verify Check box on the data table
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see check box on the left side in all rows of the data table

  Scenario: Verify Edit and Delete buttons
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see Any Edit and Delete buttons on each row of the data table

  #Feature:  Add New Program
  #Background: Admin is on dashboard page after Login and clicks Program on the navigation bar
  Scenario: Verify Search bar on the Program page
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see Search bar with text as "Search..."

  Scenario: Search Program By Name
    When Program_Admin clicks "Program" on the navigation bar
    Then Program_Admin should see the Programs displayed based on the Program Name

  Scenario: Search Program By Description
    When Program_Admin enters <Program description phrase> into search box
    Then Program_Admin should see the Programs displayed based on the Program Description

  Scenario: Search Program By Status
    When Program_Admin enters <Program description Status> into search box
    Then Program_Admin should see the Programs displayed based on the Program Status

  Scenario: Validating the Search with unrelated keyword
    When Program_Admin enters the keywords not present in the data table on the Search box
    Then Program_Admin should see zero entries on the data table

  Scenario: Validate Program Details Popup window
    When Program_Admin clicks <A New Program>button
    Then Program_Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close(X) Icon on the top right corner of the window

  Scenario: Validate input fields and their text boxes in Program details form
    When Program_Admin clicks <A New Program>button
    Then Program_Admin should see two radio button for Program Status

  Scenario: Validate radio button for Program Status
    When Program_Admin clicks <A New Program>button
    Then Program_Admin should see two radio button for Program Status

  #Feature: Edit Program Details
  #Background: Admin is on Manage Program Page after clicks Program on the navigation bar
  Scenario: Validate Edit feature
    #Given Given Program_ Admin is on Manage Program Page
    When Program_Admin clicks <Edit> button on the data table for any row
    Then Program_Admin should see a popup open for Program details to edit

  Scenario: Edit Program Name
    When Program_Admin edits the Name column and clicks save button
    Then Program_Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program

  Scenario: Edit Program description
    When Program_Admin edits the Description column and clicks save button
    Then Program_Admin gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program

  Scenario: Change Program Status
    When Program_Admin changes the Status and clicks save button
    Then Program_Admin gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program

  Scenario: Validate invalid values on the text column
    When Program_Admin enters only numbers or special char in name and desc column
    Then Program_Admin gets a Error message alert

  Scenario: Validate Cancel button on Edit popup
    When Program_Admin clicks <Cancel>button on edit popup
    Then Program_Admin can see the Program details popup disappears and can see nothing changed for particular program

  Scenario: Validate Save button on Edit popup
    When Program_Admin clicks <Save>button on edit popup
    Then Program_Admin gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program

  #Feature: Delete Program
  #Background: Admin is on dashboard page after Login and clicks Program on the navigation bar
  Scenario: Delete Feature
    When Program_Admin clicks <Delete> button on the data table for any row
    Then Program_Admin should see a alert open with heading "Confirm" along with  <YES> and <NO> button for deletion

  Scenario: Validate details for Confirm Deletion form
    When Program_Admin clicks <Delete> button on the data table for any row
    Then Program_Admin should see a message "Are you sure you want to delete <Program name>?"

  Scenario: Click Yes on deletion window
    When Program_Admin clicks <YES> button on the alert
    Then Program_Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table

  Scenario: Click No on deletion window
    When Program_Admin clicks <NO> button on the alert
    Then Program_Admin can see the deletion alert disappears without deleting

  Scenario: Validate Cancel/Close(X) icon on Confirm Deletion alert
    When Program_Admin clicks any checkbox in the data table
    Then Program_Admin should see common delete option enabled under header Manage Program

  Scenario: Validate multiple program deletion by selecting Single checkbox
    When Program_Admin clicks <YES> button on the alert
    Then Program_Admin should land on Manage Program page and can see the selected program is deleted from the data table

  Scenario: Validate multiple program deletion by selecting multiple check boxes
    When Program_Admin clicks <NO> button on the alert
    Then Program_Admin should land on Manage Program page and can see the selected programs are not deleted from the data table

  #Feature: Sorting(Data Ordering) Validation
  #Background: Admin is on Manage Program Page after clicks Program on the navigation bar
  Scenario: Validates Sorting(data ordering) on the Program Data table
    When Program_Admin clicks the sort icon of program name column
    Then Program_The data get sorted on the table based on the program name column values in descending order
    Given The data is in the ascending order on the table based on Program Name column
    When Program_Admin clicks the sort icon of program name column
    #Given Given Program_ Admin is on Manage Program page
    When Program_Admin clicks the sort icon of program Desc column
    Then Program_The data get sorted on the table based on the program description column values in ascending order
    When Program_Admin clicks the sort icon of program Desc column
    Then Program_The data get sorted on the table based on the program description column values in descending order
    #Given Given Program_ Admin is on Manage Program page
    When Program_Admin clicks the sort icon of program Desc column
    Then Program_The data get sorted on the table based on the program status column values in ascending order
    When Program_Admin clicks the sort icon of program Desc column
    Then Program_The data get sorted on the table based on the program status column values in descending order

  #Feature: Pagination
  Scenario: Verify Next page link
    When Program_Admin clicks Next page link on the program table
    Then Program_Admin should see the Pagination has "Next" link

  Scenario: Verify Next page link
    Given Program_Admin is on Manage Program page
    When Program_Admin clicks Last page link
    Then Program_Admin should see the last page record on the table with Next page link are disabled

  Scenario: Verify Next page link
    When Program_Admin clicks Last page link
    Then Program_Admin should see the last page record on the table with Next page link are disabled

  Scenario: Verify Next page link
    When Program_Admin clicks First page link
    Then Program_Admin should see the previous page record on the table with pagination has previous page link
    When Program_Admin clicks Start page link
    Then Program_Admin should see the very first page record on the table with Previous page link are disabled

  #Feature: Navigation Validation from Manage Program to other Pages
  Scenario: Admin is on dashboard page after Login and clicks Program on the navigation bar
    Given Program_Admin is on Manage Program page
    When Program_Admin clicks on Student link on Manage Program page
    Then Program_Admin is re-directed to Student page

  Scenario: Admin is on dashboard page after Login and clicks Program on the navigation bar
    Given Program_Admin is on Manage Program page
    When Program_Admin clicks on Batch link on Manage Program page
    Then Program_Admin is re-directed to Batch page

  Scenario: Admin is on dashboard page after Login and clicks Program on the navigation bar
    #Given Given Program_ Admin is on Manage Program page
    When Program_Admin clicks on Class link on Manage Program page
    Then Program_Admin is re-directed to Class page

  Scenario: Admin is on dashboard page after Login and clicks Program on the navigation bar
    #Given Given Program_ Admin is on Manage Program page
    When Program_Admin clicks on User link on Manage Program page
    Then Program_Admin is re-directed to User page

  Scenario: Admin is on dashboard page after Login and clicks Program on the navigation bar
    #Given Given Program_ Admin is on Manage Program page
    When Program_Admin clicks on Assignment link on Manage Program page
    Then Program_Admin is re-directed to Assignment page

  Scenario: Admin is on dashboard page after Login and clicks Program on the navigation bar
    #Given Given Program_ Admin is on Manage Program page
    When Program_Admin clicks on Attendance link on Manage Program page
    Then Program_Admin is re-directed to Attendance page

  Scenario: Admin is on dashboard page after Login and clicks Program on the navigation bar
    #Given Program_ Admin is on Manage Program page
    When Program_Admin clicks on Logout link on Manage Program page
    Then Program_Admin is re-directed to Login page
