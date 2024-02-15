Feature: Smoke
  As a user
  I want to test all google search functionality
  So that I can be sure that search works correctly

  Scenario Outline: Check that google search found needed result
    Given User makes search by keyword '<searchRequest>'
    And User scroll down to needed result '<neededResult>'
    When User click on needed result '<neededResult>'
    Then User verifies that first sentence on ecology page as expected '<expectedSentence>'

    Examples:
      | searchRequest    | neededResult       | expectedSentence                                                                                        |
      | екологія україни | https://esu.com.ua | наука, яка вивчає взаємодії рослин, тварин, грибів, мікроорганізмів і вірусів між собою та з довкіллям. |