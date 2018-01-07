package com.stepdefination.stepfiles;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.lilauto.base.TestBase;
import com.lilauto.pages.BookFlightPage;
import com.lilauto.pages.FlightConfirmationPage;
import com.lilauto.pages.FlightFinderPage;
import com.lilauto.pages.SelectFlightPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingFlightStepDefination extends TestBase{
	
	FlightFinderPage fpobj;
	SelectFlightPage selobj;
	BookFlightPage bfpobj;
	FlightConfirmationPage fcpobj;
	@When("^provides below information on Flight finder page$")
	public void provides_below_information_on_Flight_finder_page(DataTable arg1) throws Throwable {
	   fpobj=new FlightFinderPage();
	   List<Map<String, String>> data = arg1.asMaps(String.class, String.class);
	   driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	   fpobj.selectNoPassenger(data.get(0).get("Passengers"));
	   fpobj.selectDepartingFrom(data.get(0).get("Departing_From"));
	   fpobj.selectArrivingIn(data.get(0).get("Arriving_In"));
	   fpobj.selectReturningIn(data.get(0).get("Returning"));
	   fpobj.selectPreferenceFirst();
	   fpobj.selectAirLines(data.get(0).get("AirLine"));
		
		
	  
	}

	@When("^click on the continue button$")
	public void click_on_the_continue_button() throws Throwable {
	   
		fpobj.flpgcontinuebutton();
	   
	}

	@When("^select pangea airlines (\\d+) and click on the continue button\\.$")
	public void select_pangea_airlines_and_click_on_the_continue_button(int arg1) throws Throwable {
	    
		selobj=new SelectFlightPage();
		selobj.selectflight();
		bfpobj=selobj.reserveflightbutton();
	 
	}

	@When("^provide below information of taveler on book flight page\\.$")
	public void provide_below_information_of_taveler_on_book_flight_page(DataTable arg1) throws Throwable {
	  
		  List<Map<String, String>> data = arg1.asMaps(String.class, String.class);
		  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		  bfpobj.submitFirstName(data.get(0).get("FirstName"));
		  bfpobj.submitLastName(data.get(0).get("LastName"));
		  bfpobj.selectMealType(data.get(0).get("Meal"));
		  bfpobj.submitCardNumber(data.get(0).get("Number"));
		  
	  
	}

	@When("^click on the secure purchase button\\.$")
	public void click_on_the_secure_purchase_button() throws Throwable {
	   
		fcpobj=bfpobj.clicksecurepaybttn();
	   
	}

	@Then("^Flight Confirmation page is display with details of booked flight\\.$")
	public void flight_Confirmation_page_is_display_with_details_of_booked_flight() throws Throwable {
	   
		if(fcpobj.validateconfirm())
		{
			 Assert.assertTrue("flight confirm", true);
		}
	  
	}

}
