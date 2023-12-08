package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Generaterisk_andcontrol_pages extends PageObject {

	@Step
	// To click View business menu
	public void to_click_view_business_menu() throws InterruptedException {

		$(By.xpath("//span[@class='wkicon_admin']")).click();
		Thread.sleep(3000);

	}

	@Step
	// To mouse hover on Task Admin option
	public void to_mouse_hover_on_task_admin_option() {

		$(By.xpath("//a[text()='Task Admin']")).click();

	}

	@Step
	// To click Generate risk and control self assesment
	public void to_click_generate_risk_and_control_self_assesment() throws InterruptedException {

		$(By.xpath("//a[text()='Generate Risk & Control Self-Assessment (RCSA)']")).click();
		Thread.sleep(3000);
	}

	@Step
	// To validate Generate risk and control self assesment page
	public void to_validate_generate_risk_and_control_self_assesment_page() {
		boolean displayed = $(By.xpath("//h1[text()='Organisation Unit for Risk & Control Self-Assessment (RCSA)']"))
				.isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Step
	// To click expand arrow in office of the president
	public void to_click_expand_arrow_in_office_of_the_president() {

		$(By.id("ctl00_content_stOrgUnit_treeViewn1")).click();

	}

	@Step
	// To click expand arrow in the president option
	public void to_click_expand_arrow_in_the_president_option() {
		$(By.id("ctl00_content_stOrgUnit_treeViewn2")).click();

	}

	@Step
	// To click Risk Management checkbox
	public void to_click_risk_management_checkbox() {
		$(By.xpath("(//input[@type='checkbox'])[53]")).click();

	}

	@Step
	// To click Proceed button in Generate risk and control self assesment
	// functionality
	public void to_click_proceed_button_in_generate_risk_and_control_self_assesment_functionality()
			throws InterruptedException {

		$(By.xpath("//input[@value='Proceed']")).click();
		Thread.sleep(3000);
	}

	@Step
	// To validate report generation in generate risk and control self assesment
	public void to_validate_report_generation_in_generate_risk_and_control_self_assesment() {
		boolean displayed = $(By.xpath("//h1[text()='Risk & Control Self-Assessment (RCSA) - Report Generation']"))
				.isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Step

	// To click cancel in report generation in generate risk
	public void to_click_cancel_in_report_generation_in_generate_risk() throws InterruptedException {

		$(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(3000);

	}

	@Step

	// To click cancel in Generate risk and control self assesment functionality
	public void to_click_cancel_in_generate_risk_and_control_self_assesment_functionality()
			throws InterruptedException {
		$(By.xpath("(//input[@type='submit'])[3]")).click();
		Thread.sleep(3000);

	}

}
