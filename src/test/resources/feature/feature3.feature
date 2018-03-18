@Feature3
Feature: Test tabs

  Scenario: Test Anime List tab
    Given Gogoanime website is open
    When I click Anime List tab
    Then site should show me a list of animes with title as "ANIME LIST"

  Scenario: Test Season tab
    Given Gogoanime website is open
    When I click New Season tab
    Then site should show me a list of season with title as "NEW SEASON"