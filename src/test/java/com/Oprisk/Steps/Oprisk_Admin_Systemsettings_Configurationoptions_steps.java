package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Systemsettings_Configurationoptions_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Systemsettings_Configurationoptions_steps {

	@Managed
	WebDriver driver;

	@Steps
	Oprisk_Admin_Systemsettings_Configurationoptions_pages cop;

	// To Test Admin menu in custom fields in Configuration option in System
	// settings

	@When("To mouse hover to System settings Option")
	public void to_mouse_hover_to_system_settings_option() throws InterruptedException {
		cop.to_mouse_hover_to_system_settings_option();
	}

	@When("To click Configuration option in System settings")
	public void to_click_configuration_option_in_system_settings() {
		cop.to_click_configuration_option_in_system_settings();
	}

	@Then("To validate Settings page")
	public void to_validate_settings_page() throws InterruptedException {
		cop.to_validate_settings_page();
	}

	@When("To click custom fields link in Settings page")
	public void to_click_custom_fields_link_in_settings_page() {
		cop.to_click_custom_fields_link_in_settings_page();
	}

	@Then("To validate Maintain Custom Fields page")
	public void to_validate_maintain_custom_fields_page() throws InterruptedException {
		cop.to_validate_maintain_custom_fields_page();
	}

	@When("To click Add new button in Maintain Custom Fields page")
	public void to_click_add_new_button_in_maintain_custom_fields_page() {
		cop.to_click_add_new_button_in_maintain_custom_fields_page();
	}

	@Then("To validate Add Custom Field page")
	public void to_validate_add_custom_field_page() throws InterruptedException {
		cop.to_validate_add_custom_field_page();
	}

	@When("To select dropdown in table option in Add Custom Field page")
	public void to_select_dropdown_in_table_option_in_add_custom_field_page() throws InterruptedException {
		cop.to_select_dropdown_in_table_option_in_add_custom_field_page();
	}

	@When("To select dropdown in Interest Type option in Add Custom Field page")
	public void to_select_dropdown_in_interest_type_option_in_add_custom_field_page() throws InterruptedException {
		cop.to_select_dropdown_in_interest_type_option_in_add_custom_field_page();
	}

	@When("To Enter value in Label Name box in Add Custom Field page")
	public void to_enter_value_in_label_name_box_in_add_custom_field_page() {
		cop.to_enter_value_in_label_name_box_in_add_custom_field_page();
	}

	@When("To click in Custom Column Name box in Add Custom Field page")
	public void to_click_in_custom_column_name_box_in_add_custom_field_page() throws InterruptedException {
		cop.to_click_in_custom_column_name_box_in_add_custom_field_page();
	}

	@When("To click check box in Apply Security in Add Custom Field page")
	public void to_click_check_box_in_apply_security_in_add_custom_field_page() {
		cop.to_click_check_box_in_apply_security_in_add_custom_field_page();
	}

	@When("To select dropdown under role option in Add Custom Field page")
	public void to_select_dropdown_under_role_option_in_add_custom_field_page() throws InterruptedException {
		cop.to_select_dropdown_under_role_option_in_add_custom_field_page();
	}

	@When("To select dropdown under Access level option in Add Custom Field page")
	public void to_select_dropdown_under_access_level_option_in_add_custom_field_page() {
		cop.to_select_dropdown_under_access_level_option_in_add_custom_field_page();
	}

	@When("To select dropdown Field Type option in Add Custom Field page")
	public void to_select_dropdown_field_type_option_in_add_custom_field_page() {
		cop.to_select_dropdown_field_type_option_in_add_custom_field_page();
	}

	@When("To click save button in Add Custom Field page")
	public void to_click_save_button_in_add_custom_field_page() {
		cop.to_click_save_button_in_add_custom_field_page();
	}

	@Then("To validate Edit Custom Field page")
	public void to_validate_edit_custom_field_page() throws InterruptedException {
		cop.to_validate_edit_custom_field_page();
	}

	@When("To click cancel button in Edit Custom Field page")
	public void to_click_cancel_button_in_edit_custom_field_page() throws InterruptedException {
		cop.to_click_cancel_button_in_edit_custom_field_page();
	}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Custom Picklist and Hierarchies in Configuration option
	// in System settings

	@When("To click Custom Picklist and Hierarchies link in Settings page")
	public void to_click_custom_picklist_and_hierarchies_link_in_settings_page() throws InterruptedException {
		cop.to_click_custom_picklist_and_hierarchies_link_in_settings_page();
	}

	@Then("To validate Custom Picklists and Hierarchies page")
	public void to_validate_custom_picklists_and_hierarchies_page() throws InterruptedException {
		cop.to_validate_custom_picklists_and_hierarchies_page();
	}

	@When("To click Add picklist button in Custom Picklists and Hierarchies page")
	public void to_click_add_picklist_button_in_custom_picklists_and_hierarchies_page() {
		cop.to_click_add_picklist_button_in_custom_picklists_and_hierarchies_page();
	}

	@Then("To validate Maintain Picklist page")
	public void to_validate_maintain_picklist_page() throws InterruptedException {
		cop.to_validate_maintain_picklist_page();
	}

	@When("To Enter value in Picklist Name box in Maintain Picklist page")
	public void to_enter_value_in_picklist_name_box_in_maintain_picklist_page() throws InterruptedException {
		cop.to_enter_value_in_picklist_name_box_in_maintain_picklist_page();
	}

	@When("To Enter value under Description box in Maintain Picklist page")
	public void to_enter_value_under_description_box_in_maintain_picklist_page() throws InterruptedException {
		cop.to_enter_value_under_description_box_in_maintain_picklist_page();
	}

	@When("To Enter value under value box in Maintain Picklist page")
	public void to_enter_value_under_value_box_in_maintain_picklist_page() throws InterruptedException {
		cop.to_enter_value_under_value_box_in_maintain_picklist_page();
	}

	@When("To click Add button in Maintain Picklist page")
	public void to_click_add_button_in_maintain_picklist_page() throws InterruptedException {
		cop.to_click_add_button_in_maintain_picklist_page();
	}

	@When("To Enter value under second Description box in Maintain Picklist page")
	public void to_enter_value_under_second_description_box_in_maintain_picklist_page() throws InterruptedException {
		cop.to_enter_value_under_second_description_box_in_maintain_picklist_page();
	}

	@When("To Enter value under second value box in Maintain Picklist page")
	public void to_enter_value_under_second_value_box_in_maintain_picklist_page() throws InterruptedException {
		cop.to_enter_value_under_second_value_box_in_maintain_picklist_page();
	}

	@When("To click save button in Maintain Picklist page")
	public void to_click_save_button_in_maintain_picklist_page() throws InterruptedException {
		cop.to_click_save_button_in_maintain_picklist_page();
	}

	@When("To click Add Hierarchy in Custom Picklists and Hierarchies page")
	public void to_click_add_hierarchy_in_custom_picklists_and_hierarchies_page() throws InterruptedException {
		cop.to_click_add_hierarchy_in_custom_picklists_and_hierarchies_page();
	}

	@Then("To validate Add Hierarchy page")
	public void to_validate_add_hierarchy_page() throws InterruptedException {
		cop.to_validate_add_hierarchy_page();
	}

	@When("To Enter value in Hierarchy name in Add Hierarchy page")
	public void to_enter_value_in_hierarchy_name_in_add_hierarchy_page() {
		cop.to_enter_value_in_hierarchy_name_in_add_hierarchy_page();
	}

	@When("To Enter value in Hierarchy value in Add Hierarchy page")
	public void to_enter_value_in_hierarchy_value_in_add_hierarchy_page() {
		cop.to_enter_value_in_hierarchy_value_in_add_hierarchy_page();
	}

	@When("To click save button in Add Hierarchy page")
	public void to_click_save_button_in_add_hierarchy_page() {
		cop.to_click_save_button_in_add_hierarchy_page();
	}

	@Then("To validate Edit Hierarchy page")
	public void to_validate_edit_hierarchy_page() throws InterruptedException {
		cop.to_validate_edit_hierarchy_page();
	}

	@When("To click cancel button in Edit Hierarchy page")
	public void to_click_cancel_button_in_edit_hierarchy_page() throws InterruptedException {
		cop.to_click_cancel_button_in_edit_hierarchy_page();
	}

//---------------------------------------------------------------------------------------------------------------------------------------

	
	// To Test Admin menu in Field Templeate in Configuration option in System settings
	
	@When("To click Field Templates link in Settings page")
	public void to_click_field_templates_link_in_settings_page() throws InterruptedException {
		cop.to_click_field_templates_link_in_settings_page();
	}

	@Then("To validate Maintain Field Templates page")
	public void to_validate_maintain_field_templates_page() throws InterruptedException {
		cop.to_validate_maintain_field_templates_page();
	}

	@When("To click Script button in Maintain Field Templates page")
	public void to_click_script_button_in_maintain_field_templates_page() {
		cop.to_click_script_button_in_maintain_field_templates_page();
	}

	@Then("To validate Organisation Unit Field Scripts page")
	public void to_validate_organisation_unit_field_scripts_page() throws InterruptedException {
		cop.to_validate_organisation_unit_field_scripts_page();
	}

	@When("To select dropdown Script Target option in Organisation Unit Field Scripts page")
	public void to_select_dropdown_script_target_option_in_organisation_unit_field_scripts_page() throws InterruptedException {
		cop.to_select_dropdown_script_target_option_in_organisation_unit_field_scripts_page();
	}

	@When("To Enter Value in Script Description in Organisation Unit Field Scripts page")
	public void to_enter_value_in_script_description_in_organisation_unit_field_scripts_page() throws InterruptedException {
		cop.to_enter_value_in_script_description_in_organisation_unit_field_scripts_page();
	}

	@When("To select dropdown under Parameter Field option in Organisation Unit Field Scripts page")
	public void to_select_dropdown_under_parameter_field_option_in_organisation_unit_field_scripts_page() throws InterruptedException {
		cop.to_select_dropdown_under_parameter_field_option_in_organisation_unit_field_scripts_page();
	}

	@When("To select dropdown under Variable Name option in Organisation Unit Field Scripts page")
	public void to_select_dropdown_under_variable_name_option_in_organisation_unit_field_scripts_page() {
		cop.to_select_dropdown_under_variable_name_option_in_organisation_unit_field_scripts_page();
	}

	@When("To click Add link in Organisation Unit Field Scripts page")
	public void to_click_add_link_in_organisation_unit_field_scripts_page() throws InterruptedException {
		cop.to_click_add_link_in_organisation_unit_field_scripts_page();
	}

	@When("To select dropdown under second Parameter Field option in Organisation Unit Field Scripts page")
	public void to_select_dropdown_under_second_parameter_field_option_in_organisation_unit_field_scripts_page() throws InterruptedException {
		cop.to_select_dropdown_under_second_parameter_field_option_in_organisation_unit_field_scripts_page();
	}

	@When("To select dropdown under second Variable Name option in Organisation Unit Field Scripts page")
	public void to_select_dropdown_under_second_variable_name_option_in_organisation_unit_field_scripts_page() {
		cop.to_select_dropdown_under_second_variable_name_option_in_organisation_unit_field_scripts_page();
	}

	@When("To click Save button in Organisation Unit Field Scripts page")
	public void to_click_save_button_in_organisation_unit_field_scripts_page() throws InterruptedException {
		cop.to_click_save_button_in_organisation_unit_field_scripts_page();
	}

	@When("To click cancel button in Organisation Unit Field Scripts page")
	public void to_click_cancel_button_in_organisation_unit_field_scripts_page() throws InterruptedException {
		cop.to_click_cancel_button_in_organisation_unit_field_scripts_page();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in incident loss Quick Query setting in Configuration option in System settings
	
	@When("To click incident loss Quick Query setting link in Settings page")
	public void to_click_incident_loss_quick_query_setting_link_in_settings_page() throws InterruptedException {
	   cop.to_click_incident_loss_quick_query_setting_link_in_settings_page();
	}

	@Then("To validate Incident Loss Quick Query Settings page")
	public void to_validate_incident_loss_quick_query_settings_page() throws InterruptedException {
	  cop.to_validate_incident_loss_quick_query_settings_page();  
	}

	@When("To click cancel button in Incident Loss Quick Query Settings page")
	public void to_click_cancel_button_in_incident_loss_quick_query_settings_page() throws InterruptedException {
	   cop.to_click_cancel_button_in_incident_loss_quick_query_settings_page(); 
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in incident loss Templates in Configuration option in System settings
	
	@When("To click incident loss Templates link in Settings page")
	public void to_click_incident_loss_templates_link_in_settings_page() throws InterruptedException {
	   cop.to_click_incident_loss_templates_link_in_settings_page(); 
	}

	@Then("To validate List Incident Loss Templates page")
	public void to_validate_list_incident_loss_templates_page() throws InterruptedException {
	   cop.to_validate_list_incident_loss_templates_page(); 
	}

	@When("To click Add template button in List Incident Loss Templates page")
	public void to_click_add_template_button_in_list_incident_loss_templates_page() {
	    cop.to_click_add_template_button_in_list_incident_loss_templates_page();
	}

	@Then("To validate Maintain Incident Loss Database Template page")
	public void to_validate_maintain_incident_loss_database_template_page() throws InterruptedException {
	   cop.to_validate_maintain_incident_loss_database_template_page();
	}

	@When("To Enter Value in Template Name box in Maintain Incident Loss Database Template page")
	public void to_enter_value_in_template_name_box_in_maintain_incident_loss_database_template_page() throws InterruptedException {
	   cop.to_enter_value_in_template_name_box_in_maintain_incident_loss_database_template_page(); 
	}

	@When("To Enter Value in Template Description box in Maintain Incident Loss Database Template page")
	public void to_enter_value_in_template_description_box_in_maintain_incident_loss_database_template_page() throws InterruptedException {
	    cop.to_enter_value_in_template_description_box_in_maintain_incident_loss_database_template_page();
	}

	@When("To click check box in Expired Flag option in Maintain Incident Loss Database Template page")
	public void to_click_check_box_in_expired_flag_option_in_maintain_incident_loss_database_template_page() {
	   cop.to_click_check_box_in_expired_flag_option_in_maintain_incident_loss_database_template_page(); 
	}

	@When("To click check box in Restrict Cancellation option in Maintain Incident Loss Database Template page")
	public void to_click_check_box_in_restrict_cancellation_option_in_maintain_incident_loss_database_template_page() {
	    cop.to_click_check_box_in_restrict_cancellation_option_in_maintain_incident_loss_database_template_page();
	}

	@When("To Enter Value under Template lable box in Maintain Incident Loss Database Template page")
	public void to_enter_value_under_template_lable_box_in_maintain_incident_loss_database_template_page() throws InterruptedException {
	    cop.to_enter_value_under_template_lable_box_in_maintain_incident_loss_database_template_page();
	}

	@When("To select dropdown in print when status in Maintain Incident Loss Database Template page")
	public void to_select_dropdown_in_print_when_status_in_maintain_incident_loss_database_template_page() throws InterruptedException {
	    cop.to_select_dropdown_in_print_when_status_in_maintain_incident_loss_database_template_page();
	}

	@When("To click save button in Maintain Incident Loss Database Template page")
	public void to_click_save_button_in_maintain_incident_loss_database_template_page() throws InterruptedException {
	  cop.to_click_save_button_in_maintain_incident_loss_database_template_page();  
	}

	@When("To Click Add stage button in Maintain Incident Loss Database Template page")
	public void to_click_add_stage_button_in_maintain_incident_loss_database_template_page() throws InterruptedException {
	    cop.to_click_add_stage_button_in_maintain_incident_loss_database_template_page();
	}

	@When("To Enter value in Name box under stage two in Maintain Incident Loss Database Template page")
	public void to_enter_value_in_name_box_under_stage_two_in_maintain_incident_loss_database_template_page() throws InterruptedException {
	    cop.to_enter_value_in_name_box_under_stage_two_in_maintain_incident_loss_database_template_page();
	}

	@When("To click cancel button in Maintain Incident Loss Database Template page")
	public void to_click_cancel_button_in_maintain_incident_loss_database_template_page() throws InterruptedException {
	   cop.to_click_cancel_button_in_maintain_incident_loss_database_template_page();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Indicator Scoring Methodologies in Configuration option in System settings
	
	@When("To click Indicator Scoring Methodologies link in Settings page")
	public void to_click_indicator_scoring_methodologies_link_in_settings_page() throws InterruptedException {
	    cop.to_click_indicator_scoring_methodologies_link_in_settings_page();
	}

	@Then("To validate Maintain Indicator Scoring Methodologies page")
	public void to_validate_maintain_indicator_scoring_methodologies_page() throws InterruptedException {
	    cop.to_validate_maintain_indicator_scoring_methodologies_page();
	}

	@When("To click add new button in Maintain Indicator Scoring Methodologies page")
	public void to_click_add_new_button_in_maintain_indicator_scoring_methodologies_page() {
	    cop.to_click_add_new_button_in_maintain_indicator_scoring_methodologies_page();
	}

	@Then("To validate Add Indicator Scoring Methodology page")
	public void to_validate_add_indicator_scoring_methodology_page() throws InterruptedException {
	    cop.to_validate_add_indicator_scoring_methodology_page();
	}

	@When("To Enter value in Name option Add Indicator Scoring Methodology page")
	public void to_enter_value_in_name_option_add_indicator_scoring_methodology_page() {
	    cop.to_enter_value_in_name_option_add_indicator_scoring_methodology_page();
	}

	@When("To Enter value in Description option Add Indicator Scoring Methodology page")
	public void to_enter_value_in_description_option_add_indicator_scoring_methodology_page() {
	   cop.to_enter_value_in_description_option_add_indicator_scoring_methodology_page(); 
	}

	@When("To click save button Add Indicator Scoring Methodology page")
	public void to_click_save_button_add_indicator_scoring_methodology_page() {
	   cop.to_click_save_button_add_indicator_scoring_methodology_page(); 
	}

	@Then("To validate Edit Indicator Scoring Methodology page")
	public void to_validate_edit_indicator_scoring_methodology_page() throws InterruptedException {
	   cop.to_validate_edit_indicator_scoring_methodology_page();
	}

	@When("To click cancel button in Edit Indicator Scoring Methodology page")
	public void to_click_cancel_button_in_edit_indicator_scoring_methodology_page() throws InterruptedException {
	  cop.to_click_cancel_button_in_edit_indicator_scoring_methodology_page();  
	}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu in Reference Categories in Configuration option in System settings
	
	@When("To click Reference Categories link in Settings page")
	public void to_click_reference_categories_link_in_settings_page() throws InterruptedException {
	    cop.to_click_reference_categories_link_in_settings_page();
	}

	@Then("To validate Maintain Reference Categories page")
	public void to_validate_maintain_reference_categories_page() throws InterruptedException {
	    cop.to_validate_maintain_reference_categories_page();
	}

	@When("To click Add new button in Maintain Reference Categories page")
	public void to_click_add_new_button_in_maintain_reference_categories_page() {
	    cop.to_click_add_new_button_in_maintain_reference_categories_page();
	    
	}

	@Then("To validate Add Reference Category page")
	public void to_validate_add_reference_category_page() throws InterruptedException {
	   cop.to_validate_add_reference_category_page();
	}

	@When("To Enter Value in Reference Category Name option in Add Reference Category page")
	public void to_enter_value_in_reference_category_name_option_in_add_reference_category_page() {
	   cop.to_enter_value_in_reference_category_name_option_in_add_reference_category_page();
	}

	@When("To Enter Value in Reference Category Description option in Add Reference Category page")
	public void to_enter_value_in_reference_category_description_option_in_add_reference_category_page() {
	   cop.to_enter_value_in_reference_category_description_option_in_add_reference_category_page();
	}

	@When("To select dropdown in Associated Entities option in Add Reference Category page")
	public void to_select_dropdown_in_associated_entities_option_in_add_reference_category_page() throws InterruptedException {
	   cop.to_select_dropdown_in_associated_entities_option_in_add_reference_category_page();
	}

	@When("To click save button in Add Reference Category page")
	public void to_click_save_button_in_add_reference_category_page() {
	    cop.to_click_save_button_in_add_reference_category_page();
	}

	@Then("To validate Edit Reference Category page")
	public void to_validate_edit_reference_category_page() throws InterruptedException {
	   cop.to_validate_edit_reference_category_page(); 
	}

	@When("To click cancel button in Edit Reference Category page")
	public void to_click_cancel_button_in_edit_reference_category_page() throws InterruptedException {
	    cop.to_click_cancel_button_in_edit_reference_category_page();
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	//To Test Admin menu in Revaluation Rules in Configuration option in System settings
	
		@When("To click Revaluation Rules link in Settings page")
		public void to_click_revaluation_rules_link_in_settings_page() throws InterruptedException {
		  cop.to_click_revaluation_rules_link_in_settings_page(); 
		}

		@Then("To validate Revaluation Rules page")
		public void to_validate_revaluation_rules_page() throws InterruptedException {
		  cop.to_validate_revaluation_rules_page(); 
		}

		@When("To click cancel button in Revaluation Rules page")
		public void to_click_cancel_button_in_revaluation_rules_page() {
		  cop.to_click_cancel_button_in_revaluation_rules_page();
		}	
	
	
	
	
	
}
