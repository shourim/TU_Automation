Feature: Search

Scenario: Search with valid data
Given I am in homepage
When I enter valid product details
And I select search button
Then I should see search results page. 