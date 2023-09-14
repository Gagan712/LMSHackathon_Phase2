Feature: Manage Attendance Page verification

  Background: The Admin is logged in to LMS portal
    Given Admin is on Home page of lms portal
    When Admin enter valid username as "Ninja" and password "Automators"
    And Admin click on login button
    Then Admin redirected to Dashboard Page

  Scenario: Attendance_ Validate the header of the page
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see the "Manage attendance" in header

  Scenario: Attendance_ Validate response time from dashboard page to attendance page
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Maximum navigation time in milliseconds, defaults to 30 seconds

  Scenario: Attendance_ Validate the broken link
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should recieve message for broken link as "404 page not found " on attendance page

  Scenario: Attendance_ Verify LMS title
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see "LMS -Learning management system"  as title

  Scenario: Attendance_ Verify the alignment of the Manage Attendance header
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Manage attendance header should be in left side of the page

  Scenario: Attendance_ Validate text in manage attendancepage
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see correct spelling for the all the fields

  Scenario: Attendance_ Verify delete icon below the header
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see disabled delete icon below the Manage Attendance

  Scenario: Attendance_ Verify search bar on the class page
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see search bar on the attendance page

  Scenario: Attendance_ Verify add new Attendance button  on Attendance page
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see +Add New Attendance button on the attendance page

  Scenario: Attendance_ Verify data table on the attendance page
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see data table on the Manage Attendance Page With following column headers.

  #(Check box symbol,Class ID, Student Id,Preasent, Edit /Delete)
  Scenario: Attendance_ Verify Edit icon in the data table
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Edit Icon in each row of data table only When entries are available

  Scenario: Attendance_ Verify Edit icon When no data in the table
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Edit Icon will not be present in data table

  Scenario: Attendance_ Verify delete icon in the data table
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Delete Icon in each row of data table only When entries are available

  Scenario: Attendance_ Verify delete icon  When Attendance_ no data in the table
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin cant see delete  Icon in data table

  Scenario: Attendance_ Verify sort icon in the data table
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see sort icon near the column headers except for Edit and Delete

  Scenario: Attendance_ Verify check box in the data table
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see check box in the all rows  of data table

  Scenario: Attendance_ Validate the number entries displaying
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Above the footer Admin should see the text as "Showing x to y of z entries" below the table.

  #x- starting record number on that page
  #y-ending record number on that page
  #z-Total number of records  Note: with or without entries"
  Scenario: Attendance_ Verify Pagination control below the data table
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see the pagination controls under the data table

  Scenario: Attendance_ Validate footer  text
    When Attendance_ Admin clicks Attendance link on the navigation bar
    Then Attendance_ Admin should see the text as " In total there are number of classes"

  # Attendance details popup window  verification
  #Add new Attendance
  Scenario: Attendance_ Validate admin able to create new attendance data
    Given Attendance_ Admin is in  attendance details popup window
    When Attendance_ Admin fills all the values and click save
    Then Attendance_ Admin should see success message in popup window

  #and sees new attendance details in manage attendance details DB
  Scenario: Attendance_ Validate admin able to create new attendance data without program name
    Given Attendance_ Admin is in  attendance details popup window
    When Attendance_ Admin fills values missing program name and click save
    Then Attendance_ Admin should see error message for missing program name "Program name is missing"

  Scenario: Attendance_ Validate admin able to create new attendance data without class name
    Given Attendance_ Admin is in  attendance details popup window
    When Attendance_ Admin fills values missing class name and click save
    Then Attendance_ Admin should see error message for missing class name "class name is missing"

  Scenario: Attendance_ Validate admin able to create new attendance data without student name
    Given Attendance_ Admin is in  attendance details popup window
    When Attendance_ Admin fills values missing student name and click save
    Then Attendance_ Admin should see error message for missing student name  "student name is missing"

  Scenario: Attendance_ Validate admin able to create new attendance data without attendances
    Given Attendance_ Admin is in  attendance details popup window
    When Attendance_ Admin fills values missing attendance and click save
    Then Attendance_ Admin should see error message for missing attendance "Attendance is missing"

  Scenario: Attendance_ Validate admin able to create new attendance data without attendance date
    Given Attendance_ Admin is in  attendance details popup window
    When Attendance_ Admin fills values missing attendance date  and click save
    Then Attendance_ Admin should see error message for missing Attendance date "Attendance Date is missing"

  Scenario: Attendance_ Validate admin able to create new attendance by selecting future date
    Given Attendance_ Admin is in  attendance details popup window
    When Attendance_ Admin fills values with future date  and click save
    Then Attendance_ Admin should see error message for missing future date "Invalidate attendance date"

  #Edit attendance
  Scenario: Attendance_ Validate admin able to update  attendance data
    Given Attendance_ Admin is in  attendance details popup window after clicking on edit button
    When Attendance_ Admin fills all the values and click save
    Then Attendance_ Admin should see success message in popup window

  #and sees new attendance details in manage attendance details DB
  Scenario: Attendance_ Validate admin able to update attendance data without program name
    Given Attendance_ Admin is in  attendance details popup window after clicking on edit button
    When Attendance_ Admin fills values missing program name and click save
    Then Attendance_ Admin should see error message for missing program name "Program name is missing"

  Scenario: Attendance_ Validate admin able to update attendance data without class name
    Given Attendance_ Admin is in  attendance details popup window after clicking on edit button
    When Attendance_ Admin fills values missing class name and click save
    Then Attendance_ Admin should see error message for missing class name "class name is missing"

  Scenario: Attendance_ Validate admin able to create new attendance data without student name
    Given Attendance_ Admin is in  attendance details popup window after clicking on edit button
    When Attendance_ Admin fills values missing student name and click save
    Then Attendance_ Admin should see error message for missing student name  "student name is missing"

  Scenario: Attendance_ Validate admin able to create new attendance data without attendances
    Given Attendance_ Admin is in  attendance details popup window after clicking on edit button
    When Attendance_ Admin fills values missing attendance and click save
    Then Attendance_ Admin should see error message for missing attendance "Attendance is missing"

  Scenario: Attendance_ Validate admin able to create new attendance data without attendance date
    Given Attendance_ Admin is in  attendance details popup window after clicking on edit button
    When Attendance_ Admin fills values missing attendance date  and click save
    Then Attendance_ Admin should see error message for missing Attendance date "Attendance Date is missing"

  Scenario: Attendance_ Validate admin able to create new attendance by selecting future date
    Given Attendance_ Admin is in  attendance details popup window after clicking on edit button
    When Attendance_ Admin fills values with future date  and click save
    Then Attendance_ Admin should see error message for missing future date "Invalidate attendance date"

  #Navigation function validation from manage attendance page to other pages
  Scenario: Attendance_ Verify admin is able to navigate from manage attendance to student page
    Given Attendance_ Admin is on manage attendance page
    When Attendance_ Admin clicks Student button in the navigation bar
    Then Attendance_ Admin should able to land on student page

  Scenario: Attendance_ Verify admin is able to navigate from manage attendance to program page
    Given Attendance_ Admin is on manage attendance page
    When Attendance_ Admin clicks Program button in the navigation bar
    Then Attendance_ Admin should able to land on program page

  Scenario: Attendance_ Verify admin is able to navigate from manage attendance to batch page
    Given Attendance_ Admin is on manage attendance page
    When Attendance_ Admin clicks Batch button in the navigation bar
    Then Attendance_ Admin should able to land on batch page

  Scenario: Attendance_ Verify admin is able to navigate from manage attendance to user page
    Given Attendance_ Admin is on manage attendance page
    When Attendance_ Admin clicks User button in the navigation bar
    Then Attendance_ Admin should able to land on user page

  Scenario: Attendance_ Verify admin is able to navigate from manage attendance to assignment page
    Given Attendance_ Admin is on manage attendance page
    When Attendance_ Admin clicks Assignment button in the navigation bar
    Then Attendance_ Admin should able to land on Assignment page

  Scenario: Attendance_ Verify admin is able to navigate from manage attendance to class page
    Given Attendance_ Admin is on manage attendance page
    When Attendance_ Admin clicks Class button in the navigation bar
    Then Attendance_ Admin should able to land on Class page

  Scenario: Attendance_ Verify adminshould able to do logout function from manage attendance
    Given Attendance_ Admin is on manage attendance page
    When Attendance_ Admin clicks Logout button in the navigation bar
    Then Attendance_ Admin should able to land on login page
