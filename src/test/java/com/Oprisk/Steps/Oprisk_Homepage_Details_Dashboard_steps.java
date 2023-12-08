package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepage_Details_Dashboard_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Homepage_Details_Dashboard_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Homepage_Details_Dashboard_pages hp;
	
	// To Test the Details option- dashboard in Login dropdown

		@When("To click Dashboard option")
		public void to_click_dashboard_option() {
			
			hp.to_click_dashboard_option();

		}

		@Then("To validate dashboard options")
		public void to_validate_dashboard_options() {
			
			hp.to_validate_dashboard_options();

		}

		@When("To click Create a new dashboard")
		public void to_click_create_a_new_dashboard() {
			
			hp.to_click_create_a_new_dashboard();

		}

		@When("To click Next button")
		public void to_click_next_button() {
			
			hp.to_click_next_button();

		}

		@Then("To validate dashboard layout page")
		public void to_validate_dashboard_layout_page() throws InterruptedException, AWTException {
			
			hp.to_validate_dashboard_layout_page();

		}

		@When("Navigate to back")
		public void navigate_to_back() {
			
			hp.navigate_to_back();

		}

		@When("To click Cancel button")
		public void to_click_cancel_button() {
			
			hp.to_click_cancel_button();
		}

		@Then("To validate Workspace")
		public void to_validate_workspace() {
			
			hp.to_validate_workspace();

		}

}
