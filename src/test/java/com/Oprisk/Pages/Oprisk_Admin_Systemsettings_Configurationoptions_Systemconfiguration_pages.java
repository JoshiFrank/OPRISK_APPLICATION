package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Systemsettings_Configurationoptions_Systemconfiguration_pages extends PageObject {

	// To Test Admin menu in Integrations Areas in Configuration option in System
	// settings

	//To click Integrations Areas link in Settings page
	@Step
	public void to_click_integrations_areas_link_in_settings_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Integration Areas']")).click();
	}

	//To validate Questionnaire Integrations page
	@Step
	public void to_validate_questionnaire_integrations_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Questionnaire Integrations']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button in Questionnaire Integrations page
	@Step
	public void to_click_cancel_button_in_questionnaire_integrations_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//-----------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Issues Log Administrator in Configuration option in
	// System settings

	//To click Issues Log Administrator link in Settings page
	@Step
	public void to_click_issues_log_administrator_link_in_settings_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Issue Log Administrators']")).click();
	}

	//To validate Issues Log Administrator page
	@Step
	public void to_validate_issues_log_administrator_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Issues Log Administrator']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button in Issues Log Administrator page
	@Step
	public void to_click_cancel_button_in_issues_log_administrator_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}

}
