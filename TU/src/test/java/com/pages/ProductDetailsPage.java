package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class ProductDetailsPage extends AbstractMain{
	
	public void i_m_in_product_listing_page() {
		Assert.assertEquals("Search results for 'Jeans'",driver.findElement(By.cssSelector("h1")).getText());
	}
	public void i_click_on_selected_product() {
		driver.findElements(By.cssSelector(".details")).get(2).click();;
	}
	public void product_details_page_should_be_displayed() {
		//Assert.assertEquals("Womens Skinny Jeans | Tu clothing",driver.getTitle());

	}
}
