package com.stepdefination;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class HomePageStepdef extends AbstractMain {
	@Given("^I am in homepage$")
	public void i_am_in_homepage() throws Throwable {
            homepage.start();
	}

@When("^I enter valid product details$")
public void i_enter_valid_product_details() throws Throwable {
         homepage.search_with_valiData();
}

@When("^I select search button$")
public void i_select_search_button() throws Throwable {
   homepage.select_Search_Button();
}

	}
