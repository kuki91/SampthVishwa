Feature: Feature for check logout fuctionallity

  Background: user is logged into the Vishwa
    Given user is on Vishwa login page
    When user enters username and password
    And click on login button
    Then user is navigeted to hame page

  Scenario Outline: Validate that user should be able to logout from the vishwa.
    When user click on logout button
    Then user is logout from the system
  