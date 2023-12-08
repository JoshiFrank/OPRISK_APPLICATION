package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Control_ReassignAndOverride_PAReports_pages extends PageObject {

	//To click the Reassign PA reports option
	@Step
	public void to_click_the_reassign_pa_reports_option() throws InterruptedException {
		Thread.sleep(3000);
	    $(By.xpath("//a[text()='Reassign PA Reports']")).click();
	}

	//To validate the Reassign Positive Assurance Reports page
	@Step
	public void to_validate_the_reassign_positive_assurance_reports_page() throws InterruptedException {
		Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//h1[text()='Reassign Positive Assurance Reports']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the Edit option in Reassign Positive Assurance Reports page
	@Step
	public void to_click_the_edit_option_in_reassign_positive_assurance_reports_page() {
	   $(By.xpath("(//input[@type='image'])[1]")).click();
	}

	//To Select dropdown option in business manager in Reassign Positive Assurance Reports page
	@Step
	public void to_select_dropdown_option_in_business_manager_in_reassign_positive_assurance_reports_page() throws InterruptedException {
		Thread.sleep(3000);
	    $(By.xpath("//select[@class='bodyText']")).selectByVisibleText("Joshi Franklin");
	}

	//To click save button in Reassign Positive Assurance Reports page
	@Step
	public void to_click_save_button_in_reassign_positive_assurance_reports_page() {
	   $(By.xpath("//input[@value='Save']")).click();
	}

	//To click ok button in confirm popup in Reassign Positive Assurance Reports page
	@Step
	public void to_click_ok_button_in_confirm_popup_in_reassign_positive_assurance_reports_page() throws InterruptedException {
		Thread.sleep(3000);
	    $(By.xpath("//button[text()='OK']")).click();
	}

	//To click the cancel button in Reassign Positive Assurance Reports page
	@Step
	public void to_click_the_cancel_button_in_reassign_positive_assurance_reports_page() throws InterruptedException {
		Thread.sleep(3000);
	    $(By.xpath("//input[@value='Cancel']")).click();
	}

	//To click the Override PA Report
	@Step
	public void to_click_the_override_pa_report() throws InterruptedException {
		Thread.sleep(3000);
		$(By.xpath("//a[text()='Override PA Reports']")).click();
	    
	}

	//To Validate the Approval override page
	@Step
	public void to_validate_the_approval_override_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Approval Override']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click any check box under override option in Approval override page
	@Step
	public void to_click_any_check_box_under_override_option_in_approval_override_page() {
		$(By.xpath("(//input[@type='checkbox'])[1]")).click();
	}

	//To click the override button in Approval override page
	@Step
	public void to_click_the_override_button_in_approval_override_page() {
		$(By.xpath("//input[@value='Override']")).click();
	    
	}

	//To click ok button in confirm popup in Approval override page
	@Step
	public void to_click_ok_button_in_confirm_popup_in_approval_override_page() throws InterruptedException {
		Thread.sleep(3000);
	    $(By.xpath("//button[text()='OK']")).click();
	    String text = $(By.xpath("//span[text()='Override was successful.']")).getText();
	    System.out.println(text);
	}

}
