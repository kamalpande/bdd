@PhaseOne
Feature: Deals Management
CRUD Operations for Deals

@SmokeTest
Scenario: Create a Deals
Given User is logged in
When User create a Deals

@RegressionTest
Scenario: Update a Deals
Given User is logged in
When User update a Deals

Scenario: Delete a Deals
Given User is logged in
When User delete a Deals