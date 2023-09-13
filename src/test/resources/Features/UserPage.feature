@User
Feature: User page validation

  Background: 
    Given Logged on the LMS portal as admin

  #Feature: User page validation
  Scenario: Validate landing in User page
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Then User Admin should see the "Manage User" in the URL

  Scenario: Validate header in the User Page
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Then User Admin should see the "Manage User" in the header

  Scenario: Validate pagination in the User Page
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Then User Admin should see the pagination controls under the data table

  Scenario Outline: Validate data table headers in the User Page
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Then User Admin Should see the data table with "<headers>" Id, Name, location, Phone Number, Edit/Delete

    Examples: 
      | headers      |
      | Id           |
      | Name         |
      | location     |
      | Phone Number |
      | Edit         |
      | Delete       |

  Scenario: Validate Delete button in User Page
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Then User Admin should be able to see the Delete icon button that is disabled

  Scenario: Validate "+ A New user" button in User Page
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Then User Admin should be able to see the "+ A New User" button

  Scenario: Validate "+ Assign staff"  button in User page
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Then User Admin should be able to see the "+ Assign staff" button

  Scenario: Validate search box in User page
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Then User Admin should be able to see the search text box

  Scenario Outline: Validate data rows
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Then User Admin should see each row in the data table should have a "<option>"

    Examples: 
      | option      |
      | checkbox    |
      | edit icon   |
      | delete icon |

  Scenario: Validate pop up for adding user
    Given User Admin is on "dashboard" page after Login And User Admin clicks User from navigation bar
    When User Admin clicks + A New User button
    Then User Admin should see new pop up with User details appears

  #Feature: Add new user
  # Background:
  #  Given Logged on the LMS portal as admin
  Scenario: Check if Middle name, linkedIn url, email, user comments.under graduate,post graduate,time zone are optional
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    And User Admin clicks + A New User button
    When User Admin should see new pop up with User details appears
    When User Admin The pop up should include the fields First Name,Middle name, Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone and user comments as "text" box and User Role ,Role Status ,Visa Status as drop down "Select"

  Scenario Outline: Check with all possible scenarios of add User
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    And User Admin clicks + A New User button
    When User Admin should see new pop up with User details appears
    When User Admin fill in fields "<First Name>","<Last Name>","<Middle Name>","<Location>","<phone>","<linkedin Url>","<email>","<User Role>","<Role Status>","<Visa Status>","<Undergraduate>","<postgraduate>","<time zone>","<user comments>"
    Then User Admin should see the "<results>"

    Examples: 
      | First Name |  | Middle Name |  | Last Name |  | Location |  | phone |  | email         |  | linkedin Url     |  | User Role |  | Role Status |  | Visa Status |  | Undergraduate |  | postgraduate |  | time zone |  | user comments |  | Results    |
      | Numpy      |  | sdet        |  | Ninja     |  | Qwer     |  | 99999 |  | abc@gmail.com |  | www.linkedin.com |  | Lead      |  | Active      |  | H4          |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | User added |
      | Numpy      |  |             |  | Ninja     |  | Qwer     |  | 99999 |  |               |  |                  |  | Lead      |  | Active      |  | H4          |  |               |  |              |  |           |  |               |  | User added |
      | Numpy1     |  | sdet1       |  | Ninja1    |  | Qwer1    |  | 99999 |  | abc@gmailcom  |  | www.linkedincom  |  | Lead      |  | Active      |  | H4          |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | ERROR      |
      |            |  |             |  | Ninja     |  | Qwer     |  | 99999 |  |               |  |                  |  | Lead      |  | Active      |  | H4          |  |               |  |              |  |           |  |               |  | ERROR      |

  #Feature: Edit new user
  #Background:
  #Given Logged on the LMS portal
  # Given User Admin is on "dashboard" page after Login
  #When User Admin clicks "User" from navigation bar
  Scenario Outline: Validate row level edit icon
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    Given The edit icon on row level in data table is enabled
    When User Admin clicks the edit icon
    Then User Admin should see new pop up with User details appears
    

  Scenario Outline: Validate edit User
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    When User Admin clicks the edit icon
    When User Admin should see new pop up with User details appears
    When User Admin fill in fields "<First Name>","<Last Name>","<Middle Name>","<Location>","<phone>","<linkedin Url>","<email>","<User Role>","<Role Status>","<Visa Status>","<Undergraduate>","<postgraduate>","<time zone>","<user comments>"
    Then User Admin should see the "<results>"

    Examples: 
      | First Name |  | Middle Name |  | Last Name |  | Location |  | phone |  | email         |  | linkedin Url     |  | User Role |  | Role Status |  | Visa Status |  | Undergraduate |  | postgraduate |  | time zone |  | user comments |  | Results      |
      | Numpy      |  | sdet        |  | Ninja     |  | Qwer     |  | 99999 |  | abc@gmail.com |  | www.linkedin.com |  | Lead      |  | Active      |  | H4          |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | User updated |
      | Numpy      |  |             |  | Ninja     |  | Qwer     |  | 99999 |  |               |  |                  |  | Lead      |  | Active      |  | H4          |  |               |  |              |  |           |  |               |  | User updated |
      | Numpy 1    |  | sdet        |  | Ninja     |  | Qwer     |  | 99999 |  | abc@gmail.com |  | www.linkedin.com |  | Lead      |  | Active      |  | H4          |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | User updated |
      | Numpy1     |  | sdet1       |  |           |  |          |  |       |  | abc@gmailcom  |  | www.linkedincom  |  |           |  |             |  |             |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | ERROR        |
      |            |  |             |  | Ninja     |  | Qwer     |  | 99999 |  |               |  |                  |  | Lead      |  | Active      |  | H4          |  |               |  |              |  |           |  |               |  | ERROR        |

  #Feature: Delete  user
  #Background:
  #Given Logged on the LMS portal
  # Given User Admin is on "dashboard" page after Login
  #When User Admin clicks "User" from navigation bar
  Scenario: Validate row level delete icon
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    And A The delete icon on row level in data table is enabled
    When User Admin clicks the delete icon
    Then User Admin Alert appears with yes and No option

  Scenario: Validate accept alert
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    And User Admin clicks the delete icon
    When User Admin click yes option
    Then User Admin  "User deleted" alert pops and user is no more available in data table

  Scenario: Validate reject alert
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    And User Admin clicks the delete icon
    When User Admin click No option
    Then User Admin sees "User" is still listed in data table

  Scenario: Delete multiple user
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    And User Admin None of the checkboxes in data table are selected
    Then User Admin The delete icon under the Manage User header should be disabled

  Scenario: Check for single row delete
    Given Admin User One of the checkbox row is selected
    When User Admin Click delete icon below Manage User header
    Then User Admin The respective row in the data table is deleted

  Scenario: Check for multi row delete
    Given User Admin is on "dashboard" page after Login
    When User Admin clicks User from navigation bar
    And User admin Two or more checkboxes row is selected
    When User Admin Click delete icon below Manage User header
    Then User Admin The respective row in the data table is deleted
