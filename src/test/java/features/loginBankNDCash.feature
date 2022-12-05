@LoginTest @Regression 
Feature: Techfios billing login functionality validation

Scenario Outline: User should be able to login with credentials and add Bank and Cash details
	Given User is on the techfios loginpage 
When User enter username as "<username>"
When user enter password as "<password>"
And User clicks signin button
Then User should be on "Dashboard" page
And User clicks on BankCash
And User clicks on NewAccount page
And User should be on "Add New Account" page
And User enters "<Titlefield>" in  Account Tile field
And User enters "<Description>" in Description field 
And User enters "<Balance>" in Balance field 
And User enters "<Accountnumber>" in Account number field 
And User enters "<Contactperson>" in Contact person field 
And User enters "<Phonenumber>" in  phone number field 
And User enters "<BankingURL>" in Banking url Field 
And User clicks on Submit button
Then User should be able to validate "Account Created Successfully"
	
Examples:

|username          |password  |Titlefield|Description|Balance|Accountnumber|Contactperson|Phonenumber|BankingURL|
|demo@techfios.com |abc123     | Saving  |Techfios   |58000  |586556   | Tom         |4864687    |https://www.techfios.com/billing/?ng=admin/ | 
|demo@techfios.com |abc123   | current  |Techfios   |89558  |464468       | Pom         |4845455    |https://www.techfios.com/billing/?ng=admin/ | 



	