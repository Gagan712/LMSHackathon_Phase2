@StudentPage
Feature: StudentPage Verification


  Background: The Admin is logged in to LMS portal
    Given Admin is on Home page of lms portal
    When Admin enter valid username as "Ninja" and password "Automators"
    And Admin click on login button
    Then Admin redirected to Dashboard Page
    
	Scenario: Student_Validate the title of the page 
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see the Student details Page Title
	
	Scenario: Student_Validate response time from dashboard page to student page
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Maximum navigation  time in milliseconds, defaults to 30 seconds
	
	Scenario: Student_Validate the broken link
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_HTTP response >= 400. then the link is broken
	
	Scenario: Student_Verify LMS title 
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see LMS - Learning management system  as title 
	
	Scenario: Student_Verify the alignment of the Student detail title
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Student Detail title should be in centre of the page
	
	Scenario: Student_Validate drop down is present in the page
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_2 dropdowns should be present in the page
	
	Scenario: Student_Validate search bar in select student name drop down
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see search box inside the drop down 
	
	Scenario: Student_ Validate search bar in select batch id drop down
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see search box inside  batch id drop down 
	
	Scenario: Student_Validate text spelling student name
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see correct spelling select student name
	
	Scenario: Student_Validate text spelling select batch id
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see correct spelling select  batch id text
	
	Scenario: Student_Validate only numbers inside select batch id
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see only numbers inside batch id drop down
	
	Scenario: Student_Validate gray color in student name drop down
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see select student name in gray color
	
	Scenario: Student_Validate gray color in student name drop down
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see select batch ID in gray color
	
	Scenario: Student_ Validate first drop down label is select student name
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see select student name in first
	
	Scenario: Student_Validate second drop down label is select batch id
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should see select batch id in second
	
	Scenario: Student_Validate scroll down inside student name dropdown
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should able to scroll down to select the name
	
	Scenario: Student_ Validate scroll down inside batch id dropdown
	Given Student_Admin is on dashboard page after Login
	When Student_Admin clicks "Student" on the navigation bar
	Then Student_Admin should able to scroll down to select the batch id
	
	Scenario: Student_Validate select student name is fading
	Given Student_Admin is on student details page
	When Student_Admin select student name from the drop down 
	Then Student_Admin should not see select student name text 
	
	Scenario: Student_Validate select batch id  is fading
	Given Student_Admin is on student details page
	When Student_Admin select batch id from the drop down 
	Then Student_Admin shouldnt see select batch id text 
	
	Scenario: Student_Validate selecting only  student name  will not display any details
	Given Student_Admin is on student details page
	When Student_Admin selects only student name
	Then Student_Student details should not be displayed
	
	Scenario: Student_Validate selecting only  batch id  will not display any details
	Given Student_Admin is on student details page
	When Student_Admin selects only  batch id
	Then Student_Student details should not be displayed
	
	Scenario: Student_Validate selecting student name and batch id
	Given Student_Admin is on student details page
	When Student_Admin selects  student name and batch id
	Then Student_Particular student informations should be display
	
	Scenario: Student_Program link on navigation bar
	Given Student_Admin is on student details page
	When Student_Admin clicks on program link on student  page
	Then Student_Admin is redirected to Program page
	
	Scenario: Student_Batch link on navigation bar
	Given Student_Admin is on student details page
	When Student_Admin clicks on Batch link on student page
	Then Student_Admin is redirected to Batch page
	
	Scenario: Student_Class link on navigation bar
	Given Student_Admin is on student details page
	When Student_Admin clicks on Class link on student page
	Then Student_Admin is redirected to Class page
	
	Scenario: Student_User link on navigation bar
	Given Student_Admin is on student details page
	When Student_Admin clicks on User link on student page
	Then Student_Admin is redirected to User page
	
	Scenario: Student_Assignment link on navigation bar
	Given Student_Admin is on student details page
	When Student_Admin clicks on Assignment link on student page
	Then Student_Admin is redirected to Assignment page

	Scenario: Student_Attendance link on navigation bar
	Given Student_Admin is on student details page
	When Student_Admin clicks on Attendance link on student page
	Then Student_Admin is redirected to Attendance page
	
	Scenario: Student_Logout link on navigation bar
	Given Student_Admin is on student details page
	When Student_Admin clicks on Logout link on student page
	Then Student_Admin is redirected to Login page
	
	
	
	