package com.stepdefination.stepfiles;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.lilauto.base.TestBase;
import com.lilauto.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefination extends TestBase {

	RegisterPage regobj;
	String uname;

	@Given("^mercury tours web application open.$")
	public void openmerurytourssite() throws Throwable {

		initBrowser();
	}

	@When("^User click on the Register page$")
	public void user_click_on_the_Register_page() throws Throwable {

		regobj = new RegisterPage();
		regobj.RegisterLink();

	}

	@Then("^Register page is display\\.$")
	public void register_page_is_display() throws Throwable {

	}

	@Then("^provide all the information as below to Register to mercury tours\\.$")
	public void provide_all_the_information_as_below_to_Register_to_mercury_tours(DataTable arg1) throws Throwable {

		List<Map<String, String>> data = arg1.asMaps(String.class, String.class);
		regobj.setFirstName(data.get(0).get("FirstName"));
		regobj.setLastName(data.get(0).get("LastName"));
		regobj.setphoneno(data.get(0).get("Phone"));
		regobj.setemail(data.get(0).get("Email"));
		regobj.setaddress(data.get(0).get("Address"));
		regobj.setcity(data.get(0).get("City"));
		regobj.setstate(data.get(0).get("State"));
		regobj.setpostalcode(data.get(0).get("PostalCode"));
		regobj.selectcountry(data.get(0).get("Country"));
		uname=regobj.setusername(data.get(0).get("UserName"));
		regobj.setpassword(data.get(0).get("Password"));
		regobj.setconfirmpassword(data.get(0).get("ConfirmPassword"));
	}

	@Then("^Click on the submit button\\.$")
	public void click_on_the_submit_button() throws Throwable {

		regobj.clicksubmit();
	}

	@Then("^Registration successful text with username is displayed\\.$")
	public void registration_successful_text_with_username_is_displayed() throws Throwable {

		//regobj.validateusername();
		
		
	}

}
