Feature: Registration form for the user

@registrationForm
Scenario: Valid Registration Form Information
Given User submits a valid registration form
| John | Doe | jdoe | testPass1 | jdoe@email.com |
Then System proceeds with registration