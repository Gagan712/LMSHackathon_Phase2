Feature: Manage Class Page Verification
Background: 
Given Admin is on dashboard page after login in class

Scenario: Verify Admin landing in class page
When Admin clicks "Class" button on the navigation bar in class
Then Admin should see URL with "Manage Class" in class

Scenario: Verify Admin capture response time to navigate to manage class page
When Admin clicks "Class" button on the navigation bar in class
Then Get the response time for navigation from dashboard page to manage class page in class
    
Scenario: Verify for broken link
When Admin gives the correct LMS portal URL in class
Then Admin should recieve message as " HTTP response as >=400.The link is broken" in class

Scenario: Verify Manage Class page header
When Admin clicks "Class" button on the navigation bar in class
Then Admin should see header with "Manage Class" in class

Scenario Outline: Verify the text spelling in the Manage Class Page
When Admin clicks "Class" button on the navigation bar in class 
Then Admin should see all the "<field>" and the correct spelling in class 

    Examples: 
      | field |     
      | BatchId|
      | Class No|
      | Class Date|
      | Class Topic|
      | Staff Id|
      | Description|
      | Comments|
      | Notes|
      | Recording|
       | Edit|
        | Delete|

Scenario: Verify delete icon below the header
When Admin clicks "Class" button on the navigation bar in class
Then Admin should see disabled delete icon below the "Manage Class" in class

Scenario: Verify search bar on class page
 When Admin clicks "Class" button on the navigation bar in class
 Then Admin should see search bar on the class page in class

Scenario: Verify add new class button on class page 
When Admin clicks "Class" button on the navigation bar in class
Then Admin should see +Add New Class button on the class page in class

    
Scenario: Verify Edit icon in data table 
When Admin clicks "Class" button on the navigation bar in class
Then Edit Icon in each row of data table only  when entries are available in class
    
Scenario: Verify Edit icon when no data in table 
When Admin clicks "Class" button on the navigation bar in class
Then Edit Icon will not be present in data table in class
    
Scenario: Verify Delete icon in data table 
When Admin clicks "Class" button on the navigation bar in class
Then Delete Icon in each row of data table only when entries are available in class
    
Scenario: Verify Delete icon when no data in table 
When Admin clicks "Class" button on the navigation bar in class
Then Admin cant see delete Icon in data table in class
    
Scenario: Verify Sort icon in data table 
When Admin clicks "Class" button on the navigation bar in class
Then Admin should see sort icon near the column headers except for Edit and Delete in class
    
Scenario: Verify check box in data table 
When Admin clicks "Class" button on the navigation bar in class
Then Admin should see check box in the all rows  of data table in class 
    
Scenario: Validate number of entries displayed
When Admin clicks "Class" button on the navigation bar in class
Then Admin should see the text as "Showing x to y of z entries" below the table above the footer in class
    
Scenario: Validate pagination control below data table
When Admin clicks "Class" button on the navigation bar in class
Then Admin should see the pagination controls under the data table in class
    
Scenario: Validate footer text
 When Admin clicks "Class" button on the navigation bar in class
 Then Admin should see the text with total number classes in the data table "In total there are number of classes" in class
 
 
    