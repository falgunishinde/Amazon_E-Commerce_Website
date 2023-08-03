package automation;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework.BaseClass;

public class SearchResultsTest extends BaseClass{

    @Test
    public void SearchResultsTest() {
        // Perform a search
        String searchKeyword = "laptop";
        homePage.searchFor(searchKeyword);

        // Get the list of product titles from search results
        List<String> productTitles = searchResultsPage.getProductTitles();

        // Validate search results
        boolean isSearchValid = false;
        for (String title : productTitles) {
            if (!title.toLowerCase().contains(searchKeyword.toLowerCase())) {
                isSearchValid = false;
                break;
            }
            isSearchValid = true;
        }

        // Assert the validation result
        Assert.assertTrue(isSearchValid, "Search results are not correct for the keyword: " + searchKeyword);
    }

}
