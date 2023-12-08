package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Systemsettings_Configurationoptions_Gobalsettings_pages extends PageObject {

	// To Test Admin menu in Generic list defaults in Configuration option in System
	// settings

	// To click Generic list defaults link in Settings page
	@Step
	public void to_click_generic_list_defaults_link_in_settings_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Generic List Defaults']")).click();
		
	
	}

	// To validate Maintain Global Generic List Default Preferences page
	@Step
	public void to_validate_maintain_global_generic_list_default_preferences_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Global Generic List Default Preferences']"))
				.isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Global Generic List Default Preferences
	// page
	@Step
	public void to_click_cancel_button_in_maintain_global_generic_list_default_preferences_page() {
		$(By.xpath("//input[@value='Cancel']")).click();
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Global dashboards in Configuration option in System
	// settings

	// To click Global dashboards link in Settings page
	@Step
	public void to_click_global_dashboards_link_in_settings_page() throws InterruptedException {
		Thread.sleep(2000);
     $(By.xpath("//a[text()='Global Dashboards']")).click();
	}

	//To validate Maintain Global Dashboards page
	@Step
	public void to_validate_maintain_global_dashboards_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Global Dashboards']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button in Maintain Global Dashboards page
	@Step
	public void to_click_cancel_button_in_maintain_global_dashboards_page() {
		$(By.xpath("//input[@value='Cancel']")).click();
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Preferences sets in Configuration option in System settings
	
	//To click Preferences sets link in Settings page
	@Step
	public void to_click_preferences_sets_link_in_settings_page() throws InterruptedException  {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Preference Sets']")).click();
	}

	//To validate List Preference Sets page
	@Step
	public void to_validate_list_preference_sets_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='List Preference Sets']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button List Preference Sets page
	@Step
	public void to_click_cancel_button_list_preference_sets_page() {
	    
		$(By.xpath("//input[@value='Cancel']")).click();
	}	
	
}

