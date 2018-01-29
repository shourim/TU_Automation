package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.cucumberrunner.AbstractMain;

public class BasketPage extends AbstractMain {

	public void i_select_size_and_quantity() throws InterruptedException {
		
		driver.findElement(By.cssSelector("#productVariantSize")).click();
		 Select sizedropdown = new Select(driver.findElement(By.cssSelector("#productVariantSize")));
		
		 sizedropdown.selectByValue("132640384");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("#qty")).click();
		 Select qtydropdown = new Select(driver.findElement(By.id("qty")));
		 Thread.sleep(1000);
		 qtydropdown.selectByValue("2");
		 Thread.sleep(1000);
	}

	public void i_click_on_add_to_basket() {
		
		 driver.findElement(By.cssSelector(".jsonBackInStockMessage")).click();
	}
public void selected_item_should_be_added_to_basket() {
	    
	}

}
