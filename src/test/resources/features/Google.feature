Feature: Test Google Search Funcionality.

  Scenario: As a user i enter a search criteria in Google
    Given Iam on the google search page
    When I enter the search criteria
    And  Click in the search button
    Then The result match the criteria