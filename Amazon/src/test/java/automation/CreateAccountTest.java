package automation;

import framework.BaseClass;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseClass{
	@Test
	public void createAccount() {
		homePage.chooseHomePageMenu("SignIn");
		createAccount.clickCreateAccount();
		createAccount.enterName("Parag Shinde");
		createAccount.enterPhoneNumber("7498960926");
		createAccount.enterEmail("shindeparag31@gmail.com");
		createAccount.enterPassword("123456");
		createAccount.clickContinue();
	}
	
	

}
