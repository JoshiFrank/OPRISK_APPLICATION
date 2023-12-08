package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Organisation_Person_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Organisation_Person_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Organisation_Person_pages opp;
	
	
	@When("To click the Person in organisation option")
	public void to_click_the_person_in_organisation_option() throws InterruptedException {
	   opp.to_click_the_person_in_organisation_option(); 
	}

	@Then("To validate the Maintain Person page")
	public void to_validate_the_maintain_person_page() throws InterruptedException {
	    opp.to_validate_the_maintain_person_page();
	}

	@When("To click the Add New in Maintain Person page")
	public void to_click_the_add_new_in_maintain_person_page() {
	    opp.to_click_the_add_new_in_maintain_person_page();
	}

	@Then("To validate the Add Person page")
	public void to_validate_the_add_person_page() throws InterruptedException {
	    opp.to_validate_the_add_person_page();
	}

	@When("To Enter the value in Login id box in Add Person page")
	public void to_enter_the_value_in_login_id_box_in_add_person_page() {
	    opp.to_enter_the_value_in_login_id_box_in_add_person_page();
	}

	@When("To Enter the value in Name box in Add Person page")
	public void to_enter_the_value_in_name_box_in_add_person_page() {
	    opp.to_enter_the_value_in_name_box_in_add_person_page();
	}

	@When("To Enter the value in Initials in Add Person page")
	public void to_enter_the_value_in_initials_in_add_person_page() {
	    opp.to_enter_the_value_in_initials_in_add_person_page();
	}

	@When("To click check box in Person Roles in Add Person page")
	public void to_click_check_box_in_person_roles_in_add_person_page() {
	    opp.to_click_check_box_in_person_roles_in_add_person_page();
	}

	@When("To click check box in Other Roles in Add Person page")
	public void to_click_check_box_in_other_roles_in_add_person_page() {
	   opp.to_click_check_box_in_other_roles_in_add_person_page();
	}

	@When("To Enter the value in email box in Add Person page")
	public void to_enter_the_value_in_email_box_in_add_person_page() {
	    opp.to_enter_the_value_in_email_box_in_add_person_page();
	}

	@When("To select dropdown in Location in Add Person page")
	public void to_select_dropdown_in_location_in_add_person_page() {
	   opp.to_select_dropdown_in_location_in_add_person_page();
	}

	@When("To select dropdown in User Seniority in Add Person page")
	public void to_select_dropdown_in_user_seniority_in_add_person_page() {
	    opp.to_select_dropdown_in_user_seniority_in_add_person_page();
	}

	@When("To select dropdown in Incident\\/Loss Seniority in Add Person page")
	public void to_select_dropdown_in_incident_loss_seniority_in_add_person_page() throws AWTException {
	    opp.to_select_dropdown_in_incident_loss_seniority_in_add_person_page();
	}

	@When("To select dropdown in Home Page in Add Person page")
	public void to_select_dropdown_in_home_page_in_add_person_page() throws AWTException {
	   opp.to_select_dropdown_in_home_page_in_add_person_page();
	}

	@When("To click check box in Disable enhance dropdown in Add Person page")
	public void to_click_check_box_in_disable_enhance_dropdown_in_add_person_page() {
	    opp.to_click_check_box_in_disable_enhance_dropdown_in_add_person_page();
	}

	@When("To click the save button in Add Person page")
	public void to_click_the_save_button_in_add_person_page() {
	    opp.to_click_the_save_button_in_add_person_page();
	}

	@Then("To validate the Edit Person page")
	public void to_validate_the_edit_person_page() throws InterruptedException {
	    opp.to_validate_the_edit_person_page();
	}

	@When("To click the save button in Edit Person page")
	public void to_click_the_save_button_in_edit_person_page() throws InterruptedException {
	    opp.to_click_the_save_button_in_edit_person_page();
	}

}
