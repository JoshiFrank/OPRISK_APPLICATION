package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Organisation_OrganisationUnit_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Organisation_OrganisationUnit_Steps {

	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Organisation_OrganisationUnit_pages oop;
	
	
	@When("To click the Admin menu option in home page")
	public void to_click_the_admin_menu_option_in_home_page() throws InterruptedException {
	  oop.to_click_the_admin_menu_option_in_home_page();  
	}

	@When("To mouse hover to organisation option")
	public void to_mouse_hover_to_organisation_option() {
	    oop.to_mouse_hover_to_organisation_option();
	}

	@When("To click the organisation unit in organisation option")
	public void to_click_the_organisation_unit_in_organisation_option() {
	    oop.to_click_the_organisation_unit_in_organisation_option();
	}

	@Then("To validate the Maintain Organisation Unit page")
	public void to_validate_the_maintain_organisation_unit_page() throws InterruptedException {
	   oop.to_validate_the_maintain_organisation_unit_page(); 
	}

	@When("To click the arrow button in office of the president in Maintain Organisation Unit page")
	public void to_click_the_arrow_button_in_office_of_the_president_in_maintain_organisation_unit_page() {
	    oop.to_click_the_arrow_button_in_office_of_the_president_in_maintain_organisation_unit_page();
	}

	@When("To click the arrow button in the president in Maintain Organisation Unit page")
	public void to_click_the_arrow_button_in_the_president_in_maintain_organisation_unit_page() throws InterruptedException {
	   oop.to_click_the_arrow_button_in_the_president_in_maintain_organisation_unit_page(); 
	}

	@When("To click the down arrow button in Risk management in Maintain Organisation Unit page")
	public void to_click_the_down_arrow_button_in_risk_management_in_maintain_organisation_unit_page() throws InterruptedException {
	   oop.to_click_the_down_arrow_button_in_risk_management_in_maintain_organisation_unit_page(); 
	}

	@When("To click the Add organisation unit in Maintain Organisation Unit page")
	public void to_click_the_add_organisation_unit_in_maintain_organisation_unit_page() {
	   oop.to_click_the_add_organisation_unit_in_maintain_organisation_unit_page();
	}

	@Then("To validate the Add Organisation Unit page")
	public void to_validate_the_add_organisation_unit_page() throws InterruptedException {
	    oop.to_validate_the_add_organisation_unit_page();
	}

	@When("To Enter value in Organisation Unit Code in Add Organisation Unit page")
	public void to_enter_value_in_organisation_unit_code_in_add_organisation_unit_page() {
	    oop.to_enter_value_in_organisation_unit_code_in_add_organisation_unit_page();
	}

	@When("To Enter value in Organisation Unit Name in Add Organisation Unit page")
	public void to_enter_value_in_organisation_unit_name_in_add_organisation_unit_page() {
	    oop.to_enter_value_in_organisation_unit_name_in_add_organisation_unit_page();
	}

	@When("To Enter value in Organisation Unit Description in Add Organisation Unit page")
	public void to_enter_value_in_organisation_unit_description_in_add_organisation_unit_page() {
	    oop.to_enter_value_in_organisation_unit_description_in_add_organisation_unit_page();
	}

	@When("To select dropdown option in owner in Add Organisation Unit page")
	public void to_select_dropdown_option_in_owner_in_add_organisation_unit_page() {
	   oop.to_select_dropdown_option_in_owner_in_add_organisation_unit_page();
	}

	@When("To select dropdown option in Risk manager in Add Organisation Unit page")
	public void to_select_dropdown_option_in_risk_manager_in_add_organisation_unit_page() {
	    oop.to_select_dropdown_option_in_risk_manager_in_add_organisation_unit_page();
	}
	@When("To Enter value in External Link in Add Organisation Unit page")
	public void to_enter_value_in_external_link_in_add_organisation_unit_page() {
	   oop.to_enter_value_in_external_link_in_add_organisation_unit_page();
	}

	@When("To Enter value in Objectives in Add Organisation Unit page")
	public void to_enter_value_in_objectives_in_add_organisation_unit_page() {
	    oop.to_enter_value_in_objectives_in_add_organisation_unit_page();
	}

	@When("To Enter value in Background in Add Organisation Unit page")
	public void to_enter_value_in_background_in_add_organisation_unit_page() throws AWTException {
	    oop.to_enter_value_in_background_in_add_organisation_unit_page();
	}

	@When("To Enter value in Planning in Add Organisation Unit page")
	public void to_enter_value_in_planning_in_add_organisation_unit_page() throws AWTException {
	    oop.to_enter_value_in_planning_in_add_organisation_unit_page();
	}

	@When("To click the Save button in Add Organisation Unit page")
	public void to_click_the_save_button_in_add_organisation_unit_page() throws InterruptedException {
	    oop.to_click_the_save_button_in_add_organisation_unit_page();
	    
	}

	@Then("To validate the Manage Organisation Unit page")
	public void to_validate_the_manage_organisation_unit_page() throws InterruptedException {
	    oop.to_validate_the_manage_organisation_unit_page();
	}

	@When("To Enter the value in Loader id in Manage Organisation Unit page")
	public void to_enter_the_value_in_loader_id_in_manage_organisation_unit_page() throws InterruptedException {
	    oop.to_enter_the_value_in_loader_id_in_manage_organisation_unit_page();
	}

	@When("To Select dropdown in source system in Manage Organisation Unit page")
	public void to_select_dropdown_in_source_system_in_manage_organisation_unit_page() throws AWTException {
	    oop.to_select_dropdown_in_source_system_in_manage_organisation_unit_page();
	}

	@When("To click the Save button in Manage Organisation Unit page")
	public void to_click_the_save_button_in_manage_organisation_unit_page() {
	    oop.to_click_the_save_button_in_manage_organisation_unit_page();
	}

	@When("To click the Risk and control map option in Risks")
	public void to_click_the_risk_and_control_map_option_in_risks() throws InterruptedException {
	    oop.to_click_the_risk_and_control_map_option_in_risks();
	}

	@Then("To validate the Maintain Risk Map page")
	public void to_validate_the_maintain_risk_map_page() throws InterruptedException {
	    oop.to_validate_the_maintain_risk_map_page();
	}

	@When("To click the arrow button in office of the president in Maintain Risk Map page")
	public void to_click_the_arrow_button_in_office_of_the_president_in_maintain_risk_map_page() {
	    oop.to_click_the_arrow_button_in_office_of_the_president_in_maintain_risk_map_page();
	}

	@When("To click the arrow button in the president in Maintain Risk Map page")
	public void to_click_the_arrow_button_in_the_president_in_maintain_risk_map_page() throws InterruptedException {
	   oop.to_click_the_arrow_button_in_the_president_in_maintain_risk_map_page();
	}

	@When("To click the arrow button in Risk Management in Maintain Risk Map page")
	public void to_click_the_arrow_button_in_risk_management_in_maintain_risk_map_page() throws InterruptedException {
	   oop.to_click_the_arrow_button_in_risk_management_in_maintain_risk_map_page();
	}

	@Then("To validate the result Risk Management in Maintain Risk Map page")
	public void to_validate_the_result_risk_management_in_maintain_risk_map_page() throws InterruptedException {
	    oop.to_validate_the_result_risk_management_in_maintain_risk_map_page();
	}
	
	
}
