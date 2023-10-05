Feature: Iam going to search

  Scenario Outline: User went to verify search functionality
    Given User open the browser
    Then User enter the "https://www.amazon.co.uk/" of the application
    When User enter the appropriate '<search data>'
    Then verify user the search result
    Then User close the browser
    Examples:
      |search data|
      |shoe|
      |mobile|


