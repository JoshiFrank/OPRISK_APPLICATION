package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Systemsettings_Configurationoptions_Reporting_pages extends PageObject {

	// To Test Admin menu in Folders in Configuration option in System settings

	//To click Folders link in Settings page
	@Step
	public void to_click_folders_link_in_settings_page() throws InterruptedException {
   
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Folders']")).click();
	}

	//To validate Maintain Reports Folders page
	@Step
	public void to_validate_maintain_reports_folders_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Reports Folders']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button in Maintain Reports Folders page
	@Step
	public void to_click_cancel_button_in_maintain_reports_folders_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//-------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in User Report Defaults in Configuration option in System
	// settings

	//To click User Report Defaults link in Settings page
	@Step
	public void to_click_user_report_defaults_link_in_settings_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='User Report Defaults']")).click();
	}

	//To validate User Report Defaults page
	@Step
	public void to_validate_user_report_defaults_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='User Report Defaults']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button in User Report Defaults page
	@Step
	public void to_click_cancel_button_in_user_report_defaults_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}

}
