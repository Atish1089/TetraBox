Feature: UploadFolder

  @upload
  Scenario Outline: upload scenario
     Given I want to navigate to box website
    Then page with title "Box | Login" should open
    When user enter "<user>" username
    And Click on Next button
    Then User should be able to enter "<password>" password
    And user clicks on login button
    Then page with title "All Files | Powered By Box" should open
    And click on foldername hyperlink
    Then page with title "serious123 | Powered By Box" should open
    And click on upload button
    And Check the confirmation message displayed
    When select the newly created row
    And click on Trash link
    Then confirm popup should get displayed
    And click on ok button
    When user clicks on logout button
    Then page with title "Box | Login" should open

    Examples: 
      | user                      | password |
      | nancydhingra131@gmail.com | nancy131 |
