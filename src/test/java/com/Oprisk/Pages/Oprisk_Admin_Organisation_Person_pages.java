package com.Oprisk.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Organisation_Person_pages extends PageObject {

	
	//To click the Person in organisation option
	@Step
	public void to_click_the_person_in_organisation_option() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("(//a[text()='Person'])[1]")).click();
	}

	//To validate the Maintain Person page
	@Step
	public void to_validate_the_maintain_person_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Maintain Person']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the Add New in Maintain Person page
	@Step
	public void to_click_the_add_new_in_maintain_person_page() {
		
	    $(By.xpath("//input[@value='Add New']")).click();
	}

	//To validate the Add Person page
	@Step
	public void to_validate_the_add_person_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Add Person']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Enter the value in Login id box in Add Person page
	@Step
	public void to_enter_the_value_in_login_id_box_in_add_person_page() {
	    $(By.xpath("(//input[@type='text'])[1]")).sendKeys("test7");
	}

	//To Enter the value in Name box in Add Person page
	@Step
	public void to_enter_the_value_in_name_box_in_add_person_page() {
		 $(By.xpath("(//input[@type='text'])[2]")).sendKeys("test3");
	    
	}

	//To Enter the value in Initials in Add Person page
	@Step
	public void to_enter_the_value_in_initials_in_add_person_page() {
		 $(By.xpath("(//input[@type='text'])[3]")).sendKeys("test3");
	}

	//To click check box in Person Roles in Add Person page
	@Step
	public void to_click_check_box_in_person_roles_in_add_person_page() {
	    $(By.xpath("(//input[@type='checkbox'])[1]")).click();
	}

	//To click check box in Other Roles in Add Person page
	@Step
	public void to_click_check_box_in_other_roles_in_add_person_page() {
	   $(By.xpath("(//input[@type='checkbox'])[19]")).click();
	}

	//To Enter the value in email box in Add Person page
	@Step
	public void to_enter_the_value_in_email_box_in_add_person_page() {
		 $(By.xpath("(//input[@type='text'])[4]")).sendKeys("test1@gmail.com");
	}

	//To select dropdown in Location in Add Person page
	@Step
	public void to_select_dropdown_in_location_in_add_person_page() {
	   $(By.xpath("(//a[@class='chosen-single'])[1]")).click();
	   $(By.xpath("//li[text()='Cairo']")).click();
	}

	//To select dropdown in User Seniority in Add Person page
	@Step
	public void to_select_dropdown_in_user_seniority_in_add_person_page() {
		$(By.xpath("(//a[@class='chosen-single'])[2]")).click();
		   $(By.xpath("//li[text()='Senior User']")).click();
	}

	//To select dropdown in Incident and Loss Seniority in Add Person page
	@Step
	public void to_select_dropdown_in_incident_loss_seniority_in_add_person_page() throws AWTException {
		$(By.xpath("(//a[@class='chosen-single'])[3]")).click();
		
		   $(By.xpath("(//li[text()='Senior User'])[2]")).click();
	}

	//To select dropdown in Home Page in Add Person page
	@Step
	public void to_select_dropdown_in_home_page_in_add_person_page() throws AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		$(By.xpath("(//a[@class='chosen-single'])[4]")).click();
		   $(By.xpath("//li[text()='Home']")).click();
	}

	//To click check box in Disable enhance dropdown in Add Person page
	@Step
	public void to_click_check_box_in_disable_enhance_dropdown_in_add_person_page() {
	    $(By.xpath("(//input[@type='checkbox'])[20]")).click();
	}

	//To click the save button in Add Person page
	@Step
	public void to_click_the_save_button_in_add_person_page() {
	    $(By.xpath("//input[@value='Save']")).click();
	}

	//To validate the Edit Person page
	@Step
	public void to_validate_the_edit_person_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Edit Person']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the save button in Edit Person page
	@Step
	public void to_click_the_save_button_in_edit_person_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//input[@value='Save']")).click();
		
	    
	}
}
