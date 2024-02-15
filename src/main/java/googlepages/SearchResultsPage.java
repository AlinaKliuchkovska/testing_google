package googlepages;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;


import static com.codeborne.selenide.Selenide.$x;

public class SearchResultsPage {
    public void moveToNeededResult(String resultUrl) {
        var windowHeight = Selenide.webdriver().driver().getWebDriver().manage().window().getSize().getHeight();
        var moreResultsButton = "//a[@aria-label='Більше результатів']";
        var page = 1;
        do {
            if ($x(moreResultsButton).is(Condition.enabled)) {
                $x(moreResultsButton).click(ClickOptions.usingJavaScript());
            }
            Selenide.executeJavaScript("window.scrollTo(0, " + windowHeight * page + ")");
            page++;
        } while (!$x("(//cite[contains(text(),'" + resultUrl + "')])[1]").is(Condition.visible));
    }

    public void clickOnNeededResult(String neededResult) {
        $x("(//cite[contains(text(),'" + neededResult + "')])[1]").click(ClickOptions.usingJavaScript());
    }
}
