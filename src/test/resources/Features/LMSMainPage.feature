Feature: Home Page Verification

  Scenario: Verify Admin is on Home Page
    When Admin gives the correct LMS portal URL
    Then Admin should land on the home page

  Scenario: Verify the invalid URL of Home Page
    When Admin gives the invalid LMS portal URL
    Then Admin should recieve message as "404 page not found error"

  Scenario: Verify for broken link
    When Admin gives the correct LMS portal URL
    Then Admin should recieve message as " HTTP response as >=400.The link is broken"

  Scenario Outline: Verify the text spelling in the Home Page
    When Admin gives the correct LMS portal URL
    Then Admin should see each <field> with message <message>

    Examples: 
      | field | message    |
      | L     | LEARNING   |
      | M     | MANAGEMENT |
      | S     | SYSTEM     |

  Scenario: Verify the logo of LMS
    When Admin gives the correct LMS portal URL
    Then Admin see correct logo of the LMS as "LMS"

  Scenario: Verify the alignment of LMS logo
    When Admin gives the correct LMS portal URL
    Then Admin should see logo is properly aligned

  Scenario: Verify the presence of login button
    When Admin gives the correct LMS portal URL
    Then Admin should see login button

  Scenario: Verify login button is clickable
    When Admin gives the correct LMS portal URL
    Then Admin should able to click the Login button

