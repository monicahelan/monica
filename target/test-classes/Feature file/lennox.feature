Feature: User is going to automate the lennox website

  Scenario Outline: Validating the lead got saved successfully
    Given User is on lennox application and login using valid credentials
    When user is going to add lead
    And filling details from "<sheet>"
    Then user is going to validate lead got saved successfully

    Examples: 
      | sheet |
      |     7 |
      |    8 |
      |    9 |
