package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Organisation_businessentities_pages extends PageObject {

	
	//To click the Business Entities in organisation option
	@Step
	public void to_click_the_business_entities_in_organisation_option() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Business Entities']")).click();
	}

	//To Validate the Maintain Business Entities pages
	@Step
	public void to_validate_the_maintain_business_entities_pages() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Business Entities']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click the down Arrow button in Default Root Business Entity
	@Step
	public void to_click_the_down_arrow_button_in_default_root_business_entity() {
	    $(By.xpath("//span[@class='tree-hover-icon']")).click();
	}

	//To click the Add business Entities in Maintain Business Entities pages
	@Step
	public void to_click_the_add_business_entities_in_maintain_business_entities_pages() {
	    $(By.xpath("//span[text()='Add Business Entity']")).click();
	}

	//To validate the Add Business Entity page
	@Step
	public void to_validate_the_add_business_entity_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Add Business Entity']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Enter the value in code box in Add Business Entity page
	@Step
	public void to_enter_the_value_in_code_box_in_add_business_entity_page() {
	    $(By.xpath("(//input[@type='text'])[1]")).sendKeys("test");
	}

	//To Enter the value in short name box in Add Business Entity page
	@Step
	public void to_enter_the_value_in_short_name_box_in_add_business_entity_page() {
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("test");
	}

	//To Enter the value in name box in Add Business Entity page
	@Step
	public void to_enter_the_value_in_name_box_in_add_business_entity_page() {
		$(By.xpath("(//input[@type='text'])[3]")).sendKeys("test");
	}

	//To select dropdown option Accounting Currency in Add Business Entity page
	@Step
	public void to_select_dropdown_option_accounting_currency_in_add_business_entity_page() {
	    $(By.xpath("//select[@class='bodyText']")).selectByVisibleText("USD");
	}

	//To click the save button in Add Business Entity page
	@Step
	public void to_click_the_save_button_in_add_business_entity_page() {
	    $(By.xpath("//input[@value='Save']")).click();
	}

	//To validate the Edit Business Entity page
	@Step
	public void to_validate_the_edit_business_entity_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Edit Business Entity']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the cancel button in Edit Business Entity page
	@Step
	public void to_click_the_cancel_button_in_edit_business_entity_page() {
	    $(By.xpath("//input[@value='Cancel']")).click();
	}

	//To Validate Result Maintain Business Entities pages
	@Step
	public void to_validate_result_maintain_business_entities_pages() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Business Entities']")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	
}
