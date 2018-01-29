package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class ProductListingPage extends AbstractMain {
	public void product_list_page_should_displayed()  {
		Assert.assertEquals("Search results for 'Jeans'",driver.findElement(By.cssSelector("h1")).getText());  
	}

}
