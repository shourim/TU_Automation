package com.stepdefination;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductDetailsStepdef extends AbstractMain{
	@When("^I'm in product listing page$")
	public void i_m_in_product_listing_page() throws Throwable {
	   PDP.i_m_in_product_listing_page();
	}

	@When("^I click on selected product$")
	public void i_click_on_selected_product() throws Throwable {
	    PDP.i_click_on_selected_product();
	}

	@Then("^Product details page should be displayed$")
	public void product_details_page_should_be_displayed() throws Throwable {
	    PDP.product_details_page_should_be_displayed();
	}

}
