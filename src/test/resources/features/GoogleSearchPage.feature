Feature: Google Page Search

Background: Launch App

Given  User launch google page

Scenario: Search Java Tutorial
When  User Search Java Tutorial
Then  Should display Java result page


Scenario: Search Selenium Tutorial
When  User Search Selenium Tutorial
Then  Should display Selenium result page

Scenario: Search Cypress Tutorial
When  User Search Cypress Tutorial
Then  Should display Cypress result page