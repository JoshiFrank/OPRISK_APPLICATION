package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Controlgap_IssueEdit_pages extends PageObject {

	//To validate the Existing issues for selected target page
	@Step
	public void to_validate_the_existing_issues_for_selected_target_page() {
	    boolean displayed = $(By.xpath("//h1[text()='Existing Issues for Selected Target']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the Edit file symbol in Existing issues for selected target page
	@Step
	public void to_click_the_edit_file_symbol_in_existing_issues_for_selected_target_page() {
		$(By.xpath("//img[@alt='View' and contains(@style,'border-width')]")).click();
		
	}

	//To validate the Edit issue page in control gap Management
	@Step
	public void to_validate_the_edit_issue_page_in_control_gap_management() {
	    boolean displayed = $(By.xpath("//h1[text()='Edit Issue']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the Add issue interest button in Edit issue
	@Step
	public void to_click_the_add_issue_interest_button_in_edit_issue() {
	   $(By.xpath("//input[@value='Add Issue Interest']")).click();
	}

	//To validate the Add interest for issue page
	@Step
	public void to_validate_the_add_interest_for_issue_page() {
		boolean displayed = $(By.xpath("//h1[text()='Add Interest for Issue']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To select interest type in Dropdown in Add interest page
	@Step
	public void to_select_interest_type_in_dropdown_in_add_interest_page() throws InterruptedException {
	    
		$(By.xpath("//a[@class='chosen-single']")).click();
		Thread.sleep(3000);
		
		$(By.xpath("//li[text()='Group Risk']")).click();
		Thread.sleep(3000);
	}

	//To Enter the value departmental ref in Add interest page
	@Step
	public void to_enter_the_value_departmental_ref_in_add_interest_page() throws InterruptedException {
	    
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test");
		Thread.sleep(3000);
	}

	//To Enter the value in comment box in Add interest page
	@Step
	public void to_enter_the_value_in_comment_box_in_add_interest_page() throws InterruptedException {
		getDriver().switchTo().frame(0);
		$(By.id("tinymce")).sendKeys("Hi Team");
		getDriver().switchTo().defaultContent();
		Thread.sleep(2000);
	    
	}

	//To select interested person in Dropdown in Add interest page
	@Step
	
	public void to_select_interested_person_in_dropdown_in_add_interest_page() throws InterruptedException {
	    
		$(By.xpath("(//a[@class='chosen-single'])[2]")).click();
		
		$(By.xpath("//li[text()='Joshi Franklin']")).click();
		Thread.sleep(2000);
	}
	
	//To Click the save button in Add interest page
	@Step
	public void to_click_the_save_button_in_add_interest_page() throws InterruptedException {
		
		$(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(2000);
		
		
	    
	}

	//To validate the issue under the group risk
	@Step
	public void to_validate_the_issue_under_the_group_risk() throws InterruptedException {
		boolean displayed = $(By.xpath("//span[text()='Group Risk']")).isDisplayed();
		Assert.assertTrue(displayed);
		Thread.sleep(2000);
	   
	}

	//To click the observe button in group risk
	@Step
	public void to_click_the_observe_button_in_group_risk() throws InterruptedException {

		$(By.xpath("//input[@value='Observe']")).click();
		Thread.sleep(2000);

	   
	}

	//To validate the status showing observer
	@Step
	public void to_validate_the_status_showing_observer() throws InterruptedException {
		String text = $(By.xpath("(//span[text()='Observer'])[3]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
	    
	}

	//To click the void button in group risk
	@Step
	public void to_click_the_void_button_in_group_risk() throws InterruptedException {
		$(By.xpath("//input[@value='Void']")).click();
		Thread.sleep(2000);
	    
	}

	//To validate the status showing voided
	@Step
	public void to_validate_the_status_showing_voided() throws InterruptedException {
		String text = $(By.xpath("(//span[text()='Voided'])[3]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
	    
	}

	//To click the Accept button in group risk"
	@Step
	public void to_click_the_accept_button_in_group_risk() throws InterruptedException {
		
		$(By.xpath("(//input[@value='Accept'])[1]")).click();
		Thread.sleep(2000);
	    
	}

	//To click the Saveandreturn button in Edit issue
	@Step
	public void to_click_the_saveandreturn_button_in_edit_issue() throws InterruptedException {
		$(By.xpath("//input[@value='Save & Return']")).click();
		Thread.sleep(2000);
	    
	}
	
	
}
