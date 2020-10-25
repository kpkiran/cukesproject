Feature: Application login

Background: This should be run before every scenario
Given validate the browser
When browser is triggered
Then check if browser is started

	@portalTest
  Scenario: Home page default login
    Given User is on landing page
    When User log into application with "Jim" and password "testing"
    Then Home page is populated
    And Cards displayed are "true"

  @portalTest
  Scenario: Home page default login
    Given User is on landing page
    When User log into application with "roger" and password "testing"
    Then Home page is populated
    And Cards displayed are "false"
  
  @portalTest  
  Scenario: Home page default login
    Given User is on landing page
    When User log into application with "roger" and password "testing"
    Then Home page is populated
    And Cards displayed are "false"
    
  @portalTest
  Scenario: Home page default login
    Given User is on landing page
    When User log into application with "roger" and password "testing"
    Then Home page is populated
    And Cards displayed are "false"

  @portalTest
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