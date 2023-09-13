Feature: Class detail pop up window verification
Background: 
Given Admin is on ManageClass page after clicking class button

 Scenario: Verify Edit class popup window
    When Admin clicks Edit button in data table 
    Then Edit popup window appears with heading "Class Details" and same values in fields

  Scenario Outline: Validate Search box function with existing batch id
    When Admin enters the "<batchid>" into search box  
    Then Displays entries with that "<batchId>"
    Examples:
    |testid|Sheetname|
    |1     |Sheet1   |
    |2     |Sheet1   |
    
  Scenario Outline: Validate Search box function with non-existing batch id
    When Admin enters invalid "<batchid"> which is not existing the table into search box  
    Then Displays empty details in the data table
     Examples:
    |testid|Sheetname|
    |3     |Sheet1   |
    
    Scenario Outline: Validate Search box function by entering existing class no
    When Admin enters the "<classno"> into the search box  
    Then Displays entries with that the "<class no>"
     Examples:
    |testid|Sheetname|
    |4     |Sheet1   |

  Scenario Outline: Validate Search box function by entering non-existing class no
    When Admin enters "<classno>" which is not existing the table into search box   
    Then Displays empty details in the data table
     Examples:
    |testid|Sheetname|
    |5     |Sheet1   |
    
   Scenario Outline: Validate Search box function by entering existing class topic
    When Admin enters a "<classtopic>" into search box  
    Then Displays entries with that of "<class topic>"
   Examples:
    |testid|Sheetname|
    |6     |Sheet1   |

    Scenario Outline: Validate Search box function by entering non-existing class topic
    When Admin enters "<classtopic>" which is not the existing the table into search box  
    Then Displays empty details in the data table
    Examples:
    |testid|Sheetname|
    |7     |Sheet1   |
    
    Scenario Outline: Validate Search box function by entering existing staff id
    When Admin enters "<staffid"> into of search box  
    Then Displays entries with that of the "<staff id>"
      Examples:
    |testid|Sheetname|
    |8     |Sheet1   |
    
    Scenario Outline: Validate Search box function by entering non-existing staff id
    When Admin enters "<staffid>" which is not existing the table into the search box  
    Then Displays empty details in the data table
       Examples:
    |testid|Sheetname|
    |9     |Sheet1   |

    Scenario Outline: Validate Search box function by entering existing class date
    When Admin enters "<classdate>" into of the the search box  
    Then Displays entries with that the of the "<class date>"
    Examples:
    |testid|Sheetname|
    |10     |Sheet1   |

    Scenario Outline: Validate Search box function by entering invalid class date
    When Admin enters invalid "<classdate"> into search box  
    Then Displays empty details in the data table
     Examples:
    |testid|Sheetname|
    |11     |Sheet1  |
    | 12     |Sheet1 |
    
    Scenario: Verify input fields in class details pop up window
    When Admin clicks +Add New Class button 
    Then Admin should see a popup  with  heading "class details" and all "<fields>"
   |fields|
   |Batch ID|
   |No of Classes|
   |Class Date|
   |Class Topic|
   |Staff Id|
   |Class description|
   |Comments|
   |Notes|
   |Recordings|
  
 Scenario: Verify drop down list for Batch Id  in class details popup window
    When Admin clicks +Add New Class button  
    Then Admin should see dropdown list for Batch ID

 Scenario: Verify drop down list for Staff Id  in class details popup window
    When Admin clicks +Add New Class button  
    Then Admin should see  dropdown list for Staff ID
    
   Scenario: Verify calendar icon in class date  in class details popup window
    When Admin clicks +Add New Class button  
    Then Admin should see  calendar icon for class date
    
   Scenario: Verify save button is present
    When Admin clicks +Add New Class button  
    Then Admin should see  save button in the class detail popup window

   Scenario: Verify cancel button is present
    When Admin clicks +Add New Class button  
    Then Admin should see  cancel button in the class detail popup window

 Scenario: Verify close button   in class details popup window
    When Admin clicks +Add New Class button  
    Then Admin should see  close button on the class details popup window


   
   
    
    
 