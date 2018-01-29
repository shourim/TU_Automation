package com.stepdefination;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;

public class SearchResultsstepdef extends AbstractMain {
	@Then("^I should see search results page\\.$")
	public void i_should_see_search_results_page() throws Throwable {
		
		SRP.searchResultsPageDisplayed();
	}
	    
	}