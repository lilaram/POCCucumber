package com.lilauto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lilauto.base.TestBase;

public class FlightFinderPage extends TestBase {
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	WebElement signoff;
	
	@FindBy(xpath="")
	WebElement label_type;
			
	@FindBy(xpath="")
	WebElement label_passengers;
	
	@FindBy(xpath="")
    WebElement label_departing_from;
	
	@FindBy(xpath="")
    WebElement label_on;
	
	@FindBy(xpath="")
    WebElement label_arriving_in;
	

	@FindBy(xpath="")
    WebElement label_returning_in;
	

	@FindBy(xpath="")
    WebElement label_serviceclass;
	
	@FindBy(xpath="")
    WebElement label_airlines;
	
	@FindBy(xpath=".//input[@name='findFlights']")
    WebElement button_continue;
	
	public FlightFinderPage() {
		PageFactory.initElements(driver, this);

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
		


}


