@DashBoard
Feature: Dashboard Page

  Background: The Admin is logged in to LMS portal
    Given Admin is on Home page of lms portal
    When Admin enter valid username as "Ninja" and password "Automators"
    And Admin click on login button
    Then Admin redirected to Dashboard Page


  Scenario: Dashboard_ Verify after login admin lands on manage program as dashboard page
    Then Dashboard_Admin should see manage program as header

  Scenario: Dashboard_Verify the response time
    Then Dashboard_Maximum navigation time in milliseconds, defaults to 30 seconds

  Scenario: Dashboard_Verify broken link
    Then Dashboard_HTTP response >= 400. The link is broken

  Scenario: Dashboard_Verify LMS title
    Then Dashboard_Admin should see LMS -Learning management system  as title

  Scenario: Dashboard_Verify LMS title alignment
    Then Dashboard_LMS title should be on the top left corner of page

  Scenario: Dashboard_Validate navigation bar text
    Then Dashboard_Admin should see correct spelling in navigation bar text

  Scenario: Dashboard_Validate LMS title has correct spelling ang space
    Then Dashboard_Admin should see correct spelling and space in LMS title

  Scenario: Dashboard_Validate alignment for navigation bar
    Then Dashboard_Admin should see the navigation bar text on the top right side

  Scenario: Dashboard_Validate navigation bar order 1st Student
    Then Dashboard_Admin should see student in the 1st place

  Scenario: Dashboard_Validate navigation bar order 2nd Program
    Then Dashboard_Admin should see program in the 2nd place

  Scenario: Dashboard_Validate navigation bar order 3rd Batch
    Then Dashboard_Admin should see batch in the 3rd place

  Scenario: Dashboard_Validate navigation bar order 4th Class
    Then Dashboard_Admin should see class in the 4th place

  Scenario: Dashboard_Validate navigation bar order 5th User
    Then Dashboard_Admin should see user in the 5th place

  Scenario: Dashboard_Validate navigation bar order 6th Assignment
    Then Dashboard_Admin should see assignment in the 6th place

  Scenario: Dashboard_Validate navigation bar order 7th Attendance
    Then Dashboard_Admin should see attendance in the 7th place

  Scenario: Dashboard_Validate navigation bar order 8th Logout
    Then Dashboard_Admin should see logout in the 8th place

  Scenario: Dashboard_Verify Logout button function
    Given Dashboard_Admin is in dashboard page
    When Dashboard_Admin click Logout button on navigation bar
    Then Dashboard_Admin should land on login in page
