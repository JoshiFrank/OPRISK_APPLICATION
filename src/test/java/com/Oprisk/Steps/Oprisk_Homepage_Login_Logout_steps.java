package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepage_Login_Logout_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.WebdriverAssertionError;

public class Oprisk_Homepage_Login_Logout_steps {

	@Managed
	WebDriver driver;
	@Steps
	Oprisk_Homepage_Login_Logout_pages hp;
	
	
	@When("To click Logout option in login functionality")
	public void to_click_logout_option_in_login_functionality() {
		hp.to_click_logout_option_in_login_functionality();
		
		
	    
	}

	@Then("To validate logout option page")
	public void to_validate_logout_option_page() {
		hp.to_validate_logout_option_page();
	    
	}

	@When("To click Cancel in logout page in login functionality")
	public void to_click_cancel_in_logout_page_in_login_functionality() {
		hp.to_click_cancel_in_logout_page_in_login_functionality();
	    
	}

	
	    
	
	
	
}
