package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_RiskFramework_Riskmapbuilder_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_RiskFramework_Riskmapbuilder_steps {

	@Managed
	WebDriver driver;

	@Steps
	Oprisk_Admin_RiskFramework_Riskmapbuilder_pages rmp;

	@When("To mouse hover to Risk Framework option")
	public void to_mouse_hover_to_risk_framework_option() throws InterruptedException {
		rmp.to_mouse_hover_to_risk_framework_option();
	}

	@When("To click the Risk Map builder in Risk Framework option")
	public void to_click_the_risk_map_builder_in_risk_framework_option() {
		rmp.to_click_the_risk_map_builder_in_risk_framework_option();
	}

	@Then("To validate the Build Risk Map page")
	public void to_validate_the_build_risk_map_page() throws InterruptedException {
		rmp.to_validate_the_build_risk_map_page();
	}

	@When("To click Select organisation unit link in Build Risk Map page")
	public void to_click_select_organisation_unit_link_in_build_risk_map_page() {
		rmp.to_click_select_organisation_unit_link_in_build_risk_map_page();
	}

	@Then("To validate Select organisation unit page")
	public void to_validate_select_organisation_unit_page() throws InterruptedException {
		rmp.to_validate_select_organisation_unit_page();
	}

	@When("To click Arrow button in office of president in Select organisation unit page")
	public void to_click_arrow_button_in_office_of_president_in_select_organisation_unit_page() {
		rmp.to_click_arrow_button_in_office_of_president_in_select_organisation_unit_page();
	}

	@When("To click Arrow button in The president in Select organisation unit page")
	public void to_click_arrow_button_in_the_president_in_select_organisation_unit_page() throws InterruptedException {
		rmp.to_click_arrow_button_in_the_president_in_select_organisation_unit_page();
	}

	@When("To click radio button in Risk management option in Select organisation unit page")
	public void to_click_radio_button_in_risk_management_option_in_select_organisation_unit_page() throws InterruptedException {
		rmp.to_click_radio_button_in_risk_management_option_in_select_organisation_unit_page();
	}

	@When("To click the proceed button in Select organisation unit page")
	public void to_click_the_proceed_button_in_select_organisation_unit_page() {
		rmp.to_click_the_proceed_button_in_select_organisation_unit_page();
	}

	@Then("To validate result Build Risk Map page")
	public void to_validate_result_build_risk_map_page() throws InterruptedException {
	   rmp.to_validate_result_build_risk_map_page();
	}

	@When("To click check box in risk management result Build Risk Map page")
	public void to_click_check_box_in_risk_management_result_build_risk_map_page() {
		rmp.to_click_check_box_in_risk_management_result_build_risk_map_page();
	}

	@When("To click the Add to risk map button in result Build Risk Map page")
	public void to_click_the_add_to_risk_map_button_in_result_build_risk_map_page() {
		rmp.to_click_the_add_to_risk_map_button_in_result_build_risk_map_page();
	}

	@When("To click the save button in result Build Risk Map page")
	public void to_click_the_save_button_in_result_build_risk_map_page() throws InterruptedException {
		rmp.to_click_the_save_button_in_result_build_risk_map_page();
	}

}
