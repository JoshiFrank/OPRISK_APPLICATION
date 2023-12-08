package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Systemsettings_Configurationoptions_Systemconfiguration_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Systemsettings_Configurationoptions_Systemconfiguration_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Systemsettings_Configurationoptions_Systemconfiguration_pages scp;
	
	//To Test Admin menu in Integrations Areas in Configuration option in System settings
	
	@When("To click Integrations Areas link in Settings page")
	public void to_click_integrations_areas_link_in_settings_page() throws InterruptedException {
	    scp.to_click_integrations_areas_link_in_settings_page();
	}

	@Then("To validate Questionnaire Integrations page")
	public void to_validate_questionnaire_integrations_page() throws InterruptedException {
	   scp.to_validate_questionnaire_integrations_page();
	}

	@When("To click cancel button in Questionnaire Integrations page")
	public void to_click_cancel_button_in_questionnaire_integrations_page() {
	  scp.to_click_cancel_button_in_questionnaire_integrations_page();
	}
//-----------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Issues Log Administrator in Configuration option in System settings
	
	@When("To click Issues Log Administrator link in Settings page")
	public void to_click_issues_log_administrator_link_in_settings_page() throws InterruptedException {
	   scp.to_click_issues_log_administrator_link_in_settings_page(); 
	}

	@Then("To validate Issues Log Administrator page")
	public void to_validate_issues_log_administrator_page() throws InterruptedException {
	  scp.to_validate_issues_log_administrator_page();  
	}

	@When("To click cancel button in Issues Log Administrator page")
	public void to_click_cancel_button_in_issues_log_administrator_page() {
	   scp.to_click_cancel_button_in_issues_log_administrator_page();
	}
	

}
