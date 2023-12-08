package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Libraries_Questionset_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Libraries_Questionset_steps {

	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Libraries_Questionset_pages qsp;
	
	@When("To Click the Question set option in Libraries")
	public void to_click_the_question_set_option_in_libraries() throws InterruptedException {
		qsp.to_click_the_question_set_option_in_libraries();
	    
	}

	@Then("To validate the Manage Question Set page")
	public void to_validate_the_manage_question_set_page() throws InterruptedException {
	    qsp.to_validate_the_manage_question_set_page();
	}

	@When("To click the Add new button in Manage Question Set page")
	public void to_click_the_add_new_button_in_manage_question_set_page() {
	    qsp.to_click_the_add_new_button_in_manage_question_set_page();
	}

	@Then("To validate the Add question set page")
	public void to_validate_the_add_question_set_page() throws InterruptedException {
	    qsp.to_validate_the_add_question_set_page();
	}

	@When("To enter the value in Question set box in Add question set page")
	public void to_enter_the_value_in_question_set_box_in_add_question_set_page() {
	    qsp.to_enter_the_value_in_question_set_box_in_add_question_set_page();
	}

	@When("To click the Save button in Add question set page")
	public void to_click_the_save_button_in_add_question_set_page() {
	   qsp.to_click_the_save_button_in_add_question_set_page();
	}

	@Then("To validate the Edit Question set page")
	public void to_validate_the_edit_question_set_page() throws InterruptedException {
	   qsp.to_validate_the_edit_question_set_page();
	}

	@When("To click the insert button in Edit Question set page")
	public void to_click_the_insert_button_in_edit_question_set_page() {
	    qsp.to_click_the_insert_button_in_edit_question_set_page();
	}

	@Then("To validate the Add question page")
	public void to_validate_the_add_question_page() throws InterruptedException {
	    qsp.to_validate_the_add_question_page();
	}

	@When("To select the drop down option in choose an item type in Add question page")
	public void to_select_the_drop_down_option_in_choose_an_item_type_in_add_question_page() {
	    qsp.to_select_the_drop_down_option_in_choose_an_item_type_in_add_question_page();
	}

	@Then("To validate the Add question with choose an item type in Add question page")
	public void to_validate_the_add_question_with_choose_an_item_type_in_add_question_page() throws InterruptedException {
	   qsp.to_validate_the_add_question_with_choose_an_item_type_in_add_question_page();
	}

	@When("To Enter value in question box in Add question page")
	public void to_enter_value_in_question_box_in_add_question_page() {
	   qsp.to_enter_value_in_question_box_in_add_question_page();
	}

	@When("To Enter value in question Alias box in Add question page")
	public void to_enter_value_in_question_alias_box_in_add_question_page() {
	    qsp.to_enter_value_in_question_alias_box_in_add_question_page();
	}

	@When("To Enter value in Explanatory Text box in Add question page")
	public void to_enter_value_in_explanatory_text_box_in_add_question_page() throws InterruptedException {
	    qsp.to_enter_value_in_explanatory_text_box_in_add_question_page();
	}

	@When("To click the check box in Required default value in Add question page")
	public void to_click_the_check_box_in_required_default_value_in_add_question_page() {
	   qsp.to_click_the_check_box_in_required_default_value_in_add_question_page();
	}

	@When("To select dropdown option in display type in Add question page")
	public void to_select_dropdown_option_in_display_type_in_add_question_page() throws AWTException {
	    qsp.to_select_dropdown_option_in_display_type_in_add_question_page();
	}

	@When("To click the check box in Allow additonal answer in Add question page")
	public void to_click_the_check_box_in_allow_additonal_answer_in_add_question_page() {
	    qsp.to_click_the_check_box_in_allow_additonal_answer_in_add_question_page();
	}

	@When("To Enter value in loader id box in in Add question page")
	public void to_enter_value_in_loader_id_box_in_in_add_question_page() {
	    qsp.to_enter_value_in_loader_id_box_in_in_add_question_page();
	}

	@When("To select dropdown option source system in Add question page")
	public void to_select_dropdown_option_source_system_in_add_question_page() throws AWTException {
	   qsp.to_select_dropdown_option_source_system_in_add_question_page();
	}

	@When("To click the save button in Add question page")
	public void to_click_the_save_button_in_add_question_page() throws InterruptedException {
	    qsp.to_click_the_save_button_in_add_question_page();
	}

	@Then("To validate the Edit Question Set page with question paper")
	public void to_validate_the_edit_question_set_page_with_question_paper() throws InterruptedException {
	    qsp.to_validate_the_edit_question_set_page_with_question_paper();
	}
	
	
}
