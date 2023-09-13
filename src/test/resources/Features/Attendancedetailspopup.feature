Feature: Attendance details popup window verification

Scenario: Verify all label text
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see correct spellings in the label

Scenario: Verify dropdown box is present
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Admin Should see there are four dropdowns

Scenario: Verify close button in attendance details popup window
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see  close button on the attendance details popup window

Scenario: Verify the alignment of the close button
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Close button should on the top right corner

Scenario: Verify the text on first dropdown select a program name
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then First dropdown box "select a program name" text  should be present

Scenario: Verify the text on second dropdown select class  name
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Second dropdown box "select class name" text  should be present

Scenario: Verify the text on third dropdown select students
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Third dropdown box "select students" text  should be present

Scenario: Verify the text on fourth dropdown select attendance
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Fourth dropdown box "select attendance" text  should be present

Scenario: Verify all the text inside the dropdown box is gray color
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Admin  should text in gray color

Scenario: Verify save button is present
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see a save button in the class detail popup window

Scenario: Verify cancel button is present
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see a cancel button in the class detail popup window

Scenario: Verify order of the label in attendance details page
    Given Admin is on manage attendance page
    When Admin clicks + a new attendance button
    Then Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date.

Scenario: Validate all program name is reflecting in the dropdown
    Given Admin is in  attendance details popup window
    When Admin clicks  program name dropdown
    Then Program Name in the drop down should match with  program name in  manage program page table

Scenario: Validate all class name  is reflecting in the dropdown
    Given Admin is in  attendance details popup window
    When Admin clicks class name dropdown
    Then Class Name in the drop down should match with  class name in  manage class page table

Scenario: Validate attendance field dropdown all mandatory keywords
    Given Admin is in  attendance details popup window
    When Admin clicks attendance dropdown
    Then Attendance field should have keywords such as - present, absent, late, excused

Scenario: Verify spellings in the attendance field drop down
    Given Admin is in  attendance details popup window
    When Admin clicks attendance dropdown
    Then Admin should see correct spellings in dropdown text

Scenario: Validate date picker
    Given Admin is in  attendance details popup window
    When Admin clicks the date from date picker
    Then selected date should be there in class date text box

Scenario: validate date picker should be correct format
    Given Admin is in  attendance details popup window
    When Admin clicks the date from date picker
    Then The selected date should be in  mm/dd/yyyy format

Scenario: Validate right arrow in data picker to navigate to next month
    Given Admin is in  attendance details popup window
    When Admin clicks the right arrow in the date picker near month
    Then Next month calender should be visible

Scenario: Validate left arrow in data picker to navigate to previous month
    Given Admin is in  attendance details popup window
    When Admin clicks the left arrow in the date picker near month
    Then previous month calender should be visible

Scenario: Validate current date is highlighted in the date picker
    Given Admin is in  attendance details popup window
    When Admin clicks the date picker button
    Then Admin should see current date is highled in the date picker
Scenario: Validate selected date is highlighted in the date picker
    Given Admin is in  attendance details popup window
    When Admin clicks the date picker button and selects future date
    Then Admin should see selected date is highled in the date picker