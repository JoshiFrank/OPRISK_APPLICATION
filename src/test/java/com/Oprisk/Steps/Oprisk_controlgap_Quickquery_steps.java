package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_controlgap_Quickquery_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_controlgap_Quickquery_steps {

	@Managed
	WebDriver driver;

	@Steps
	Oprisk_controlgap_Quickquery_pages Qqy;

	@When("To click the Quick query option")
	public void to_click_the_quick_query_option() throws InterruptedException {
		Qqy.to_click_the_quick_query_option();
	}

	@Then("To validate the issue Quick query page")
	public void to_validate_the_issue_quick_query_page() {
		Qqy.to_validate_the_issue_quick_query_page();
	}

	@Then("To click the issue id radio button in issue Quick query page")
	public void to_click_the_issue_id_radio_button_in_issue_quick_query_page() throws InterruptedException {
		Qqy.to_click_the_issue_id_radio_button_in_issue_quick_query_page();
	}

	@Then("To Enter the id in the issue id box issue Quick query page")
	public void to_enter_the_id_in_the_issue_id_box_issue_quick_query_page() throws InterruptedException {
		Qqy.to_enter_the_id_in_the_issue_id_box_issue_quick_query_page();
	}

	@Then("To click the Run button issue Quick query page")
	public void to_click_the_run_button_issue_quick_query_page() throws InterruptedException {
		Qqy.to_click_the_run_button_issue_quick_query_page();
	}

	@Then("To validate the id in the issue id box control gap management page")
	public void to_validate_the_id_in_the_issue_id_box_control_gap_management_page() throws InterruptedException {
		Qqy.to_validate_the_id_in_the_issue_id_box_control_gap_management_page();
	}

}
