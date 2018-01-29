package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumberrunner.AbstractMain;

public class HomePage extends AbstractMain {
	

	public void start() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/ID/Desktop/Automation/driver/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("https://www.tuclothing.sainsburys.co.uk");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void search_with_valiData() throws InterruptedException {
		driver.findElement(By.cssSelector("#search")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#search")).sendKeys("Jeans");
	}
	public void select_Search_Button() {
		driver.findElement(By.cssSelector(".button.searchButton")).click();
	}
	}