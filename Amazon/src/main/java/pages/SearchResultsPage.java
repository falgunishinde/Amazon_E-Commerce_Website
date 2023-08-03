package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage {

    @FindBy(css = ".a-size-medium.a-color-base.a-text-normal")
    private List<WebElement> productTitleElements;

    public SearchResultsPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        PageFactory.initElements(driver, this);
    }

    public List<String> getProductTitles() {
        List<String> productTitles = new ArrayList<>();

        // Check if productTitleElements list is not null
        if (productTitleElements != null) {
            for (WebElement titleElement : productTitleElements) {
                productTitles.add(titleElement.getText());
            }
        }

        return productTitles;
    }

}
