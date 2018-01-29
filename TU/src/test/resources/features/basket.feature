Feature: Add to basket

Scenario: Add a product to basket
Given  I am in homepage
When I enter valid product details
And I select search button
And I'm in product listing page
When I click on selected product
And Product details page should be displayed
When I select size and quantity 
And I click on add to basket
Then selected item should be added to basket