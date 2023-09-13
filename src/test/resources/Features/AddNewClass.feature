Feature: Add New Class
Background: 
Given Admin is in class detail popup window


  Scenario: Validate all batch id is reflecting in the dropdown
    When Admin clicks Batch ID dropdown
    Then Batch ids in the drop down should match with Batch id manage batch page table
   
    
  Scenario: Validate admin able to add new class with valid data in mandatory fields
    When Admin enters all mandatory "<field>" values with valid "<data>" and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id) 
    Then Admin should see new class details is added in the data table
    
    Scenario: Validate admin able to add new class with invalid data in mandatory fields
    When Admin enters all mandatory "<field>" values with "<invaliddata>" and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id, )
    Then Error message should appear in alert


  Scenario: Validate admin able to add new class with valid data in all fields
    When Admin enters values in all fields with valid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)
    Then Admin should see new class details is added in the data table
    
   Scenario: Validate admin able to add new class with invalid data in optional fields
    When Admin enters with invalid data in optional fields and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then Error message should appear in alert

    Scenario: Validate admin able to add new class missing Batch Id
    When Admin enters data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id)
    Then Batch Id is missing
    
    Scenario: Validate admin able to add new class missing No of Class
    When Admin enters data missing value in No of class and clicks save button (Batch ID ,  Class Date, Staff Id, )
    Then No of classes is missing
    
    Scenario: Validate admin able to add new class missing Class Date
    When Admin enters data missing value in  class date and clicks save button (Batch ID , No of Classes, Staff Id, )
    Then class date is missing

    Scenario: Validate admin able to add new class missing staff id
    When Admin enters data missing value in staff id and clicks save button (Batch ID , No of Classes, Class Date )
    Then staff id is missing

    Scenario: Validate  admin able to add new class passing past date 
    When Admin enters passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then class cannot be  created for the passed date
    
    Scenario: Validate date picker
    When Admin clicks date from date picker
    Then selected date should be their in class date text box
 
  
 Scenario: validate date picker should be correct format
    When Admin clicks date from date picker
    Then selected date should be in  mm/dd/yyyy format

 Scenario: Validate right arrow in data picker to navigate to next month
    When Admin clicks right arrow in the date picker near month
    Then Next month calender should visible
    
   Scenario: Validate left arrow in data picker to navigate to previous month
    When Admin clicks left arrow in the date picker near month
    Then previous month calender should visible
    
   Scenario: Validate current date is highlighted in the date picker
    When Admin clicks date picker button
    Then Admin should see current date is highlighted in the date picker

   Scenario: Validate selected date is highlighted in the date picker
    When Admin clicks date picker button and selects future date
    Then Admin should see selected date is highlighted in the date picker

 Scenario: Validate cancel button function in class details popup window
    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on Manage Class page

     Scenario: Validate cancel button function in class details popup window with values in field
    When Admin clicks Cancel button entering values in the fields
    Then Admin should land on Manage Class Page and validate new class is not created in the data table
