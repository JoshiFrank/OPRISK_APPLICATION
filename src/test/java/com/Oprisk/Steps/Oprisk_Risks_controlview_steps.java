package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Risks_controlview_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Risks_controlview_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Risks_controlview_pages cvp;
	
	@When("To click the checkbox in RIMA")
	public void to_click_the_checkbox_in_rima() throws InterruptedException {
		cvp.to_click_the_checkbox_in_rima();
	   
	}

	@When("To click the reassign option in RCSA page")
	public void to_click_the_reassign_option_in_rcsa_page() throws InterruptedException {
		cvp.to_click_the_reassign_option_in_rcsa_page();
	    
	}

	@Then("To validate the Risk assessment selected pop up")
	public void to_validate_the_risk_assessment_selected_pop_up() {
	    cvp.to_validate_the_risk_assessment_selected_pop_up();
	}

	@When("To select joshi franklin in select person dropdowm")
	public void to_select_joshi_franklin_in_select_person_dropdowm() throws InterruptedException {
		cvp.to_select_joshi_franklin_in_select_person_dropdowm();
	    
	}

	@When("To click save in Risk assessment selected pop up")
	public void to_click_save_in_risk_assessment_selected_pop_up() throws InterruptedException {
		cvp.to_click_save_in_risk_assessment_selected_pop_up();
	   
	}

	@When("To click close in Risk assessment selected pop up")
	public void to_click_close_in_risk_assessment_selected_pop_up() throws InterruptedException {
		cvp.to_click_close_in_risk_assessment_selected_pop_up();
	    
	}

	@When("To click Risk assessment link RCSA page")
	public void to_click_risk_assessment_link_rcsa_page() throws InterruptedException {
	    cvp.to_click_risk_assessment_link_rcsa_page();
	}

	@Then("To validate the RCSA control view page")
	public void to_validate_the_rcsa_control_view_page() throws InterruptedException {
		cvp.to_validate_the_rcsa_control_view_page();
	    
	}

	@When("To click the proceed to approval button in control view page")
	public void to_click_the_proceed_to_approval_button_in_control_view_page() throws InterruptedException {
	    cvp.to_click_the_proceed_to_approval_button_in_control_view_page();
	}

	@Then("To Validate the RCSA approval page")
	public void to_validate_the_rcsa_approval_page() {
		cvp.to_validate_the_rcsa_approval_page();
	   
	}

	@When("To click the check box in RCSA approval page")
	public void to_click_the_check_box_in_rcsa_approval_page() {
	   cvp.to_click_the_check_box_in_rcsa_approval_page();
	}

	@When("To Enter value in comment box in RCSA approval page")
	public void to_enter_value_in_comment_box_in_rcsa_approval_page() throws InterruptedException {
	    cvp.to_enter_value_in_comment_box_in_rcsa_approval_page();
	}

	@When("To click the review dropdown in RCSA approval page")
	public void to_click_the_review_dropdown_in_rcsa_approval_page() throws InterruptedException {
	 cvp.to_click_the_review_dropdown_in_rcsa_approval_page();
	}

	@When("To select one reviewer in review dropdown in RCSA approval page")
	public void to_select_one_reviewer_in_review_dropdown_in_rcsa_approval_page() {
	   cvp.to_select_one_reviewer_in_review_dropdown_in_rcsa_approval_page();
	}

	@When("To click the RA save button in RCSA approval page")
	public void to_click_the_ra_save_button_in_rcsa_approval_page() {
	    cvp.to_click_the_ra_save_button_in_rcsa_approval_page();
	}

	@When("To click the history option in RCSA approval page")
	public void to_click_the_history_option_in_rcsa_approval_page() throws InterruptedException {
	    cvp.to_click_the_history_option_in_rcsa_approval_page();
	}

	@Then("To validate history option in RCSA approval page")
	public void to_validate_history_option_in_rcsa_approval_page() throws InterruptedException {
		cvp.to_validate_history_option_in_rcsa_approval_page();
	  
	}

	
	
	
	

}
