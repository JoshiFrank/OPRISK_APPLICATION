package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepage_Login_Changepass_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Homepage_Login_Changepass_steps {
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Homepage_Login_Changepass_pages hp;
	
	
	@When("To click Product Ext Password")
	public void to_click_product_ext_password() {
		hp.to_click_product_ext_password();
	    
	}

	@Then("To validate Change password")
	public void to_validate_change_password() {
		hp.to_validate_change_password();
	    
	}

	@When("To click cancel in change password")
	public void to_click_cancel_in_change_password() {
		hp.to_click_cancel_in_change_password();
	    
	}

}
