package com.stepdefination.stepfiles;

import org.openqa.selenium.support.PageFactory;

import com.lilauto.base.TestBase;
import com.lilauto.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefination extends TestBase {

	RegisterPage regobj;

	@Given("^mercury tours web application open.$")
	public void openmerurytourssite() throws Throwable {

		initBrowser();
	}

	@When("^User click on the Register page$")
	public void user_click_on_the_Register_page() throws Throwable {

		regobj = new RegisterPage();
		// regobj.RegisterLink();

	}

	@Then("^Register page is display\\.$")
	public void register_page_is_display() throws Throwable {

	}

	@Then("^provide all the information as below to Register to mercury tours\\.$")
	public void provide_all_the_information_as_below_to_Register_to_mercury_tours(DataTable arg1) throws Throwable {

	}

	@Then("^Click on the submit button\\.$")
	public void click_on_the_submit_button() throws Throwable {

	}

	@Then("^Registration successful text with username is displayed\\.$")
	public void registration_successful_text_with_username_is_displayed() throws Throwable {

	}

}
