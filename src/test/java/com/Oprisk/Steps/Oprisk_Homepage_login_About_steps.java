package com.Oprisk.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepage_login_About_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Homepage_login_About_steps {
	@Managed
	WebDriver driver;
		
		@Steps
		Oprisk_Homepage_login_About_pages hp;
		
		
		@When("To click About in Login functionality")
		public void to_click_about_in_login_functionality() {
			hp.to_click_about_in_login_functionality();
			
		    
		}

		@Then("To validate the about functionality")
		public void to_validate_the_about_functionality() {
		    hp.to_validate_the_about_functionality();
		}

		@When("To print the about details in login functionality")
		public void to_print_the_about_details_in_login_functionality() {
			hp.to_print_the_about_details_in_login_functionality();
		   
		}

		@When("To click Cancel in About in login functionality")
		public void to_click_cancel_in_about_in_login_functionality() {
			hp.to_click_cancel_in_about_in_login_functionality();
		    
		}
	

}
