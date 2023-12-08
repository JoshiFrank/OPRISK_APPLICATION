package com.Oprisk.Steps;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Issue_Raise_Process_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Issue_Raise_Process_Steps {
@Managed
WebDriver driver;

@Steps
Oprisk_Issue_Raise_Process_Pages irp;



@Then("To validate the plus issue button")
public void to_validate_the_plus_issue_button() {
    irp.to_validate_the_plus_issue_button();
}

@When("To click the plus issue button")
public void to_click_the_plus_issue_button() throws InterruptedException {
irp.to_click_the_plus_issue_button();
}

@When("To click the views option straight line")
public void to_click_the_views_option_straight_line() throws InterruptedException {
irp.to_click_the_views_option_straight_line();
}

@When("To click the number two link")
public void to_click_the_number_two_link() throws InterruptedException {
irp.to_click_the_number_two_link();
}

@When("To click the twenty Strategy & Innovation \\(STIN)")
public void to_click_the_twenty_strategy_innovation_stin() {
	irp.to_click_the_twenty_strategy_innovation_stin();
}

@When("To click proceed button")
public void to_click_proceed_button() throws InterruptedException {
 irp.to_click_proceed_button();
}

@Then("To validate the new issue path in Strategy & Innovation issue page")
public void to_validate_the_new_issue_path_in_strategy_innovation_issue_page() throws InterruptedException {
    irp.to_validate_the_new_issue_path_in_strategy_innovation_issue_page();
}

@When("To enter the Title in title box in Strategy & Innovation issue page {string}")
public void to_enter_the_title_in_title_box_in_strategy_innovation_issue_page(String string) {
irp.to_enter_the_title_in_title_box_in_strategy_innovation_issue_page(string);
}

@When("To enter the issue details in Strategy & Innovation issue page {string}")
public void to_enter_the_issue_details_in_strategy_innovation_issue_page(String string) {
    irp.to_enter_the_issue_details_in_strategy_innovation_issue_page(string);
}

@Then("To validate the priority options in Strategy & Innovation issue page")
public void to_validate_the_priority_options_in_strategy_innovation_issue_page() throws InterruptedException {
   irp.to_validate_the_priority_options_in_strategy_innovation_issue_page();
}

@When("To select the priority in Strategy & Innovation issue page")
public void to_select_the_priority_in_strategy_innovation_issue_page() {
	irp.to_select_the_priority_in_strategy_innovation_issue_page();
}

@Then("to validate the responsibility in Strategy & Innovation issue page")
public void to_validate_the_responsibility_in_strategy_innovation_issue_page() throws InterruptedException, AWTException {
	irp.to_validate_the_responsibility_in_strategy_innovation_issue_page();;
}

@When("To select the select link in Strategy & Innovation issue page")
public void to_select_the_select_link_in_strategy_innovation_issue_page() throws InterruptedException {
	irp.to_select_the_select_link_in_strategy_innovation_issue_page();
}

@When("To select the oadelakin id in responsibility select section")
public void to_select_the_oadelakin_id_in_responsibility_select_section() {
		irp.to_select_the_oadelakin_id_in_responsibility_select_section();
}

@When("To click the select button in responsibility select section")
public void to_click_the_select_button_in_responsibility_select_section() throws InterruptedException {
	irp.to_click_the_select_button_in_responsibility_select_section();
}

@When("to select the issue sensitivity in Strategy & Innovation issue page")
public void to_select_the_issue_sensitivity_in_strategy_innovation_issue_page() throws InterruptedException {
	irp.to_select_the_issue_sensitivity_in_strategy_innovation_issue_page();
}

@When("To select target closure date in Strategy & Innovation issue page")
public void to_select_target_closure_date_in_strategy_innovation_issue_page() throws InterruptedException {
		irp.to_select_target_closure_date_in_strategy_innovation_issue_page();
}

@When("To enter department ref in Strategy & Innovation issue page {string}")
public void to_enter_department_ref_in_strategy_innovation_issue_page(String string) {
		irp.to_enter_department_ref_in_strategy_innovation_issue_page(string);
}

@When("To enter department comment in Strategy & Innovation issue page {string}")
public void to_enter_department_comment_in_strategy_innovation_issue_page(String string) throws AWTException {
	irp.to_enter_department_comment_in_strategy_innovation_issue_page(string);
}

@Then("To validate the interested person option list")
public void to_validate_the_interested_person_option_list() throws InterruptedException, AWTException {
    irp.to_validate_the_interested_person_option_list();
}

@When("To select Ahmed Magdi in person option list in Strategy & Innovation issue page")
public void to_select_ahmed_magdi_in_person_option_list_in_strategy_innovation_issue_page() {
    	irp.to_select_ahmed_magdi_in_person_option_list_in_strategy_innovation_issue_page();
}

@When("To select save button in Strategy & Innovation issue page")
public void to_select_save_button_in_strategy_innovation_issue_page() throws InterruptedException {
    irp.to_select_save_button_in_strategy_innovation_issue_page();
}

@Then("to validate the Details of the Strategy & Innovation issue")
public void to_validate_the_details_of_the_strategy_innovation_issue() throws AWTException, InterruptedException {
    irp.to_validate_the_details_of_the_strategy_innovation_issue();
}

@When("To select accept button in Strategy & Innovation issue")
public void to_select_accept_button_in_strategy_innovation_issue() throws InterruptedException {
    irp.to_select_accept_button_in_strategy_innovation_issue();
}


@When("to click home pagre button from Strategy & Innovation issue")
public void to_click_home_pagre_button_from_strategy_innovation_issue() throws InterruptedException {
    irp.to_click_home_pagre_button_from_strategy_innovation_issue();
}

@When("To click the issues option in Home page")
public void to_click_the_issues_option_in_home_page() {
    irp.to_click_the_issues_option_in_home_page();
}

@Then("to validate New issue status in Home page")
public void to_validate_new_issue_status_in_home_page() throws InterruptedException {
    irp.to_validate_new_issue_status_in_home_page();
   
}
}
