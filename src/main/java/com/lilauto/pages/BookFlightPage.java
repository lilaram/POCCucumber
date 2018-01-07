package com.lilauto.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lilauto.base.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlightPage extends TestBase {

	@FindBy(xpath = ".//input[@name='buyFlights']")
	WebElement securepaymentbutton;

	@FindBy(xpath = ".//input[@name='passFirst0']")
	WebElement firstname;

	@FindBy(xpath = ".//input[@name='passLast0']")
	WebElement lastname;

	@FindBy(xpath = ".//select[@name='pass.0.meal']")
	WebElement meal;

	@FindBy(xpath = ".//input[@name='billAddress1']")
	WebElement address;

	@FindBy(xpath = ".//input[@name='billCity']")
	WebElement city;

	@FindBy(xpath = ".//input[@name='delZip']")
	WebElement postalcode;
	
	@FindBy(xpath=".//input[@name='creditnumber']")
	WebElement cardnumber;

	public BookFlightPage() {
		PageFactory.initElements(driver, this);
	}

	public FlightConfirmationPage clicksecurepaybttn() {

		securepaymentbutton.click();
		return new FlightConfirmationPage();
	}

	public void submitFirstName(String name)
	{
		firstname.sendKeys(name);
	}
	
	public void submitLastName(String name)
	{
		lastname.sendKeys(name);
	}
	public void selectMealType(String name)
	{
		new Select(meal).selectByVisibleText(name);
	}
	public void submitCardNumber(String number)
	{
		
		cardnumber.sendKeys(number);
		
	}
	public boolean validatefirstname() {
		if (firstname.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validatemeal() {
		if (meal.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validatelastname() {
		if (lastname.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	

	public boolean validateaddress() {
		if (address.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validatecity() {
		if (city.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validatepostalcode() {
		if (postalcode.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
