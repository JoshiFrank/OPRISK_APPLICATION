package com.Oprisk.Steps;

import com.Oprisk.Pages.Oprisk_Risk_ControlSelf_Assesment_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Risk_Control_Self_Assesment_Steps {

	@Steps
	Oprisk_Risk_ControlSelf_Assesment_Pages rs;

	@When("To MouseOver on the Risks option in home page")
	public void to_mouse_over_on_the_risks_option_in_home_page() {

		rs.to_mouse_over_on_the_risks_option_in_home_page();
	}

	@When("To click the Risk & Self-Assesment\\(RCSA) link")
	public void to_click_the_risk_self_assesment_rcsa_link() {
		rs.to_click_the_risk_self_assesment_rcsa_link();
	}

	@Then("Validate the Risk & Self-Assesment\\(RCSA) page")
	public void validate_the_risk_self_assesment_rcsa_page() {
		rs.validate_the_risk_self_assesment_rcsa_page();
	}

	@When("To Click Opratinal Risk Link")
	public void to_click_opratinal_risk_link() throws InterruptedException {
		rs.to_click_opratinal_risk_link();
	}

	@Then("Validate the Risk & Self-Assesment Control view page")
	public void validate_the_risk_self_assesment_control_view_page() {

		rs.validate_the_risk_self_assesment_control_view_page();
	}

	@When("Click Professional movers option")
	public void click_professional_movers_option() throws InterruptedException {

		rs.click_professional_movers_option();
	}

	@When("To Click proceed To Approval button")
	public void to_click_proceed_to_approval_button() {
		
		rs.to_click_proceed_to_approval_button();
	}

	@Then("Validate the Risk Approval page")
	public void validate_the_risk_approval_page() {

		rs.validate_the_risk_approval_page();
	}
}
