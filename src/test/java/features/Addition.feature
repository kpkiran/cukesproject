Feature: Addition of numbers using the data table

Scenario: The sum of list of numbers should be calculated.
Given a list of numbers
| 17 |
| 29 |
| 23 |
When I add them
Then should I get 69