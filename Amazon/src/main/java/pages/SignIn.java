package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import framework.Methods;

public class SignIn extends Methods{
	
	By sign_in_link =  By.id("nav-link-accountList");
	By email_input = By.id("ap_email");
	By continue_button = By.id("continue");
	By password_input = By.id("ap_password");
	By sign_in_button = By.id("signInSubmit");
	

	public SignIn(WebDriver driver, WebDriverWait wait, Actions actions) {
		super(driver, wait, actions);
	}
	
	public void clickSignIn() {
		click(sign_in_link);
	}

	public void enterEmailId(String email) {
		sendKeys(email_input, email);
	}
	
	public void clickContinueButton() {
		click(continue_button);
	}
	
	public void enterPasswaord(String password) {
		sendKeys(password_input, password);
	}
	
	public void clickSignInButton() {
		click(sign_in_button);
	}

	
}
