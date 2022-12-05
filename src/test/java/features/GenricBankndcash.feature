@LoginTest @Regression 
Feature: Techfios billing login functionality validation

Background:
Given User is on the techfios loginpage

Scenario Outline: User should be able to login with credentials and add Bank and Cash details
When User enter  "<Username>" in "username" field
When User enter  "<Password>" in "password" field
And User clicks  on "Signin"
Then User should see "Dashboard" 
And User clicks  on "bankandcash"
And User clicks  on "NewAccount"
Then User should see "Add New Account" 
And User enters "<Titlename>" in "TitleName" field
And User enters "<Description>" in "description" field 
And User enters "<Balance>" in "Balance" field 
And User enters "<Accountnumber>" in "AccountNumber" field 
And User enters "<Contactperson>" in "ContactPerson" field 
And User enters "<Phonenumber>" in "PhoneNumber" field 
And User enters "<BankingURL>" in "Bankingurl" field 
And User clicks  on "Submit"
Then User should see "Account Created Successfully"
	

Examples:

|Username          |Password|Titlename     |Description|Balance|Accountnumber|Contactperson|Phonenumber|BankingURL|
|demo@techfios.com |abc123  | current      |Techfios   |58000  |586556      | Tom         |4864687    |https://www.techfios.com/billing/?ng=admin/ | 
|demo@techfios.com |abc123  | current      |Techfios   |88000  |588974      | Pom         |4848687    |https://www.techfios.com/billing/?ng=admin/ | 


	