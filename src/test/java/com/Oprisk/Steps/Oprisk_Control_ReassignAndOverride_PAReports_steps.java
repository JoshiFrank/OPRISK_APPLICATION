package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Control_ReassignAndOverride_PAReports_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Control_ReassignAndOverride_PAReports_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Control_ReassignAndOverride_PAReports_pages ro;
	
	@When("To click the Reassign PA reports option")
	public void to_click_the_reassign_pa_reports_option() throws InterruptedException {
	    ro.to_click_the_reassign_pa_reports_option();
	}

	@Then("To validate the Reassign Positive Assurance Reports page")
	public void to_validate_the_reassign_positive_assurance_reports_page() throws InterruptedException {
	    ro.to_validate_the_reassign_positive_assurance_reports_page();
	}

	@When("To click the Edit option in Reassign Positive Assurance Reports page")
	public void to_click_the_edit_option_in_reassign_positive_assurance_reports_page() {
	   ro.to_click_the_edit_option_in_reassign_positive_assurance_reports_page();
	}

	@When("To Select dropdown option in business manager in Reassign Positive Assurance Reports page")
	public void to_select_dropdown_option_in_business_manager_in_reassign_positive_assurance_reports_page() throws InterruptedException {
	    ro.to_select_dropdown_option_in_business_manager_in_reassign_positive_assurance_reports_page();
	}

	@When("To click save button in Reassign Positive Assurance Reports page")
	public void to_click_save_button_in_reassign_positive_assurance_reports_page() {
	   ro.to_click_save_button_in_reassign_positive_assurance_reports_page();
	}

	@When("To click ok button in confirm popup in Reassign Positive Assurance Reports page")
	public void to_click_ok_button_in_confirm_popup_in_reassign_positive_assurance_reports_page() throws InterruptedException {
	    ro.to_click_ok_button_in_confirm_popup_in_reassign_positive_assurance_reports_page();
	}

	@When("To click the cancel button in Reassign Positive Assurance Reports page")
	public void to_click_the_cancel_button_in_reassign_positive_assurance_reports_page() throws InterruptedException {
	   ro.to_click_the_cancel_button_in_reassign_positive_assurance_reports_page(); 
	}

	@When("To click the Override PA Report")
	public void to_click_the_override_pa_report() throws InterruptedException {
	    ro.to_click_the_override_pa_report();
	}

	@Then("To Validate the Approval override page")
	public void to_validate_the_approval_override_page() throws InterruptedException {
	    ro.to_validate_the_approval_override_page();
	}

	@When("To click any check box under override option in Approval override page")
	public void to_click_any_check_box_under_override_option_in_approval_override_page() {
	   ro.to_click_any_check_box_under_override_option_in_approval_override_page();
	}

	@When("To click the override button in Approval override page")
	public void to_click_the_override_button_in_approval_override_page() {
	    ro.to_click_the_override_button_in_approval_override_page();
	}

	@When("To click ok button in confirm popup in Approval override page")
	public void to_click_ok_button_in_confirm_popup_in_approval_override_page() throws InterruptedException {
	    ro.to_click_ok_button_in_confirm_popup_in_approval_override_page();
	}


}
