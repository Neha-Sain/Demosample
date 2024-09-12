Feature: Wiki page Automation

@infosyswiki1
  Scenario: validate the mapping of shareholder and shareholding values
    Given user navigates to wiki home page
    When user extracts the shareholder value
    And user extracts the shareholding value
    Then validate the mapping
