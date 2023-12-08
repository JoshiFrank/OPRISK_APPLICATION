package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Systemsettings_Configurationoptions_pages extends PageObject {

	// To Test Admin menu in custom fields in Configuration option in System
	// settings

	// To mouse hover to System settings Option
	@Step
	public void to_mouse_hover_to_system_settings_option() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='System Settings']")).click();
	}

	// To click Configuration option in System settings
	@Step
	public void to_click_configuration_option_in_system_settings() {

		$(By.xpath("//a[text()='Configuration Options']")).click();
	}

	// To validate Settings page
	@Step
	public void to_validate_settings_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Settings']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click custom fields link in Settings page
	@Step
	public void to_click_custom_fields_link_in_settings_page() {

		$(By.xpath("//a[text()='Custom Fields']")).click();
	}

	// To validate Maintain Custom Fields page
	@Step
	public void to_validate_maintain_custom_fields_page() throws InterruptedException {
		Thread.sleep(3000);

		boolean displayed = $(By.xpath("//h1[text()='Maintain Custom Fields']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click Add new button in Maintain Custom Fields page
	@Step
	public void to_click_add_new_button_in_maintain_custom_fields_page() {

		$(By.xpath("//input[@value='Add New']")).click();
	}

	// To validate Add Custom Field page
	@Step
	public void to_validate_add_custom_field_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Add Custom Field']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To select dropdown in table option in Add Custom Field page
	@Step
	public void to_select_dropdown_in_table_option_in_add_custom_field_page() throws InterruptedException {

		$(By.xpath("//select[@class='bodytext']")).selectByVisibleText("Action Interest Page");
		Thread.sleep(3000);
	}

	// To select dropdown in Interest Type option in Add Custom Field page
	@Step
	public void to_select_dropdown_in_interest_type_option_in_add_custom_field_page() throws InterruptedException {

		Thread.sleep(2000);

		$(By.xpath("(//input[@type='text'])[1]")).click();
		$(By.xpath("//li[text()='Business']")).click();
	}

	// To Enter value in Label Name box in Add Custom Field page
	@Step
	public void to_enter_value_in_label_name_box_in_add_custom_field_page() {

		$(By.xpath("(//input[@type='text'])[3]")).sendKeys("test");
	}

	// To click in Custom Column Name box in Add Custom Field page
	@Step
	public void to_click_in_custom_column_name_box_in_add_custom_field_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[4]")).click();
	}

	// To click check box in Apply Security in Add Custom Field page
	@Step
	public void to_click_check_box_in_apply_security_in_add_custom_field_page() {
		$(By.xpath("(//input[@type='checkbox'])[2]")).click();
	}

	// To select dropdown under role option in Add Custom Field page
	@Step
	public void to_select_dropdown_under_role_option_in_add_custom_field_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//select[@class='bodyText'])[3]")).selectByVisibleText("Business User");
	}

	// To select dropdown under Access level option in Add Custom Field page
	@Step
	public void to_select_dropdown_under_access_level_option_in_add_custom_field_page() {
		$(By.xpath("(//select[@class='bodyText'])[4]")).selectByVisibleText("View");
	}

	// To select dropdown Field Type option in Add Custom Field page
	@Step
	public void to_select_dropdown_field_type_option_in_add_custom_field_page() {
		$(By.xpath("(//select[@class='bodyText'])[5]")).selectByVisibleText("Checkbox");
	}

	// To click save button in Add Custom Field page
	@Step
	public void to_click_save_button_in_add_custom_field_page() {
		$(By.xpath("//input[@value='Save']")).click();
	}

	// To validate Edit Custom Field page
	@Step
	public void to_validate_edit_custom_field_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Edit Custom Field']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Edit Custom Field page
	@Step
	public void to_click_cancel_button_in_edit_custom_field_page() throws InterruptedException {

		$(By.xpath("(//input[@value='Cancel'])[3]")).click();
		Thread.sleep(3000);
	}

//----------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Custom Picklist and Hierarchies in Configuration option
	// in System settings

	// To click Custom Picklist and Hierarchies link in Settings page
	@Step
	public void to_click_custom_picklist_and_hierarchies_link_in_settings_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//a[text()='Custom Picklists/Hierarchies']")).click();
	}

	// To validate Custom Picklists and Hierarchies page
	@Step
	public void to_validate_custom_picklists_and_hierarchies_page() throws InterruptedException {

		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Custom Picklists/Hierarchies']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click Add picklist button in Custom Picklists and Hierarchies page
	@Step
	public void to_click_add_picklist_button_in_custom_picklists_and_hierarchies_page() {

		$(By.xpath("//input[@value='Add Picklist']")).click();
	}

	// To validate Maintain Picklist page
	@Step
	public void to_validate_maintain_picklist_page() throws InterruptedException {

		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Picklist']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To Enter value in Picklist Name box in Maintain Picklist page
	@Step
	public void to_enter_value_in_picklist_name_box_in_maintain_picklist_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[1]")).sendKeys("test2");
	}

	// To Enter value under Description box in Maintain Picklist page
	@Step
	public void to_enter_value_under_description_box_in_maintain_picklist_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("test2");
	}

	// To Enter value under value box in Maintain Picklist page
	@Step
	public void to_enter_value_under_value_box_in_maintain_picklist_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[3]")).sendKeys("test2");
	}

	// To click Add button in Maintain Picklist page
	@Step
	public void to_click_add_button_in_maintain_picklist_page() throws InterruptedException {

		$(By.xpath("//a[text()='Add']")).click();
		Thread.sleep(3000);
	}

	// To Enter value under second Description box in Maintain Picklist page
	@Step
	public void to_enter_value_under_second_description_box_in_maintain_picklist_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[5]")).sendKeys("test2");

	}

	// To Enter value under second value box in Maintain Picklist page
	@Step
	public void to_enter_value_under_second_value_box_in_maintain_picklist_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[6]")).sendKeys("test2");
	}

	// To click save button in Maintain Picklist page
	@Step
	public void to_click_save_button_in_maintain_picklist_page() throws InterruptedException {

		$(By.xpath("//input[@value='Save']")).click();

		Thread.sleep(3000);
		$(By.xpath("//input[@value='Cancel']")).click();
		Thread.sleep(3000);
	}

	// To click Add Hierarchy in Custom Picklists and Hierarchies page
	@Step
	public void to_click_add_hierarchy_in_custom_picklists_and_hierarchies_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//input[@value='Add Hierarchy']")).click();
	}

	// To validate Add Hierarchy page
	@Step
	public void to_validate_add_hierarchy_page() throws InterruptedException {

		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Add Hierarchy']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To Enter value in Hierarchy name in Add Hierarchy page
	@Step
	public void to_enter_value_in_hierarchy_name_in_add_hierarchy_page() {

		$(By.xpath("(//input[@type='text'])[1]")).sendKeys("test1");
	}

	// To Enter value in Hierarchy value in Add Hierarchy page
	@Step
	public void to_enter_value_in_hierarchy_value_in_add_hierarchy_page() {

		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("test1");
	}

	// To click save button in Add Hierarchy page
	@Step
	public void to_click_save_button_in_add_hierarchy_page() {

		$(By.xpath("//input[@value='Save']")).click();
	}

	// To validate Edit Hierarchy page
	@Step
	public void to_validate_edit_hierarchy_page() throws InterruptedException {

		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Edit Hierarchy']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Edit Hierarchy page
	@Step
	public void to_click_cancel_button_in_edit_hierarchy_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//input[@value='Cancel']")).click();
		Thread.sleep(3000);
	}
//---------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Field Templeate in Configuration option in System
	// settings

	// To click Field Templates link in Settings page
	@Step
	public void to_click_field_templates_link_in_settings_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//a[text()='Field Templates']")).click();
	}

	// To validate Maintain Field Templates page
	@Step
	public void to_validate_maintain_field_templates_page() throws InterruptedException {

		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Field Templates']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click Script button in Maintain Field Templates page
	@Step
	public void to_click_script_button_in_maintain_field_templates_page() {

		$(By.xpath("//input[@value='Scripts']")).click();
	}

	// To validate Organisation Unit Field Scripts page
	@Step
	public void to_validate_organisation_unit_field_scripts_page() throws InterruptedException {

		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Organisation Unit Field Scripts']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To select dropdown Script Target option in Organisation Unit Field Scripts
	// page
	@Step
	public void to_select_dropdown_script_target_option_in_organisation_unit_field_scripts_page()
			throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//a[@class='chosen-single']")).click();

		$(By.xpath("//li[text()='Background Visible']")).click();
	}

	// To Enter Value in Script Description in Organisation Unit Field Scripts page
	@Step
	public void to_enter_value_in_script_description_in_organisation_unit_field_scripts_page()
			throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("test2");
	}

	// To select dropdown under Parameter Field option in Organisation Unit Field
	// Scripts page
	@Step
	public void to_select_dropdown_under_parameter_field_option_in_organisation_unit_field_scripts_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//select[@class='bodyText'])[2]")).selectByVisibleText("Owner");
	}

	// To select dropdown under Variable Name option in Organisation Unit Field
	// Scripts page
	@Step
	public void to_select_dropdown_under_variable_name_option_in_organisation_unit_field_scripts_page() {

		$(By.xpath("(//input[@type='text'])[3]")).sendKeys("test3");
	}

	// To click Add link in Organisation Unit Field Scripts page
	@Step
	public void to_click_add_link_in_organisation_unit_field_scripts_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Add']")).click();

		Thread.sleep(4000);
	}

	// To select dropdown under second Parameter Field option in Organisation Unit
	// Field Scripts page
	@Step
	public void to_select_dropdown_under_second_parameter_field_option_in_organisation_unit_field_scripts_page()
			throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("(//select[@class='bodyText'])[2]")).selectByVisibleText("Risk Manager");
	}

	// To select dropdown under second Variable Name option in Organisation Unit
	// Field Scripts page
	@Step
	public void to_select_dropdown_under_second_variable_name_option_in_organisation_unit_field_scripts_page() {

		$(By.xpath("(//input[@type='text'])[4]")).sendKeys("test4");
	}

	// To click Save button in Organisation Unit Field Scripts page
	@Step
	public void to_click_save_button_in_organisation_unit_field_scripts_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(3000);
	}

	// To click cancel button in Organisation Unit Field Scripts page
	@Step
	public void to_click_cancel_button_in_organisation_unit_field_scripts_page() throws InterruptedException {

		$(By.xpath("//input[@value='Cancel']")).click();
		Thread.sleep(3000);
	}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in incident loss Quick Query setting in Configuration
	// option in System settings

	// To click incident loss Quick Query setting link in Settings page
	@Step
	public void to_click_incident_loss_quick_query_setting_link_in_settings_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//a[text()='Incident/Loss Quick Query Settings']")).click();
	}

	// To validate Incident Loss Quick Query Settings page
	@Step
	public void to_validate_incident_loss_quick_query_settings_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Incident/Loss Quick Query Settings']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Incident Loss Quick Query Settings page
	@Step
	public void to_click_cancel_button_in_incident_loss_quick_query_settings_page() throws InterruptedException {

		$(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(3000);
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in incident loss Templates in Configuration option in
	// System settings

	// To click incident loss Templates link in Settings page
	@Step
	public void to_click_incident_loss_templates_link_in_settings_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Incident/Loss Templates']")).click();
	}

	// To validate List Incident Loss Templates page
	@Step
	public void to_validate_list_incident_loss_templates_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='List Incident/Loss Templates']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click Add template button in List Incident Loss Templates page
	@Step
	public void to_click_add_template_button_in_list_incident_loss_templates_page() {

		$(By.xpath("//input[@value='Add Template']")).click();
	}

	// To validate Maintain Incident Loss Database Template page
	@Step
	public void to_validate_maintain_incident_loss_database_template_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Incident/Loss Database Template']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To Enter Value in Template Name box in Maintain Incident Loss Database
	// Template page
	@Step
	public void to_enter_value_in_template_name_box_in_maintain_incident_loss_database_template_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[1]")).sendKeys("test");
	}

	// To Enter Value in Template Description box in Maintain Incident Loss Database
	// Template page
	@Step
	public void to_enter_value_in_template_description_box_in_maintain_incident_loss_database_template_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//textarea[@class='bodytext']")).sendKeys("test");
	}

	// To click check box in Expired Flag option in Maintain Incident Loss Database
	// Template page
	@Step
	public void to_click_check_box_in_expired_flag_option_in_maintain_incident_loss_database_template_page() {

		$(By.xpath("(//input[@type='checkbox'])[1]")).click();
	}

	// To click check box in Restrict Cancellation option in Maintain Incident Loss
	// Database Template page
	@Step
	public void to_click_check_box_in_restrict_cancellation_option_in_maintain_incident_loss_database_template_page() {

		$(By.xpath("(//input[@type='checkbox'])[2]")).click();
	}

	// To Enter Value under Template lable box in Maintain Incident Loss Database
	// Template page
	@Step
	public void to_enter_value_under_template_lable_box_in_maintain_incident_loss_database_template_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[3]")).sendKeys("test");
	}

	// To select dropdown in print when status in Maintain Incident Loss Database
	// Template page
	@Step
	public void to_select_dropdown_in_print_when_status_in_maintain_incident_loss_database_template_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//select[@class='bodytext']")).selectByVisibleText("Approved");
	}

	// To click save button in Maintain Incident Loss Database Template page
	@Step
	public void to_click_save_button_in_maintain_incident_loss_database_template_page() throws InterruptedException {

		$(By.xpath("(//input[@value='Save'])[2]")).click();
		Thread.sleep(2000);
	}

	// To Click Add stage button in Maintain Incident Loss Database Template page
	@Step
	public void to_click_add_stage_button_in_maintain_incident_loss_database_template_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//input[@value='Add Stage']")).click();
	}

	// To Enter value in Name box under stage two in Maintain Incident Loss Database
	// Template page
	@Step
	public void to_enter_value_in_name_box_under_stage_two_in_maintain_incident_loss_database_template_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[4]")).sendKeys("test");
	}

	// To click cancel button in Maintain Incident Loss Database Template page
	@Step
	public void to_click_cancel_button_in_maintain_incident_loss_database_template_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@value='Cancel'])[2]")).click();
	}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Indicator Scoring Methodologies in Configuration option
	// in System settings

	// To click Indicator Scoring Methodologies link in Settings page
	@Step
	public void to_click_indicator_scoring_methodologies_link_in_settings_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//a[text()='Indicator Scoring Methodologies']")).click();
	}

	// To validate Maintain Indicator Scoring Methodologies page
	@Step
	public void to_validate_maintain_indicator_scoring_methodologies_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Indicator Scoring Methodologies']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click add new button in Maintain Indicator Scoring Methodologies page
	@Step
	public void to_click_add_new_button_in_maintain_indicator_scoring_methodologies_page() {

		$(By.xpath("//input[@value='Add New']")).click();
	}

	// To validate Add Indicator Scoring Methodology page
	@Step
	public void to_validate_add_indicator_scoring_methodology_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Add Indicator Scoring Methodology']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To Enter value in Name option Add Indicator Scoring Methodology page
	@Step
	public void to_enter_value_in_name_option_add_indicator_scoring_methodology_page() {

		$(By.xpath("//input[@type='text']")).sendKeys("test");
	}

	// To Enter value in Description option Add Indicator Scoring Methodology page
	@Step
	public void to_enter_value_in_description_option_add_indicator_scoring_methodology_page() {

		$(By.xpath("//textarea[@class='bodyText']")).sendKeys("test");
	}

	// To click save button Add Indicator Scoring Methodology page
	@Step
	public void to_click_save_button_add_indicator_scoring_methodology_page() {

		$(By.xpath("//input[@value='Save']")).click();
	}

	// To validate Edit Indicator Scoring Methodology page
	@Step
	public void to_validate_edit_indicator_scoring_methodology_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Edit Indicator Scoring Methodology']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Edit Indicator Scoring Methodology page
	@Step
	public void to_click_cancel_button_in_edit_indicator_scoring_methodology_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//input[@value='Cancel']")).click();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Reference Categories in Configuration option in System
	// settings

	// To click Reference Categories link in Settings page
	@Step 
	public void to_click_reference_categories_link_in_settings_page() throws InterruptedException {
        Thread.sleep(2000);
		$(By.xpath("//a[text()='Reference Categories']")).click();
	}

	//To validate Maintain Reference Categories page
	@Step
	public void to_validate_maintain_reference_categories_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Reference Categories']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click Add new button in Maintain Reference Categories page
	@Step
	public void to_click_add_new_button_in_maintain_reference_categories_page() {
		
		$(By.xpath("//input[@value='Add New']")).click();
	}

	//To validate Add Reference Category page
	@Step
	public void to_validate_add_reference_category_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Add Reference Category']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To Enter Value in Reference Category Name option in Add Reference Category page
	@Step
	public void to_enter_value_in_reference_category_name_option_in_add_reference_category_page() {

		$(By.xpath("(//input[@type='text'])[1]")).sendKeys("tester");
	}

	//To Enter Value in Reference Category Description option in Add Reference Category page
	@Step
	public void to_enter_value_in_reference_category_description_option_in_add_reference_category_page() {

		$(By.xpath("//textarea[@class='bodyText']")).sendKeys("tester");
	}

	//To select dropdown in Associated Entities option in Add Reference Category page
	@Step
	public void to_select_dropdown_in_associated_entities_option_in_add_reference_category_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//div[@class='chosen-container chosen-container-multi']")).click();
		$(By.xpath("//li[text()='Control Signoff']")).click();
	}

	//To click save button in Add Reference Category page
	@Step
	public void to_click_save_button_in_add_reference_category_page() {

		$(By.xpath("//input[@value='Save']")).click();
	}

	//To validate Edit Reference Category page
	@Step
	public void to_validate_edit_reference_category_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Edit Reference Category']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button in Edit Reference Category page
	@Step
	public void to_click_cancel_button_in_edit_reference_category_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//input[@value='Cancel']")).click();
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// To Test Admin menu in Revaluation Rules in Configuration option in System
		// settings

		// To click Revaluation Rules link in Settings page
		@Step
		public void to_click_revaluation_rules_link_in_settings_page() throws InterruptedException {

			Thread.sleep(2000);
			$(By.xpath("//a[text()='Revaluations Rules']")).click();
		}

		//To validate Revaluation Rules page
		@Step
		public void to_validate_revaluation_rules_page() throws InterruptedException {
			Thread.sleep(3000);
			boolean displayed = $(By.xpath("//h1[text()='Revaluation Rules']")).isDisplayed();
			Assert.assertTrue(displayed);
		}

		//To click cancel button in Revaluation Rules page
		@Step
		public void to_click_cancel_button_in_revaluation_rules_page() {

			$(By.xpath("//input[@value='Cancel']")).click();
		}

	
	
	
	
}
