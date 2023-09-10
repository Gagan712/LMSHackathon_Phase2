@User
Feature: User page validation

  Background: 
    Given Logged on the LMS portal as admin

  #Feature: User page validation
  
  Scenario: Validate landing in User page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin should see the "Manage User" in the URL

  Scenario: Validate header in the User Page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin should see the "Manage User" in the header

  Scenario: Validate pagination in the User Page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin should see the pagination controls under the data table

  Scenario Outline: Validate data table headers in the User Page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin Should see the data table with "<headers>" Id, Name, location, Phone Number, Edit/Delete
    Examples:
    |headers|
    |Id|
    |Name|
    |location|
    |Phone Number|
    |Edit|
    |Delete|

    

  Scenario: Validate Delete button in User Page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin should be able to see the Delete icon button that is disabled

   

  Scenario: Validate "+ A New user" button in User Page
    Given Admin is on dashboard page after Login
   When Admin clicks User from navigation bar
    Then Admin should be able to see the + A New User button

    

  Scenario: Validate "+ Assign staff"  button in User page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin should be able to see the + Assign staff button

  

  Scenario: Validate search box in User page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin should be able to see the search text box

    

  Scenario Outline: Validate data rows
    Given Admin is on dashboard page after Login
   When Admin clicks User from navigation bar
    Then Admin should see each row in the data table should have a "<option>"

    Examples: 
      | option      |
      | checkbox    |
      | edit icon   |
      | delete icon |

  Scenario: Validate pop up for adding user
    Given Admin is on dashboard page after Login and Admin clicks "User" from navigation bar
    When Admin clicks + A New User button
    Then Admin should see new pop up with User details appears
