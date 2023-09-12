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
      | headers      |
      | Id           |
      | Name         |
      | location     |
      | Phone Number |
      | Edit         |
      | Delete       |

  Scenario: Validate Delete button in User Page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin should be able to see the Delete icon button that is disabled

  Scenario: Validate "+ A New user" button in User Page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin should be able to see the "+ A New User" button

  Scenario: Validate "+ Assign staff"  button in User page
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Then Admin should be able to see the "+ Assign staff" button

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
    Given Admin is on dashboard page after Login and Admin clicks User from navigation bar
    When Admin clicks + A New User button
    Then Admin should see new pop up with User details appears
    
    
    
    
    #Feature: Add new user

 # Background: 
  #  Given Logged on the LMS portal as admin


Scenario: Check if Middle name, linkedIn url, email, user comments.under graduate,post graduate,time zone are optional
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    And Admin clicks + A New User button
    When Admin should see new pop up with User details appears
    When The pop up should include the fields First Name,Middle name, Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone and user comments as "text" box and User Role ,Role Status ,Visa Status as drop down "Select"




  Scenario Outline: Check with all possible scenarios of add User
    Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    And Admin clicks + A New User button
    When Admin should see new pop up with User details appears
    When Admin fill in fields "<First Name>","<Last Name>","<Middle Name>","<Location>","<phone>","<linkedin Url>","<email>","<User Role>","<Role Status>","<Visa Status>","<Undergraduate>","<postgraduate>","<time zone>","<user comments>"
    Then Admin should see the "<results>" 

    Examples: 
      | First Name |  | Middle Name |  | Last Name |  | Location |  | phone |  | email         |  | linkedin Url     |  | User Role |  | Role Status |  | Visa Status |  | Undergraduate |  | postgraduate |  | time zone |  | user comments |  | Results |
      | Numpy      |  | sdet        |  | Ninja     |  | Qwer     |  | 99999 |  | abc@gmail.com |  | www.linkedin.com |  | Lead      |  | Active      |  | H4          |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | User added  |
      | Numpy      |  |             |  | Ninja     |  | Qwer     |  | 99999 |  |               |  |                  |  | Lead      |  | Active      |  | H4          |  |               |  |              |  |           |  |               |  | User added  |
      | Numpy1     |  | sdet1       |  | Ninja1    |  | Qwer1    |  | 99999 |  | abc@gmailcom  |  | www.linkedincom  |  | Lead      |  | Active      |  | H4          |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | ERROR   |
      |            |  |             |  | Ninja     |  | Qwer     |  | 99999 |  |               |  |                  |  | Lead      |  | Active      |  | H4          |  |               |  |              |  |           |  |               |  | ERROR   |

      
      
       #Feature: Edit new user
  #Background:
  #Given Logged on the LMS portal
  # Given Admin is on dashboard page after Login
  #When Admin clicks "User" from navigation bar
  Scenario Outline: Validate row level edit icon
  
  Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    Given The edit icon on row level in data table is enabled
    When Admin clicks the edit icon
    Then A new pop up with User details appears
    
    
    Scenario Outline: Validate edit User
  
  Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
    When Admin clicks the edit icon
     When Admin should see new pop up with User details appears
    When Admin fill in fields "<First Name>","<Last Name>","<Middle Name>","<Location>","<phone>","<linkedin Url>","<email>","<User Role>","<Role Status>","<Visa Status>","<Undergraduate>","<postgraduate>","<time zone>","<user comments>"
    Then Admin should see the "<results>" 

    Examples: 
      | First Name |  | Middle Name |  | Last Name |  | Location |  | phone |  | email         |  | linkedin Url     |  | User Role |  | Role Status |  | Visa Status |  | Undergraduate |  | postgraduate |  | time zone |  | user comments |  | Results |
      | Numpy      |  | sdet        |  | Ninja     |  | Qwer     |  | 99999 |  | abc@gmail.com |  | www.linkedin.com |  | Lead      |  | Active      |  | H4          |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | User updated  |
      | Numpy      |  |             |  | Ninja     |  | Qwer     |  | 99999 |  |               |  |                  |  | Lead      |  | Active      |  | H4          |  |               |  |              |  |           |  |               |  | User updated  |
      | Numpy 1     |  | sdet        |  | Ninja     |  | Qwer     |  | 99999 |  | abc@gmail.com |  | www.linkedin.com |  | Lead      |  | Active      |  | H4          |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | User updated  |
      | Numpy1     |  | sdet1       |  |     |  |     |  |  |  | abc@gmailcom  |  | www.linkedincom  |  |       |  |       |  |           |  | b.tec         |  | MBA          |  | PST       |  | No Comments   |  | ERROR   |
      |            |  |             |  | Ninja     |  | Qwer     |  | 99999 |  |               |  |                  |  | Lead      |  | Active      |  | H4          |  |               |  |              |  |           |  |               |  | ERROR   |
    
    #Feature: Delete  user
  #Background:
  #Given Logged on the LMS portal
  # Given Admin is on dashboard page after Login
  #When Admin clicks "User" from navigation bar
  Scenario: Validate row level delete icon
  
  Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
  
   And  A The delete icon on row level in data table is enabled
    When Admin clicks the delete icon
    Then Alert appears with yes and No option

  Scenario: Validate accept alert
  Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
  
  
    And Admin clicks the delete icon
    When Admin click yes option
    Then User "User deleted" alert pops and user is no more available in data table

  Scenario: Validate reject alert
  Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
  
    And Admin clicks the delete icon
    When Admin click No option
    Then Admin sees "User" is still listed in data table

  Scenario: Delete multiple user
  Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
  
    And None of the checkboxes in data table are selected
    Then The delete icon under the Manage User header should be disabled

  Scenario: Check for single row delete
    Given One of the checkbox row is selected
    When Click delete icon below Manage User header
    Then The respective row in the data table is deleted

  Scenario: Check for multi row delete
  Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
  
    And Two or more checkboxes row is selected
    When Click delete icon below Manage User header
    Then The respective row in the data table is deleted
    
    

        
    
