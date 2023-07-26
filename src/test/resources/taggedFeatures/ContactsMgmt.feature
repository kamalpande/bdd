@PhaseTwo
Feature: Contacts Management
CRUD Operations for Contact

@SmokeTest
Scenario: Create a contact
Given User is logged in
When User create a contact

Scenario: Update a contact
Given User is logged in
When User update a contact

Scenario: Delete a contact
Given User is logged in
When User delete a contact