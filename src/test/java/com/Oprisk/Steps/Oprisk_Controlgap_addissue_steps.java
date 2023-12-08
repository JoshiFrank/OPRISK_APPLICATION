package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Controlgap_addissue_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Controlgap_addissue_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Controlgap_addissue_pages opcap;
	
	@When("To mouse hover to Control Gap Management")
	public void to_mouse_hover_to_control_gap_management() throws InterruptedException {
		
		opcap.to_mouse_hover_to_control_gap_management();
		
	    
	}

	@When("To click the control Gap Management option")
	public void to_click_the_control_gap_management_option() throws InterruptedException {
		opcap.to_click_the_control_gap_management_option();
	    
	}

	@Then("To validate control Gap Management page")
	public void to_validate_control_gap_management_page() {
		opcap.to_validate_control_gap_management_page();
	    
	}

	@When("To click the Add issue button in control Gap Management page")
	public void to_click_the_add_issue_button_in_control_gap_management_page() throws InterruptedException {
		opcap.to_click_the_add_issue_button_in_control_gap_management_page();
	}

	@Then("To validate the Add issue page in control Gap Management")
	public void to_validate_the_add_issue_page_in_control_gap_management() {
		opcap.to_validate_the_add_issue_page_in_control_gap_management();
	    
	}

	@When("To select drop down option and select in issue interest type option in Add issue page")
	public void to_select_drop_down_option_and_select_in_issue_interest_type_option_in_add_issue_page() throws InterruptedException {
	    opcap.to_select_drop_down_option_and_select_in_issue_interest_type_option_in_add_issue_page();
	}

	@When("To click the office of the president icon in Add issue page")
	public void to_click_the_office_of_the_president_icon_in_add_issue_page() {
	    opcap.to_click_the_office_of_the_president_icon_in_add_issue_page();
	}

	@When("To click the president icon in Add issue page")
	public void to_click_the_president_icon_in_add_issue_page() {
		opcap.to_click_the_president_icon_in_add_issue_page();
	    
	}

	@When("To click the check box of Risk Management in Add issue page")
	public void to_click_the_check_box_of_risk_management_in_add_issue_page() {
	    opcap.to_click_the_check_box_of_risk_management_in_add_issue_page();
	}

	@When("To click the Proceed button in Add issue page")
	public void to_click_the_proceed_button_in_add_issue_page() throws InterruptedException {
	    opcap.to_click_the_proceed_button_in_add_issue_page();
	}

	@Then("To Validate  Raise New Issue in Risk management option")
	public void to_validate_raise_new_issue_in_risk_management_option() throws InterruptedException {
	    opcap.to_validate_raise_new_issue_in_risk_management_option();
	}

	@When("To Enter title in Raise New Issue in Risk management option page")
	public void to_enter_title_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	    opcap.to_enter_title_in_raise_new_issue_in_risk_management_option_page();
	}

	@When("To Enter issue details in Raise New Issue in Risk management option page")
	public void to_enter_issue_details_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	    opcap.to_enter_issue_details_in_raise_new_issue_in_risk_management_option_page();
	}

	@When("To Select priority option in  Raise New Issue in Risk management option page")
	public void to_select_priority_option_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	    opcap.to_select_priority_option_in_raise_new_issue_in_risk_management_option_page();
	}

	@When("To Select responsiblity option in  Raise New Issue in Risk management option page")
	public void to_select_responsiblity_option_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	    opcap.to_select_responsiblity_option_in_raise_new_issue_in_risk_management_option_page();
	}

	@When("To select Target closure date in  Raise New Issue in Risk management option page")
	public void to_select_target_closure_date_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	  opcap.to_select_target_closure_date_in_raise_new_issue_in_risk_management_option_page();
	}

	@When("To Enter Deparmental Ref in Raise New Issue in Risk management option page")
	public void to_enter_deparmental_ref_in_raise_new_issue_in_risk_management_option_page() {
	    opcap.to_enter_deparmental_ref_in_raise_new_issue_in_risk_management_option_page();
	}

	@When("To Enter Dept comment in Raise New Issue in Risk management option page")
	public void to_enter_dept_comment_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException, AWTException {
	    opcap.to_enter_dept_comment_in_raise_new_issue_in_risk_management_option_page();
	}

	@When("To select dropdown option in interested person in Raise New Issue in Risk management option page")
	public void to_select_dropdown_option_in_interested_person_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	    opcap.to_select_dropdown_option_in_interested_person_in_raise_new_issue_in_risk_management_option_page();
	}

	@When("To click the Save button in Raise New Issue in Risk management option page")
	public void to_click_the_save_button_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	    opcap.to_click_the_save_button_in_raise_new_issue_in_risk_management_option_page();
	}

	@When("To click the go to home page")
	public void to_click_the_go_to_home_page() throws InterruptedException {
	    opcap.to_click_the_go_to_home_page();
	}

	@When("To click the issue option in home page")
	public void to_click_the_issue_option_in_home_page() throws InterruptedException {
	   opcap.to_click_the_issue_option_in_home_page();
	}

	@Then("To validate the recently created issue title in home page")
	public void to_validate_the_recently_created_issue_title_in_home_page() {
	    opcap.to_validate_the_recently_created_issue_title_in_home_page();
	}
	
}
