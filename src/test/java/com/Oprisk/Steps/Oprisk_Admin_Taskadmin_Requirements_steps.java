package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Taskadmin_Requirements_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Taskadmin_Requirements_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Taskadmin_Requirements_pages rp;

	@When("To click the Requirements in Task Admin option")
	public void to_click_the_requirements_in_task_admin_option() throws InterruptedException {
	   rp.to_click_the_requirements_in_task_admin_option();
	}

	@Then("To validate Maintain Requirements page")
	public void to_validate_maintain_requirements_page() throws InterruptedException {
	    rp.to_validate_maintain_requirements_page();
	}

	@When("To click Add Requirements button in Maintain Requirements page")
	public void to_click_add_requirements_button_in_maintain_requirements_page() {
	    rp.to_click_add_requirements_button_in_maintain_requirements_page();
	}

	@Then("To validate Add Requirement page")
	public void to_validate_add_requirement_page() throws InterruptedException {
	    rp.to_validate_add_requirement_page();
	}

	@When("To select dropdown in Requirement Type option in Add Requirement page")
	public void to_select_dropdown_in_requirement_type_option_in_add_requirement_page() {
	   rp.to_select_dropdown_in_requirement_type_option_in_add_requirement_page();
	}

	@When("To click the Select link in Requirement Item in Add Requirement page")
	public void to_click_the_select_link_in_requirement_item_in_add_requirement_page() throws InterruptedException {
	   rp.to_click_the_select_link_in_requirement_item_in_add_requirement_page();
	}

	@Then("To validate pop up in select case")
	public void to_validate_pop_up_in_select_case() throws InterruptedException {
	   rp.to_validate_pop_up_in_select_case(); 
	}

	@When("To click any radio button in case type id in pop up")
	public void to_click_any_radio_button_in_case_type_id_in_pop_up() {
	   rp.to_click_any_radio_button_in_case_type_id_in_pop_up();
	}

	@When("To click proceed button in pop up")
	public void to_click_proceed_button_in_pop_up() {
	    rp.to_click_proceed_button_in_pop_up();
	}

	@When("To Enter value in Requirement Name box in Add Requirement page")
	public void to_enter_value_in_requirement_name_box_in_add_requirement_page() throws InterruptedException {
	   rp.to_enter_value_in_requirement_name_box_in_add_requirement_page(); 
	}

	@When("To Enter value in Requirement Description box in Add Requirement page")
	public void to_enter_value_in_requirement_description_box_in_add_requirement_page() {
	   rp.to_enter_value_in_requirement_description_box_in_add_requirement_page(); 
	}

	@When("To click Save button in Add Requirement page")
	public void to_click_save_button_in_add_requirement_page() {
	    rp.to_click_save_button_in_add_requirement_page();
	}

	@Then("To validate Manage Requirement page")
	public void to_validate_manage_requirement_page() throws InterruptedException {
	    rp.to_validate_manage_requirement_page();
	}

	@When("To click Exit button Manage Requirement page")
	public void to_click_exit_button_manage_requirement_page() throws InterruptedException {
	    rp.to_click_exit_button_manage_requirement_page();
	}
	
	
}
