package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import framework.Methods;

public class LanguageVerification extends Methods{
	
	public LanguageVerification(WebDriver driver, WebDriverWait wait, Actions actions) {
		super(driver, wait, actions);
	}
	 public void verifySelectedLanguage(WebDriver driver) {
	        
	        // Get the selected language
	        String selectedLanguage = driver.findElement(By.id("icp-nav-flyout")).getText();
	        
	        System.out.println("Selected Language: " + selectedLanguage);
	        String Language = selectedLanguage.toString();
	        
	        Assert.assertTrue(Language.contains("English"), "Language verification failed.");
	        
	        System.out.println("Language verification successful. English is selected.");
	 }
}
