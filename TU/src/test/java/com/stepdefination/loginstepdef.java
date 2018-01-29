package com.stepdefination;
import com.cucumberrunner.AbstractMain;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdef extends AbstractMain {
	

	@Given("^I am in Home page$")
	public void i_am_in_Home_page() throws Throwable {
	

			
	}

	@When("^I Select on Login Link$")
	public void i_Select_on_Login_Link() throws Throwable {
		loginpage.iSelectonLoginLink();
			
	}

	@When("^I should see the login page$")
	public void i_should_see_the_login_page() throws Throwable {
		loginpage.ishouldseetheloginpage();
	}		

	@When("^I enter the valid email address and valid password$")
	public void i_enter_the_valid_email_address_and_valid_password() throws Throwable {
		loginpage.ienterthevalidemailaddressandvalidpassword();

	}

	@When("^I click login buuton$")
	public void i_click_login_buuton() throws Throwable {
		loginpage.iclickloginbuuton();
				

	}

	@Then("^I should see the welcome page$")
	public void i_should_see_the_welcome_page() throws Throwable {
	    loginpage.ishouldseethewelcomepage();
	}



}
