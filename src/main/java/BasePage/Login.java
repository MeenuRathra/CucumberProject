package BasePage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {

WebDriver driver;

@FindBy(how=How.XPATH, using="//input[@id='username']") WebElement usernameElement;
@FindBy(how=How.XPATH,using="//input[@type='password']") WebElement passwordElement;
@FindBy(how=How.XPATH,using="//button[@type='submit']")WebElement loginElement;
@FindBy (how=How.XPATH,using="//h2[contains(text(),'Dashboard')]")WebElement dashboardElement;

public Login(WebDriver driver) {
	this.driver=driver;

}
public void username(String username) {
	usernameElement.sendKeys(username);
}

public void password(String password) {
	
	passwordElement.sendKeys(password);

}

public void login() {
	
	loginElement.click();;
}

public void dashboardvalidation(String expected) {
	String actuals= dashboardElement.getText();
Assert.assertEquals( expected, actuals);
}}
