package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Key_Risk_Indicator_KRIs_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Key_Risk_Indicator_KRIs_steps {
	@Managed
	WebDriver driver;
	@Steps
	Oprisk_Key_Risk_Indicator_KRIs_pages KRI;

	@When("To MouseOver on the Key Risk indicators\\(KRIs) option in the home page")
	public void to_mouse_over_on_the_key_risk_indicators_kr_is_option_in_the_home_page() throws InterruptedException {
		KRI.to_mouse_over_on_the_key_risk_indicators_kr_is_option_in_the_home_page();

	}

	@When("To Click the Periodic Key Risk indicators\\(KRIs) link")
	public void to_click_the_periodic_key_risk_indicators_kr_is_link() throws InterruptedException {
		KRI.to_click_the_periodic_key_risk_indicators_kr_is_link();

	}

	@Then("validate the List Periodic Key Risk Indicators \\(KRIs) page")
	public void validate_the_list_periodic_key_risk_indicators_kr_is_page() throws InterruptedException {

		KRI.validate_the_list_periodic_key_risk_indicators_kr_is_page();
	}

	@When("To click the check box of required indicator")
	public void to_click_the_check_box_of_required_indicator() throws InterruptedException {
		KRI.to_click_the_check_box_of_required_indicator();

	}

	@When("Click the Not Recorded link under the value option which one you selected indicator")
	public void click_the_not_recorded_link_under_the_value_option_which_one_you_selected_indicator() throws InterruptedException {

		KRI.click_the_not_recorded_link_under_the_value_option_which_one_you_selected_indicator();
	}

	@Then("Validate the Enter indicator score popup")
	public void validate_the_enter_indicator_score_popup() throws InterruptedException {
		KRI.validate_the_enter_indicator_score_popup();

	}

	@When("Enter the value")
	public void enter_the_value() throws InterruptedException {
		KRI.enter_the_value();

	}

	@When("Select the Score from the dropdown")
	public void select_the_score_from_the_dropdown() throws InterruptedException {
		KRI.select_the_score_from_the_dropdown();

	}

	@When("Enter the comment in the text box")
	public void enter_the_comment_in_the_text_box() throws InterruptedException, AWTException {
		KRI.enter_the_comment_in_the_text_box();

	}

	@When("Click Save & Next button")
	public void click_save_next_button() throws InterruptedException {
		KRI.click_save_next_button();

	}

	@When("To click cancel button")
	public void to_click_cancel_button() throws InterruptedException {
		KRI.to_click_cancel_button();
		

	}

	@When("To click submit button")
	public void to_click_submit_button() throws InterruptedException {
		KRI.to_click_submit_button();

	}

	@When("To click Approve button")
	public void to_click_approve_button() throws InterruptedException {
		KRI.to_click_approve_button();

	}

	@Then("Validate the selected indicator status is submitted")
	public void validate_the_selected_indicator_status_is_submitted() throws InterruptedException {
		KRI.validate_the_selected_indicator_status_is_submitted();

	}

}
