Feature: Edit Class Validation
Background: 
Given Admin is in  Edit class detail popup window in edit class


  Scenario Outline: Validate admin able to update class with valid data in mandatory fields in edit class
    When Admin enters all mandatory "<field>" values with valid "<data>" and clicks the save button ( Batch ID , No of Classes, Class Date, Staff Id) in edit class
    Then Admin should see particular class details is updated in the data table in edit class
   Examples: 
   |testid|Sheetname|
   |1|Sheet1|
   |4|Sheet1|
   |10|Sheet1|
   |8|Sheet1|
   
    
  Scenario Outline: Validate admin able to  update class with invalid data in mandatory fields in edit class
    When Admin enters all mandatory "<field>" values with "<invalid data>" and clicks the save button ( Batch ID , No of Classes, Class Date, Staff Id, ) in edit class
    Then Error message should appear in the alert in edit class
     Examples:
    |testid|Sheetname|
   |3|Sheet1|
   |5|Sheet1|
   |11|Sheet1|
   |9|Sheet1|
    
    Scenario Outline: Validate admin able to  update class with valid data  in all fields in edit class
    When Admin enters values in all fields with the valid "<data>" and clicks of save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings) in edit class
    Then Admin should see particular class details is updated in the data table in edit class
      Examples:
   |testid|Sheetname|
   |1|Sheet1|
   |4|Sheet1|
   |10|Sheet1|
   |6|Sheet1|
   |8|Sheet1|
   |14|Sheet1|
   |15|Sheet1|
   |16|Sheet1|
   |17|Sheet1|

  Scenario Outline: Validate admin able to  update  class with invalid data  in optional fields in edit class
    When Admin enters with invalid data in the optional fields and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) in edit class
    Then Error message should appear in the alert in edit class
     Examples:
   |testid|Sheetname|
   |1|Sheet1|
   |4|Sheet1|
   |10|Sheet1|
   |6|Sheet1|
   |8|Sheet1|
   |14|Sheet1|
   |15|Sheet1|
   |16|Sheet1|
   |17|Sheet1|
    
   Scenario Outline: Validate admin able to update class missing Batch Id in edit class
    When Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id) in edit class
    Then Batch Id should be missing in edit class
 Examples:
    |testid|Sheetname|
    |4|Sheet1|
    |10|Sheet1|
   |8|Sheet1|

    Scenario Outline: Validate admin able to update  class missing No of Class in edit class
    When Admin enters data missing value in the No of class and clicks save button (Batch ID ,  Class Date, Staff Id, ) in edit class
    Then No of classes is of missing in edit class
    Examples:
    |testid|Sheetname|
    |1|Sheet1|
    |10|Sheet1|
   |8|Sheet1|
    
    Scenario Outline: Validate admin able to update class missing Class Date in edit class
    When Admin enters data missing value in  the class date and clicks save button (Batch ID , No of Classes, Staff Id, ) in edit class
    Then class date is of missing in edit class
      Examples:
  |testid|Sheetname|
    |1|Sheet1|
    |4|Sheet1|
   |8|Sheet1|
    
    Scenario Outline: Validate admin able to update class missing staff id in edit class
    When Admin enters data missing value in the staff id and clicks save button (Batch ID , No of Classes, Class Date ) in edit class
    Then staff id is of missing in edit class
      Examples:
   |testid|Sheetname|
    |1|Sheet1|
    |4|Sheet1|
    |10|Sheet1|

    Scenario Outline: Validate  admin able to update class passing past date in edit class
    When Admin enters the passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) in edit class
    Then class cannot be updated for passed date in edit class
      Examples:
      |testid|Sheetname|
    |1|Sheet1|
    |4|Sheet1|
    |11|Sheet1|
    |8|Sheet1|

    Scenario: Validate cancel button function in Edit class details popup window in edit class
    When Admin clicks the Cancel button without entering values in the fields in edit class
    Then Admin should land on the Manage Class page in edit class
  
    
      Scenario: Validate cancel button function in Edit class details popup window with values in field in edit class
    When Admin clicks the Cancel button entering values in the fields in edit class
    Then Admin should land on Manage Class Page and validate particular class details are not changed  in the data table in edit class
    
    
    