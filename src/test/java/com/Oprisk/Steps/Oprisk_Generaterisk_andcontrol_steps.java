package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Generaterisk_andcontrol_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Generaterisk_andcontrol_steps {

	@Managed
	WebDriver driver;

	@Steps
	Oprisk_Generaterisk_andcontrol_pages grc;

	@When("To click View business menu")
	public void to_click_view_business_menu() throws InterruptedException {
		grc.to_click_view_business_menu();

	}

	@When("To mouse hover on Task Admin option")
	public void to_mouse_hover_on_task_admin_option() {
		grc.to_mouse_hover_on_task_admin_option();
	}

	@When("To click Generate risk and control self assesment")
	public void to_click_generate_risk_and_control_self_assesment() throws InterruptedException {
		grc.to_click_generate_risk_and_control_self_assesment();

	}

	@Then("To validate Generate risk and control self assesment page")
	public void to_validate_generate_risk_and_control_self_assesment_page() {
		grc.to_validate_generate_risk_and_control_self_assesment_page();

	}

	@When("To click expand arrow in office of the president")
	public void to_click_expand_arrow_in_office_of_the_president() {
		grc.to_click_expand_arrow_in_office_of_the_president();

	}

	@When("To click expand arrow in the president option")
	public void to_click_expand_arrow_in_the_president_option() {
		grc.to_click_expand_arrow_in_the_president_option();

	}

	@When("To click Risk Management checkbox")
	public void to_click_risk_management_checkbox() {
		grc.to_click_risk_management_checkbox();

	}

	@When("To click Proceed button in Generate risk and control self assesment functionality")
	public void to_click_proceed_button_in_generate_risk_and_control_self_assesment_functionality()
			throws InterruptedException {
		grc.to_click_proceed_button_in_generate_risk_and_control_self_assesment_functionality();
	}

	@Then("To validate report generation in generate risk and control self assesment")
	public void to_validate_report_generation_in_generate_risk_and_control_self_assesment() {
		grc.to_validate_report_generation_in_generate_risk_and_control_self_assesment();
	}

	@When("To click cancel in report generation in generate risk")
	public void to_click_cancel_in_report_generation_in_generate_risk() throws InterruptedException {
		grc.to_click_cancel_in_report_generation_in_generate_risk();

	}

	@When("To click cancel in Generate risk and control self assesment functionality")
	public void to_click_cancel_in_generate_risk_and_control_self_assesment_functionality()
			throws InterruptedException {
		grc.to_click_cancel_in_generate_risk_and_control_self_assesment_functionality();
	}

}
