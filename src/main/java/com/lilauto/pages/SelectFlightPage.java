package com.lilauto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lilauto.base.TestBase;

public class SelectFlightPage extends TestBase {
	
	
	@FindBy(xpath=".//input[@name='reserveFlights']")
	WebElement buttonreserve;
	public SelectFlightPage() {
		PageFactory.initElements(driver, this);

	}
	
	public BookFlight reserveflightbutton()
	{
	
		 buttonreserve.click();
		
	
	  return new BookFlight();
	}
	
	

}
