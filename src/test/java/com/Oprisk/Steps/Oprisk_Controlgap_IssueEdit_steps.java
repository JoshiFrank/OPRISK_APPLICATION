package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Controlgap_IssueEdit_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Controlgap_IssueEdit_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Controlgap_IssueEdit_pages IEP;
	
	@Then("To validate the Existing issues for selected target page")
	public void to_validate_the_existing_issues_for_selected_target_page() {
		IEP.to_validate_the_existing_issues_for_selected_target_page();
	    
	}

	@When("To click the Edit file symbol in Existing issues for selected target page")
	public void to_click_the_edit_file_symbol_in_existing_issues_for_selected_target_page() {
		
	    IEP.to_click_the_edit_file_symbol_in_existing_issues_for_selected_target_page();
	}

	@Then("To validate the Edit issue page in control gap Management")
	public void to_validate_the_edit_issue_page_in_control_gap_management() {
		IEP.to_validate_the_edit_issue_page_in_control_gap_management();
	    
	}

	@When("To click the Add issue interest button in Edit issue")
	public void to_click_the_add_issue_interest_button_in_edit_issue() {
		IEP.to_click_the_add_issue_interest_button_in_edit_issue();
	   
	}

	@Then("To validate the Add interest for issue page")
	public void to_validate_the_add_interest_for_issue_page() {
		IEP.to_validate_the_add_interest_for_issue_page();
	    
	}

	@When("To select interest type in Dropdown in Add interest page")
	public void to_select_interest_type_in_dropdown_in_add_interest_page() throws InterruptedException {
		IEP.to_select_interest_type_in_dropdown_in_add_interest_page();
	    
	}

	@When("To Enter the value departmental ref in Add interest page")
	public void to_enter_the_value_departmental_ref_in_add_interest_page() throws InterruptedException {
		IEP.to_enter_the_value_departmental_ref_in_add_interest_page();
	    
	}

	@When("To Enter the value in comment box in Add interest page")
	public void to_enter_the_value_in_comment_box_in_add_interest_page() throws InterruptedException {
		IEP.to_enter_the_value_in_comment_box_in_add_interest_page();
	    
	}

	@When("To select interested person in Dropdown in Add interest page")
	public void to_select_interested_person_in_dropdown_in_add_interest_page() throws InterruptedException {
		IEP.to_select_interested_person_in_dropdown_in_add_interest_page();
	    
	}

	@When("To Click the save button in Add interest page")
	public void to_click_the_save_button_in_add_interest_page() throws InterruptedException {
		IEP.to_click_the_save_button_in_add_interest_page();
	    
	}

	@Then("To validate the issue under the group risk")
	public void to_validate_the_issue_under_the_group_risk() throws InterruptedException {
		IEP.to_validate_the_issue_under_the_group_risk();
	   
	}

	@When("To click the observe button in group risk")
	public void to_click_the_observe_button_in_group_risk() throws InterruptedException {
		IEP.to_click_the_observe_button_in_group_risk();
	   
	}

	@Then("To validate the status showing observer")
	public void to_validate_the_status_showing_observer() throws InterruptedException {
		IEP.to_validate_the_status_showing_observer();
	    
	}

	@When("To click the void button in group risk")
	public void to_click_the_void_button_in_group_risk() throws InterruptedException {
		IEP.to_click_the_void_button_in_group_risk();
	    
	}

	@Then("To validate the status showing voided")
	public void to_validate_the_status_showing_voided() throws InterruptedException {
		IEP.to_validate_the_status_showing_voided();
	    
	}

	@When("To click the Accept button in group risk")
	public void to_click_the_accept_button_in_group_risk() throws InterruptedException {
		IEP.to_click_the_accept_button_in_group_risk();
	    
	}

	@When("To click the Saveandreturn button in Edit issue")
	public void to_click_the_saveandreturn_button_in_edit_issue() throws InterruptedException {
		IEP.to_click_the_saveandreturn_button_in_edit_issue();
	    
	}
	

}
