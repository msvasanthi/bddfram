Feature: Feature file to verify weather appropriate application are loaded or not.
  Scenario: User check functionality of application.
    Given User open the browser
    Then User enter the "https://www.amazon.co.uk/" of the application
    And User verfy the browser  title of the window
    Then User close the browser