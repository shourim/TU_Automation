package com.pages;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.cucumberrunner.AbstractMain;

public class LoginPage extends AbstractMain {
	
	
public void iSelectonLoginLink() {

		 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		driver.findElement(By.linkText("Tu Log In / Register")).click();

		 }
		 
			 

	

	public void ishouldseetheloginpage() {
		
		Assert.assertEquals("Returning Tu customers", driver.findElements(By.cssSelector("h2")).get(2).getText());

		

	}

	public void ienterthevalidemailaddressandvalidpassword() {
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("shouri.macha@gmail.com");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("honey234");
	
	}

	public void iclickloginbuuton()  {

		driver.findElement(By.className("loginButtonMain")).click();
		
	}
	
	public void ishouldseethewelcomepage() {
		 Assert.assertEquals("Hello shouri goud", driver.findElement(By.cssSelector("li[class='logged_in']")).getText());

	}
}
