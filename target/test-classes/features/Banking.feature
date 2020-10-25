Feature: Banking application scenario

Background: Login to banking application
Given I am a the manager of the bank
When I login as an admin
Then I should be given access to see accounts

@bankTest
Scenario: See the latest transaction of the given account
Given I see the account number
When I click on the account number
Then I should be able to see the account details

@bankTest
Scenario: See the transactions of all the account
Given I see the view accounts link
When I click on the account numbers
Then I should be able to see all the account details
