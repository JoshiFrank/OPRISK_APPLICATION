package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Control_controlsignoff_page;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Control_controlsignoff_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Control_controlsignoff_page cso;
	
	@When("To mouse hover to Control")
	public void to_mouse_hover_to_control() throws InterruptedException {
	    cso.to_mouse_hover_to_control();
	}

	@When("To click the control signoff option")
	public void to_click_the_control_signoff_option() {
	    cso.to_click_the_control_signoff_option();
	}

	@Then("To validate the list control signoff page")
	public void to_validate_the_list_control_signoff_page() throws InterruptedException {
	   cso.to_validate_the_list_control_signoff_page();
	}

	@When("To click Show check box in list control signoff page")
	public void to_click_show_check_box_in_list_control_signoff_page() {
	    cso.to_click_show_check_box_in_list_control_signoff_page();
	}

	@When("To click the strategy and innovation link in list control signoff page")
	public void to_click_the_strategy_and_innovation_link_in_list_control_signoff_page() throws InterruptedException {
	   cso.to_click_the_strategy_and_innovation_link_in_list_control_signoff_page();
	}

	@Then("To validate the control signoff page")
	public void to_validate_the_control_signoff_page() throws InterruptedException {
		cso.to_validate_the_control_signoff_page();
	    
	}

	@When("To click the Proceed To Approval in control signoff page")
	public void to_click_the_proceed_to_approval_in_control_signoff_page() {
	   cso.to_click_the_proceed_to_approval_in_control_signoff_page();
	}

	@Then("To validate the control signoff approval page")
	public void to_validate_the_control_signoff_approval_page() throws InterruptedException {
	    cso.to_validate_the_control_signoff_approval_page();
	}

	@When("To click the arrow button in Business Manager Approval Text in control signoff approval page")
	public void to_click_the_arrow_button_in_business_manager_approval_text_in_control_signoff_approval_page() {
	    cso.to_click_the_arrow_button_in_business_manager_approval_text_in_control_signoff_approval_page();
	}

}
