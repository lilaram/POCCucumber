package com.lilauto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.lilauto.base.TestBase;

public class RegisterPage extends TestBase {

	@FindBy(xpath = ".//a[text()='REGISTER']")
	WebElement registerlink;

	@FindBy(name = "firstName")
	WebElement fname;
	@FindBy(name = "lastName")
	WebElement lname;
	@FindBy(name = "phone")
	WebElement phone;
	@FindBy(id = "userName")
	WebElement email;
	@FindBy(name = "address1")
	WebElement address;
	@FindBy(name = "city")
	WebElement city;
	@FindBy(name = "state")
	WebElement state;
	@FindBy(name = "postalCode")
	WebElement postalcode;
	@FindBy(name = "country")
	WebElement country;
	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(xpath="//input[@name='register']")
	WebElement submitbutton;
	
//	@FindBy(xpath="//table[4]/tr[3]/td/p[3]/a/font/b[contains(text(),'Note:')")
//	WebElement usernametext;

	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}

	public void setFirstName(String f_name) {
		fname.sendKeys(f_name);
	}

	public void setLastName(String l_name) {
		lname.sendKeys(l_name);
	}

	public void setphoneno(String phonenum) {
		phone.sendKeys(phonenum);
	}

	public void setemail(String emailid) {
		email.sendKeys(emailid);
	}

	public void setaddress(String addressa) {
		address.sendKeys(addressa);
	}

	public void setcity(String cityname) {
		city.sendKeys(cityname);
	}

	public void setstate(String statename) {
		state.sendKeys(statename);
	}

	public void setpostalcode(String postalcode1) {
		postalcode.sendKeys(postalcode1);
	}

	public void selectcountry(String countryname) {
		
		Select s=new Select(country);
		 s.selectByVisibleText(countryname);
	}

	public String setusername(String username1) {
		username.sendKeys(username1);
		
		return  username1;
	}

	public void setpassword(String password1) {
		password.sendKeys(password1);
	}

	public void setconfirmpassword(String cpassword) {
		confirmpassword.sendKeys(cpassword);
	}

	public void RegisterLink() {

		registerlink.click();
	}
	public void clicksubmit()
	{
		
		submitbutton.click();
	}
	
    
	
}
