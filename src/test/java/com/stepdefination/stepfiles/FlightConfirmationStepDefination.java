package com.stepdefination.stepfiles;

import com.lilauto.base.TestBase;
import com.lilauto.pages.BookFlightPage;

import cucumber.api.java.en.Then;

public class FlightConfirmationStepDefination extends TestBase {
	
	BookFlightPage bfobj;
	
	@Then("^Click on the secure purchase button of book a fligh page\\.$")
	public void click_on_the_secure_purchase_button_of_book_a_fligh_page() throws Throwable {
	    bfobj=new BookFlightPage();
		bfobj.clicksecurepaybttn();
		
	}

}
