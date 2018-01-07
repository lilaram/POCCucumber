package com.lilauto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lilauto.base.TestBase;

public class FlightFinderPage extends TestBase {
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	WebElement signoff;
	
	@FindBy(xpath="//input[@name='tripType']")
	WebElement type;
			
	@FindBy(xpath="//select[@name='passCount']")
	WebElement passengers;
	
	@FindBy(xpath="//select[@name='fromPort']")
    WebElement departing_from;
	
	@FindBy(xpath="//select[@name='fromMonth']")
    WebElement on;
	
	@FindBy(xpath="//select[@name='toPort']")
    WebElement arriving_in;
	

	@FindBy(xpath="//select[@name='toMonth']")
    WebElement returning_in;
	

	@FindBy(xpath="//input[@name='servClass']")
    WebElement serviceclass;
	
	@FindBy(xpath="//select[@name='airline']")
    WebElement airlines;
	
	@FindBy(xpath=".//input[@name='findFlights']")
    WebElement button_continue;
	
	@FindBy(xpath=".//input[@value='First']")
    WebElement preffirstclass;
	 
	public FlightFinderPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void selectNoPassenger(String no)
	{
		
		 new Select(passengers).selectByVisibleText(no);
		
	}
	
	
	public void selectDepartingFrom(String countryname)
	{
		
		 new Select(departing_from).selectByVisibleText(countryname);
		
	}
	
	public void selectArrivingIn(String countryname)
	{
		
		 new Select(arriving_in).selectByVisibleText(countryname);
	}
	
	public void selectReturningIn(String month)
	{
		 new Select(returning_in).selectByVisibleText(month);
	}
	
	public void selectPreferenceFirst()
	{
		preffirstclass.click();
	}
	public void selectAirLines(String name)
	{
		new Select(airlines).selectByVisibleText(name);
	}
	public boolean issignofflink()
	{
		if(signoff.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public SelectFlightPage flpgcontinuebutton()
	{
		button_continue.click();	
		return new SelectFlightPage();
	}
	
	public boolean validateTypeField()
	{
		if(type.isDisplayed())
		{
			return true;
		}
		else
		{
			 return false;
		}
	}
	
	public boolean validatefrommonthField()
	{
		if(on.isDisplayed())
		{
			return true;
		}
		else
		{
			 return false;
		}
	}

	
	public boolean validatedepartingfromField()
	{
		if(departing_from.isDisplayed())
		{
			return true;
		}
		else
		{
			 return false;
		}
	}

}


