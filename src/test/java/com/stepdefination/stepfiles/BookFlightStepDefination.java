package com.stepdefination.stepfiles;

import java.util.concurrent.TimeUnit;

import com.lilauto.base.TestBase;
import com.lilauto.pages.SelectFlightPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlightStepDefination extends TestBase{

	

	SelectFlightPage spgobj;
	
	@When("^Click on the continue button of select flight page\\.$")
	public void click_on_the_continue_button_of_select_flight_page() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		spgobj=new SelectFlightPage();
		spgobj.reserveflightbutton();
	}
	
	@Then("^Book  flight page display with summary and passenger details label\\.$")
	public void book_flight_page_display_with_summary_and_passenger_details_label() throws Throwable {
	   
	}
}
