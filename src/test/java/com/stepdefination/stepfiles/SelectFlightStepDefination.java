package com.stepdefination.stepfiles;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.lilauto.base.TestBase;
import com.lilauto.pages.FlightFinderPage;
import com.lilauto.pages.SelectFlightPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectFlightStepDefination extends TestBase {

	FlightFinderPage fpobj;
	 SelectFlightPage selobj;
	@When("^Click on the continue button of flight finder page\\.$")
	public void click_on_the_continue_button_of_flight_finder_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   fpobj=new FlightFinderPage();
	   driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		fpobj.flpgcontinuebutton();
	}

	@Then("^Select flight page display with label Depart and return$")
	public void select_flight_page_display_with_label_Depart_and_return() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		selobj=new SelectFlightPage();
		if(selobj.selectFightDefault() && selobj.returnselectedFightDefault())
		{
			Assert.assertTrue("elements display on select flight page", true);
		}
		else
		{
			Assert.assertFalse("elements display on select flight page", false);
			
		}
		
	}
}
