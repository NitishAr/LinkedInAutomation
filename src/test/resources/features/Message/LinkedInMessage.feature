@Message
Feature:
  As a user
  I want to test LinkedIn Message functionality


  @Smoke
  Scenario: Sending message to one person in LinkedIn
    Given User navigates to Application URL
    And User logged in  with valid "Nitish.arora35@gmail.com" and "password"
    When User search for valid "Profectus Kamaljeet"
    And User sends the text message "Hello Kamaljeet, This is the auto message from username to Kamaljeet." and logged out from the application
    Then User should successfully logged out from the application




