package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepage_Workspacesetting_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Homepage_Workspacesetting_steps {
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Homepage_Workspacesetting_pages hp;
	
	
	@When("To Click workspace settings")
	public void to_click_workspace_settings() {
		hp.to_click_workspace_settings();
	    
	}

	@Then("To Validate the workspace settings")
	public void to_validate_the_workspace_settings() {
		hp.to_validate_the_workspace_settings();
	   
	}

	@Then("To validate the individual settings")
	public void to_validate_the_individual_settings() {
		hp.to_validate_the_individual_settings();
	    
	}

	@When("To click Save in workspace settings")
	public void to_click_save_in_workspace_settings() {
		hp.to_click_save_in_workspace_settings();
	    
	}

	@When("To click OK")
	public void to_click_ok() {
		hp.to_click_ok();
	   
	}

	@When("To click Cancel in workspace settings")
	public void to_click_cancel_in_workspace_settings() {
		hp.to_click_cancel_in_workspace_settings();
	    
	}
		
	

}
