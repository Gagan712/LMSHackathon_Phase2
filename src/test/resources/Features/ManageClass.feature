Feature: Manage Class 
Background: 
Given Admin is in  Edit class detail popup window


  Scenario Outline: Validate admin able to update class with valid data in mandatory fields
    When Admin enters all mandatory "<field>" values with valid "<data>" and clicks the save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then Admin should see particular class details is updated in the data table
   Examples: 
   |testid|Sheetname|
   |1|Sheet1|
   |4|Sheet1|
   |10|Sheet1|
   |8|Sheet1|
   
    
  Scenario Outline: Validate admin able to  update class with invalid data in mandatory fields
    When Admin enters all mandatory "<field>" values with "<invalid data>" and clicks the save button ( Batch ID , No of Classes, Class Date, Staff Id, )
    Then Error message should appear in the alert
     Examples:
    |testid|Sheetname|
   |3|Sheet1|
   |5|Sheet1|
   |11|Sheet1|
   |9|Sheet1|
    
    Scenario Outline: Validate admin able to  update class with valid data  in all fields
    When Admin enters values in all fields with the valid "<data>" and clicks of save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)
    Then Admin should see particular class details is updated in the data table
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

  Scenario Outline: Validate admin able to  update  class with invalid data  in optional fields
    When Admin enters with invalid data in the optional fields and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then Error message should appear in the alert
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
    
   Scenario Outline: Validate admin able to update class missing Batch Id
    When Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id)
    Then Batch Id should be missing
 Examples:
    |testid|Sheetname|
    |4|Sheet1|
    |10|Sheet1|
   |8|Sheet1|

    Scenario Outline: Validate admin able to update  class missing No of Class
    When Admin enters data missing value in the No of class and clicks save button (Batch ID ,  Class Date, Staff Id, )
    Then No of classes is of missing
    Examples:
    |testid|Sheetname|
    |1|Sheet1|
    |10|Sheet1|
   |8|Sheet1|
    
    Scenario Outline: Validate admin able to update class missing Class Date
    When Admin enters data missing value in  the class date and clicks save button (Batch ID , No of Classes, Staff Id, )
    Then class date is of missing
      Examples:
  |testid|Sheetname|
    |1|Sheet1|
    |4|Sheet1|
   |8|Sheet1|
    
    Scenario Outline: Validate admin able to update class missing staff id
    When Admin enters data missing value in the staff id and clicks save button (Batch ID , No of Classes, Class Date )
    Then staff id is of missing
      Examples:
   |testid|Sheetname|
    |1|Sheet1|
    |4|Sheet1|
    |10|Sheet1|

    Scenario Outline: Validate  admin able to update class passing past date
    When Admin enters the passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then class cannot be updated for passed date
      Examples:
      |testid|Sheetname|
    |1|Sheet1|
    |4|Sheet1|
    |11|Sheet1|
    |8|Sheet1|

    Scenario: Validate cancel button function in Edit class details popup window
    When Admin clicks the Cancel button without entering values in the fields
    Then Admin should land on the Manage Class page
  
    
      Scenario: Validate cancel button function in Edit class details popup window with values in field
    When Admin clicks the Cancel button entering values in the fields
    Then Admin should land on Manage Class Page and validate particular class details are not changed  in the data table
    
    
    
