#Author       :  TetraNoodle
#Scenario     :  Login and Logout from Box app
#Application  :  Box
Feature: Box loginlogout

  @login
  Scenario Outline: Box Loginlogout scenario
    Given I want to navigate to box website
    Then page with title "Box | Login" should open
    When user enter "<user>" username
    And Click on Next button
    Then User should be able to enter "<password>" password
    And user clicks on login button
    Then page with title "All Files | Powered By Box" should open
    When user clicks on logout button
    Then page with title "Box | Login" should open

    Examples: 
      | user                      | password  |
      | h2so4in2008@gmail.com     | Qazplm123 |
      | nancydhingra131@gmail.com | nancy131  |

      
  @login123
  Scenario Outline: Box Loginlogout negative scenario
    Given I want to navigate to box website
    Then page with title "Box | Login" should open
    When user enter "<user>" username
    And Click on Next button
    Then User should be able to enter "<password>" password
    And user clicks on login button
    Then error message "<message>" is displayed

    Examples: 
      | user                | password  |message|
      | abc@def.com    		| 12345 	|Invalid Login Credentials|