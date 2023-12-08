package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepage_Details_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Homepage_Details_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Homepage_Details_pages hp;
	
	// To Test the Details option in Login dropdown

		@When("To click Details option in Login dropdown")
		public void to_click_details_option_in_login_dropdown() {
			hp.to_click_details_option_in_login_dropdown();

		}

		@Then("To validate Personal Details page")
		public void to_validate_personal_details_page() {
			hp.to_validate_personal_details_page();

		}

		@Then("To validate username details")
		public void to_validate_username_details() {
			hp.to_validate_username_details();

		}

		@Then("To validate Details option")
		public void to_validate_details_option() {
			hp.to_validate_details_option();

		}

		@Then("To Validate Authorization option")
		public void to_validate_authorization_option() {
			hp.to_validate_authorization_option();

		}

		@Then("To Validate Usergroups option")
		public void to_validate_usergroups_option() {
			hp.to_validate_usergroups_option();

		}

		@Then("To click Save button")
		public void to_click_save_button() {
			hp.to_click_save_button();

		}

}
