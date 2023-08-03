package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchDropDown {
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Amazon.in
        driver.get("https://www.amazon.in/");

        // Find the global search input field and enter a search query
        WebElement dropDown = driver.findElement(By.className("nav-icon"));
        dropDown.click();
//
//        // Wait for the global search suggestions to appear in the dropdown
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-suggestion")));
//
//        // Find the specific element from the global search suggestions and click on it
//        WebElement specificElement = driver.findElement(By.xpath("//div[@class='s-suggestion']//span[text()='laptop stand']"));
//        specificElement.click();

        // Optional: Wait for the new page to load (if required)
        // Add your test steps for the selected page here

        // Close the browser
        driver.quit();
	}
}
