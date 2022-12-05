package BasePage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bank_cash {
	
WebDriver driver;

@FindBy (how=How.XPATH,using="//span[contains(text(),'Bank & Cash')]")WebElement bankNdcashElement;
@FindBy (how=How.XPATH,using="//a[contains(text(),'New Account')]")WebElement newAccountElement;
@FindBy (how=How.XPATH,using="//h5[contains(text(),'Add New Account')]")WebElement addnewaccountVAlidation;
@FindBy(how=How.XPATH, using="//input[@name='account']") WebElement accountTitleElement;
@FindBy(how=How.XPATH, using="//input[@type='text']") WebElement descriptionElement;
@FindBy(how=How.XPATH, using="//input[@name='balance']") WebElement balanceElement;
@FindBy(how=How.XPATH, using="//input[@name='account_number']") WebElement accountnumberElement;
@FindBy(how=How.XPATH, using="//input[@name='contact_person']") WebElement contactpersonElement;
@FindBy(how=How.XPATH, using="//input[@name='contact_phone']") WebElement phoneElement;
@FindBy(how=How.XPATH, using="//input[@name='ib_url']") WebElement urlElement;
@FindBy(how=How.XPATH, using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button") WebElement submitElement;
@FindBy (how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]")WebElement accountcreatedVAlidation;

public Bank_cash(WebDriver driver) {
	
	this.driver=driver;
	
}
public void clickBankCash() {


bankNdcashElement.click();

}
public void clickNewaccount() throws InterruptedException {
	Thread.sleep(3000);
	newAccountElement.click();
}

public void addnewAccountVAlidation(String expected) throws InterruptedException  {
	Thread.sleep(1000);
	String actual= addnewaccountVAlidation.getText();
	
	Assert.assertEquals(expected, actual);

}


public void accountTitle(String Title) {
	accountTitleElement.sendKeys(Title);
	
}
public void Description(String description) {
	descriptionElement.sendKeys(description);
	
}public void balance(String balance) {
	balanceElement.sendKeys(balance);
}
public void accountNumber(String accountnumber) {
	accountnumberElement.sendKeys(accountnumber);

}

 public void contactPerson(String contactperson) {
	
contactpersonElement.sendKeys(contactperson);
 }
public void phonenumber(String phonenumber) {
	
	phoneElement.sendKeys(phonenumber);
}

public void bankingurl(String url) {
urlElement.sendKeys(url);
}

public void submit() {
	submitElement.click();
}

public void accountcreatedvalidation(String expected) throws InterruptedException {
	Thread.sleep(5000);
String actual=	accountcreatedVAlidation.getText();
	
	if(expected.equals(actual)) {
		System.out.println("matched");
	}
}
}
