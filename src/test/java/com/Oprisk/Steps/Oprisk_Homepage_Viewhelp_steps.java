package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepage_Viewhelp_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Homepage_Viewhelp_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Homepage_Viewhelp_pages hp;
	
	// View help functionality

		@When("To click View Help box")
		public void to_click_view_help_box() throws InterruptedException {
			hp.to_click_view_help_box();

		}

		@Then("To validate the OneSumX GRC page opened")
		public void to_validate_the_one_sum_x_grc_page_opened() {
			hp.to_validate_the_one_sum_x_grc_page_opened();

		}

		@When("To click OneSumX Grc option")
		public void to_click_one_sum_x_grc_option() {
			hp.to_click_one_sum_x_grc_option();

		}

		@Then("To validate OneSumX Grc option dropdown")
		public void to_validate_one_sum_x_grc_option_dropdown() throws InterruptedException {
			hp.to_validate_one_sum_x_grc_option_dropdown();

		}

		@When("To click the Using the OneSumX GRC Interface option")
		public void to_click_the_using_the_one_sum_x_grc_interface_option() {
			hp.to_click_the_using_the_one_sum_x_grc_interface_option();

		}

		@Then("To validate Using the OneSumX GRC Interface option dropdown")
		public void to_validate_using_the_one_sum_x_grc_interface_option_dropdown() throws InterruptedException {
			hp.to_validate_using_the_one_sum_x_grc_interface_option_dropdown();

		}

		@When("To click the Configuring OneSumX GRC option")
		public void to_click_the_configuring_one_sum_x_grc_option() {
			hp.to_click_the_configuring_one_sum_x_grc_option();

		}

		@Then("To validate Configuring OneSumX GRC option dropdown")
		public void to_validate_configuring_one_sum_x_grc_option_dropdown() throws InterruptedException {
			hp.to_validate_configuring_one_sum_x_grc_option_dropdown();

		}

		@When("To click the Using the OneSumX GRC option")
		public void to_click_the_using_the_one_sum_x_grc_option() {
			hp.to_click_the_using_the_one_sum_x_grc_option();

		}

		@Then("To validate Using the OneSumX GRC option dropdown")
		public void to_validate_using_the_one_sum_x_grc_option_dropdown() throws InterruptedException {
			hp.to_validate_using_the_one_sum_x_grc_option_dropdown();

		}

		@When("To click Managing Programs option")
		public void to_click_managing_programs_option() {
			hp.to_click_managing_programs_option();

		}

		@Then("To validate Managing Programs option interface")
		public void to_validate_managing_programs_option_interface() throws InterruptedException {
			hp.to_validate_managing_programs_option_interface();

		}

		@When("To click OneSumX GRC Reference option")
		public void to_click_one_sum_x_grc_reference_option() {
			hp.to_click_one_sum_x_grc_reference_option();

		}

		@Then("To validate OneSumX GRC Reference option dropdown")
		public void to_validate_one_sum_x_grc_reference_option_dropdown() throws InterruptedException {
			hp.to_validate_one_sum_x_grc_reference_option_dropdown();

		}


}
