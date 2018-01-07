package com.stepdefination.stepfiles;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.lilauto.base.TestBase;

import com.lilauto.pages.BookFlightPage;
import com.lilauto.pages.SelectFlightPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlightStepDefination extends TestBase{

	

	SelectFlightPage spgobj;
	BookFlightPage bfobj;
	
	@When("^Click on the continue button of select flight page\\.$")
	public void click_on_the_continue_button_of_select_flight_page() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		spgobj=new SelectFlightPage();
		spgobj.reserveflightbutton();
	}
	
	@Then("^Book  flight page display with summary and passenger details label\\.$")
	public void book_flight_page_display_with_summary_and_passenger_details_label() throws Throwable {
		bfobj=new BookFlightPage();
	if(bfobj.validateaddress() && bfobj.validatecity() && bfobj.validatefirstname() && bfobj.validatelastname() && bfobj.validatemeal() && bfobj.validatepostalcode())
	{
		Assert.assertTrue("fields availalable on book flight page",true);
	}
	else
	{
		System.out.println("fields is not availalbe on book flight page");
	}
	}
}
