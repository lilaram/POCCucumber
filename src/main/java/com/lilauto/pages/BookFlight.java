package com.lilauto.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lilauto.base.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlight extends TestBase {

	@FindBy(xpath=".//input[@name='buyFlights']")
	WebElement securepaymentbutton;
	
	public BookFlight() {
		PageFactory.initElements(driver, this);
	}
	public FlightConfirmationPage clicksecurepaybttn()
	{
				
		securepaymentbutton.click();
		return new FlightConfirmationPage();
	}

}
