Feature: Feature for check tranfer fuctionallity

  Background: user is logged into the Vishwa
    Given user is on Vishwa login page
    When user enters username and password
    And click on login button
    Then user is navigeted to hame page

  Scenario Outline: Validate that user should be able to proceed online TPS transaction successfully.
    When user is navigated to tranfer
    And User is selected Other SampathBank Accounts radio button
    And user is filled the <fromAccountNo> and <toAccountNo> and <amount> and transferPupose
    And user is click on continue
    Then The OTP page is displayed.
    And user is logged out from Vishwa 

    Examples: 
      | fromAccountNo | toAccountNo  | amount |
      |  100750588292 | 100354184260 |     24 |
