package automation;

import framework.BaseClass;
import org.testng.annotations.Test;

public class SignInTest extends BaseClass {
	@Test
	public void SignIn() {
		homePage.chooseHomePageMenu("SignIn");
		signIn.enterEmailId("falgunishinde09@gmail.com");
		signIn.clickContinueButton();
		signIn.enterPasswaord("Falguni@123");
		signIn.clickSignInButton();
	}
}
