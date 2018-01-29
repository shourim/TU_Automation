Feature: Login

Scenario: Login With Valid Data
Given I am in homepage
When I Select on Login Link
And I should see the login page
And I enter the valid email address and valid password
And I click login buuton
Then I should see the welcome page