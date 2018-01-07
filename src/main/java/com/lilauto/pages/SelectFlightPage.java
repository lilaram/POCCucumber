package com.lilauto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lilauto.base.TestBase;

public class SelectFlightPage extends TestBase {
	
	
	@FindBy(xpath=".//input[@name='reserveFlights']")
	WebElement buttonreserve;
	
	@FindBy(xpath=".//input[@name='outFlight']")
	WebElement selectflightdefault;
	
	@FindBy(xpath=".//input[@name='inFlight']")
	WebElement returnflightdefault;
	
	@FindBy(xpath=".//input[@value='Pangea Airlines$362$274$9:17']")
	WebElement sflights;
	
	public SelectFlightPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void selectflight()
	{
		sflights.click();
	}
	public BookFlightPage reserveflightbutton()
	{
			 buttonreserve.click();
		  return new BookFlightPage();
	}
	
	public boolean selectFightDefault()
	{
		if(selectflightdefault.isDisplayed())
		{
			return true;
		}
		else
		{
		return false;
		}
		
	}
	
	public boolean returnselectedFightDefault()
	{
		if(returnflightdefault.isDisplayed())
		{
			return true;
		}
		else
		{
		return false;
		}
		
	}

}
