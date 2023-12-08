package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Controlgap_issuewrappers_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Controlgap_issuewrappers_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Controlgap_issuewrappers_pages iwp;
	
	@When("To click the issue wrappers option")
	public void to_click_the_issue_wrappers_option() throws InterruptedException {
	    iwp.to_click_the_issue_wrappers_option();
	}

	@Then("To validate the issue wrappers page")
	public void to_validate_the_issue_wrappers_page() {
		iwp.to_validate_the_issue_wrappers_page();
	    
	}

	@When("To click the Add new button issue wrappers page")
	public void to_click_the_add_new_button_issue_wrappers_page() throws InterruptedException {
	    iwp.to_click_the_add_new_button_issue_wrappers_page();
	}

	@Then("To validate the issue wrappers select senior organisation unit")
	public void to_validate_the_issue_wrappers_select_senior_organisation_unit() {
	   iwp.to_validate_the_issue_wrappers_select_senior_organisation_unit();
	}

	@When("To click the office of the president icon in issue wrappers select senior organisation unit")
	public void to_click_the_office_of_the_president_icon_in_issue_wrappers_select_senior_organisation_unit() throws InterruptedException {
	    iwp.to_click_the_office_of_the_president_icon_in_issue_wrappers_select_senior_organisation_unit();
	}

	@When("To click the president icon in issue wrappers select senior organisation unit")
	public void to_click_the_president_icon_in_issue_wrappers_select_senior_organisation_unit() {
	   iwp.to_click_the_president_icon_in_issue_wrappers_select_senior_organisation_unit();
	}

	@When("To click the radio button of risk management in issue wrappers select senior organisation unit")
	public void to_click_the_radio_button_of_risk_management_in_issue_wrappers_select_senior_organisation_unit() {
	    iwp.to_click_the_radio_button_of_risk_management_in_issue_wrappers_select_senior_organisation_unit();
	}

	@When("To click the proceed button in issue wrappers select senior organisation unit")
	public void to_click_the_proceed_button_in_issue_wrappers_select_senior_organisation_unit() throws InterruptedException {
	    iwp.to_click_the_proceed_button_in_issue_wrappers_select_senior_organisation_unit();
	}

	@Then("To validate the Add issue wrappers page")
	public void to_validate_the_add_issue_wrappers_page() {
	   iwp.to_validate_the_add_issue_wrappers_page();
	}

	@When("To Enter the value in wrapper Title box in Add issue wrappers page")
	public void to_enter_the_value_in_wrapper_title_box_in_add_issue_wrappers_page() throws InterruptedException {
	    iwp.to_enter_the_value_in_wrapper_title_box_in_add_issue_wrappers_page();
	}

	@When("To Enter the value in wrapper Reference box in Add issue wrappers page")
	public void to_enter_the_value_in_wrapper_reference_box_in_add_issue_wrappers_page() {
	    iwp.to_enter_the_value_in_wrapper_reference_box_in_add_issue_wrappers_page();
	}

	@When("To Enter the value in wrapper Notes box in Add issue wrappers page")
	public void to_enter_the_value_in_wrapper_notes_box_in_add_issue_wrappers_page() throws InterruptedException {
	    iwp.to_enter_the_value_in_wrapper_notes_box_in_add_issue_wrappers_page();
	}

	@When("To select dropdown option in Originator Type in Add issue wrappers page")
	public void to_select_dropdown_option_in_originator_type_in_add_issue_wrappers_page() throws InterruptedException {
	    iwp.to_select_dropdown_option_in_originator_type_in_add_issue_wrappers_page();
	}

	@When("To click the Save button in Add issue wrappers page")
	public void to_click_the_save_button_in_add_issue_wrappers_page() throws InterruptedException {
	   iwp.to_click_the_save_button_in_add_issue_wrappers_page();
	}

	@Then("To validate the Edit issue wrapper page")
	public void to_validate_the_edit_issue_wrapper_page() {
	    iwp.to_validate_the_edit_issue_wrapper_page();
	}

	@When("To click the Add new reference button in Edit issue wrapper page")
	public void to_click_the_add_new_reference_button_in_edit_issue_wrapper_page() throws InterruptedException {
	    iwp.to_click_the_add_new_reference_button_in_edit_issue_wrapper_page();
	}

	@Then("To validate the Add new reference popup page")
	public void to_validate_the_add_new_reference_popup_page() throws InterruptedException {
	   iwp.to_validate_the_add_new_reference_popup_page();
	}

	@When("To click the choose file in Add new reference page")
	public void to_click_the_choose_file_in_add_new_reference_page() throws AWTException, InterruptedException {
	    iwp.to_click_the_choose_file_in_add_new_reference_page();
	}

	@When("To Enter the value in Reference Source System box in Add new reference page")
	public void to_enter_the_value_in_reference_source_system_box_in_add_new_reference_page() throws InterruptedException {
	    iwp.to_enter_the_value_in_reference_source_system_box_in_add_new_reference_page();
	}

	@When("To Enter the value in Reference Description box in Add new reference page")
	public void to_enter_the_value_in_reference_description_box_in_add_new_reference_page() throws InterruptedException {
	    iwp.to_enter_the_value_in_reference_description_box_in_add_new_reference_page();
	}

	@When("To click the check bok in Shared in Add new reference page")
	public void to_click_the_check_bok_in_shared_in_add_new_reference_page() throws InterruptedException {
	    iwp.to_click_the_check_bok_in_shared_in_add_new_reference_page();
	}

	@When("To Enter the value in Loader Id box in Add new reference page")
	public void to_enter_the_value_in_loader_id_box_in_add_new_reference_page() throws InterruptedException {
	   iwp.to_enter_the_value_in_loader_id_box_in_add_new_reference_page();
	}

	@When("To select dropdown option in Source System in Add new reference page")
	public void to_select_dropdown_option_in_source_system_in_add_new_reference_page() throws InterruptedException, AWTException {
	    iwp.to_select_dropdown_option_in_source_system_in_add_new_reference_page();
	}

	@When("To click the Attach and close in Add new reference page")
	public void to_click_the_attach_and_close_in_add_new_reference_page() throws InterruptedException {
	    iwp.to_click_the_attach_and_close_in_add_new_reference_page();
	}

	@When("to click the save button in Edit issue wrapper page")
	public void to_click_the_save_button_in_edit_issue_wrapper_page() {
	   iwp.to_click_the_save_button_in_edit_issue_wrapper_page();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	

	//To Test the issue wrappers Add Existing page functionality
	
	@When("To click the onesum under the title in issue wrappers page")
	public void to_click_the_onesum_under_the_title_in_issue_wrappers_page() throws InterruptedException {
	   iwp.to_click_the_onesum_under_the_title_in_issue_wrappers_page();
	}

	@When("To click the Add Existing reference button in Edit issue wrapper page")
	public void to_click_the_add_existing_reference_button_in_edit_issue_wrapper_page() throws InterruptedException {
	   iwp.to_click_the_add_existing_reference_button_in_edit_issue_wrapper_page();
	}

	@Then("To validate the Search Reference library page")
	public void to_validate_the_search_reference_library_page() throws InterruptedException {
	   iwp.to_validate_the_search_reference_library_page();
	}

	@When("To click the required checkbox under the Reference source system")
	public void to_click_the_required_checkbox_under_the_reference_source_system() throws InterruptedException {
	   iwp.to_click_the_required_checkbox_under_the_reference_source_system();
	}

	@When("To click the save button in Search Reference library page")
	public void to_click_the_save_button_in_search_reference_library_page() throws InterruptedException {
	    iwp.to_click_the_save_button_in_search_reference_library_page();
	}

	@Then("To validate the  uploaded file in Edit issue wrapper page")
	public void to_validate_the_uploaded_file_in_edit_issue_wrapper_page() throws InterruptedException {
	    iwp.to_validate_the_uploaded_file_in_edit_issue_wrapper_page();
	}

	

}
