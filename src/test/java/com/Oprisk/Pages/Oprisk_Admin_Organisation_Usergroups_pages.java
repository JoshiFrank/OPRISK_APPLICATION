package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Organisation_Usergroups_pages extends PageObject{

	
	//To click the User Groups in organisation option
	@Step
	public void to_click_the_user_groups_in_organisation_option() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='User Groups']")).click();
	}

	//To Validate the Maintain User Groups pages
	@Step
	public void to_validate_the_maintain_user_groups_pages() throws InterruptedException {
		Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='Maintain User Groups']")).isDisplayed();
	   Assert.assertTrue(displayed);
	   
	}

	//To click the Add User groups button in Maintain User Groups pages
	@Step
	public void to_click_the_add_user_groups_button_in_maintain_user_groups_pages() {
	   $(By.xpath("//input[@value='Add User Group']")).click();
	}

	//To validate the Add User Group page
	@Step
	public void to_validate_the_add_user_group_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Add User Group']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To select dropdown option in User Group Type in New User Group
	@Step
	public void to_select_dropdown_option_in_user_group_type_in_new_user_group() {
	   $(By.xpath("//select[@id='ctl00_ctl00_content_content_ucDetails_ddlUserGroupType']")).selectByVisibleText("Manual");
	}

	//To Enter value in User Group Name in New User Group
	@Step
	public void to_enter_value_in_user_group_name_in_new_user_group() {
	   $(By.xpath("(//input[@type='text'])[1]")).sendKeys("test1");
	}

	//To Enter value in User Group Description in New User Group
	@Step
	public void to_enter_value_in_user_group_description_in_new_user_group() {
	    $(By.xpath("//textarea[@class='bodyText']")).sendKeys("test1");
	}

	//To click the Save button in Add User Group page
	@Step
	public void to_click_the_save_button_in_add_user_group_page() {
	   $(By.xpath("//input[@value='Save']")).click();
	}

	//To validate the Manage User Group page
	@Step
	public void to_validate_the_manage_user_group_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Manage User Group']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the cancel button in Manage User Group page
	@Step
	public void to_click_the_cancel_button_in_manage_user_group_page() {
	    $(By.xpath("(//input[@value='Cancel'])[4]")).click();
	}

	//To validate result Maintain User Groups page
	@Step
	public void to_validate_result_maintain_user_groups_page() throws InterruptedException {
		Thread.sleep(2000);
		 boolean displayed = $(By.xpath("//h1[text()='Maintain User Groups']")).isDisplayed();
		   Assert.assertTrue(displayed);
	}
}
