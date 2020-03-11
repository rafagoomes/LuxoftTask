@Tag ChromeTest

Feature: Validate UBS Page features

  Scenario: Open Wealth Management page
    Given Open Chrome and launch the application
    When I open Wealth Management page
    Then Multi Family Page is opened

  Scenario: Fill Get In Touch Form
    Given Open Chrome and launch the application
    And I open Wealth Management page
    And Navigate to Get In Touch Form
    When I fulfill form fields
    Then I click on reset button

  Scenario: Do a search on UBS in Society Page
    Given Open Chrome and launch the application
    And Navigate to UBS In Society
    When UBS in Society page is opened
    And I Search for Brazil content
    Then I check if search results has expected result