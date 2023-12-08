package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Techadmin_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Techadmin_steps {
	
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Techadmin_pages aps;
	
	
	@When("To mouse hover to Tech Admin option")
	public void to_mouse_hover_to_tech_admin_option() throws InterruptedException {
	    aps.to_mouse_hover_to_tech_admin_option();
	}
	
	@When("To click the Auditing in organisation option")
	public void to_click_the_auditing_in_organisation_option() {
	   aps.to_click_the_auditing_in_organisation_option(); 
	}

	@Then("To validate Audit Report page")
	public void to_validate_audit_report_page() throws InterruptedException {
	   aps.to_validate_audit_report_page(); 
	}

	@When("To Select dropdown in Table Name in Audit Report page")
	public void to_select_dropdown_in_table_name_in_audit_report_page() {
	   aps.to_select_dropdown_in_table_name_in_audit_report_page(); 
	}

	@When("To Select dropdown in Changed By in Audit Report page")
	public void to_select_dropdown_in_changed_by_in_audit_report_page() throws InterruptedException, AWTException {
	    aps.to_select_dropdown_in_changed_by_in_audit_report_page();
	}

	@When("To Select the Start Date in Audit Report page")
	public void to_select_the_start_date_in_audit_report_page() throws InterruptedException {
	   aps.to_select_the_start_date_in_audit_report_page();
	}

	@When("To Select the End Date in Audit Report page")
	public void to_select_the_end_date_in_audit_report_page() throws InterruptedException {
	    aps.to_select_the_end_date_in_audit_report_page();
	}

	@When("To click the Run Report in Audit Report page")
	public void to_click_the_run_report_in_audit_report_page() {
	   aps.to_click_the_run_report_in_audit_report_page(); 
	}

	@Then("To validate Audit Report Generation page")
	public void to_validate_audit_report_generation_page() throws InterruptedException {
	   aps.to_validate_audit_report_generation_page(); 
	}

	@When("To click ok button in Audit Report Generation page")
	public void to_click_ok_button_in_audit_report_generation_page() {
	    aps.to_click_ok_button_in_audit_report_generation_page();
	}
	
//-----------------------------------------------------------------------------------------------------------------------------------
	
	// To Test Admin menu Scheduled jobs Tech Admin Option
	
	@When("To click the Scheduled jobs in Tech Admin option")
	public void to_click_the_scheduled_jobs_in_tech_admin_option() throws InterruptedException {
	    aps.to_click_the_scheduled_jobs_in_tech_admin_option();
	}

	@Then("To validate Maintain Job Schedules page")
	public void to_validate_maintain_job_schedules_page() throws InterruptedException {
	   aps.to_validate_maintain_job_schedules_page();
	}

	@When("To click the check box under Non monthly task option in Maintain Job Schedules page")
	public void to_click_the_check_box_under_non_monthly_task_option_in_maintain_job_schedules_page() throws InterruptedException {
	    aps.to_click_the_check_box_under_non_monthly_task_option_in_maintain_job_schedules_page();
	}

	@When("To click save button in Maintain Job Schedules page")
	public void to_click_save_button_in_maintain_job_schedules_page() {
	   aps.to_click_save_button_in_maintain_job_schedules_page(); 
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	//To Test Admin menu Emails Tech Admin Option
	
	@When("To click the Emails in Tech Admin option")
	public void to_click_the_emails_in_tech_admin_option() throws InterruptedException {
	  aps.to_click_the_emails_in_tech_admin_option();  
	}

	@Then("To validate Email Configuration page")
	public void to_validate_email_configuration_page() throws InterruptedException {
	   aps.to_validate_email_configuration_page();
	}

	@When("To click check box in indicator option in Email Configuration page")
	public void to_click_check_box_in_indicator_option_in_email_configuration_page() {
	    aps.to_click_check_box_in_indicator_option_in_email_configuration_page();
	}

	@When("To click link under email details option in Email Configuration page")
	public void to_click_link_under_email_details_option_in_email_configuration_page() {
	   aps.to_click_link_under_email_details_option_in_email_configuration_page(); 
	}
	
	@Then("To validate pop up in Email Configuration page")
	public void to_validate_pop_up_in_email_configuration_page() throws InterruptedException {
	    aps.to_validate_pop_up_in_email_configuration_page();
	}

	@When("To click ok button in pop up in Email Configuration page")
	public void to_click_ok_button_in_pop_up_in_email_configuration_page() {
	    aps.to_click_ok_button_in_pop_up_in_email_configuration_page();
	}

	@Then("To validate Email Text page")
	public void to_validate_email_text_page() throws InterruptedException {
	   aps.to_validate_email_text_page();
	}

	@When("To Enter value Email Title box in Email Text page")
	public void to_enter_value_email_title_box_in_email_text_page() throws InterruptedException {
	   aps.to_enter_value_email_title_box_in_email_text_page(); 
	}

	@When("To Enter value Email Body box in Email Text page")
	public void to_enter_value_email_body_box_in_email_text_page() throws InterruptedException {
	   aps.to_enter_value_email_body_box_in_email_text_page(); 
	}

	@When("To click Save button in Email Text page")
	public void to_click_save_button_in_email_text_page() {
	   aps.to_click_save_button_in_email_text_page(); 
	}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu Archiving Tech Admin Option
	
	@When("To click the Archiving in Tech Admin option")
	public void to_click_the_archiving_in_tech_admin_option() throws InterruptedException {
	   aps.to_click_the_archiving_in_tech_admin_option();
	}

	@Then("To validate Manage Archiving page")
	public void to_validate_manage_archiving_page() throws InterruptedException {
	    aps.to_validate_manage_archiving_page();
	}
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// To Test Admin menu References Tech Admin Option

	@When("To click the References in Tech Admin option")
	public void to_click_the_references_in_tech_admin_option() throws InterruptedException {
	    aps.to_click_the_references_in_tech_admin_option();
	}

	@Then("To validate Reference Manager page")
	public void to_validate_reference_manager_page() throws InterruptedException {
		aps.to_validate_reference_manager_page();
	   }

	@When("To click arrow button under Reference source system")
	public void to_click_arrow_button_under_reference_source_system() throws InterruptedException {
	    aps.to_click_arrow_button_under_reference_source_system();
	}

	@When("To click link under title Reference Manager page")
	public void to_click_link_under_title_reference_manager_page() throws InterruptedException {
	   aps.to_click_link_under_title_reference_manager_page();
	}

	@When("To click Entity link in Reference Manager page")
	public void to_click_entity_link_in_reference_manager_page() {
	    aps.to_click_entity_link_in_reference_manager_page();
	}

	@Then("To validate Suspected Payment Fraud using eBanking page")
	public void to_validate_suspected_payment_fraud_using_e_banking_page() throws InterruptedException {
	    aps.to_validate_suspected_payment_fraud_using_e_banking_page();
	}
	
	
	
	

}
