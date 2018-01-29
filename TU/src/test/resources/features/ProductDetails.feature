Feature: Product Details Page

Scenario: Product Details page is displayed
Given  I am in homepage
When I enter valid product details
And I select search button
And I'm in product listing page
When I click on selected product
Then Product details page should be displayed