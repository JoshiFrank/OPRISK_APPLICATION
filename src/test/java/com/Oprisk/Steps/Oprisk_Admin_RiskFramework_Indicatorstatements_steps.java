package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_RiskFramework_Indicatorstatements_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_RiskFramework_Indicatorstatements_steps {

	@Managed
	WebDriver driver;

	@Steps
	Oprisk_Admin_RiskFramework_Indicatorstatements_pages isp;

	@When("To click the Indicator Statements in Risk Framework option")
	public void to_click_the_indicator_statements_in_risk_framework_option() throws InterruptedException {
		isp.to_click_the_indicator_statements_in_risk_framework_option();
	}

	@Then("To validate the List Indicator Statements page")
	public void to_validate_the_list_indicator_statements_page() throws InterruptedException {
		isp.to_validate_the_list_indicator_statements_page();
	}

	@When("To click the New Standard Statement button in List Indicator Statements page")
	public void to_click_the_new_standard_statement_button_in_list_indicator_statements_page() {
		isp.to_click_the_new_standard_statement_button_in_list_indicator_statements_page();
	}

	@Then("To validate the Add Indicator Statement page")
	public void to_validate_the_add_indicator_statement_page() throws InterruptedException {
		isp.to_validate_the_add_indicator_statement_page();
	}

	@When("To Enter the value in title in Add Indicator Statement page")
	public void to_enter_the_value_in_title_in_add_indicator_statement_page() {
		isp.to_enter_the_value_in_title_in_add_indicator_statement_page();
	}

	@When("To Enter the value in Description in Add Indicator Statement page")
	public void to_enter_the_value_in_description_in_add_indicator_statement_page() {
		isp.to_enter_the_value_in_description_in_add_indicator_statement_page();
	}

	@When("To Enter the value in Introduction Title Text in Add Indicator Statement page")
	public void to_enter_the_value_in_introduction_title_text_in_add_indicator_statement_page() {
		isp.to_enter_the_value_in_introduction_title_text_in_add_indicator_statement_page();
	}

	@When("To Enter the value in Appendix Title Text in Add Indicator Statement page")
	public void to_enter_the_value_in_appendix_title_text_in_add_indicator_statement_page() {
		isp.to_enter_the_value_in_appendix_title_text_in_add_indicator_statement_page();
	}

	@When("To Select dropdown in Periodicity option in Add Indicator Statement page")
	public void to_select_dropdown_in_periodicity_option_in_add_indicator_statement_page() {
		isp.to_select_dropdown_in_periodicity_option_in_add_indicator_statement_page();
	}

	@When("To click the Save button in Add Indicator Statement page")
	public void to_click_the_save_button_in_add_indicator_statement_page() {
		isp.to_click_the_save_button_in_add_indicator_statement_page();
		
	}

	@Then("To validate Edit Indicator Statement page")
	public void to_validate_edit_indicator_statement_page() throws InterruptedException {
		isp.to_validate_edit_indicator_statement_page();
	}

	@When("To Enter value in sub heading name in Edit Indicator Statement page")
	public void to_enter_value_in_sub_heading_name_in_edit_indicator_statement_page() {
		isp.to_enter_value_in_sub_heading_name_in_edit_indicator_statement_page();
	}

	@When("To click the Save button in Edit Indicator Statement page")
	public void to_click_the_save_button_in_edit_indicator_statement_page() {
		isp.to_click_the_save_button_in_edit_indicator_statement_page();
	}

	@When("To click the cancel button in Edit Indicator Statement page")
	public void to_click_the_cancel_button_in_edit_indicator_statement_page() throws InterruptedException {
		isp.to_click_the_cancel_button_in_edit_indicator_statement_page();
	}

	@Then("To validate result in List Indicator Statements")
	public void to_validate_result_in_list_indicator_statements() throws InterruptedException {
		isp.to_validate_result_in_list_indicator_statements();
	}
	
	
//----------------------------------------------------------------------------------------------------------------------
	
	// To Test Admin menu Indicator Statements New Dimension Statement in Risk Framework option
	
	@When("To click the New Dimension Statement button in List Indicator Statements page")
	public void to_click_the_new_dimension_statement_button_in_list_indicator_statements_page() throws InterruptedException {
	   isp.to_click_the_new_dimension_statement_button_in_list_indicator_statements_page(); 
	}

	@Then("To validate the Select Statement Dimension Type page")
	public void to_validate_the_select_statement_dimension_type_page() throws InterruptedException {
	   isp.to_validate_the_select_statement_dimension_type_page();
	}

	@When("To click radio button in organisation unit in Select Statement Dimension Type page")
	public void to_click_radio_button_in_organisation_unit_in_select_statement_dimension_type_page() {
	   isp.to_click_radio_button_in_organisation_unit_in_select_statement_dimension_type_page();
	}

	@When("To click the proceed button in Select Statement Dimension Type page")
	public void to_click_the_proceed_button_in_select_statement_dimension_type_page() {
	    isp.to_click_the_proceed_button_in_select_statement_dimension_type_page();
	}

	@Then("To validate the Add Organisation Unit Statement page")
	public void to_validate_the_add_organisation_unit_statement_page() throws InterruptedException {
	    isp.to_validate_the_add_organisation_unit_statement_page();
	}

	@When("To Enter the value in title in Add Organisation Unit Statement page")
	public void to_enter_the_value_in_title_in_add_organisation_unit_statement_page() {
	    isp.to_enter_the_value_in_title_in_add_organisation_unit_statement_page();
	}

	@When("To Enter the value in Description in Add Organisation Unit Statement page")
	public void to_enter_the_value_in_description_in_add_organisation_unit_statement_page() {
	    isp.to_enter_the_value_in_description_in_add_organisation_unit_statement_page();
	}

	@When("To Enter the value in Introduction Title Text in Add Organisation Unit Statement page")
	public void to_enter_the_value_in_introduction_title_text_in_add_organisation_unit_statement_page() {
	    isp.to_enter_the_value_in_introduction_title_text_in_add_organisation_unit_statement_page();
	}

	@When("To Enter the value in Appendix Title Text in Add Organisation Unit Statement page")
	public void to_enter_the_value_in_appendix_title_text_in_add_organisation_unit_statement_page() {
	    isp.to_enter_the_value_in_appendix_title_text_in_add_organisation_unit_statement_page();
	}

	@When("To Select dropdown in Periodicity option in Add Organisation Unit Statement page")
	public void to_select_dropdown_in_periodicity_option_in_add_organisation_unit_statement_page() {
	    isp.to_select_dropdown_in_periodicity_option_in_add_organisation_unit_statement_page();
	}

	@When("To click the Save button in Add Organisation Unit Statement page")
	public void to_click_the_save_button_in_add_organisation_unit_statement_page() {
	    isp.to_click_the_save_button_in_add_organisation_unit_statement_page();
	}

	@Then("To validate Edit Indicator Statement page with sub heading")
	public void to_validate_edit_indicator_statement_page_with_sub_heading() throws InterruptedException {
	    isp.to_validate_edit_indicator_statement_page_with_sub_heading();
	}

	@When("To click the cancel button in Edit Indicator Statement page with sub heading")
	public void to_click_the_cancel_button_in_edit_indicator_statement_page_with_sub_heading() throws InterruptedException {
	    isp.to_click_the_cancel_button_in_edit_indicator_statement_page_with_sub_heading();
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu Indicator Statements New Register Statement in Risk Framework option
	
	@When("To click the New Register Statement button in List Indicator Statements page")
	public void to_click_the_new_register_statement_button_in_list_indicator_statements_page() {
	    isp.to_click_the_new_register_statement_button_in_list_indicator_statements_page();
	}

	@Then("To validate Select Indicator Register Heading page")
	public void to_validate_select_indicator_register_heading_page() throws InterruptedException {
	   isp.to_validate_select_indicator_register_heading_page();
	}

	@When("To click radio button in Indicator Library in Select Indicator Register Heading page")
	public void to_click_radio_button_in_indicator_library_in_select_indicator_register_heading_page() {
	    isp.to_click_radio_button_in_indicator_library_in_select_indicator_register_heading_page();
	}

	@When("To click Save button in Select Indicator Register Heading page")
	public void to_click_save_button_in_select_indicator_register_heading_page() {
	   isp.to_click_save_button_in_select_indicator_register_heading_page(); 
	}

	@Then("To validate Add Indicator Library Statement page")
	public void to_validate_add_indicator_library_statement_page() throws InterruptedException {
	  isp.to_validate_add_indicator_library_statement_page();  
	}

	@When("To Enter the value in title in Add Indicator Library Statement page")
	public void to_enter_the_value_in_title_in_add_indicator_library_statement_page() {
	    isp.to_enter_the_value_in_title_in_add_indicator_library_statement_page();
	}

	@When("To Enter the value in Description in Add Indicator Library Statement page")
	public void to_enter_the_value_in_description_in_add_indicator_library_statement_page() {
	    isp.to_enter_the_value_in_description_in_add_indicator_library_statement_page();
	}

	@When("To Enter the value in Introduction Title Text in Add Indicator Library Statement page")
	public void to_enter_the_value_in_introduction_title_text_in_add_indicator_library_statement_page() {
	    isp.to_enter_the_value_in_introduction_title_text_in_add_indicator_library_statement_page();
	}

	@When("To Enter the value in Appendix Title Text in Add Indicator Library Statement page")
	public void to_enter_the_value_in_appendix_title_text_in_add_indicator_library_statement_page() {
	   isp.to_enter_the_value_in_appendix_title_text_in_add_indicator_library_statement_page(); 
	}

	@When("To Select dropdown in Periodicity option in Add Indicator Library Statement page")
	public void to_select_dropdown_in_periodicity_option_in_add_indicator_library_statement_page() {
	    isp.to_select_dropdown_in_periodicity_option_in_add_indicator_library_statement_page();
	}

	@When("To click the Save button in Add Indicator Library Statement page")
	public void to_click_the_save_button_in_add_indicator_library_statement_page() throws InterruptedException {
	    isp.to_click_the_save_button_in_add_indicator_library_statement_page();
	}

	@When("To click the cancel button in Edit Indicator Statement page with sub heading name")
	public void to_click_the_cancel_button_in_edit_indicator_statement_page_with_sub_heading_name() throws InterruptedException {
	    isp.to_click_the_cancel_button_in_edit_indicator_statement_page_with_sub_heading_name();
	}
	
	
	
	
	
}
