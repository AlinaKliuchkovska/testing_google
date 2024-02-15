package stepdefinitions;

import assertions.EcologyAssertions;
import googlepages.SearchPage;
import googlepages.SearchResultsPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;
import static utils.PropertiesReader.getProperty;

public class DefinitionSteps {
    private final SearchPage searchPage = new SearchPage();
    private final SearchResultsPage searchResultsPage = new SearchResultsPage();
    private final EcologyAssertions ecologyAssertions = new EcologyAssertions();

    @Before
    public void setUp() {
        open(Objects.requireNonNull(getProperty("URL")));
    }

    @Given("User makes search by keyword {string}")
    public void enterSearchRequestToSearchInput(String searchRequest) {
        searchPage.search(searchRequest);
    }

    @And("User scroll down to needed result {string}")
    public void scrollDownToNeededResult(String neededResult) {
        searchResultsPage.moveToNeededResult(neededResult);
    }

    @When("User click on needed result {string}")
    public void clickOnResultWithNeededEcologySite(String neededEcologySite) {
        searchResultsPage.clickOnNeededResult(neededEcologySite);
    }

    @Then("User verifies that first sentence on ecology page as expected {string}")
    public void verifyThatFirstSentenceAsExpected(String expectedSentence) {
        ecologyAssertions.assertThatFirstSentenceAsExpected(expectedSentence);
    }
}