package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import framework.Methods;
import staticVariables.StaticVariables;


public class HomePage extends Methods{


    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInput;
	By clickSignInItem =  By.id("nav-link-accountList");
	
	
	public HomePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
        PageFactory.initElements(driver, this);
    }
	
	public void chooseHomePageMenu(String homeMenu) {
		int indexOfElement = arrayListToInt(StaticVariables.HOME_MENU, homeMenu);
		clickWithIndex(clickSignInItem,indexOfElement);
	}
	
	 public void searchFor(String keyword) {
	        searchInput.sendKeys(keyword);
	        searchInput.submit();
	    }
}
