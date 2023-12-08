package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Home_Reports_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Home_Reports_steps {

	@Managed
	WebDriver driver;

	@Steps
	Oprisk_Home_Reports_pages rp;

	@When("To click the Home option in Homepage")
	public void to_click_the_home_option_in_homepage() throws InterruptedException {

		rp.to_click_the_home_option_in_homepage();
	}

	@When("To click the Reports option in Home")
	public void to_click_the_reports_option_in_home() throws InterruptedException {
		rp.to_click_the_reports_option_in_home();
	}

	@Then("To validate the Reports page")
	public void to_validate_the_reports_page() throws InterruptedException {
		rp.to_validate_the_reports_page();
	}

	@When("To click Filter icon")
	public void to_click_filter_icon() throws InterruptedException {
		rp.to_click_filter_icon();

	}

	@Then("To validate the Reports option")
	public void to_validate_the_reports_option() throws InterruptedException {
		rp.to_validate_the_reports_option();

	}

	@When("To click Filters arrow")
	public void to_click_filters_arrow() {
		rp.to_click_filters_arrow();
	}

	@When("To click My application reports")
	public void to_click_my_application_reports() throws InterruptedException {
		rp.to_click_my_application_reports();
	}

	@Then("To validate My application reports")
	public void to_validate_my_application_reports() {
		rp.to_validate_my_application_reports();
	}

	@When("To click My Data Extracts")
	public void to_click_my_data_extracts() throws InterruptedException {
		rp.to_click_my_data_extracts();
		
	}

	@Then("To validate My Data Extracts")
	public void to_validate_my_data_extracts() {
		rp.to_validate_my_data_extracts();
	}

	@When("To Click My user reports")
	public void to_click_my_user_reports() throws InterruptedException {
		rp.to_click_my_user_reports();
	}

	@Then("To validate my user reports")
	public void to_validate_my_user_reports() {
		rp.to_validate_my_user_reports();
	}

	@When("To Click Sample user reports")
	public void to_click_sample_user_reports() throws InterruptedException {
		rp.to_click_sample_user_reports();
	}

	@Then("To validate Sample user reports")
	public void to_validate_sample_user_reports() {
		rp.to_validate_sample_user_reports();
	}

}
