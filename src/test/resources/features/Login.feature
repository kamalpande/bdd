Feature: Login into App

#Scenario: Valid Login
#Given  User is on Login Page
#When User enters login credential
#Then Should display Home Page


#Scenario: Valid Login
#Given  User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Home Page

#Scenario Outline: Valid Login
# Given  User is on Login Page
# When   User enters "<username>" and "<password>"
 #Then   Should display Home Page
 
#  Examples:
 #  | username | password |
 #  |tomsmith  | SuperSecretPassword! |
 #  |testuser1  | welcome123 |
 #  |testuser2  | welcome123 |
 
 Scenario: Valid Login
 Given  User is on Login Page
 When User enters login credential
    | username | password |
    |tomsmith  | SuperSecretPassword! |
 Then Should display Home Page