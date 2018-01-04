package com.lilauto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lilauto.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "userName")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "login")
	WebElement loginbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void setUserName(String name) {
		username.sendKeys(name);
	}

	public void setPassword(String passwd) {
		password.sendKeys(passwd);
	}

	public FlightFinderPage login() {
		loginbutton.click();
		return new FlightFinderPage();
	}

	

}
