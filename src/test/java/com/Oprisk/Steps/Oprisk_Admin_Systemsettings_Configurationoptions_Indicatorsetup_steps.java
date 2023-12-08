package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Systemsettings_Configurationoptions_Indicatorsetup_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Systemsettings_Configurationoptions_Indicatorsetup_steps {

	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Systemsettings_Configurationoptions_Indicatorsetup_pages isp;
	
	@When("To click Dimension Types link in Settings page")
	public void to_click_dimension_types_link_in_settings_page() throws InterruptedException {
	   isp.to_click_dimension_types_link_in_settings_page();
	}

	@Then("To validate List Dimension Types page")
	public void to_validate_list_dimension_types_page() throws InterruptedException {
	   isp.to_validate_list_dimension_types_page();
	}

	@When("To click cancel button in List Dimension Types page")
	public void to_click_cancel_button_in_list_dimension_types_page() {
	  isp.to_click_cancel_button_in_list_dimension_types_page();
	}
	
}
