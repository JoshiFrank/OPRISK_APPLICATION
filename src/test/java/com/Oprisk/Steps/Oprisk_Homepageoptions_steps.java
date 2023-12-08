package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepageoptions_pages;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Homepageoptions_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Homepageoptions_pages hp;
	
	@Then("To validate the home option")
	public void to_validate_the_home_option() {

		hp.to_validate_homeoption();

	}

	@Then("To validate the risks option")
	public void to_validate_the_risks_option() {

		hp.to_validate_the_risks_option();

	}

	@Then("To validate the controls option")
	public void to_validate_the_controls_option() {

		hp.to_validate_controls_option();

	}

	@Then("To validate the Control Gap Management option")
	public void to_validate_the_control_gap_management_option() {

		hp.to_validate_controlgapmanagement_option();

	}

	@Then("To validate the incidents\\/Losses option")
	public void to_validate_the_incidents_losses_option() {

		hp.to_validate_incidentslosses_option();

	}

	@Then("To validate the Libraries option")
	public void to_validate_the_libraries_option() {

		hp.to_validate_libraries_option();

	}


}
