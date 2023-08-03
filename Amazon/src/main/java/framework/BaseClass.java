package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.CreateAccount;
import pages.HomePage;
import pages.LanguageVerification;
import pages.SearchResultsPage;
import pages.SignIn;
import pages.CountrySelection;

import framework.Browsers;

public class BaseClass {

	public WebDriver driver;
    public WebDriverWait wait;
    
    public static final String URL = "https://www.amazon.in/";
    
    Browsers browsers = new Browsers();
    
    public HomePage homePage;
    public SignIn signIn;
    public CreateAccount createAccount;
    public SearchResultsPage searchResultsPage;
    public CountrySelection countrySelection;
    public LanguageVerification languageVerification;

    Actions actions;

    public void waitTime() {
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
        }
    }
    
    @BeforeMethod
    public void setup() {
        driver = browsers.openWithSwitch("chrome");
        driver.navigate().to(URL);

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);
        actions = new Actions(driver);
        
        homePage = new HomePage(driver, wait, actions);
        signIn = new SignIn(driver, wait, actions);
        createAccount = new CreateAccount(driver, wait, actions);
        searchResultsPage = new SearchResultsPage(driver, wait, actions);
        countrySelection = new CountrySelection(driver, wait, actions);
        languageVerification = new LanguageVerification(driver, wait, actions);
        
        waitTime();
    }
        
    @AfterMethod
    public void tear_down() {
        waitTime();
        driver.quit();
    }
}
