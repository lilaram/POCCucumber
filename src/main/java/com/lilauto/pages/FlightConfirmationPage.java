package com.lilauto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lilauto.base.TestBase;

public class FlightConfirmationPage extends TestBase {

	@FindBy(xpath="//img[@src='/images/masts/mast_confirmation.gif']")
	WebElement confirmlabel;
	
	public FlightConfirmationPage() {
		PageFactory.initElements(driver, this);

	}

	public boolean validateconfirm()
	{
		
		if(confirmlabel.isDisplayed())
		{
		return true;

		}
		else
		{
			return false;
		}
	}
	
}
