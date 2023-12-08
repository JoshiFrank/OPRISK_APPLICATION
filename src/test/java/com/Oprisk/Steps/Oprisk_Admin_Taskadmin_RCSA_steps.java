package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Taskadmin_RCSA_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Taskadmin_RCSA_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Taskadmin_RCSA_pages rcs;
	
	
	@When("To mouse hover to Task Admin option")
	public void to_mouse_hover_to_task_admin_option() throws InterruptedException {
	   rcs.to_mouse_hover_to_task_admin_option(); 
	}

	@When("To click the Generate Risk and Control Self Assessment in Task Admin option")
	public void to_click_the_generate_risk_and_control_self_assessment_in_task_admin_option() {
	   rcs.to_click_the_generate_risk_and_control_self_assessment_in_task_admin_option(); 
	}

	@Then("To validate Organisation Unit for Risk and Control Self Assessment")
	public void to_validate_organisation_unit_for_risk_and_control_self_assessment() throws InterruptedException {
	    rcs.to_validate_organisation_unit_for_risk_and_control_self_assessment();
	}

	@When("To click the Arrow button in office of the president in Organisation Unit for Risk and Control Self Assessment")
	public void to_click_the_arrow_button_in_office_of_the_president_in_organisation_unit_for_risk_and_control_self_assessment() {
	    rcs.to_click_the_arrow_button_in_office_of_the_president_in_organisation_unit_for_risk_and_control_self_assessment();
	}

	@When("To click the Arrow button in the president in Organisation Unit for Risk and Control Self Assessment")
	public void to_click_the_arrow_button_in_the_president_in_organisation_unit_for_risk_and_control_self_assessment() throws InterruptedException {
	    rcs.to_click_the_arrow_button_in_the_president_in_organisation_unit_for_risk_and_control_self_assessment();
	}

	@When("To click check box in Risk Management option Organisation Unit for Risk and Control Self Assessment")
	public void to_click_check_box_in_risk_management_option_organisation_unit_for_risk_and_control_self_assessment() {
	   rcs.to_click_check_box_in_risk_management_option_organisation_unit_for_risk_and_control_self_assessment();
	}

	@When("To click proceed button in Organisation Unit for Risk and Control Self Assessment")
	public void to_click_proceed_button_in_organisation_unit_for_risk_and_control_self_assessment() {
	    rcs.to_click_proceed_button_in_organisation_unit_for_risk_and_control_self_assessment();
	}

	@Then("To validate RCSA Report Generation Page")
	public void to_validate_rcsa_report_generation_page() throws InterruptedException {
	    rcs.to_validate_rcsa_report_generation_page();
	}

	@When("To click Start button in RCSA Report Generation Page")
	public void to_click_start_button_in_rcsa_report_generation_page() throws InterruptedException {
	    rcs.to_click_start_button_in_rcsa_report_generation_page();
	}

}
