Feature: Application login

	@webtest
  Scenario: Home page default login
    Given User is on landing page
    When User log into application with "Jim" and password "testing"
    Then Home page is populated
    And Cards displayed are "true"

	@mobileTest
  Scenario: Home page default login
    Given User is on landing page
    When User log into application with "roger" and password "testing"
    Then Home page is populated
    And Cards displayed are "false"
    
  @webTest
  Scenario: Home page default login
    Given User is on landing page
    When User log into application with "roger" and password "testing"
    Then Home page is populated
    And Cards displayed are "false"
    
  @smoketest
  Scenario: Home page default login
    Given User is on landing page
    When User log into application with "roger" and password "testing"
    Then Home page is populated
    And Cards displayed are "false"

	@webtest
  Scenario Outline: Home page default login
    Given User is on landing page
    When User log in to application with <Username> and password <Password>
    Then Home page is populated
    And Cards displayed are "false"

    Examples: 
      | Username | Password  |
      | user1    | password1 |
      | user2    | password2 |
      | user3    | password3 |
