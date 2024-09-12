Feature: Functional validation of SalesForce login page

@salesforce1
  Scenario: validation of Login Functionality
    Given user navigates to salesforce login page
    When user enter the username "Limit" and password "ahsjdsdjv"
    And user click on Login Button
    Then user validate the navigation to home page

  @salesforce2
    Scenario: validation of Error message Functionality
      Given user navigates to salesforce login page
      When user enter the username "learnmore" and password "abcdfgh"
      And user click on Login Button
      Then user validate by Error" Please check your username and password. If you still can't log in, contact your Salesforce administrator."

