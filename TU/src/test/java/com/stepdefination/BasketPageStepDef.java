package com.stepdefination;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketPageStepDef extends AbstractMain {
	
	@When("^I select size and quantity$")
	public void i_select_size_and_quantity() throws InterruptedException {
		bp.i_select_size_and_quantity();
	    
	}

	@When("^I click on add to basket$")
	public void i_click_on_add_to_basket() {
	    bp.i_click_on_add_to_basket();
	}

	@Then("^selected item should be added to basket$")
	public void selected_item_should_be_added_to_basket() {
	    bp.selected_item_should_be_added_to_basket();
	}


}
