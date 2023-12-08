package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Riskframework_Questionnaires_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Riskframework_Questionnaires_steps {

	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Riskframework_Questionnaires_pages qnp;
	
	
	@When("To click the Questionnaires in Risk Framework option")
	public void to_click_the_questionnaires_in_risk_framework_option() throws InterruptedException {
	   qnp.to_click_the_questionnaires_in_risk_framework_option();
	}

	@Then("To validate the Manage Questionnaires page")
	public void to_validate_the_manage_questionnaires_page() throws InterruptedException {
	   qnp.to_validate_the_manage_questionnaires_page(); 
	}

	@When("To click the the Add new button in Manage Questionnaires page")
	public void to_click_the_the_add_new_button_in_manage_questionnaires_page() {
	    qnp.to_click_the_the_add_new_button_in_manage_questionnaires_page();
	}

	@Then("To validate Add Questionnaire page")
	public void to_validate_add_questionnaire_page() throws InterruptedException {
	   qnp.to_validate_add_questionnaire_page();
	}

	@When("To Enter the value in Title box in Add Questionnaire page")
	public void to_enter_the_value_in_title_box_in_add_questionnaire_page() {
	    qnp.to_enter_the_value_in_title_box_in_add_questionnaire_page();
	}

	@When("To click the Save button in Add Questionnaire page")
	public void to_click_the_save_button_in_add_questionnaire_page() {
	   qnp.to_click_the_save_button_in_add_questionnaire_page(); 
	}

	@Then("To validate the Modify Questionnaire page")
	public void to_validate_the_modify_questionnaire_page() throws InterruptedException {
	    qnp.to_validate_the_modify_questionnaire_page();
	}

	@When("To click the insert button in Modify Questionnaire page")
	public void to_click_the_insert_button_in_modify_questionnaire_page() throws InterruptedException {
	    qnp.to_click_the_insert_button_in_modify_questionnaire_page();
	}

	@Then("To validate result Modify Questionnaire page")
	public void to_validate_result_modify_questionnaire_page() throws InterruptedException {
	   qnp.to_validate_result_modify_questionnaire_page(); 
	}
	
}
