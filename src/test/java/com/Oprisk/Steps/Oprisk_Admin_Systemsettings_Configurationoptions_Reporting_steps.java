package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Systemsettings_Configurationoptions_Reporting_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Systemsettings_Configurationoptions_Reporting_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Systemsettings_Configurationoptions_Reporting_pages rtp;

	//To Test Admin menu in Folders in Configuration option in System settings
	
	@When("To click Folders link in Settings page")
	public void to_click_folders_link_in_settings_page() throws InterruptedException {
	  rtp.to_click_folders_link_in_settings_page(); 
	}

	@Then("To validate Maintain Reports Folders page")
	public void to_validate_maintain_reports_folders_page() throws InterruptedException {
	   rtp.to_validate_maintain_reports_folders_page();
	}

	@When("To click cancel button in Maintain Reports Folders page")
	public void to_click_cancel_button_in_maintain_reports_folders_page() {
	   rtp.to_click_cancel_button_in_maintain_reports_folders_page(); 
	}
//-------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in User Report Defaults in Configuration option in System settings
	
	@When("To click User Report Defaults link in Settings page")
	public void to_click_user_report_defaults_link_in_settings_page() throws InterruptedException {
	   rtp.to_click_user_report_defaults_link_in_settings_page();
	}

	@Then("To validate User Report Defaults page")
	public void to_validate_user_report_defaults_page() throws InterruptedException {
	    rtp.to_validate_user_report_defaults_page();
	}

	@When("To click cancel button in User Report Defaults page")
	public void to_click_cancel_button_in_user_report_defaults_page() {
	   rtp.to_click_cancel_button_in_user_report_defaults_page();
	}
	
}
