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

public class Oprisk_Controlgap_addissue_pages extends PageObject{
	
	
	//To mouse hover to Control Gap Management
	@Step
	public void to_mouse_hover_to_control_gap_management() throws InterruptedException {
		$(By.xpath("(//a[text()='Control Gap Management'])[1]")).click();
		Thread.sleep(2000);
	    
	}

	//To click the control Gap Management option
	@Step
	public void to_click_the_control_gap_management_option() throws InterruptedException {
		$(By.xpath("(//a[text()='Control Gap Management'])[2]")).click();
		Thread.sleep(2000);
	}

	//To validate control Gap Management page
	@Step
	public void to_validate_control_gap_management_page() {
	    
		boolean displayed = $(By.xpath("//h1[text()='List Issues']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click the Add issue button in control Gap Management page
	@Step
	public void to_click_the_add_issue_button_in_control_gap_management_page() throws InterruptedException {
		$(By.xpath("//input[@value='Add Issue']")).click();
		Thread.sleep(2000);
	    
	}

	//To validate the Add issue page in control Gap Management
	@Step
	public void to_validate_the_add_issue_page_in_control_gap_management() {
		boolean displayed = $(By.xpath("//h1[text()='Get Issue Target']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To select drop down option and select in issue interest type option in Add issue page
	@Step
	public void to_select_drop_down_option_and_select_in_issue_interest_type_option_in_add_issue_page() throws InterruptedException {
	    $(By.xpath("//span[text()='--None--']")).click();
	    Thread.sleep(2000);
	    $(By.xpath("//li[text()='Business']")).click();
	    Thread.sleep(2000);
	}

	//To click the office of the president icon in Add issue page
	@Step
	public void to_click_the_office_of_the_president_icon_in_add_issue_page() {
		$(By.id("ctl00_content_ucLazyTree_ucLazyTreen1")).click();
		
	    
	}

	//To click the president icon in Add issue page
	@Step
	public void to_click_the_president_icon_in_add_issue_page() {
		$(By.id("ctl00_content_ucLazyTree_ucLazyTreen2")).click();
	    
	}

	//To click the check box of Risk Management in Add issue page
	@Step
	public void to_click_the_check_box_of_risk_management_in_add_issue_page() {
		$(By.xpath("(//input[@type='radio'])[13]")).click();
	    
	}

	//To click the Proceed button in Add issue page
	@Step
	public void to_click_the_proceed_button_in_add_issue_page() throws InterruptedException {
		$(By.xpath("//input[@value='Proceed']")).click();
		Thread.sleep(2000);
	}

	//To Validate  Raise New Issue in Risk management option
	@Step
	public void to_validate_raise_new_issue_in_risk_management_option() throws InterruptedException {
		
		boolean displayed = $(By.xpath("//h1[text()='Raise New Issue']")).isDisplayed();
	    Assert.assertTrue(displayed);
	    Thread.sleep(2000);
	}

	//To Enter title in Raise New Issue in Risk management option page
	@Step
	public void to_enter_title_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	    $(By.xpath("//textarea[@class='bodyText']")).sendKeys("AFREXIMBANK");
	    Thread.sleep(2000);
	}

	//To Enter issue details in Raise New Issue in Risk management option page
	@Step
	public void to_enter_issue_details_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
		getDriver().switchTo().frame(0);
		$(By.id("tinymce")).sendKeys("Hi Team");
		getDriver().switchTo().defaultContent();
		Thread.sleep(2000);
	}

    //To Select priority option in  Raise New Issue in Risk management option page
	@Step
	public void to_select_priority_option_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
		$(By.xpath("(//a[@class='chosen-single'])[1]")).click();
		Thread.sleep(2000); 
		$(By.xpath("//li[text()='Low']")).click();
		Thread.sleep(4000);   
	}

	//To Select responsiblity option in  Raise New Issue in Risk management option page
	@Step
	public void to_select_responsiblity_option_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
		$(By.xpath("(//span[@class='select2-arrow'])[1]")).click();
		Thread.sleep(4000);
	    $(By.xpath("(//div [text()='Joshi Franklin'])[2]")).click();
	    
	    Thread.sleep(4000);
	}

	//To select Target closure date in  Raise New Issue in Risk management option page
	@Step
	public void to_select_target_closure_date_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	 
		$(By.xpath("//input[@class='calendar-icon']")).click();
		Thread.sleep(2000);
		$(By.xpath("(//div[text()='27'])[2]")).click();
	}

	//To Enter Deparmental Ref in Raise New Issue in Risk management option page
	@Step
	public void to_enter_deparmental_ref_in_raise_new_issue_in_risk_management_option_page() {
	    $(By.xpath("(//input[@type='text'])[5]")).sendKeys("Approval");
	}

	//To Enter Dept comment in Raise New Issue in Risk management option page
	@Step
	public void to_enter_dept_comment_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException, AWTException {
	 Thread.sleep(3000);
	 Robot rb=new Robot();
	 rb.keyPress(KeyEvent.VK_TAB);
	 rb.keyRelease(KeyEvent.VK_TAB);
	 rb.keyPress(KeyEvent.VK_T);
	 rb.keyRelease(KeyEvent.VK_T);
	 rb.keyPress(KeyEvent.VK_E);
	 rb.keyRelease(KeyEvent.VK_E);
	 rb.keyPress(KeyEvent.VK_S);
	 rb.keyRelease(KeyEvent.VK_S);
	 rb.keyPress(KeyEvent.VK_T);
	 rb.keyRelease(KeyEvent.VK_T);
	 Thread.sleep(3000);
		
	}

	//To select dropdown option in interested person in Raise New Issue in Risk management option page
	@Step
	public void to_select_dropdown_option_in_interested_person_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
		$(By.xpath("(//span[@class='select2-arrow'])[2]")).click();
		Thread.sleep(2000);
		$(By.xpath("(//div [text()='Joshi Franklin'])[2]")).click();
		Thread.sleep(2000);
	}

	//To click the Save button in Raise New Issue in Risk management option page
	@Step
	public void to_click_the_save_button_in_raise_new_issue_in_risk_management_option_page() throws InterruptedException {
	    $(By.xpath("(//input[@value='Save'])[3]")).click();
	    Thread.sleep(3000);
	}

	//To click the go to home page
	@Step
	public void to_click_the_go_to_home_page() throws InterruptedException {
		$(By.xpath("//a[@title='Go to home']")).click();
		Thread.sleep(3000);
	}

	//To click the issue option in home page
	@Step
	public void to_click_the_issue_option_in_home_page() throws InterruptedException {
		$(By.xpath("//div[text()='Issues']")).click();
		Thread.sleep(3000);
	}

	//To validate the recently created issue title in home page
	@Step
	public void to_validate_the_recently_created_issue_title_in_home_page() {
	    
		boolean displayed = $(By.xpath("//span[text()='Title']")).isDisplayed();
		Assert.assertTrue(displayed);
		String text = $(By.xpath("//a[text()='AFREXIMBANK']")).getText();
		System.out.println(text);
		String text2 = $(By.xpath("//td[text()='27 Oct 2023']")).getText();
		System.out.println(text2);
		
	}
	
}


