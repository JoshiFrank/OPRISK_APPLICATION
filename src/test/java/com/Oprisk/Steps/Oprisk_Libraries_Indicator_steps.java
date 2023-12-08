package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Libraries_Indicator_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Libraries_Indicator_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Libraries_Indicator_pages lip;
	
	
	@When("To Click the indicator option in Libraries")
	public void to_click_the_indicator_option_in_libraries() throws InterruptedException {
	   lip.to_click_the_indicator_option_in_libraries();
	}

	@Then("To validate the Maintain indicator register page")
	public void to_validate_the_maintain_indicator_register_page() throws InterruptedException {
		lip.to_validate_the_maintain_indicator_register_page();
	    
	}

	@When("To click  Down arrow button in Operational Risk Indicators related to Clients Products and Business Practices Failures")
	public void to_click_down_arrow_button_in_operational_risk_indicators_related_to_clients_products_and_business_practices_failures() {
	   lip.to_click_down_arrow_button_in_operational_risk_indicators_related_to_clients_products_and_business_practices_failures();
	}

	@When("To click the Add  headline indicator option")
	public void to_click_the_add_headline_indicator_option() {
       lip.to_click_the_add_headline_indicator_option();
	   
	}

	@Then("To Validate Create Headline Indicator  page")
	public void to_validate_create_headline_indicator_page() throws InterruptedException {
	    lip.to_validate_create_headline_indicator_page();
	}

	@When("To Enter value in Headline Indicator Name box in Create Headline Indicator  page")
	public void to_enter_value_in_headline_indicator_name_box_in_create_headline_indicator_page() {
	    lip.to_enter_value_in_headline_indicator_name_box_in_create_headline_indicator_page();
	}

	@When("To Enter value in Description box in Create Headline Indicator  page")
	public void to_enter_value_in_description_box_in_create_headline_indicator_page() {
	   lip.to_enter_value_in_description_box_in_create_headline_indicator_page();
	}

	@When("To Enter value in Headline Indicator Reference box in Create Headline Indicator  page")
	public void to_enter_value_in_headline_indicator_reference_box_in_create_headline_indicator_page() {
	   lip.to_enter_value_in_headline_indicator_reference_box_in_create_headline_indicator_page();
	   
	}

	@When("To select the dropdown option in Periodicity in Create Headline Indicator  page")
	public void to_select_the_dropdown_option_in_periodicity_in_create_headline_indicator_page() throws InterruptedException {
	    lip.to_select_the_dropdown_option_in_periodicity_in_create_headline_indicator_page();
	}

	@When("To select the dropdown option in Provider in Create Headline Indicator  page")
	public void to_select_the_dropdown_option_in_provider_in_create_headline_indicator_page() throws InterruptedException {
	    lip. to_select_the_dropdown_option_in_provider_in_create_headline_indicator_page();
	}

	@When("To select the dropdown option in Approver in Create Headline Indicator  page")
	public void to_select_the_dropdown_option_in_approver_in_create_headline_indicator_page() throws InterruptedException {
	    lip.to_select_the_dropdown_option_in_approver_in_create_headline_indicator_page();
	}

	@When("To select the dropdown option in Overseer in Create Headline Indicator  page")
	public void to_select_the_dropdown_option_in_overseer_in_create_headline_indicator_page() throws InterruptedException {
	    lip.to_select_the_dropdown_option_in_overseer_in_create_headline_indicator_page();
	}

	@When("To select the dropdown option in Overseer Alter Notification in Create Headline Indicator  page")
	public void to_select_the_dropdown_option_in_overseer_alter_notification_in_create_headline_indicator_page() throws InterruptedException {
	   lip.to_select_the_dropdown_option_in_overseer_alter_notification_in_create_headline_indicator_page();
	}

	@When("To Select the Completion Date in Create Headline Indicator  page")
	public void to_select_the_completion_date_in_create_headline_indicator_page() {
	    lip.to_select_the_completion_date_in_create_headline_indicator_page();
	}

	@When("To select the dropdown option in Collection Method in Create Headline Indicator  page")
	public void to_select_the_dropdown_option_in_collection_method_in_create_headline_indicator_page() throws InterruptedException {
	    lip.to_select_the_dropdown_option_in_collection_method_in_create_headline_indicator_page();
	}

	@When("To Enter value in Data Feed Mnemonic box in Create Headline Indicator  page")
	public void to_enter_value_in_data_feed_mnemonic_box_in_create_headline_indicator_page() throws InterruptedException {
	    lip.to_enter_value_in_data_feed_mnemonic_box_in_create_headline_indicator_page();
	}

	@When("To select the dropdown option in Aggregation Method in Create Headline Indicator  page")
	public void to_select_the_dropdown_option_in_aggregation_method_in_create_headline_indicator_page() throws AWTException {
	    lip.to_select_the_dropdown_option_in_aggregation_method_in_create_headline_indicator_page();
	}

	@When("To click the next button in Create Headline Indicator  page")
	public void to_click_the_next_button_in_create_headline_indicator_page() throws InterruptedException {
	    lip.to_click_the_next_button_in_create_headline_indicator_page();
	}

	@Then("To Validate the Select Scoring Method And Define Thresholds page")
	public void to_validate_the_select_scoring_method_and_define_thresholds_page() throws InterruptedException {
	   lip.to_validate_the_select_scoring_method_and_define_thresholds_page();
	}

	@When("To select dropdown option in Indicator Scoring Methodology in Select Scoring Method And Define Thresholds page")
	public void to_select_dropdown_option_in_indicator_scoring_methodology_in_select_scoring_method_and_define_thresholds_page() throws InterruptedException {
	    lip.to_select_dropdown_option_in_indicator_scoring_methodology_in_select_scoring_method_and_define_thresholds_page();
	}

	@When("To click check box in Inherit Headline Indicator Threshold in Select Scoring Method And Define Thresholds page")
	public void to_click_check_box_in_inherit_headline_indicator_threshold_in_select_scoring_method_and_define_thresholds_page() throws InterruptedException {
	  lip.to_click_check_box_in_inherit_headline_indicator_threshold_in_select_scoring_method_and_define_thresholds_page();
	}

	@When("To click the next button in Select Scoring Method And Define Thresholds page")
	public void to_click_the_next_button_in_select_scoring_method_and_define_thresholds_page() {
	   lip.to_click_the_next_button_in_select_scoring_method_and_define_thresholds_page();
	}

	@Then("To Validate the Select Dimension Types page")
	public void to_validate_the_select_dimension_types_page() throws InterruptedException {
	   lip.to_validate_the_select_dimension_types_page();
	}

	@When("To click the check box in Dimension Types in Select Dimension Types page")
	public void to_click_the_check_box_in_dimension_types_in_select_dimension_types_page() {
	    lip.to_click_the_check_box_in_dimension_types_in_select_dimension_types_page();
	}

	@When("To click the next button in Select Dimension Types page")
	public void to_click_the_next_button_in_select_dimension_types_page() {
	    lip.to_click_the_next_button_in_select_dimension_types_page();
	}

	@Then("To validate the Select Indicator Dimension Values page")
	public void to_validate_the_select_indicator_dimension_values_page() throws InterruptedException {
	    lip.to_validate_the_select_indicator_dimension_values_page();
	}

	@When("To click the Arrow button in office of the President in Select Indicator Dimension Values page")
	public void to_click_the_arrow_button_in_office_of_the_president_in_select_indicator_dimension_values_page() {
	   lip.to_click_the_arrow_button_in_office_of_the_president_in_select_indicator_dimension_values_page();
	}

	@When("To click the Arrow button the President in Select Indicator Dimension Values page")
	public void to_click_the_arrow_button_the_president_in_select_indicator_dimension_values_page() {
	    lip.to_click_the_arrow_button_the_president_in_select_indicator_dimension_values_page();
	}

	@When("To click the check box in Risk management option in Select Indicator Dimension Values page")
	public void to_click_the_check_box_in_risk_management_option_in_select_indicator_dimension_values_page() {
	   lip.to_click_the_check_box_in_risk_management_option_in_select_indicator_dimension_values_page();
	}

	@When("To click the next button in Select Indicator Dimension Values page")
	public void to_click_the_next_button_in_select_indicator_dimension_values_page() {
	    lip.to_click_the_next_button_in_select_indicator_dimension_values_page();
	}

	@Then("To validate the Review Indicators page")
	public void to_validate_the_review_indicators_page() throws InterruptedException {
	    lip.to_validate_the_review_indicators_page();
	}

	@When("To click the save button in Review Indicators page")
	public void to_click_the_save_button_in_review_indicators_page() {
	   lip.to_click_the_save_button_in_review_indicators_page();
	}

	@Then("To validate the Edit headline indicator page")
	public void to_validate_the_edit_headline_indicator_page() throws InterruptedException {
	   lip.to_validate_the_edit_headline_indicator_page();
	}

	@When("To click the check box in onesum Edit headline indicator page")
	public void to_click_the_check_box_in_onesum_edit_headline_indicator_page() throws InterruptedException {
	    lip.to_click_the_check_box_in_onesum_edit_headline_indicator_page();
	}

	@When("to click the save button in Edit headline indicator page")
	public void to_click_the_save_button_in_edit_headline_indicator_page() {
	    lip.to_click_the_save_button_in_edit_headline_indicator_page();
	}

}
