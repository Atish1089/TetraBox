#Author       :  TetraNoodle
#Scenario     :  Create and Delete folder from Box app.
#Application  :  Box
Feature: CreateFolder

  @createfolder
  Scenario Outline: Createfolder scenario
    Given I want to navigate to box website
    Then page with title "Box | Login" should open
    When user enter "<user>" username
    And Click on Next button
    Then User should be able to enter "<password>" password
    And user clicks on login button
    Then page with title "All Files | Powered By Box" should open
    When click on new button
    And click on new folder link
    Then Create folder pop up should get open
    And enter folder name given below:
      | Dcfolder |
    And click on create folder button
    When select the newly created folder row
    And click on Trash link
    Then confirm popup should get displayed
    And click on ok button
    Then page with title "All Files | Powered By Box" should open
    When user clicks on logout button
    Then page with title "Box | Login" should open

    Examples: 
      | user                  | password  |
      | h2so4in2008@gmail.com | Qazplm123 |
