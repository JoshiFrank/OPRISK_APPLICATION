package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Systemsettings_Configurationoptions_Gobalsettings_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Systemsettings_Configurationoptions_Gobalsettings_steps {

	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Systemsettings_Configurationoptions_Gobalsettings_pages gsp;
	
   // To Test Admin menu in Generic list defaults in Configuration option in System settings	
	
	@When("To click Generic list defaults link in Settings page")
	public void to_click_generic_list_defaults_link_in_settings_page() throws InterruptedException {
	   gsp.to_click_generic_list_defaults_link_in_settings_page();
	}

	@Then("To validate Maintain Global Generic List Default Preferences page")
	public void to_validate_maintain_global_generic_list_default_preferences_page() throws InterruptedException {
	  gsp.to_validate_maintain_global_generic_list_default_preferences_page();  
	}

	@When("To click cancel button in Maintain Global Generic List Default Preferences page")
	public void to_click_cancel_button_in_maintain_global_generic_list_default_preferences_page() {
	  gsp.to_click_cancel_button_in_maintain_global_generic_list_default_preferences_page();  
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------
	
  //To Test Admin menu in Global dashboards in Configuration option in System settings
	
	@When("To click Global dashboards link in Settings page")
	public void to_click_global_dashboards_link_in_settings_page() throws InterruptedException {
	   gsp.to_click_global_dashboards_link_in_settings_page();
	}

	@Then("To validate Maintain Global Dashboards page")
	public void to_validate_maintain_global_dashboards_page() throws InterruptedException {
	  gsp.to_validate_maintain_global_dashboards_page(); 
	}

	@When("To click cancel button in Maintain Global Dashboards page")
	public void to_click_cancel_button_in_maintain_global_dashboards_page() {
	  gsp.to_click_cancel_button_in_maintain_global_dashboards_page(); 
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Preferences sets in Configuration option in System settings
	
	@When("To click Preferences sets link in Settings page")
	public void to_click_preferences_sets_link_in_settings_page() throws InterruptedException {
	    gsp.to_click_preferences_sets_link_in_settings_page();
	}

	@Then("To validate List Preference Sets page")
	public void to_validate_list_preference_sets_page() throws InterruptedException {
	   gsp.to_validate_list_preference_sets_page();
	}

	@When("To click cancel button List Preference Sets page")
	public void to_click_cancel_button_list_preference_sets_page() {
	   gsp.to_click_cancel_button_list_preference_sets_page(); 
	}
	
	
}
