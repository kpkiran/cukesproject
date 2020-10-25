Feature: Search and place an order

  @seleniumTest
  Scenario: Search for items and validate results
    Given User is on greenkart landing page
    When User searched for Cucumber vegetable
    Then "Cucumber" resutls are displayed

  @seleniumTest
  Scenario Outline: Search for items and move to checkout page
    Given User is on greenkart landing page
    When User searched for <Name> vegetable
    And added items to cart
    And user proceeds to checkout page
    Then verify selected <Name> items are displayed

    Examples: 
      | Name     	|
      | Brinjal  		|
      | Beetroot |
