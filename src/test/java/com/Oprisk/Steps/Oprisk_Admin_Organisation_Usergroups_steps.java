package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Organisation_Usergroups_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Organisation_Usergroups_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Organisation_Usergroups_pages ugp;
	
	
	@When("To click the User Groups in organisation option")
	public void to_click_the_user_groups_in_organisation_option() throws InterruptedException {
	    ugp.to_click_the_user_groups_in_organisation_option();
	}

	@Then("To Validate the Maintain User Groups pages")
	public void to_validate_the_maintain_user_groups_pages() throws InterruptedException {
	   ugp.to_validate_the_maintain_user_groups_pages();
	}

	@When("To click the Add User groups button in Maintain User Groups pages")
	public void to_click_the_add_user_groups_button_in_maintain_user_groups_pages() {
	   ugp.to_click_the_add_user_groups_button_in_maintain_user_groups_pages();
	}

	@Then("To validate the Add User Group page")
	public void to_validate_the_add_user_group_page() throws InterruptedException {
	    ugp.to_validate_the_add_user_group_page();
	}

	@When("To select dropdown option in User Group Type in New User Group")
	public void to_select_dropdown_option_in_user_group_type_in_new_user_group() {
	   ugp.to_select_dropdown_option_in_user_group_type_in_new_user_group();
	}

	@When("To Enter value in User Group Name in New User Group")
	public void to_enter_value_in_user_group_name_in_new_user_group() {
	   ugp.to_enter_value_in_user_group_name_in_new_user_group();
	}

	@When("To Enter value in User Group Description in New User Group")
	public void to_enter_value_in_user_group_description_in_new_user_group() {
	    ugp.to_enter_value_in_user_group_description_in_new_user_group();
	}

	@When("To click the Save button in Add User Group page")
	public void to_click_the_save_button_in_add_user_group_page() {
	   ugp.to_click_the_save_button_in_add_user_group_page();
	}

	@Then("To validate the Manage User Group page")
	public void to_validate_the_manage_user_group_page() throws InterruptedException {
	   ugp.to_validate_the_manage_user_group_page(); 
	}

	@When("To click the cancel button in Manage User Group page")
	public void to_click_the_cancel_button_in_manage_user_group_page() {
	    ugp.to_click_the_cancel_button_in_manage_user_group_page();
	}

	@Then("To validate result Maintain User Groups page")
	public void to_validate_result_maintain_user_groups_page() throws InterruptedException {
	   ugp.to_validate_result_maintain_user_groups_page(); 
	}
	

}
