Feature: Portal Login

Background:
Given Validate the browser
When Browser is triggered
Then Browser is started

@portaltest
Scenario: Home page default login
Given User is on landing page
When User login into application with "Siddhartha" and password "1234"
Then Home page is populated
And Cards are displayed "true"

@portaltest
Scenario: Home page default login
Given User is on landing page
When User login into application with "Ribhu" and password "5678"
Then Home page is populated
And Cards are displayed "false"

@portaltest
Scenario: Home page default login
Given User is on landing page
When User sign up with following details
|Jenny|9999|jen@tcs.com|kolkata|
Then Home page is populated
And Cards are displayed "false"

@portaltest
Scenario Outline: Home page default login
Given User is on landing page
When User login into application with usernames <username> and passwords <password>
Then Home page is populated
And Cards are displayed "true"

Examples:
|username|password |
|user1   |password1|
|user2   |password2|
|user3   |password3|