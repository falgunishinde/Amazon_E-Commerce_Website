package automation;

import framework.BaseClass;
import org.testng.annotations.Test;

public class LanguageVerificationTest extends BaseClass{
	@Test
	public void LanguageVerificationTest() {
		languageVerification.verifySelectedLanguage(driver);
		
	}
	

}
