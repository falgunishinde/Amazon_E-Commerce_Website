package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.Methods;

public class CountrySelection extends Methods{

	public CountrySelection(WebDriver driver, WebDriverWait wait, Actions actions) {
		super(driver, wait, actions);
	}

    public void SelectCountry() {
        // Click on the country selector
        By countrySelector = By.id("nav-global-location-popover-link");
        click(countrySelector);

        // Select the desired country (e.g., United States)
        By desiredCountry = By.xpath("//a[text()='United States']");
        click(desiredCountry);

        // Verify the selected country
        By selectedCountry = By.id("glow-ingress-line1");
        getText(selectedCountry);
        Assert.assertEquals(selectedCountry, "Deliver to United States");

        // Wait for a moment to observe the changes (optional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

