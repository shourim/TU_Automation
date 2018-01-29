package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;




public class SearchResultsPage extends AbstractMain{

	public void searchResultsPageDisplayed() {
		Assert.assertEquals("Search results for 'Jeans'",driver.findElement(By.cssSelector("h1")).getText());
		
		
	}
}
