@Tag ChromeTest

Feature: Validate UBS Page features

#  Scenario: Open Wealth Management page
#    Given Open Chrome and launch the application
#    When I open Wealth Management page
#    Then Multi Family Page is opened

  Scenario: Fill Get In Touch Form
    Given Open Chrome and launch the application
    And I open Wealth Management page
    And Navigate to Get In Touch Form
    When I fulfill form fields
      | Dropdown1        | Dropdown2      | DescriptionField | FirstName | LastName | Email                 | Country |
      | General question | USD 2 million+ | This is a test!  | Rafael    | Gomes    | rafaelgomes@email.com | Brazil  |
    Then I click on reset button

  Scenario Outline: Do a search on UBS in Society Page
    Given Open Chrome and launch the application
    And Navigate to UBS In Society
    When UBS in Society page is opened
    And I Search for '<Country>' content
    Then I check if search results has '<ExpectedResult>'

    Examples:
      | Country   | ExpectedResult                     |
      | Brazil    | Found 2 results for applied filters|
      | Argentina | Sorry, there are no results matching your criteria.|
