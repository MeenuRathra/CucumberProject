package TestSteps;

import org.junit.After;
import org.openqa.selenium.support.PageFactory;

import BasePage.Bank_cash;
import BasePage.Login;
import BasePage.getdataFROMdatabase;
import BasePage.testbasePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class genricBankandCAsh extends testbasePage{
	
	Bank_cash bankcash;
	Login login;
	getdataFROMdatabase databasepage;
	
	@Before
	public void setup() {
		
		init();
		bankcash=PageFactory.initElements(driver, Bank_cash .class);
		login=PageFactory.initElements(driver, Login.class);
		databasepage = new getdataFROMdatabase();
	}



	@When("^User enter  \"([^\"]*)\" in \"([^\"]*)\" field$")
public void user_enter_in_field(String logindata, String field)  {

		if (field.equalsIgnoreCase("username")) {
			login.username(logindata);
		} else if (field.equalsIgnoreCase("password")) {
			login.password(logindata);
		} else {
			System.out.println("unable to enter login data");
		}
	}

@When("^User clicks  on \"([^\"]*)\"$")
public void user_clicks(String buttonORlink) throws InterruptedException  {
		switch (buttonORlink) {
		case "Signin":
			login.login();
			break;
		case "bankandcash":
			bankcash.clickBankCash();
			break;
		case "NewAccount":
			bankcash.clickNewaccount();
			break;
		case "Submit":
			bankcash.submit();
		default:
			System.out.println("unable to click");
			break;
	
//	if(buttonORlink.equalsIgnoreCase("Login")) {
//		login.login();}
//		else if(buttonORlink.equalsIgnoreCase("NewAccount")) {
//			bankcash.clickNewaccount();
//		}else if(buttonORlink.equalsIgnoreCase("bankandcash")) {
//			bankcash.clickBankCash();
//		}
//		else {System.out.println("not valid");
}
}
@Then("^User should see \"([^\"]*)\"$")
public void user_should_see(String expected) throws InterruptedException  {
	Thread.sleep(3000);
	if (expected.equalsIgnoreCase("Dashboard")) {
		login.dashboardvalidation(expected);
	}
	else if(expected.equalsIgnoreCase("Add New Account")) {
		bankcash.addnewAccountVAlidation(expected);
	}
	else if (expected.equalsIgnoreCase("Account Created Successfully")) {
	
	bankcash.accountcreatedvalidation(expected);}
	screenShot(driver);


} 
@And("^User enters \"([^\"]*)\" in \"([^\"]*)\" field$")
public void user_enters_in_field(String bankAndcash, String field)  {
	switch(field){
		case "TitleName":
			bankcash.accountTitle(bankAndcash+Randomnum(85));
			break;
		case "description": 
			bankcash.Description(bankAndcash);
			break;
		case "Balance":
			bankcash.balance(bankAndcash);
			break;
		case "AccountNumber":
			bankcash.accountNumber(bankAndcash);
			break;
		case "ContactPerson":
			bankcash.contactPerson(bankAndcash+Randomnum(789));
			break;
		case "PhoneNumber": 
			bankcash.phonenumber(bankAndcash);
			break;
		case "Bankingurl": 
			bankcash.bankingurl(bankAndcash);
			break;
		default:
			System.out.println("unable to enterData");
			break;
	
	}
   }


@When("^User enter \"([^\"]*)\" from database$")
public void user_enter_from_database(String logindata)  {
	switch(logindata) {
	case "Username":
		login.username(databasepage.getDataFromDb("username"));
	break;
	case "Password":
			login.password(databasepage.getDataFromDb("password"));
			break;
	default:
		System.out.println("unable to enterData");
		break;

	}
	
	
}
@And("^User enters \"([^\"]*)\" from database$")
	public void user_enters_from_databaseBankCash(String bankandCash) {
		switch(bankandCash) {
case"Titlename":
	bankcash.accountTitle(databasepage.getDataFromDb("Titlename"));
	break;
case "Description":
	bankcash.Description(databasepage.getDataFromDb("Description"));
	break;
case "Balance":
	bankcash.balance(databasepage.getDataFromDb("Balanace"+Randomnum(54)));
	break;
case "Accountnumber":
	bankcash.accountNumber(databasepage.getDataFromDb("Accountnumber"));
	break;
case "Contactperson":
	bankcash.contactPerson(databasepage.getDataFromDb("Contactperson"+Randomnum(999)));
	break;
case "Phonenumber":
	bankcash.phonenumber(databasepage.getDataFromDb("phone"));
	break;
case "BankingURL":
	bankcash.bankingurl(databasepage.getDataFromDb("url"));
	break;
		}	
}
@After
	public void teardwon() {
		driver.quit();
		driver.close();
	}
		
	}
	
