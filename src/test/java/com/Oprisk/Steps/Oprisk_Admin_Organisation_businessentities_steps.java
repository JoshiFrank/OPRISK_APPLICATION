package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Organisation_businessentities_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Organisation_businessentities_steps {

	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Organisation_businessentities_pages btp;
	
	@When("To click the Business Entities in organisation option")
	public void to_click_the_business_entities_in_organisation_option() throws InterruptedException {
	  btp.to_click_the_business_entities_in_organisation_option();  
	}

	@Then("To Validate the Maintain Business Entities pages")
	public void to_validate_the_maintain_business_entities_pages() throws InterruptedException {
	   btp.to_validate_the_maintain_business_entities_pages(); 
	}

	@When("To click the down Arrow button in Default Root Business Entity")
	public void to_click_the_down_arrow_button_in_default_root_business_entity() {
	    btp.to_click_the_down_arrow_button_in_default_root_business_entity();
	}

	@When("To click the Add business Entities in Maintain Business Entities pages")
	public void to_click_the_add_business_entities_in_maintain_business_entities_pages() {
	    btp.to_click_the_add_business_entities_in_maintain_business_entities_pages();
	}

	@Then("To validate the Add Business Entity page")
	public void to_validate_the_add_business_entity_page() throws InterruptedException {
	    btp.to_validate_the_add_business_entity_page();
	}

	@When("To Enter the value in code box in Add Business Entity page")
	public void to_enter_the_value_in_code_box_in_add_business_entity_page() {
	    btp.to_enter_the_value_in_code_box_in_add_business_entity_page();
	}

	@When("To Enter the value in short name box in Add Business Entity page")
	public void to_enter_the_value_in_short_name_box_in_add_business_entity_page() {
	   btp.to_enter_the_value_in_short_name_box_in_add_business_entity_page(); 
	}

	@When("To Enter the value in name box in Add Business Entity page")
	public void to_enter_the_value_in_name_box_in_add_business_entity_page() {
	   btp.to_enter_the_value_in_name_box_in_add_business_entity_page(); 
	}

	@When("To select dropdown option Accounting Currency in Add Business Entity page")
	public void to_select_dropdown_option_accounting_currency_in_add_business_entity_page() {
	   btp.to_select_dropdown_option_accounting_currency_in_add_business_entity_page(); 
	}

	@When("To click the save button in Add Business Entity page")
	public void to_click_the_save_button_in_add_business_entity_page() {
	  btp.to_click_the_save_button_in_add_business_entity_page();  
	}

	@Then("To validate the Edit Business Entity page")
	public void to_validate_the_edit_business_entity_page() throws InterruptedException {
	  btp.to_validate_the_edit_business_entity_page();  
	}

	@When("To click the cancel button in Edit Business Entity page")
	public void to_click_the_cancel_button_in_edit_business_entity_page() {
	    btp.to_click_the_cancel_button_in_edit_business_entity_page();
	}

	@Then("To Validate Result Maintain Business Entities pages")
	public void to_validate_result_maintain_business_entities_pages() throws InterruptedException {
	   btp.to_validate_result_maintain_business_entities_pages(); 
	}
}
