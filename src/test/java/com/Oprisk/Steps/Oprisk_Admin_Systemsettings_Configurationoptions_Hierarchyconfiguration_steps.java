package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Systemsettings_Configurationoptions_Hierarchyconfiguration_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Systemsettings_Configurationoptions_Hierarchyconfiguration_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Systemsettings_Configurationoptions_Hierarchyconfiguration_pages hcp;

   //To Test Admin menu in Authoritative Category Levels in Configuration option in System settings
	@When("To click Authoritative Category Levels link in Settings page")
	public void to_click_authoritative_category_levels_link_in_settings_page() throws InterruptedException {
	    hcp.to_click_authoritative_category_levels_link_in_settings_page();
	}

	@Then("To validate Maintain Authoritative Category Level Hierarchy page")
	public void to_validate_maintain_authoritative_category_level_hierarchy_page() throws InterruptedException {
	    hcp.to_validate_maintain_authoritative_category_level_hierarchy_page();
	}

	@When("To click cancel button in Maintain Authoritative Category Level Hierarchy page")
	public void to_click_cancel_button_in_maintain_authoritative_category_level_hierarchy_page() {
	    hcp.to_click_cancel_button_in_maintain_authoritative_category_level_hierarchy_page();
	}
//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Location Levels in Configuration option in System settings
	
	@When("To click Location Levels link in Settings page")
	public void to_click_location_levels_link_in_settings_page() throws InterruptedException {
		hcp.to_click_location_levels_link_in_settings_page();
	}

	@Then("To validate Maintain Location Level Hierarchy page")
	public void to_validate_maintain_location_level_hierarchy_page() throws InterruptedException {
		hcp.to_validate_maintain_location_level_hierarchy_page();
	}

	@When("To click cancel button in Maintain Location Level Hierarchy page")
	public void to_click_cancel_button_in_maintain_location_level_hierarchy_page() {
		hcp.to_click_cancel_button_in_maintain_location_level_hierarchy_page();
	}
	
	
}
