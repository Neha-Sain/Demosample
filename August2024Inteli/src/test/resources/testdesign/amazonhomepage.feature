Features: Amazn Homepage validation
@amazon01
  Scenario: validation of search functionality
    Given user navigates to amazon home page
    When user enter the product name "iphone"
    And user clicks the search icon
    Then user verify the title of page
Features: Amazn Homepage validation

  @amazon02
Scenario: Dropdown Validation
  Given user navigates to amazon home page
  When user extracts all the values
