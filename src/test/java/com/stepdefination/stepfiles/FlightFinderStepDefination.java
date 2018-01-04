package com.stepdefination.stepfiles;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.lilauto.base.TestBase;
import com.lilauto.pages.FlightFinderPage;
import com.lilauto.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightFinderStepDefination extends TestBase {

	LoginPage lpobj;
	FlightFinderPage fpobj;
	Logger log;
	@Given("^login to mercury tours site.$")
	public void login()
	{
		 log=Logger.getLogger( LoginStepDefination.class);
		    PropertyConfigurator.configure("log4j.properties");
		initBrowser();
		lpobj=new LoginPage();
		lpobj.setUserName("batman");
		lpobj.setPassword("batman");
		lpobj.login();
		log.info("login sucessull for flight find scenario");
		
	}
	
	@When("^flight finder page displays$")
	public void flight_finder_page_displays() throws Throwable {
			
		log.info("flight finder page is display");
	}
	
		
	@Then("^user is able to see label Type,Passengers, Departing From, On,Arriving In, Returning, Service class,Airline$")
	public void user_is_able_to_see_label_Type_Passengers_Departing_From_On_Arriving_In_Returning_Service_class_Airline() throws Throwable {
	   
	}
	
}
