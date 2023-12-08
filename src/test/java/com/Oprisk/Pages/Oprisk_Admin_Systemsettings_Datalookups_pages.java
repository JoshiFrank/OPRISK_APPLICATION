package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Systemsettings_Datalookups_pages extends PageObject {

	// To Test Admin menu in source system under Administration option in Data looks
	// ups in System settings

	// To click Data looks ups in System settings
	@Step
	public void to_click_data_looks_ups_in_system_settings() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//a[text()='Data Lookups']")).click();
	}

	// To validate Data looks ups page
	@Step
	public void to_validate_data_looks_ups_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Data Lookups']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click source system under Administration option in Data looks ups page
	@Step
	public void to_click_source_system_under_administration_option_in_data_looks_ups_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Source System']")).click();
	}

	// To validate Maintain Source System page
	@Step
	public void to_validate_maintain_source_system_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Source System']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Source System page
	@Step
	public void to_click_cancel_button_in_maintain_source_system_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//--------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Assert class under Asserts option in Data looks ups in
	// System settings

	// To click Assert class under Asserts option option in Data looks ups page
	@Step
	public void to_click_assert_class_under_asserts_option_option_in_data_looks_ups_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Asset Class']")).click();
	}

	// To validate Maintain Asset Class page
	@Step
	public void to_validate_maintain_asset_class_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Asset Class']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Asset Class page
	@Step
	public void to_click_cancel_button_in_maintain_asset_class_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Authoritative Sources type under Authoritative Sources
	// in Data looks ups in System settings

	// To click Authoritative Sources type under Authoritative Sources option in
	// Data looks ups page
	@Step
	public void to_click_authoritative_sources_type_under_authoritative_sources_option_in_data_looks_ups_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Authoritative Source Type']")).click();
	}

	// To validate Maintain Authoritative Source Type page
	@Step
	public void to_validate_maintain_authoritative_source_type_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Authoritative Source Type']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Authoritative Source Type page
	@Step
	public void to_click_cancel_button_in_maintain_authoritative_source_type_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Lines of business under common option in Data looks ups
	// in System settings

	// To click Lines of business under common option in Data looks ups page
	@Step
	public void to_click_lines_of_business_under_common_option_in_data_looks_ups_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Lines of Business']")).click();
	}

	// To validate Maintain Lines of Business page
	@Step
	public void to_validate_maintain_lines_of_business_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Lines of Business']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Lines of Business page
	@Step
	public void to_click_cancel_button_in_maintain_lines_of_business_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Control catagory under Control option in Data looks ups
	// in System settings

	// To click Control catagory under Control option in Data looks ups page
	@Step
	public void to_click_control_catagory_under_control_option_in_data_looks_ups_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Control Category']")).click();
	}

	// To validate Maintain Control Category page
	@Step
	public void to_validate_maintain_control_category_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Control Category']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Control Category page
	@Step
	public void to_click_cancel_button_in_maintain_control_category_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Control performance definiton under Control signoff
	// option in Data looks ups in System settings

	// To click Control performance definiton under Control signoff option in Data
	// looks ups page
	@Step
	public void to_click_control_performance_definiton_under_control_signoff_option_in_data_looks_ups_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Control Performance Definition']")).click();
	}

	// To validate Maintain Control Performance Definition page
	@Step
	public void to_validate_maintain_control_performance_definition_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Control Performance Definition']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Control Performance Definition page
	@Step
	public void to_click_cancel_button_in_maintain_control_performance_definition_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Indicator score colours under Indicator option in Data
	// looks ups in System settings

	// To click Indicator score colours under Indicator option in Data looks ups
	// page
	@Step
	public void to_click_indicator_score_colours_under_indicator_option_in_data_looks_ups_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Indicator Score Colours']")).click();
	}

	// To validate Maintain Indicator Score Colours page
	@Step
	public void to_validate_maintain_indicator_score_colours_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Indicator Score Colours']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Indicator Score Colours page
	@Step
	public void to_click_cancel_button_in_maintain_indicator_score_colours_page() {
		$(By.xpath("//input[@value='Cancel']")).click();
	}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Action priority under Issue and Action option in Data
	// looks ups in System settings

	// To click Action priority under Issue and Action option in Data looks ups page
	@Step
	public void to_click_action_priority_under_issue_and_action_option_in_data_looks_ups_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Action Priority']")).click();
	}

	// To validate Maintain Action Priority page
	@Step
	public void to_validate_maintain_action_priority_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Action Priority']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Action Priority page
	@Step
	public void to_click_cancel_button_in_maintain_action_priority_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Cause under Incident and loss option in Data looks ups
	// in System settings

	// To click Cause under Incident and loss option in Data looks ups page
	@Step
	public void to_click_cause_under_incident_and_loss_option_in_data_looks_ups_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Causes']")).click();
	}

	// To validate Maintain Causes page
	@Step
	public void to_validate_maintain_causes_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//a[text()='Maintain Causes']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Causes page
	@Step
	public void to_click_cancel_button_in_maintain_causes_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Organisation Unit Type under Organisation Unit option
	// in Data looks ups in System settings

	// To click Organisation Unit Type under Organisation Unit option in Data looks
	// ups page
	@Step
	public void to_click_organisation_unit_type_under_organisation_unit_option_in_data_looks_ups_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Organisation Unit Types']")).click();
	}

	// To validate Maintain Organisation Unit Type page
	@Step
	public void to_validate_maintain_organisation_unit_type_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//a[text()='Maintain Organisation Unit Type']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Organisation Unit Type page
	@Step
	public void to_click_cancel_button_in_maintain_organisation_unit_type_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Risk Catagory under Risk option in Data looks ups in
	// System settings

	// To click Risk Catagory under Risk option in Data looks ups page
	@Step
	public void to_click_risk_catagory_under_risk_option_in_data_looks_ups_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Risk Category']")).click();
	}

	// To Validate Maintain Risk Categories page
	@Step
	public void to_validate_maintain_risk_categories_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Risk Categories']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// To click cancel button in Maintain Risk Categories page
	@Step
	public void to_click_cancel_button_in_maintain_risk_categories_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Risk Assessment Status under Risk Assessment option in
	// Data looks ups in System settings

	// To click Risk Assessment Status under Risk Assessment option in Data looks
	// ups page
	@Step
	public void to_click_risk_assessment_status_under_risk_assessment_option_in_data_looks_ups_page()
			throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Risk Assessment Status']")).click();
	}

	// To validate Maintain Status page
	@Step
	public void to_validate_maintain_status_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain CT100 Status']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click cancel button in Maintain Status page
	@Step
	public void to_click_cancel_button_in_maintain_status_page() {

		$(By.xpath("//input[@value='Cancel']")).click();

	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu in Survey Answer Groups under Surveys option in Data looks
	// ups in System settings

	//To click Survey Answer Groups under Surveys option in Data looks ups page
	@Step
	public void to_click_survey_answer_groups_under_surveys_option_in_data_looks_ups_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Survey Answer Groups']")).click();
	}

	//To validate Survey Answer Group List page
	@Step
	public void to_validate_survey_answer_group_list_page() throws InterruptedException {

		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Survey Answer Group List']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}

	//To click cancel button in Survey Answer Group List page
	@Step
	public void to_click_cancel_button_in_survey_answer_group_list_page() {

		$(By.xpath("//input[@value='Cancel']")).click();
	}
}
