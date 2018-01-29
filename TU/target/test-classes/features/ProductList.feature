Feature: ProductList
@Test
Scenario: Product list page should be displayed
Given  I am in homepage
When I enter valid product details
And I select search button
Then Product list page should displayed
