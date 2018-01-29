package com.cucumberrunner;

import org.openqa.selenium.WebDriver;

import com.pages.BasketPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductDetailsPage;
import com.pages.ProductListingPage;
import com.pages.SearchResultsPage;

public class AbstractMain {
	public static WebDriver driver;

	public static HomePage homepage = new HomePage();

	public static LoginPage loginpage = new LoginPage();
	public static SearchResultsPage SRP = new SearchResultsPage();
	public static ProductListingPage PLP = new ProductListingPage();
	public static ProductDetailsPage PDP = new ProductDetailsPage();
	public static BasketPage bp = new BasketPage();
	
}
