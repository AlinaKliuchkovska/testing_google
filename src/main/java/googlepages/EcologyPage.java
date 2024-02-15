package googlepages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EcologyPage {

    public SelenideElement getArticle(){
        return $x("//div[@id='start']//p");
    }
}
