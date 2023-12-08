package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Systemsettings_Configurationoptions_Hierarchyconfiguration_pages extends PageObject {

	// To Test Admin menu in Authoritative Category Levels in Configuration option
	// in System settings

	// To click Authoritative Category Levels link in Settings page
	@Step
	public void to_click_authoritative_category_levels_link_in_settings_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//a[text()='Authoritative Category Levels']")).click();
	}

	//To validate Maintain Authoritative Category Level Hierarchy page
	@Step
	public void to_validate_maintain_authoritative_category_level_hierarchy_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Authoritative Category Level Hierarchy']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button in Maintain Authoritative Category Level Hierarchy page
	@Step
	public void to_click_cancel_button_in_maintain_authoritative_category_level_hierarchy_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//-----------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Location Levels in Configuration option in System
	// settings

	//To click Location Levels link in Settings page
	@Step
	public void to_click_location_levels_link_in_settings_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Location Levels']")).click();
	}

	//To validate Maintain Location Level Hierarchy page
	@Step
	public void to_validate_maintain_location_level_hierarchy_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Location Level Hierarchy']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button in Maintain Location Level Hierarchy page
	@Step
	public void to_click_cancel_button_in_maintain_location_level_hierarchy_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}

}
