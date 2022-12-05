Feature: Techfios billing login functionality validation
Background:
Given User is on the techfios loginpage 

@Scenario1
Scenario:User should login with valid credentials
When User enter username as "demo@techfios.com"
When user enter password as "abc123"
And User clicks signin button
Then User should be on "Dashboard" page


@Scenario2
Scenario:User should login with valid credentials
When User enter username as "demo@techfios.com"
When user enter password as "abc123"
And User clicks signin button
Then User should be on "Dashboard" page


@Scenario3
Scenario:User should login with invalid userid
When User enter username as "demo1@techfios.com"
When user enter password as "abc123"
And User clicks signin button
Then User should be on "Dashboard" page


@otherScenario @smoke
	Scenario Outline: User should not be able to login with credentials 
	
When User enter username as "<username>"
When user enter password as "<password>"
And User clicks signin button

	Examples:
	|username         |password |
	|demo@techfios.com|abc123   |
	|demo@techfios.com|abc1234  |
	|demo@techfios.com|         |
	