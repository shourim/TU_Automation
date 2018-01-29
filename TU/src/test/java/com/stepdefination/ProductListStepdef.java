
package com.stepdefination;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;

public class ProductListStepdef extends AbstractMain {
	@Then("^Product list page should displayed$")
	public void product_list_page_should_displayed()  {
	   PLP.product_list_page_should_displayed();
	}

}
