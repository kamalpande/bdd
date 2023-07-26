Feature: Email
Scenario Outline: Send email to user
Given  User must launch the application
When User should send email to register

""""
Welcome to our community !..

click on the below link for registration..

From support team

"""

Examples:
  |user|
  |testuser1|
  |testuser2|