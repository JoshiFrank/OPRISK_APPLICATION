package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Libraries_Authoritativesources_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Libraries_Authoritativesources_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Libraries_Authoritativesources_pages asp;
	
	@When("To Click the Authoritative source option in Libraries")
	public void to_click_the_authoritative_source_option_in_libraries() throws InterruptedException {
	   asp.to_click_the_authoritative_source_option_in_libraries();
	}

	@Then("To validate the Authoritative source list page")
	public void to_validate_the_authoritative_source_list_page() throws InterruptedException {
	   asp.to_validate_the_authoritative_source_list_page();
	}

	@When("To click the New Authoritative Source button in Authoritative source list page")
	public void to_click_the_new_authoritative_source_button_in_authoritative_source_list_page() {
	    asp.to_click_the_new_authoritative_source_button_in_authoritative_source_list_page();
	}

	@Then("To validate the Add Authoritative Source page")
	public void to_validate_the_add_authoritative_source_page() throws InterruptedException {
	    asp.to_validate_the_add_authoritative_source_page();
	}

	@When("To select Dropdown option in Authoritative Source Type in Add Authoritative Source page")
	public void to_select_dropdown_option_in_authoritative_source_type_in_add_authoritative_source_page() {
	    asp.to_select_dropdown_option_in_authoritative_source_type_in_add_authoritative_source_page();
	}

	@When("To Enter value in Authoritative Source Name in Add Authoritative Source page")
	public void to_enter_value_in_authoritative_source_name_in_add_authoritative_source_page() {
	    asp.to_enter_value_in_authoritative_source_name_in_add_authoritative_source_page();
	}

	@When("To Enter value in Authoritative Source Title in Add Authoritative Source page")
	public void to_enter_value_in_authoritative_source_title_in_add_authoritative_source_page() {
	    asp.to_enter_value_in_authoritative_source_title_in_add_authoritative_source_page();
	}

	@When("To Enter value in Heading in Add Authoritative Source page")
	public void to_enter_value_in_heading_in_add_authoritative_source_page() {
	   asp.to_enter_value_in_heading_in_add_authoritative_source_page();
	}

	@When("To Enter value in common name in Add Authoritative Source page")
	public void to_enter_value_in_common_name_in_add_authoritative_source_page() {
	    asp.to_enter_value_in_common_name_in_add_authoritative_source_page();
	}

	@When("To Enter value in codify in Add Authoritative Source page")
	public void to_enter_value_in_codify_in_add_authoritative_source_page() {
	    asp.to_enter_value_in_codify_in_add_authoritative_source_page();
	}

	@When("To Enter value in Authoritative Source Description in Add Authoritative Source page")
	public void to_enter_value_in_authoritative_source_description_in_add_authoritative_source_page() throws InterruptedException {
	    asp.to_enter_value_in_authoritative_source_description_in_add_authoritative_source_page();
	}

	@When("To select Dropdown option in Status in Add Authoritative Source page")
	public void to_select_dropdown_option_in_status_in_add_authoritative_source_page() throws AWTException {
	    asp.to_select_dropdown_option_in_status_in_add_authoritative_source_page();
	}

	@When("To select Dropdown option in Responsible person in Add Authoritative Source page")
	public void to_select_dropdown_option_in_responsible_person_in_add_authoritative_source_page() throws AWTException {
	   asp.to_select_dropdown_option_in_responsible_person_in_add_authoritative_source_page();
	}

	@When("To Enter value in originator in Add Authoritative Source page")
	public void to_enter_value_in_originator_in_add_authoritative_source_page() {
	    asp.to_enter_value_in_originator_in_add_authoritative_source_page();
	}

	@When("To Enter value in issuer in Add Authoritative Source page")
	public void to_enter_value_in_issuer_in_add_authoritative_source_page() throws InterruptedException {
	   asp.to_enter_value_in_issuer_in_add_authoritative_source_page();
	}

	@When("To Select a Issued Date in Add Authoritative Source page")
	public void to_select_a_issued_date_in_add_authoritative_source_page() throws AWTException {
	   asp.to_select_a_issued_date_in_add_authoritative_source_page();
	}

	@When("To Select a Effective Date in Add Authoritative Source page")
	public void to_select_a_effective_date_in_add_authoritative_source_page() throws InterruptedException {
	    asp.to_select_a_effective_date_in_add_authoritative_source_page();
	}

	@When("To Select a Rescinded Date in Add Authoritative Source page")
	public void to_select_a_rescinded_date_in_add_authoritative_source_page() throws InterruptedException {
	  asp.to_select_a_rescinded_date_in_add_authoritative_source_page();  
	}

	@When("To click save button in Add Authoritative Source page")
	public void to_click_save_button_in_add_authoritative_source_page() {
	    asp.to_click_save_button_in_add_authoritative_source_page();
	}

	@Then("To validate the Edit Authoritative Source page")
	public void to_validate_the_edit_authoritative_source_page() throws InterruptedException {
	    asp.to_validate_the_edit_authoritative_source_page();
	}

	@When("To Enter the value in Loader Id in Edit Authoritative Source page")
	public void to_enter_the_value_in_loader_id_in_edit_authoritative_source_page() throws AWTException {
	    asp.to_enter_the_value_in_loader_id_in_edit_authoritative_source_page();
	}

	@When("To select Dropdown option in Source System in Edit Authoritative Source page")
	public void to_select_dropdown_option_in_source_system_in_edit_authoritative_source_page() throws AWTException {
	    asp.to_select_dropdown_option_in_source_system_in_edit_authoritative_source_page();
	}

	@When("To click save button in Edit Authoritative Source page")
	public void to_click_save_button_in_edit_authoritative_source_page() {
	    asp.to_click_save_button_in_edit_authoritative_source_page();
	}

	@When("To click cancel button in Edit Authoritative Source page")
	public void to_click_cancel_button_in_edit_authoritative_source_page() {
	    asp.to_click_cancel_button_in_edit_authoritative_source_page();
	}

	@Then("To validate result  Authoritative source list page")
	public void to_validate_result_authoritative_source_list_page() throws InterruptedException {
	  asp.to_validate_result_authoritative_source_list_page();
	}
	

}
