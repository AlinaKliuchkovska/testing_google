package googlepages;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    public void search(String searchRequest){
        $x("//textarea[@aria-label='Пошук']").setValue(searchRequest).pressEnter();
    }
}
