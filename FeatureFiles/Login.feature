Feature: feature to test login functionality
Scenario: check login is sucessful with valid credentials
Given user is on loginpage 
When user enters username and password
And clicks on login button
Then user is navigated to homepage