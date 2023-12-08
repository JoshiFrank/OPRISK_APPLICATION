package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Libraries_Assests_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Libraries_Assests_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Libraries_Assests_pages as;
	
	@When("To Click the Assets option in Libraries")
	public void to_click_the_assets_option_in_libraries() throws InterruptedException {
	  as.to_click_the_assets_option_in_libraries();
	}

	@Then("To validate the Maintain Assets Library page")
	public void to_validate_the_maintain_assets_library_page() throws InterruptedException {
	    as.to_validate_the_maintain_assets_library_page();
	}

	@When("To click the Add New button in Maintain Assets Library page")
	public void to_click_the_add_new_button_in_maintain_assets_library_page() {
	   as.to_click_the_add_new_button_in_maintain_assets_library_page();
	}

	@Then("To validate the Select Asset Type page")
	public void to_validate_the_select_asset_type_page() throws InterruptedException {
	    as.to_validate_the_select_asset_type_page();
	}

	@When("To click the plus button in key asset option in Select Asset Type page")
	public void to_click_the_plus_button_in_key_asset_option_in_select_asset_type_page() {
	    as.to_click_the_plus_button_in_key_asset_option_in_select_asset_type_page();
	}

	@Then("To validate the Add key Assets page")
	public void to_validate_the_add_key_assets_page() throws InterruptedException {
	    as.to_validate_the_add_key_assets_page();
	}

	@When("To Enter the value in Key Asset Name in Add key Assets page")
	public void to_enter_the_value_in_key_asset_name_in_add_key_assets_page() {
	    as.to_enter_the_value_in_key_asset_name_in_add_key_assets_page();
	}

	@When("To select the dropdown in Asset class in Add key Assets page")
	public void to_select_the_dropdown_in_asset_class_in_add_key_assets_page() throws InterruptedException {
	    as.to_select_the_dropdown_in_asset_class_in_add_key_assets_page();
	}

	@When("To select the dropdown in Asset type in Add key Assets page")
	public void to_select_the_dropdown_in_asset_type_in_add_key_assets_page() throws InterruptedException {
		as.to_select_the_dropdown_in_asset_type_in_add_key_assets_page();
	   
	}

	@When("To Enter the value in Asset purpose in Add key Assets page")
	public void to_enter_the_value_in_asset_purpose_in_add_key_assets_page() {
	    as.to_enter_the_value_in_asset_purpose_in_add_key_assets_page();
	}

	@When("To select the dropdown in Asset status in Add key Assets page")
	public void to_select_the_dropdown_in_asset_status_in_add_key_assets_page() throws InterruptedException {
	   as.to_select_the_dropdown_in_asset_status_in_add_key_assets_page(); 
	   
	}

	@When("To select the dropdown in Asset owner in Add key Assets page")
	public void to_select_the_dropdown_in_asset_owner_in_add_key_assets_page() {
	    as.to_select_the_dropdown_in_asset_owner_in_add_key_assets_page();
	}

	@When("To select the dropdown in Asset scale in Add key Assets page")
	public void to_select_the_dropdown_in_asset_scale_in_add_key_assets_page() {
	    as.to_select_the_dropdown_in_asset_scale_in_add_key_assets_page();
	}

	@When("To Enter the value in Asset notes in Add key Assets page")
	public void to_enter_the_value_in_asset_notes_in_add_key_assets_page() throws AWTException {
	    as.to_enter_the_value_in_asset_notes_in_add_key_assets_page();
	}

	@When("To click the save button in Add key Assets page")
	public void to_click_the_save_button_in_add_key_assets_page() {
	    as.to_click_the_save_button_in_add_key_assets_page();
	}

	@Then("To validate the Edit key Assets page")
	public void to_validate_the_edit_key_assets_page() throws InterruptedException {
	    as.to_validate_the_edit_key_assets_page();
	}

	@When("To Enter the value in loader id in Edit key Assets page")
	public void to_enter_the_value_in_loader_id_in_edit_key_assets_page() {
	    as.to_enter_the_value_in_loader_id_in_edit_key_assets_page();
	}

	@When("To select the dropdown in source system in Edit key Assets page")
	public void to_select_the_dropdown_in_source_system_in_edit_key_assets_page() throws AWTException {
	    as.to_select_the_dropdown_in_source_system_in_edit_key_assets_page();
	}

	@When("To click the Save button in Edit key Assets page")
	public void to_click_the_save_button_in_edit_key_assets_page() {
	    as.to_click_the_save_button_in_edit_key_assets_page();
	}

	@When("To click the cancel button in Edit key Assets page")
	public void to_click_the_cancel_button_in_edit_key_assets_page() {
	   as.to_click_the_cancel_button_in_edit_key_assets_page();
	}

	@Then("To validate result with Maintain Assets Library page")
	public void to_validate_result_with_maintain_assets_library_page() throws InterruptedException {
	    as.to_validate_result_with_maintain_assets_library_page();
	}

}
