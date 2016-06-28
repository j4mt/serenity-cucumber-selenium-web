Feature: SearchGoogle

  Scenario: enter text to search bar and click search
    Given I am on the google page
    When I enter ^query into search bar:
    |query|
    And I click Search
    Then I very search list appears
