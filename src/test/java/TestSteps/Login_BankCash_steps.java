package TestSteps;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import BasePage.Bank_cash;
import BasePage.Login;
import BasePage.testbasePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_BankCash_steps extends testbasePage{
	Bank_cash bankcash;
	Login login;
	@Before
	public void setup() {
		
		init();
		bankcash=PageFactory.initElements(driver, Bank_cash .class);
		login=PageFactory.initElements(driver, Login.class);
	}


	
@Given("^User is on the techfios loginpage$")
public void user_is_on_the_techfios_loginpage()  {
	driver.get("https://www.techfios.com/billing/?ng=admin/");
	
}

@When("^User enter username as \"([^\"]*)\"$")
public void user_enter_username_as(String username)  {
	login.username(username);
}

@When("^user enter password as \"([^\"]*)\"$")
public void user_enter_password_as(String password)  {
	login.password(password);
}

@When("^User clicks signin button$")
public void user_clicks_signin_button() throws Throwable {
	login.login();
}


@Then("^User should be on \"([^\"]*)\" page$")
public void user_should_be_on_Dashboard_page(String expected)  {
	login.dashboardvalidation(expected);
}

@Then("^User clicks on BankCash$")
public void user_clicks_on_BankCash()  {
	bankcash.clickBankCash();
}

@Then("^User clicks on NewAccount page$")
public void user_clicks_on_NewAccount() throws InterruptedException 
{
	bankcash.clickNewaccount();
}
	

@Then("^User shoule be on \"([^\"]*)\" page$")
public void user_shoule_be_on_page(String expected) throws InterruptedException   {
	
	bankcash.addnewAccountVAlidation(expected);
}

@Then("^User enters \"([^\"]*)\" in  Account Tile field$")
public void user_enters_in_Account_Tile_field(String Title) {
	bankcash.accountTitle(Title+Randomnum(99));
}

@Then("^User enters \"([^\"]*)\" in Description field$")
public void user_enters_in_Description_field(String description) throws Throwable {
	bankcash.Description(description+Randomnum(50));
}

@Then("^User enters \"([^\"]*)\" in Balance field$")
public void user_enters_in_Balance_field(String balance)  {
	bankcash.balance(balance+ Randomnum(2000));
}

@Then("^User enters \"([^\"]*)\" in Account number field$")
public void user_enters_in_Account_number_field(String accountnumber)  {
	bankcash.accountNumber(accountnumber+Randomnum(58));
}

@Then("^User enters \"([^\"]*)\" in Contact person field$")
public void user_enters_in_Contact_person_field(String contactperson) {
	bankcash.contactPerson(contactperson);
}
@Then("^User enters \"([^\"]*)\" in  phone number field$")
public void user_enters_in_phone_number_field(String phonenumber)  {
	bankcash.phonenumber(phonenumber+Randomnum(58));
}

@Then("^User enters \"([^\"]*)\" in Banking url Field$")
public void user_enters_in_Banking_url_Field(String url)  {
	bankcash.bankingurl(url);
}

@Then("^User clicks on Submit button$")
public void user_clicks_on_Submit_button()  {
	bankcash.submit();
}
@Then("^User should be able to validate \"([^\"]*)\"$")
public void user_should_be_able_to_validate(String expected) throws InterruptedException  {
	bankcash.accountcreatedvalidation(expected);
	screenShot(driver);
}


@After
	public void teardwon() {
		driver.quit();
		driver.close();
}
}