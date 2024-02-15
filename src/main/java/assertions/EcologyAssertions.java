package assertions;

import googlepages.EcologyPage;

import static org.junit.Assert.assertTrue;

public class EcologyAssertions {
    private EcologyPage ecologyPage = new EcologyPage();

    public void assertThatFirstSentenceAsExpected(String expectedSentence){
        assertTrue(ecologyPage.getArticle().innerText().contains(expectedSentence));
    }
}
