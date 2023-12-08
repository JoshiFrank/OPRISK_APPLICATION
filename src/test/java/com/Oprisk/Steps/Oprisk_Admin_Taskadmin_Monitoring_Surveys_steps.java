package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Taskadmin_Monitoring_Surveys_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Taskadmin_Monitoring_Surveys_steps {

	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Taskadmin_Monitoring_Surveys_pages msp;
	
	
	@When("To click the Monitoring in Task Admin option")
	public void to_click_the_monitoring_in_task_admin_option() throws InterruptedException {
	   msp.to_click_the_monitoring_in_task_admin_option();
	}

	@Then("To validate Monitoring page")
	public void to_validate_monitoring_page() throws InterruptedException {
	  msp.to_validate_monitoring_page();  
	}

	@When("To click the cancel button Monitoring page")
	public void to_click_the_cancel_button_monitoring_page() {
	   msp.to_click_the_cancel_button_monitoring_page();
	}

	@When("To click the Surveys in Task Admin option")
	public void to_click_the_surveys_in_task_admin_option() throws InterruptedException {
	 msp.to_click_the_surveys_in_task_admin_option();
	}

	@Then("To validate the Manage Surveys page")
	public void to_validate_the_manage_surveys_page() throws InterruptedException {
	  msp.to_validate_the_manage_surveys_page();
	}

	@When("To click the Exit button in Manage Surveys page")
	public void to_click_the_exit_button_in_manage_surveys_page() {
	    msp.to_click_the_exit_button_in_manage_surveys_page();
	}
	
}
