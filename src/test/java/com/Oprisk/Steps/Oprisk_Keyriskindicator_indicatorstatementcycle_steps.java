package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Keyriskindicator_indicatorstatementcycle_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Keyriskindicator_indicatorstatementcycle_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Keyriskindicator_indicatorstatementcycle_pages ist;

	
	@When("To Click the Indicator Statement cycle")
	public void to_click_the_indicator_statement_cycle() throws InterruptedException {
	   ist.to_click_the_indicator_statement_cycle(); 
	}

	@Then("To validate the Indicator Statement cycle page")
	public void to_validate_the_indicator_statement_cycle_page() throws InterruptedException {
	    ist.to_validate_the_indicator_statement_cycle_page();
	}

	@When("To Select dropdown in All option in Indicator Statement cycle page")
	public void to_select_dropdown_in_all_option_in_indicator_statement_cycle_page() {
	    ist.to_select_dropdown_in_all_option_in_indicator_statement_cycle_page();
	}

	@When("To click the Add new button in Indicator Statement cycle page")
	public void to_click_the_add_new_button_in_indicator_statement_cycle_page() {
	    ist.to_click_the_add_new_button_in_indicator_statement_cycle_page();
	}

	@Then("To validate Initiate Indicator Statement Cycle page")
	public void to_validate_initiate_indicator_statement_cycle_page() throws InterruptedException {
	   ist.to_validate_initiate_indicator_statement_cycle_page(); 
	}
}
