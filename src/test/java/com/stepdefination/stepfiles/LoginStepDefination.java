package com.stepdefination.stepfiles;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.lilauto.base.TestBase;
import com.lilauto.pages.FlightFinderPage;
import com.lilauto.pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
public class LoginStepDefination extends TestBase {

	LoginPage lpobj;
	FlightFinderPage fpobj;
	 

	@Given("^Open the URL of mercury tours\\.$")
	public void open_the_URL_of_mercury_tours() throws Throwable {
       
	   	initBrowser();
		logger.info("opening the mercury tour site");

	}

	@When("^user provide following username and password\\.$")
	public void user_provide_following_user_name_and_password(DataTable arg1) throws Throwable {

		List<Map<String, String>> data = arg1.asMaps(String.class, String.class);
		lpobj = new LoginPage();
		lpobj.setUserName(data.get(0).get("username"));
		lpobj.setPassword(data.get(0).get("password"));
		logger.info("user name and password has entered");

	}

	@When("^click on the submit button\\.$")
	public void click_on_the_submit_button() throws Throwable {

		lpobj.login();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		logger.info("clicked submit button");
	}

	@SuppressWarnings("deprecation")
	@Then("^user should sucessfully login to mercury tours site\\.$")
	public void user_should_sucessfully_login_to_mercury_tours_site() throws Throwable {

		FlightFinderPage fpobj = new FlightFinderPage();

		
	 Assert.assertTrue("user sucessfully login to mercury tours", fpobj.issignofflink());
	logger.info("login successful or not checked");

	}

	@Then("^close the browser\\.$")
	public void close_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	
	       closeBrowser();
		logger.info("closing the browser");
		 }
	   
		 
		 
		
	}


