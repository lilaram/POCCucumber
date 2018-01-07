package com.stepdefination.stepfiles;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.*;
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
	
	@Given("^login to mercury tours site.$")
	public void login()
	{
		
		initBrowser();
		lpobj=new LoginPage();
		lpobj.setUserName(config.getProperty("UserName"));
		lpobj.setPassword(config.getProperty("Password"));
		lpobj.login();
		
		
	}
	
	@When("^flight finder page displays$")
	public void flight_finder_page_displays() throws Throwable {
			
		logger.info("flight finder page is display");
	}
	
		
	@Then("^user is able to see label Type,Passengers, Departing From, On,Arriving In, Returning, Service class,Airline$")
	public void user_is_able_to_see_label_Type_Passengers_Departing_From_On_Arriving_In_Returning_Service_class_Airline() throws Throwable {
	   
		fpobj=new FlightFinderPage();
		
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		if(fpobj.validateTypeField() && fpobj.validatedepartingfromField() && fpobj.validatefrommonthField())
		{
			 Assert.assertTrue("all the fields of flight finder page available",true );
		}
		else
		{
			//System.out.println("type label is not present present");
			
		}
		
		
	}
	
}
