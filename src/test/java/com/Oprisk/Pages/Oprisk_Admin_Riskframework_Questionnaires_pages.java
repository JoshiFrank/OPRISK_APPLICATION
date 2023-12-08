package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Riskframework_Questionnaires_pages extends PageObject {

	
	//To click the Questionnaires in Risk Framework option
	@Step
	public void to_click_the_questionnaires_in_risk_framework_option() throws InterruptedException {
		Thread.sleep(2000);
	   $(By.xpath("//a[text()='Questionnaires']")).click();
	}

	//To validate the Manage Questionnaires page
	@Step
	public void to_validate_the_manage_questionnaires_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Manage Questionnaires']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the the Add new button in Manage Questionnaires page
	@Step
	public void to_click_the_the_add_new_button_in_manage_questionnaires_page() {
	    $(By.xpath("//input[@value='Add New']")).click();
	}

	//To validate Add Questionnaire page
	@Step
	public void to_validate_add_questionnaire_page() throws InterruptedException {
		Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='Add Questionnaire']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To Enter the value in Title box in Add Questionnaire page
	@Step
	public void to_enter_the_value_in_title_box_in_add_questionnaire_page() {
	    $(By.xpath("(//input[@type='text'])[1]")).sendKeys("test1");
	}

	//To click the Save button in Add Questionnaire page
	@Step
	public void to_click_the_save_button_in_add_questionnaire_page() {
	    $(By.xpath("//input[@value='Save']")).click();
	}

	//To validate the Modify Questionnaire page
	@Step
	public void to_validate_the_modify_questionnaire_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Modify Questionnaire']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the insert button in Modify Questionnaire page
	@Step
	public void to_click_the_insert_button_in_modify_questionnaire_page() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//input[@type='image']")).click();
	}

	//To validate result Modify Questionnaire page
	@Step
	public void to_validate_result_modify_questionnaire_page() throws InterruptedException {
		Thread.sleep(2000);
		 boolean displayed = $(By.xpath("//h1[text()='Modify Questionnaire']")).isDisplayed();
		    Assert.assertTrue(displayed);
	}
	
}
