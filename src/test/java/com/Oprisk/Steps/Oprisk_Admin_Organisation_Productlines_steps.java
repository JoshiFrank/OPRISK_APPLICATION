package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Organisation_Productlines_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Organisation_Productlines_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Organisation_Productlines_pages plp;

	
	@When("To click the product lines in organisation option")
	public void to_click_the_product_lines_in_organisation_option() throws InterruptedException {
	   plp.to_click_the_product_lines_in_organisation_option(); 
	}

	@Then("To Validate the Maintain Product Lines pages")
	public void to_validate_the_maintain_product_lines_pages() throws InterruptedException {
	    plp.to_validate_the_maintain_product_lines_pages();
	}

	@When("To click the All product lines link in Maintain Product Lines pages")
	public void to_click_the_all_product_lines_link_in_maintain_product_lines_pages() {
	   plp.to_click_the_all_product_lines_link_in_maintain_product_lines_pages(); 
	}

	@Then("To validate the Edit Product Line page")
	public void to_validate_the_edit_product_line_page() throws InterruptedException {
	   plp.to_validate_the_edit_product_line_page();
	}

	@When("To click Save button in Edit Product Line page")
	public void to_click_save_button_in_edit_product_line_page() {
	   plp.to_click_save_button_in_edit_product_line_page(); 
	}
}
