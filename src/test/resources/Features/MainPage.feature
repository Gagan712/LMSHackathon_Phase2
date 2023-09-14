Feature: Home Page Verification

  Background: The Admin is logged in to LMS portal
    Given Admin is on Home page of lms portal
    When Admin enter valid username as "Ninja" and password "Automators"
    And Admin click on login button
    Then Admin redirected to Dashboard Page
    
  Scenario: MainPage_Verify Admin is on Home Page
    When MainPage_ Admin gives the correct LMS portal URL
    Then MainPage_ Admin should land on the home page

  Scenario: MainPage_Verify the invalid URL of Home Page
    When MainPage_ Admin gives the invalid LMS portal URL
    Then MainPage_ Admin should recieve message as "404 page not found error"

  Scenario: MainPage_Verify for broken link
    When MainPage_ Admin gives the correct LMS portal URL
    Then MainPage_ Admin should recieve message for broken link as "404 page not found "

  Scenario: MainPage_Verify the text spelling in the Home Page
    When MainPage_ Admin gives the correct LMS portal URL
    Then MainPage_ Admin should see each field with correct spelling as " LEARNING MANAGEMENT SYSTEM "

  Scenario: MainPage_Verify the logo of LMS
    When MainPage_ Admin gives the correct LMS portal URL
    Then MainPage_ Admin see correct logo of the LMS as "LMS"

  Scenario: MainPage_Verify the alignment of LMS logo
    When MainPage_ Admin gives the correct LMS portal URL
    Then MainPage_ Admin should see logo is properly aligned

  Scenario: MainPage_Verify the presence of login button
    When MainPage_ Admin gives the correct LMS portal URL
    Then MainPage_ Admin should see login button

  Scenario: MainPage_Verify login button is clickable
    When MainPage_ Admin gives the correct LMS portal URL
    Then MainPage_ Admin should able to click the Login button

  #Feature : Login page verification
  Scenario: MainPage_Verify the login page
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should land on the login page

  Scenario: MainPage_Verify for broken link
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should recieve message for broken link as "404 page not found " on login page

  Scenario: MainPage_Verify the header of the login page
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see "Please login to LMS application" in the header

  Scenario: MainPage_Verify the text spelling in login page
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see correct spellings in all fields

  Scenario: MainPage_Verify text field is present
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see two text field

  Scenario: MainPage_Verify text on the first text field
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should "user*" in the first text field

  Scenario: MainPage_Verify text on the second text field
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should "password*" in the second text field

  Scenario: MainPage_Verify the alignment input field for the login
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see input field on the centre of the page

  Scenario: MainPage_verify Login is present
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see login button

  Scenario: MainPage_Verify the alignment of the login button
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see login button on the centre of the page

  Scenario: MainPage_Verify forgot username or password link
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see forgot username or password link

  Scenario: MainPage_Verify for the Reset password link
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see reset password link

  Scenario: MainPage_Verify input descriptive test in user field
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see user in gray color

  Scenario: MainPage_Verify input descriptive test in password field
    Given MainPage_ Admin is in home page
    When MainPage_ Admin clicks Login button
    Then MainPage_ Admin should see password in gray color

  Scenario: MainPage_Validate login with valid credentials
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks login button after entering Username as "Ninja" and Password as "Automators"
    Then MainPage_ Admin see header text as "Manage Program"

  Scenario Outline: To verify Login Page with invalid credentials
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin enter "<username>" and "<password>"
    Then MainPage_ Admin clicks login button and verify the "<message>"

    Examples: 
      | username  | password    | message                        |
      | Ninjas123 | Automate123 | please check username/password |
      | Ninja     | Automate123 | please check password          |
      | Ninjas123 | Automators  | please check username          |
      |           | Automators  | please check username/password |
      | Ninja     |             | please check username/password |
      |           |             | please check username/password |

  Scenario Outline: To verify Login Page with invalid credentials using Excel sheet
    Given MainPage_ Admin is on login page after clicking login button in homepage
    Then MainPage_ Admin enter the sheetname "<sheetname>" and row number <rownum> click login and verify "<message>" through excel sheet

    Examples: 
      | sheetname | rownum |
      | LMSLogin  |      0 |
      | LMSLogin  |      1 |
      | LMSLogin  |      2 |
      | LMSLogin  |      3 |
      | LMSLogin  |      4 |
      | LMSLogin  |      5 |

  Scenario: MainPage_verify login button action through keyboard
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin enter valid credentials  and clicks login button through keyboard
    Then MainPage_ Admin should land on dashboard page

  Scenario: MainPage_verify login button action through mouse
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin enter valid credentials  and clicks login button through mouse
    Then MainPage_ Admin should land on dashboard page

  # Feature: Forgot Username/Password
  Scenario: MainPage_Verify forgot username or password link
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks forgot username or password link
    Then MainPage_ Admin should land on forgot username or password page

  Scenario: MainPage_verify broken link
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks forgot username or password link
    Then MainPage_ Admin should recieve message for broken link as "404 page not found " on forgot username or password Page

  Scenario: MainPage_verify input descriptive text for Email
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks forgot username or password link
    Then MainPage_ Admin should see Email text in gray color

  Scenario: MainPage_Verify email text in text field
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks forgot username or password link
    Then MainPage_ Admin should see "Email" in text field

  Scenario: MainPage_Verify send link button is present
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks forgot username or password link
    Then MainPage_ Admin should see "send Link"  button

  Scenario: MainPage_Verify text spelling
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks forgot username or password link
    Then MainPage_ Admin should see correct spellings in all fields on forgot username or password page

  Scenario: MainPage_Verify the alignment of the send link button
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks forgot username or password link
    Then MainPage_ Admin should see send link button in center of the page

  Scenario: MainPage_Validate email sent for forgot password
    Given MainPage_ Admin is on forgot username and password page
    When MainPage_ Admin enters valid email id and clicks send link button
    Then MainPage_ Admin should receive link in mail for reset username or password

  Scenario: MainPage_Validate email sent for forgot password with invalid email if
    Given MainPage_ Admin is on forgot username and password page
    When MainPage_ Admin enters invalid email id and clicks send link button
    Then MainPage_ Admin should not receive link in mail for reset username or password

  #Feature Reset Password
  Scenario: MainPage_Verify  reset password link
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks reset password link
    Then MainPage_ Admin should land on reset password page

  Scenario: MainPage_Verify  text in the page
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks reset password link
    Then MainPage_ Admin should see correct spellings in all fields on reset password page

  Scenario: MainPage_Verify submit button is present
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks reset password link
    Then MainPage_ Admin should see "submit"  button

  Scenario: MainPage_Verify the alignment of the  submit button
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks reset password link
    Then MainPage_ Admin should see submit button in center of the page

  Scenario: MainPage_Verify text box is present is the page
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks reset password link
    Then MainPage_ Admin should see two text box

  Scenario: MainPage_Verify first label text
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks reset password link
    Then MainPage_ Admin should see "Type in new password" in the first label text

  Scenario: MainPage_Verify second label text
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks reset password link
    Then MainPage_ Admin should see "Retype password" in the second label text

  Scenario: MainPage_verify text box is in disabled
    Given MainPage_ Admin is on login page after clicking login button in homepage
    When MainPage_ Admin clicks reset password link
    Then MainPage_ Admin should see text box in disabled state

  Scenario: MainPage_verify text box is in enabled in new password field
    Given MainPage_ Admin is on reset password page
    When MainPage_ Admin clicks on type in new password field
    Then MainPage_ Admin should see text box is enabled state

  Scenario: MainPage_verify text box is in enabled in retype password field
    Given MainPage_ Admin is on reset password page
    When MainPage_ Admin clicks on retype password field
    Then MainPage_ Admin should see text box is enabled state

  Scenario: MainPage_Validate reset password with valid details
    Given MainPage_ Admin is on reset password page
    When MainPage_ Admin enters same password on both field and clicks submit button
    Then MainPage_ Admin should recieve  : "Your password has been reset". Please click here to login

  Scenario Outline: To verify Reset Password with invalid credentials
    Given MainPage_ Admin is on reset password page
    When MainPage_ Admin enter new password as "<newPassword>" and retype password as "<Re-typePassword>"
    Then MainPage_ Admin clicks Submit button and verify the "<message>"

    Examples: 
      | username | password    | message         |
      | Automate | Automate123 | Please try agin |
      |          |             | Please try agin |
      | Automate |             | Please try agin |
      |          | Automate    | Please try agin |
