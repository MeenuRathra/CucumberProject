@LoginTest @Regression 
Feature: Techfios billing login functionality validation



Scenario: User should be able to login with credentials and add Bank and Cash details
Given User is on the techfios loginpage
When User enter "Username" from database
When User enter "Password" from database
And User clicks  on "Signin"
Then User should see "Dashboard" 
And User clicks  on "bankandcash"
And User clicks  on "NewAccount" 
Then User should see "Account Created Successfully"
And User enters "Titlename" from database
And User enters "Description" from database
And User enters "Balance" from database
And User enters "Accountnumber" from database 
And User enters "Contactperson" from database 
And User enters "Phonenumber" from database
And User enters "BankingURL" from database
And User clicks  on "Submit"
Then User should see "Account Created Successfully"
	
