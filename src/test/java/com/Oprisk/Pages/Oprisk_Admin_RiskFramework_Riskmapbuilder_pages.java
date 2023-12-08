package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_RiskFramework_Riskmapbuilder_pages extends PageObject{

	//To mouse hover to Risk Framework option
	@Step
	public void to_mouse_hover_to_risk_framework_option() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Risk Framework']")).click();
	}

	//To click the Risk Map builder in Risk Framework option
	@Step
	public void to_click_the_risk_map_builder_in_risk_framework_option() {
		$(By.xpath("//a[text()='Risk Map Builder']")).click();
	}

	//To validate the Build Risk Map page
	@Step
	public void to_validate_the_build_risk_map_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Build Risk Map']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click Select organisation unit link in Build Risk Map page
	@Step
	public void to_click_select_organisation_unit_link_in_build_risk_map_page() {
		$(By.xpath("//a[text()='Select Organisation Unit']")).click();
	}

	//To validate Select organisation unit page
	@Step
	public void to_validate_select_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Build Risk Map - Select Organisation Unit']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click Arrow button in office of president in Select organisation unit page
	@Step
	public void to_click_arrow_button_in_office_of_president_in_select_organisation_unit_page() {
		$(By.id("ctl00_content_ucLazyTree_ucLazyTreen1")).click();
	}

	//To click Arrow button in The president in Select organisation unit page
	@Step
	public void to_click_arrow_button_in_the_president_in_select_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.id("ctl00_content_ucLazyTree_ucLazyTreen2")).click();
	}

	//To click radio button in Risk management option in Select organisation unit page
	@Step
	public void to_click_radio_button_in_risk_management_option_in_select_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='radio'])[12]")).click();
	}

	//To click the proceed button in Select organisation unit page
	@Step
	public void to_click_the_proceed_button_in_select_organisation_unit_page() {
		$(By.xpath("//input[@value='Proceed']")).click();
	}

	//To validate result Build Risk Map page
	@Step
	public void to_validate_result_build_risk_map_page() throws InterruptedException {
		Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='Build Risk Map']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To click check box in risk management result Build Risk Map page
	@Step
	public void to_click_check_box_in_risk_management_result_build_risk_map_page() {
		$(By.xpath("(//input[@type='checkbox'])[12]")).click();
	}

	//To click the Add to risk map button in result Build Risk Map page
	@Step
	public void to_click_the_add_to_risk_map_button_in_result_build_risk_map_page() {
		$(By.xpath("//input[@value='Add To Risk Map']")).click();
	}

	//To click the save button in result Build Risk Map page
	@Step
	public void to_click_the_save_button_in_result_build_risk_map_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//input[@value='Save']")).click();
	}
}
