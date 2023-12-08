package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Taskadmin_Monitoring_Surveys_pages extends PageObject {

	
	//To click the Monitoring in Task Admin option
	@Step
	public void to_click_the_monitoring_in_task_admin_option() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Monitoring']")).click();
	}

	//To validate Monitoring page
	@Step
	public void to_validate_monitoring_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Monitoring']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the cancel button Monitoring page
	@Step
	public void to_click_the_cancel_button_monitoring_page() {
	   $(By.xpath("(//input[@value='Cancel'])[2]")).click();
	}

	//To click the Surveys in Task Admin option
	@Step
	public void to_click_the_surveys_in_task_admin_option() throws InterruptedException {
		Thread.sleep(2000);
	 $(By.xpath("//a[text()='Surveys']")).click();
	}

	//To validate the Manage Surveys page
	@Step
	public void to_validate_the_manage_surveys_page() throws InterruptedException {
		Thread.sleep(2000);
	  boolean displayed = $(By.xpath("//h1[text()='Manage Surveys']")).isDisplayed();
	  Assert.assertTrue(displayed);
	}

	//To click the Exit button in Manage Surveys page
	@Step
	public void to_click_the_exit_button_in_manage_surveys_page() {
	    $(By.xpath("//h1[text()='Manage Surveys']")).click();
	}
	
	
}
