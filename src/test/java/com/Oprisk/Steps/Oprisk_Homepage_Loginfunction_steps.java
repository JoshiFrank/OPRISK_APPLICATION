package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepage_Loginfunction_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Homepage_Loginfunction_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Homepage_Loginfunction_pages hp;
	
	// To test the Login functionality

		@When("To click Login button")
		public void to_click_login_button() {

			hp.to_click_login_button();

		}

		@Then("To Validate the Login dropdown")
		public void to_validate_the_login_dropdown() throws InterruptedException {

			hp.to_validate_the_login_dropdown();

		}

	

}
