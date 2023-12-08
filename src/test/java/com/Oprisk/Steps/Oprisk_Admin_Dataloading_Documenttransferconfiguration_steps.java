package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Dataloading_Documenttransferconfiguration_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Dataloading_Documenttransferconfiguration_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Dataloading_Documenttransferconfiguration_pages dtc;

	@When("To click Document Transfer Configuration in Data Loading Option")
	public void to_click_document_transfer_configuration_in_data_loading_option() throws InterruptedException {
	  dtc.to_click_document_transfer_configuration_in_data_loading_option();  
	}

	@Then("To validate Manage Document Transfer Configuration page")
	public void to_validate_manage_document_transfer_configuration_page() throws InterruptedException {
	   dtc.to_validate_manage_document_transfer_configuration_page(); 
	}

	@When("To click Add new button in Manage Document Transfer Configuration page")
	public void to_click_add_new_button_in_manage_document_transfer_configuration_page() {
		dtc.to_click_add_new_button_in_manage_document_transfer_configuration_page();
	 }

	@Then("To validate Add Document Transfer Configuration page")
	public void to_validate_add_document_transfer_configuration_page() throws InterruptedException {
	    dtc.to_validate_add_document_transfer_configuration_page();
	}

	@When("To Enter value Document Source Name box in Add Document Transfer Configuration page")
	public void to_enter_value_document_source_name_box_in_add_document_transfer_configuration_page() throws InterruptedException {
	    dtc.to_enter_value_document_source_name_box_in_add_document_transfer_configuration_page();
	}

	@When("To Enter value Description box in Add Document Transfer Configuration page")
	public void to_enter_value_description_box_in_add_document_transfer_configuration_page() throws InterruptedException {
	    dtc.to_enter_value_description_box_in_add_document_transfer_configuration_page();
	}

	@When("To Select dropdown in type option in Add Document Transfer Configuration page")
	public void to_select_dropdown_in_type_option_in_add_document_transfer_configuration_page() throws InterruptedException {
	    dtc.to_select_dropdown_in_type_option_in_add_document_transfer_configuration_page();
	}

	@When("To Enter value Destination Folder box in Add Document Transfer Configuration page")
	public void to_enter_value_destination_folder_box_in_add_document_transfer_configuration_page() throws InterruptedException {
	    dtc.to_enter_value_destination_folder_box_in_add_document_transfer_configuration_page();
	}

	@When("To Select dropdown in Protocol option in Add Document Transfer Configuration page")
	public void to_select_dropdown_in_protocol_option_in_add_document_transfer_configuration_page() throws InterruptedException {
	    dtc.to_select_dropdown_in_protocol_option_in_add_document_transfer_configuration_page();
	}

	@When("To Enter value URL box in Add Document Transfer Configuration page")
	public void to_enter_value_url_box_in_add_document_transfer_configuration_page() throws InterruptedException {
	   dtc.to_enter_value_url_box_in_add_document_transfer_configuration_page(); 
	}

	@When("To Enter value User Name box in Add Document Transfer Configuration page")
	public void to_enter_value_user_name_box_in_add_document_transfer_configuration_page() throws InterruptedException, AWTException {
	    dtc.to_enter_value_user_name_box_in_add_document_transfer_configuration_page();
	}

	@When("To Enter value User Password box in Add Document Transfer Configuration page")
	public void to_enter_value_user_password_box_in_add_document_transfer_configuration_page() throws InterruptedException, AWTException {
	    dtc.to_enter_value_user_password_box_in_add_document_transfer_configuration_page();
	}

	@When("To Enter value Certificate Name box in Add Document Transfer Configuration page")
	public void to_enter_value_certificate_name_box_in_add_document_transfer_configuration_page() throws AWTException {
	   dtc.to_enter_value_certificate_name_box_in_add_document_transfer_configuration_page();
	}

	@When("To Enter value File Password box in Add Document Transfer Configuration page")
	public void to_enter_value_file_password_box_in_add_document_transfer_configuration_page() throws AWTException {
	   dtc.to_enter_value_file_password_box_in_add_document_transfer_configuration_page();
	}

	@When("To Select dropdown in Direction option in Add Document Transfer Configuration page")
	public void to_select_dropdown_in_direction_option_in_add_document_transfer_configuration_page() {
	   dtc.to_select_dropdown_in_direction_option_in_add_document_transfer_configuration_page(); 
	}

	@When("To select choose file in Add Document Transfer Configuration page")
	public void to_select_choose_file_in_add_document_transfer_configuration_page() throws InterruptedException {
	   dtc.to_select_choose_file_in_add_document_transfer_configuration_page(); 
	}

	@When("To Select dropdown in Run At option in Add Document Transfer Configuration page")
	public void to_select_dropdown_in_run_at_option_in_add_document_transfer_configuration_page() throws InterruptedException {
	   dtc.to_select_dropdown_in_run_at_option_in_add_document_transfer_configuration_page(); 
	}

	@When("To click save button in Add Document Transfer Configuration page")
	public void to_click_save_button_in_add_document_transfer_configuration_page() throws InterruptedException {
	    dtc.to_click_save_button_in_add_document_transfer_configuration_page();
	}
	
	
}
