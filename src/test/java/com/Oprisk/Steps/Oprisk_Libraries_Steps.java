package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Libraries_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Libraries_Steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Libraries_pages lp;
	
	
	@When("To mouse hover to Libraries")
	public void to_mouse_hover_to_libraries() throws InterruptedException {
	    lp.to_mouse_hover_to_libraries();
	}

	@When("To click the Risk option in Libraries")
	public void to_click_the_risk_option_in_libraries() throws InterruptedException {
	    lp.to_click_the_risk_option_in_libraries();
	}

	@Then("To validate the Maintain Risk register page")
	public void to_validate_the_maintain_risk_register_page() throws InterruptedException {
	    lp.to_validate_the_maintain_risk_register_page();
	}
	
	@When("To print the Group wide risk name in Maintain Risk register page")
	public void to_print_the_group_wide_risk_name_in_maintain_risk_register_page() throws InterruptedException {
	    lp.to_print_the_group_wide_risk_name_in_maintain_risk_register_page();
	}

	@When("To click the cancel button in Maintain Risk register page")
	public void to_click_the_cancel_button_in_maintain_risk_register_page() {
	   lp.to_click_the_cancel_button_in_maintain_risk_register_page();
	}
//--------------------------------------------------------------------------------------------------------------------
	
	//To Test the Control fuction in Libraries
	
	@When("To Click the control option in Libraries")
	public void to_click_the_control_option_in_libraries() throws InterruptedException {
		lp.to_click_the_control_option_in_libraries();
	    
	}

	@Then("To validate the maintain control register page")
	public void to_validate_the_maintain_control_register_page() throws InterruptedException {
	   lp.to_validate_the_maintain_control_register_page();
	}

	@When("To click the Risk icon in maintain control register page")
	public void to_click_the_risk_icon_in_maintain_control_register_page() throws InterruptedException {
	    lp.to_click_the_risk_icon_in_maintain_control_register_page();
	}

	@When("To click the Risk management Down Arrow button")
	public void to_click_the_risk_management_down_arrow_button() throws InterruptedException {
	    lp.to_click_the_risk_management_down_arrow_button();
	}

	@When("To Click the Add Groupwide control option")
	public void to_click_the_add_groupwide_control_option() {
	    lp.to_click_the_add_groupwide_control_option();
	}

	@Then("To validate the Add Groupwide control page")
	public void to_validate_the_add_groupwide_control_page() throws InterruptedException {
	    lp.to_validate_the_add_groupwide_control_page();
	}

	@When("To Enter value in Groupwide control name in New Groupwide control")
	public void to_enter_value_in_groupwide_control_name_in_new_groupwide_control() throws InterruptedException {
	    lp.to_enter_value_in_groupwide_control_name_in_new_groupwide_control();
	}

	@When("To Enter value in External reference in New Groupwide control")
	public void to_enter_value_in_external_reference_in_new_groupwide_control() {
	    lp.to_enter_value_in_external_reference_in_new_groupwide_control();
	}

	@When("To Enter value in Control Description in New Groupwide control")
	public void to_enter_value_in_control_description_in_new_groupwide_control() {
	   lp.to_enter_value_in_control_description_in_new_groupwide_control();
	}

	@When("To Enter value in Control Text in New Groupwide control")
	public void to_enter_value_in_control_text_in_new_groupwide_control() {
       lp.to_enter_value_in_control_text_in_new_groupwide_control();

	}

	@When("To select the Dropdown in Control Category New Groupwide control")
	public void to_select_the_dropdown_in_control_category_new_groupwide_control() throws InterruptedException {
	    lp.to_select_the_dropdown_in_control_category_new_groupwide_control();
	}

	@When("To select the Dropdown in Control Classification New Groupwide control")
	public void to_select_the_dropdown_in_control_classification_new_groupwide_control() throws InterruptedException {
	    lp.to_select_the_dropdown_in_control_classification_new_groupwide_control();
	}

	@When("To select the Dropdown in Frequency in New Groupwide control")
	public void to_select_the_dropdown_in_frequency_in_new_groupwide_control() throws InterruptedException {
	    lp.to_select_the_dropdown_in_frequency_in_new_groupwide_control();
	}

	@When("To select the Dropdown in Start Month in New Groupwide control")
	public void to_select_the_dropdown_in_start_month_in_new_groupwide_control() throws AWTException, InterruptedException {
	    lp.to_select_the_dropdown_in_start_month_in_new_groupwide_control();
	}

	@When("To click the Save button in New Groupwide control")
	public void to_click_the_save_button_in_new_groupwide_control() throws InterruptedException {
	    lp.to_click_the_save_button_in_new_groupwide_control();
	}

	@Then("To Validate Edit Groupwild control page")
	public void to_validate_edit_groupwild_control_page() throws InterruptedException {
	    lp.to_validate_edit_groupwild_control_page();
	}

	@When("To Enter the loader id in Edit Groupwild control page")
	public void to_enter_the_loader_id_in_edit_groupwild_control_page() throws InterruptedException {
	    lp.to_enter_the_loader_id_in_edit_groupwild_control_page();
	}

	@When("To select the Dropdown in Source System in Edit Groupwild control page")
	public void to_select_the_dropdown_in_source_system_in_edit_groupwild_control_page() throws AWTException, InterruptedException {
	    lp.to_select_the_dropdown_in_source_system_in_edit_groupwild_control_page();
	}

	@When("To click the Save button in Edit Groupwild control page")
	public void to_click_the_save_button_in_edit_groupwild_control_page() throws InterruptedException {
	    lp.to_click_the_save_button_in_edit_groupwild_control_page();
	}

	
	
}
