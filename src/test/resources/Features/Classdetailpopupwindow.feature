Feature: Class detail pop up window verification
Background: 
Given Admin is on ManageClass page after clicking class button in class

 Scenario: Verify Edit class popup window
    When Admin clicks Edit button in data table in class 
    Then Edit popup window appears with heading "Class Details" and same values in fields in class

  Scenario Outline: Validate Search box function with existing batch id
    When Admin enters the "<batchid>" into search box in class  
    Then Displays entries with that "<batchId>" in class
    Examples:
    |testid|Sheetname|
    |1     |Sheet1   |
    |2     |Sheet1   |
    
  Scenario Outline: Validate Search box function with non-existing batch id
    When Admin enters invalid "<batchid"> which is not existing the table into search box in class  
    Then Displays empty details in the data table in class
     Examples:
    |testid|Sheetname|
    |3     |Sheet1   |
    
    Scenario Outline: Validate Search box function by entering existing class no
    When Admin enters the "<classno"> into the search box in class  
    Then Displays entries with that the "<class no>" in class
     Examples:
    |testid|Sheetname|
    |4     |Sheet1   |

  Scenario Outline: Validate Search box function by entering non-existing class no
    When Admin enters "<classno>" which is not existing the table into search box in class   
    Then Displays empty details in the data table in class
     Examples:
    |testid|Sheetname|
    |5     |Sheet1   |
    
   Scenario Outline: Validate Search box function by entering existing class topic
    When Admin enters a "<classtopic>" into search box in class  
    Then Displays entries with that of "<class topic>" in class
   Examples:
    |testid|Sheetname|
    |6     |Sheet1   |

    Scenario Outline: Validate Search box function by entering non-existing class topic
    When Admin enters "<classtopic>" which is not the existing the table into search box in class  
    Then Displays empty details in the data table in class
    Examples:
    |testid|Sheetname|
    |7     |Sheet1   |
    
    Scenario Outline: Validate Search box function by entering existing staff id
    When Admin enters "<staffid"> into of search box in class  
    Then Displays entries with that of the "<staff id>" in class
      Examples:
    |testid|Sheetname|
    |8     |Sheet1   |
    
    Scenario Outline: Validate Search box function by entering non-existing staff id
    When Admin enters "<staffid>" which is not existing the table into the search box in class 
    Then Displays empty details in the data table in class
       Examples:
    |testid|Sheetname|
    |9     |Sheet1   |

    Scenario Outline: Validate Search box function by entering existing class date
    When Admin enters "<classdate>" into of the the search box in class  
    Then Displays entries with that the of the "<class date>" in class
    Examples:
    |testid|Sheetname|
    |10     |Sheet1   |

    Scenario Outline: Validate Search box function by entering invalid class date
    When Admin enters invalid "<classdate"> into search box in class 
    Then Displays empty details in the data table in class
     Examples:
    |testid|Sheetname|
    |11     |Sheet1  |
    | 12     |Sheet1 |
    
    Scenario: Verify input fields in class details pop up window
    When Admin clicks +Add New Class button in class 
    Then Admin should see a popup  with  heading "class details" and all "<fields>" in class
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
    When Admin clicks +Add New Class button in class  
    Then Admin should see dropdown list for Batch ID in class

 Scenario: Verify drop down list for Staff Id  in class details popup window
    When Admin clicks +Add New Class button in class  
    Then Admin should see  dropdown list for Staff ID in class
    
   Scenario: Verify calendar icon in class date  in class details popup window
    When Admin clicks +Add New Class button in class  
    Then Admin should see  calendar icon for class date in class
    
   Scenario: Verify save button is present
    When Admin clicks +Add New Class button in class  
    Then Admin should see  save button in the class detail popup window in class

   Scenario: Verify cancel button is present
    When Admin clicks +Add New Class button in class  
    Then Admin should see  cancel button in the class detail popup window in class

 Scenario: Verify close button   in class details popup window
    When Admin clicks +Add New Class button in class  
    Then Admin should see  close button on the class details popup window in class


   
   
    
    
 