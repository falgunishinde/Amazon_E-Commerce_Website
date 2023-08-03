package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import framework.Methods;

public class CreateAccount extends Methods{
	
	By sign_in_link =  By.id("nav-link-accountList");
	By createAccountButton = By.id("createAccountSubmit");
	By nameInput = By.id("ap_customer_name");
	By phoneNumber = By.id("ap_phone_number");
	By emailInput = By.id("ap_email");
	By passwordInput = By.id("ap_password");
	By reEnterPassword = By.id("ap_password_check");
	By clickContinue = By.id("continue");	
	
	public CreateAccount(WebDriver driver, WebDriverWait wait, Actions actions) {
		super(driver, wait, actions);
	}
	
	public void clickCreateAccount() {
		click(createAccountButton);
	}
	
	public void enterName(String name) {
		sendKeys(nameInput, name);
	}
	
	public void enterPhoneNumber(String number) {
		sendKeys(phoneNumber, number);
	}

	public void enterEmail(String email) {
		sendKeys(emailInput, email);
	}
	
	public void enterPassword(String password) {
		sendKeys(passwordInput, password);
	}
	
	public void reEnterPassword(String password) {
		sendKeys(reEnterPassword, password);
	}
	
	public void clickContinue() {
		click(clickContinue);
	}

}
