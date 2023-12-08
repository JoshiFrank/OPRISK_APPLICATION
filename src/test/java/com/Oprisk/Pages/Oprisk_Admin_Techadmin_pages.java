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

public class Oprisk_Admin_Techadmin_pages extends PageObject {

	//To mouse hover to Tech Admin option
	@Step
	public void to_mouse_hover_to_tech_admin_option() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Tech Admin ']")).click();
	}

	//To click the Auditing in organisation option
	@Step
	public void to_click_the_auditing_in_organisation_option() {
	    $(By.xpath("//a[text()='Auditing']")).click();
	}

	//To validate Audit Report page
	@Step
	public void to_validate_audit_report_page() throws InterruptedException {
		Thread.sleep(15000);
	    boolean displayed = $(By.xpath("//h1[text()='Audit Report']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Select dropdown in Table Name in Audit Report page
	@Step
	public void to_select_dropdown_in_table_name_in_audit_report_page() {
	    $(By.xpath("(//div[@class='chosen-container chosen-container-multi'])[1]")).click();
	    $(By.xpath("//li[text()='ACTION_DOCUMENT_LINK']")).click();
	}

	//To Select dropdown in Changed By in Audit Report page
	@Step
	public void to_select_dropdown_in_changed_by_in_audit_report_page() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("JoshiFranklin");
		
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}

	//To Select the Start Date in Audit Report page
	@Step
	public void to_select_the_start_date_in_audit_report_page() throws InterruptedException {
		Thread.sleep(2000);
	   $(By.xpath("(//input[@type='text'])[3]")).sendKeys("20 Nov 2023");
	}

	//To Select the End Date in Audit Report page
	@Step
	public void to_select_the_end_date_in_audit_report_page() throws InterruptedException {
		Thread.sleep(2000);
		 $(By.xpath("(//input[@type='text'])[5]")).sendKeys("21 Nov 2023");
	}

	//To click the Run Report in Audit Report page
	@Step
	public void to_click_the_run_report_in_audit_report_page() {
	    $(By.xpath("//input[@value='Run Report']")).click();
	}

	//To validate Audit Report Generation page
	@Step
	public void to_validate_audit_report_generation_page() throws InterruptedException {
		Thread.sleep(5000);
	    boolean displayed = $(By.xpath("//h1[text()='Audit Report Generation']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click ok button in Audit Report Generation page
	@Step
	public void to_click_ok_button_in_audit_report_generation_page() {
	    $(By.xpath("//input[@value='OK']")).click();
	}
//--------------------------------------------------------------------------------------------------------------------------------------
	
	// To Test Admin menu Scheduled jobs Tech Admin Option
	
	//To click the Scheduled jobs in Tech Admin option
	@Step
	public void to_click_the_scheduled_jobs_in_tech_admin_option() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Scheduled Jobs']")).click();
	}

	//To validate Maintain Job Schedules page
	@Step
	public void to_validate_maintain_job_schedules_page() throws InterruptedException {
		Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='Maintain Job Schedules']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To click the check box under Non monthly task option in Maintain Job Schedules page
	@Step
	public void to_click_the_check_box_under_non_monthly_task_option_in_maintain_job_schedules_page() throws InterruptedException {
	    $(By.xpath("(//input[@type='checkbox'])[1]")).click();
	    Thread.sleep(1000);
	    $(By.xpath("(//input[@type='checkbox'])[2]")).click();
	    Thread.sleep(1000);
	    $(By.xpath("(//input[@type='checkbox'])[3]")).click();
	    Thread.sleep(1000);
	    $(By.xpath("(//input[@type='checkbox'])[4]")).click();
	    Thread.sleep(1000);
	    $(By.xpath("(//input[@type='checkbox'])[29]")).click();
	  
	    
	}

	//To click save button in Maintain Job Schedules page
	@Step
	public void to_click_save_button_in_maintain_job_schedules_page() {
	    $(By.xpath("//input[@value='Save']")).click();
	}
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu Emails Tech Admin Option
	
	//To click the Emails in Tech Admin option
	@Step
	public void to_click_the_emails_in_tech_admin_option() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Emails']")).click();
	}

	//To validate Email Configuration page
	@Step
	public void to_validate_email_configuration_page() throws InterruptedException {
		Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='Email Configuration']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To click check box in indicator option in Email Configuration page
	@Step
	public void to_click_check_box_in_indicator_option_in_email_configuration_page() {
	    $(By.xpath("(//input[@type='checkbox'])[2]")).click();
	}

	//To click link under email details option in Email Configuration page
	@Step
	public void to_click_link_under_email_details_option_in_email_configuration_page() {
	    $(By.xpath("//a[text()='Email to approver when periodic indicator is sent for approval.']")).click();
	}
	
	//To validate pop up in Email Configuration page
	@Step
	public void to_validate_pop_up_in_email_configuration_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//span[text()='Confirm']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click ok button in pop up in Email Configuration page
	@Step
	public void to_click_ok_button_in_pop_up_in_email_configuration_page() {
	    $(By.xpath("//button[text()='OK']")).click();
	}

	//To validate Email Text page
	@Step
	public void to_validate_email_text_page() throws InterruptedException {
		Thread.sleep(5000);
	   boolean displayed = $(By.xpath("//h1[text()='Email Text']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To Enter value Email Title box in Email Text page
	@Step
	public void to_enter_value_email_title_box_in_email_text_page() throws InterruptedException {
	    $(By.xpath("//div[@id='tagger_txtTitleTextTrans']")).clear();
	    Thread.sleep(2000);
	    $(By.xpath("//div[@id='tagger_txtTitleTextTrans']")).sendKeys("test1");
	}

	//To Enter value Email Body box in Email Text page
	@Step
	public void to_enter_value_email_body_box_in_email_text_page() throws InterruptedException {
	    $(By.xpath("//textarea[@class='bodyText']")).clear();
	    Thread.sleep(2000);
	    $(By.xpath("//textarea[@class='bodyText']")).sendKeys("test");
	}

	//To click Save button in Email Text page
	@Step
	public void to_click_save_button_in_email_text_page() {
		$(By.xpath("(//input[@value='Save'])[2]")).click();
	    
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//To Test Admin menu Archiving Tech Admin Option
	
        //To click the Archiving in Tech Admin option
	    @Step
		public void to_click_the_archiving_in_tech_admin_option() throws InterruptedException {
	    	Thread.sleep(2000);
	    	$(By.xpath("//a[text()='Archiving']")).click();
		   
		}

		//To validate Manage Archiving page
	    @Step
		public void to_validate_manage_archiving_page() throws InterruptedException {
			Thread.sleep(4000);
		   boolean displayed = $(By.xpath("//h1[text()='Manage Archiving']")).isDisplayed();
		   Assert.assertTrue(displayed);
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	 // To Test Admin menu References Tech Admin Option

		//To click the References in Tech Admin option
	    @Step
		public void to_click_the_references_in_tech_admin_option() throws InterruptedException {
	    	Thread.sleep(2000);
		    $(By.xpath("//a[text()='References']")).click();
		}

		//To validate Reference Manager page
	    @Step
		public void to_validate_reference_manager_page() throws InterruptedException {
	    	Thread.sleep(2000);
			boolean displayed = $(By.xpath("//h1[text()='Reference Manager']")).isDisplayed();
			Assert.assertTrue(displayed);
		   }

		//To click arrow button under Reference source system
	    @Step
		public void to_click_arrow_button_under_reference_source_system() throws InterruptedException {
		    $(By.xpath("(//input[@type='image'])[2]")).click();
		    Thread.sleep(2000);
		    $(By.xpath("(//input[@type='image'])[4]")).click();
		    Thread.sleep(2000);
		    $(By.xpath("(//input[@type='image'])[6]")).click();
		    Thread.sleep(2000);
		    $(By.xpath("(//input[@type='image'])[8]")).click();
		    
		    
		}

		//To click link under title Reference Manager page
	    @Step
		public void to_click_link_under_title_reference_manager_page() throws InterruptedException {
		   $(By.xpath("//a[text()='000000027051-ZARA 1.pdf']")).click();
		   
		  Thread.sleep(2000);
		   
		   getDriver().navigate().back();
		   Thread.sleep(4000);
		}

		//To click Entity link in Reference Manager page
	    @Step
		public void to_click_entity_link_in_reference_manager_page() {
		    
	    	$(By.xpath("(//a[text()='Suspected Payment Fraud using eBanking'])[1]")).click();
		}

		//To validate Suspected Payment Fraud using eBanking page
	    @Step
		public void to_validate_suspected_payment_fraud_using_e_banking_page() throws InterruptedException {
	    	Thread.sleep(2000);
		    
	    boolean displayed = $(By.xpath("(//span[text()='Suspected Payment Fraud using eBanking'])[1]")).isDisplayed();
	    Assert.assertTrue(displayed);
	    
		}
		    
	
	
	
	
}
