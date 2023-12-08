package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Systemsettings_Datalookups_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Systemsettings_Datalookups_steps {

	@Managed
	WebDriver driver;

	@Steps
	Oprisk_Admin_Systemsettings_Datalookups_pages dlp;

	// To Test Admin menu in source system under Administration option in Data looks
	// ups in System settings

	@When("To click Data looks ups in System settings")
	public void to_click_data_looks_ups_in_system_settings() throws InterruptedException {
		dlp.to_click_data_looks_ups_in_system_settings();
	}

	@Then("To validate Data looks ups page")
	public void to_validate_data_looks_ups_page() throws InterruptedException {
		dlp.to_validate_data_looks_ups_page();
	}

	@When("To click source system under Administration option in Data looks ups page")
	public void to_click_source_system_under_administration_option_in_data_looks_ups_page()
			throws InterruptedException {
		dlp.to_click_source_system_under_administration_option_in_data_looks_ups_page();
	}

	@Then("To validate Maintain Source System page")
	public void to_validate_maintain_source_system_page() throws InterruptedException {
		dlp.to_validate_maintain_source_system_page();
	}

	@When("To click cancel button in Maintain Source System page")
	public void to_click_cancel_button_in_maintain_source_system_page() {
		dlp.to_click_cancel_button_in_maintain_source_system_page();
	}

//--------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Assert class under Asserts option in Data looks ups in
	// System settings

	@When("To click Assert class under Asserts option option in Data looks ups page")
	public void to_click_assert_class_under_asserts_option_option_in_data_looks_ups_page() throws InterruptedException {
		dlp.to_click_assert_class_under_asserts_option_option_in_data_looks_ups_page();

	}

	@Then("To validate Maintain Asset Class page")
	public void to_validate_maintain_asset_class_page() throws InterruptedException {
		dlp.to_validate_maintain_asset_class_page();
	}

	@When("To click cancel button in Maintain Asset Class page")
	public void to_click_cancel_button_in_maintain_asset_class_page() {
		dlp.to_click_cancel_button_in_maintain_asset_class_page();
	}
//---------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Authoritative Sources type under Authoritative Sources
	// in Data looks ups in System settings

	@When("To click Authoritative Sources type under Authoritative Sources option in Data looks ups page")
	public void to_click_authoritative_sources_type_under_authoritative_sources_option_in_data_looks_ups_page()
			throws InterruptedException {
		dlp.to_click_authoritative_sources_type_under_authoritative_sources_option_in_data_looks_ups_page();
	}

	@Then("To validate Maintain Authoritative Source Type page")
	public void to_validate_maintain_authoritative_source_type_page() throws InterruptedException {
		dlp.to_validate_maintain_authoritative_source_type_page();
	}

	@When("To click cancel button in Maintain Authoritative Source Type page")
	public void to_click_cancel_button_in_maintain_authoritative_source_type_page() {
		dlp.to_click_cancel_button_in_maintain_authoritative_source_type_page();
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Lines of business under common option in Data looks ups
	// in System settings

	@When("To click Lines of business under common option in Data looks ups page")
	public void to_click_lines_of_business_under_common_option_in_data_looks_ups_page() throws InterruptedException {
		dlp.to_click_lines_of_business_under_common_option_in_data_looks_ups_page();
	}

	@Then("To validate Maintain Lines of Business page")
	public void to_validate_maintain_lines_of_business_page() throws InterruptedException {
		dlp.to_validate_maintain_lines_of_business_page();
	}

	@When("To click cancel button in Maintain Lines of Business page")
	public void to_click_cancel_button_in_maintain_lines_of_business_page() {

		dlp.to_click_cancel_button_in_maintain_lines_of_business_page();
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Control catagory under Control option in Data looks ups
	// in System settings

	@When("To click Control catagory under Control option in Data looks ups page")
	public void to_click_control_catagory_under_control_option_in_data_looks_ups_page() throws InterruptedException {
		dlp.to_click_control_catagory_under_control_option_in_data_looks_ups_page();
	}

	@Then("To validate Maintain Control Category page")
	public void to_validate_maintain_control_category_page() throws InterruptedException {
		dlp.to_validate_maintain_control_category_page();
	}

	@When("To click cancel button in Maintain Control Category page")
	public void to_click_cancel_button_in_maintain_control_category_page() {
		dlp.to_click_cancel_button_in_maintain_control_category_page();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Control performance definiton under Control signoff
	// option in Data looks ups in System settings

	@When("To click Control performance definiton under Control signoff option in Data looks ups page")
	public void to_click_control_performance_definiton_under_control_signoff_option_in_data_looks_ups_page() throws InterruptedException {
		dlp.to_click_control_performance_definiton_under_control_signoff_option_in_data_looks_ups_page();
	}

	@Then("To validate Maintain Control Performance Definition page")
	public void to_validate_maintain_control_performance_definition_page() throws InterruptedException {
		dlp.to_validate_maintain_control_performance_definition_page();
	}

	@When("To click cancel button in Maintain Control Performance Definition page")
	public void to_click_cancel_button_in_maintain_control_performance_definition_page() {
		dlp.to_click_cancel_button_in_maintain_control_performance_definition_page();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
    //To Test Admin menu in Indicator score colours under Indicator option in Data looks ups in System settings
	
	@When("To click Indicator score colours under Indicator option in Data looks ups page")
	public void to_click_indicator_score_colours_under_indicator_option_in_data_looks_ups_page() throws InterruptedException {
	   dlp.to_click_indicator_score_colours_under_indicator_option_in_data_looks_ups_page(); 
	}

	@Then("To validate Maintain Indicator Score Colours page")
	public void to_validate_maintain_indicator_score_colours_page() throws InterruptedException {
	  dlp.to_validate_maintain_indicator_score_colours_page();  
	}

	@When("To click cancel button in Maintain Indicator Score Colours page")
	public void to_click_cancel_button_in_maintain_indicator_score_colours_page() {
	   dlp.to_click_cancel_button_in_maintain_indicator_score_colours_page(); 
	}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Action priority under Issue and Action option in Data looks ups in System settings
	
	@When("To click Action priority under Issue and Action option in Data looks ups page")
	public void to_click_action_priority_under_issue_and_action_option_in_data_looks_ups_page() throws InterruptedException {
	    dlp.to_click_action_priority_under_issue_and_action_option_in_data_looks_ups_page();
	}

	@Then("To validate Maintain Action Priority page")
	public void to_validate_maintain_action_priority_page() throws InterruptedException {
	  dlp.to_validate_maintain_action_priority_page();  
	}

	@When("To click cancel button in Maintain Action Priority page")
	public void to_click_cancel_button_in_maintain_action_priority_page() {
	   dlp.to_click_cancel_button_in_maintain_action_priority_page(); 
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Cause under Incident and loss option in Data looks ups in System settings
	
	@When("To click Cause under Incident and loss option in Data looks ups page")
	public void to_click_cause_under_incident_and_loss_option_in_data_looks_ups_page() throws InterruptedException {
	    dlp.to_click_cause_under_incident_and_loss_option_in_data_looks_ups_page();
	}

	@Then("To validate Maintain Causes page")
	public void to_validate_maintain_causes_page() throws InterruptedException {
	   dlp.to_validate_maintain_causes_page(); 
	}

	@When("To click cancel button in Maintain Causes page")
	public void to_click_cancel_button_in_maintain_causes_page() {
	   dlp.to_click_cancel_button_in_maintain_causes_page(); 
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Organisation Unit Type under Organisation Unit option in Data looks ups in System settings
	
	@When("To click Organisation Unit Type under Organisation Unit option in Data looks ups page")
	public void to_click_organisation_unit_type_under_organisation_unit_option_in_data_looks_ups_page() throws InterruptedException {
	    dlp.to_click_organisation_unit_type_under_organisation_unit_option_in_data_looks_ups_page();
	}

	@Then("To validate Maintain Organisation Unit Type page")
	public void to_validate_maintain_organisation_unit_type_page() throws InterruptedException {
	   dlp.to_validate_maintain_organisation_unit_type_page(); 
	}

	@When("To click cancel button in Maintain Organisation Unit Type page")
	public void to_click_cancel_button_in_maintain_organisation_unit_type_page() {
	  dlp.to_click_cancel_button_in_maintain_organisation_unit_type_page();  
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Risk Catagory under Risk option in Data looks ups in System settings
	
	@When("To click Risk Catagory under Risk option in Data looks ups page")
	public void to_click_risk_catagory_under_risk_option_in_data_looks_ups_page() throws InterruptedException {
	    dlp.to_click_risk_catagory_under_risk_option_in_data_looks_ups_page();
	}

	@Then("To Validate Maintain Risk Categories page")
	public void to_validate_maintain_risk_categories_page() throws InterruptedException {
	  dlp.to_validate_maintain_risk_categories_page();  
	}

	@When("To click cancel button in Maintain Risk Categories page")
	public void to_click_cancel_button_in_maintain_risk_categories_page() {
	   dlp.to_click_cancel_button_in_maintain_risk_categories_page();
	}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Risk Assessment Status under Risk Assessment option in Data looks ups in System settings
	
	@When("To click Risk Assessment Status under Risk Assessment option in Data looks ups page")
	public void to_click_risk_assessment_status_under_risk_assessment_option_in_data_looks_ups_page() throws InterruptedException {
	   dlp.to_click_risk_assessment_status_under_risk_assessment_option_in_data_looks_ups_page();
	}

	@Then("To validate Maintain Status page")
	public void to_validate_maintain_status_page() throws InterruptedException {
	 dlp.to_validate_maintain_status_page();  
	}

	@When("To click cancel button in Maintain Status page")
	public void to_click_cancel_button_in_maintain_status_page() {
	  dlp.to_click_cancel_button_in_maintain_status_page(); 
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Survey Answer Groups under Surveys option in Data looks ups in System settings
	
	@When("To click Survey Answer Groups under Surveys option in Data looks ups page")
	public void to_click_survey_answer_groups_under_surveys_option_in_data_looks_ups_page() throws InterruptedException {
	    dlp.to_click_survey_answer_groups_under_surveys_option_in_data_looks_ups_page();
	}

	@Then("To validate Survey Answer Group List page")
	public void to_validate_survey_answer_group_list_page() throws InterruptedException {
	    dlp.to_validate_survey_answer_group_list_page();
	}

	@When("To click cancel button in Survey Answer Group List page")
	public void to_click_cancel_button_in_survey_answer_group_list_page() {
	   dlp.to_click_cancel_button_in_survey_answer_group_list_page();
	}
	
}
