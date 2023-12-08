package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Taskadmin_RCSA_pages extends PageObject {

	//To mouse hover to Task Admin option"
	@Step
	public void to_mouse_hover_to_task_admin_option() throws InterruptedException {
		 Thread.sleep(2000);
	    $(By.xpath("//a[text()='Task Admin']")).click();
	}

	//To click the Generate Risk and Control Self Assessment in Task Admin option
	@Step
	public void to_click_the_generate_risk_and_control_self_assessment_in_task_admin_option() {
	    $(By.xpath("//a[text()='Generate Risk & Control Self-Assessment (RCSA)']")).click();
	}

	//To validate Organisation Unit for Risk and Control Self Assessment
	@Step
	public void to_validate_organisation_unit_for_risk_and_control_self_assessment() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Organisation Unit for Risk & Control Self-Assessment (RCSA)']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the Arrow button in office of the president in Organisation Unit for Risk and Control Self Assessment
	@Step
	public void to_click_the_arrow_button_in_office_of_the_president_in_organisation_unit_for_risk_and_control_self_assessment() {
		
	    $(By.id("ctl00_content_stOrgUnit_treeViewn1")).click();
	}

	//To click the Arrow button in the president in Organisation Unit for Risk and Control Self Assessment
	@Step
	public void to_click_the_arrow_button_in_the_president_in_organisation_unit_for_risk_and_control_self_assessment() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.id("ctl00_content_stOrgUnit_treeViewn2")).click();
	}

	//To click check box in Risk Management option Organisation Unit for Risk and Control Self Assessment
	@Step
	public void to_click_check_box_in_risk_management_option_organisation_unit_for_risk_and_control_self_assessment() {
	   $(By.xpath("(//input[@type='checkbox'])[53]")).click();
	}

	//To click proceed button in Organisation Unit for Risk and Control Self Assessment
	@Step
	public void to_click_proceed_button_in_organisation_unit_for_risk_and_control_self_assessment() {
	    $(By.xpath("//input[@value='Proceed']")).click();
	}

	//To validate RCSA Report Generation Page
	@Step
	public void to_validate_rcsa_report_generation_page() throws InterruptedException {
		 Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//h1[text()='Risk & Control Self-Assessment (RCSA) - Report Generation']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click Start button in RCSA Report Generation Page
	@Step
	public void to_click_start_button_in_rcsa_report_generation_page() throws InterruptedException {
	    $(By.xpath("//input[@value='Start']")).click();
	    Thread.sleep(3000);
	}
	
	
}
