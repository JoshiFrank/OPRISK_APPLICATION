package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Taskadmin_Requirements_pages extends PageObject {


	//To click the Requirements in Task Admin option
	@Step
	public void to_click_the_requirements_in_task_admin_option() throws InterruptedException {
		Thread.sleep(2000);
	   $(By.xpath("//a[text()='Requirements']")).click();
	}

	//To validate Maintain Requirements page
	@Step
	public void to_validate_maintain_requirements_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Maintain Requirements']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click Add Requirements button in Maintain Requirements page
	@Step
	public void to_click_add_requirements_button_in_maintain_requirements_page() {
	    $(By.xpath("//input[@value='Add Requirement']")).click();
	}

	//To validate Add Requirement page
	@Step
	public void to_validate_add_requirement_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Add Requirement']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To select dropdown in Requirement Type option in Add Requirement page
	@Step
	public void to_select_dropdown_in_requirement_type_option_in_add_requirement_page() {
	   $(By.xpath("//select[@name='ctl00$ctl00$content$content$ddlRequirementType']")).selectByVisibleText("Case");
	}

	//To click the Select link in Requirement Item in Add Requirement page
	@Step
	public void to_click_the_select_link_in_requirement_item_in_add_requirement_page() throws InterruptedException {
		Thread.sleep(3000);
	   $(By.xpath("//a[text()='Select']")).click();
	}

	//To validate pop up in select case
	@Step
	public void to_validate_pop_up_in_select_case() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//span[text()='Select Case']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click any radio button in case type id in pop up
	@Step
	public void to_click_any_radio_button_in_case_type_id_in_pop_up() {
	   $(By.xpath("(//input[@type='radio'])[11]")).click();
	}

	//To click proceed button in pop up
	@Step
	public void to_click_proceed_button_in_pop_up() {
	    $(By.xpath("//input[@value='Proceed']")).click();
	}

	//To Enter value in Requirement Name box in Add Requirement page
	@Step
	public void to_enter_value_in_requirement_name_box_in_add_requirement_page() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("(//input[@type='text'])[1]")).sendKeys("test1");
	}

	//To Enter value in Requirement Description box in Add Requirement page
	@Step
	public void to_enter_value_in_requirement_description_box_in_add_requirement_page() {
	   $(By.xpath("//textarea[@class='bodyText']")).sendKeys("test1");
	}

	//To click Save button in Add Requirement page
	@Step
	public void to_click_save_button_in_add_requirement_page() {
	    $(By.xpath("//input[@value='Save']")).click();
	}

	//To validate Manage Requirement page
	@Step
	public void to_validate_manage_requirement_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Manage Requirement']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click Exit button Manage Requirement page
	@Step
	public void to_click_exit_button_manage_requirement_page() throws InterruptedException {
	    $(By.xpath("//input[@value='Exit']")).click();
	    Thread.sleep(2000);
	}
	
	
}
