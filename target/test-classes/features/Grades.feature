Feature: To display the grades secured by the student.

  Scenario: Create new account in facebook
    Given I open facebook url
    And fill up the new account form with the following data
      | First Name | Last Name | Phone No   | Password | DOB day | DOB month | DOB year | Gender   |
      | Test FN    | Test LN   | 0123123123 | Pass1234 |      23 | Dec       |     1990 | Female   |
      | STest FN   | STest LN  | 0123123123 | Pass1234 |      09 | Nov       |     1990 | Male     |
      | TTest FN   | TTest LN  | 0123123123 | Pass1234 |      23 | Feb       |     1990 | Female   |
      | FTest FN   | FTest LN  | 0123123123 | Pass1234 |      27 | Sep       |     1990 | Female   |
