package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Risks_controlview_pages extends PageObject{
	
	//To click the checkbox in RIMA
	@Step
	public void to_click_the_checkbox_in_rima() throws InterruptedException {
		
		$(By.xpath("(//span[@title='Select'])[10]")).click();
		Thread.sleep(3000);
	   
	}

	//To click the reassign option in RCSA page
	@Step
	public void to_click_the_reassign_option_in_rcsa_page() throws InterruptedException {
		
		$(By.xpath("//input[@value='Reassign']")).click();
		Thread.sleep(3000);
	}

	//To validate the Risk assessment selected pop up
	@Step
	public void to_validate_the_risk_assessment_selected_pop_up() {
		boolean displayed = $(By.xpath("//span[text()='1 Risk Assessments Selected']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To select joshi franklin in select person dropdowm
	@Step
	public void to_select_joshi_franklin_in_select_person_dropdowm() throws InterruptedException {
		$(By.xpath("//div[@class='chosen-container chosen-container-single']")).click();
		Thread.sleep(3000);
		
		for (int i = 1; i <=13; i++) {
			WebElementFacade selectprsn = $(By.xpath("(//li[contains(@class,'active-result')])["+ i +"]"));
			String text = selectprsn.getText();
			System.out.println(text);
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		$(By.xpath("//li[text()='Joshi Franklin']")).click();
	    
	}

	//To click save in Risk assessment selected pop up
	@Step
	public void to_click_save_in_risk_assessment_selected_pop_up() throws InterruptedException {
		$(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(3000);
	   
	}

	//To click close in Risk assessment selected pop up
	@Step
	public void to_click_close_in_risk_assessment_selected_pop_up() throws InterruptedException {
		
		$(By.xpath("(//input[@value='Close'])[1]")).click();
		Thread.sleep(3000);
	    
	}
	//To click Risk assessment link RCSA page
	@Step
	public void to_click_risk_assessment_link_rcsa_page() throws InterruptedException {
		
		
		
		$(By.xpath("//a[text()='Risk Management (RIMA)']")).click();
		Thread.sleep(3000);
	    
	}

	//To validate the RCSA control view page
	@Step
	public void to_validate_the_rcsa_control_view_page() throws InterruptedException {
		boolean displayed = $(By.xpath("//h1[text()='Risk & Control Self-Assessment (RCSA) - Control View']")).isDisplayed();
	    Assert.assertTrue(displayed);
	    Thread.sleep(3000);
	}

	//To click the proceed to approval button in control view page
	@Step
	public void to_click_the_proceed_to_approval_button_in_control_view_page() throws InterruptedException {
		$(By.xpath("//input[@value='Proceed To Approval']")).click();
		Thread.sleep(3000);
	}

	//To Validate the RCSA approval page
	@Step
	public void to_validate_the_rcsa_approval_page() {
		boolean displayed = $(By.xpath("//h1[text()='Risk & Control Self-Assessment (RCSA) Approval']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	    
	}

	//To click the check box in RCSA approval page
	@Step
	public void to_click_the_check_box_in_rcsa_approval_page() {
		
		$(By.xpath("//input[@type='checkbox']")).click();
	    
	}

	//To Enter value in comment box in RCSA approval page
	@Step
	public void to_enter_value_in_comment_box_in_rcsa_approval_page() throws InterruptedException {
		
		getDriver().switchTo().frame(0);
		$(By.xpath("(//body[@id='tinymce'])[1]")).sendKeys("please approve");
		getDriver().switchTo().defaultContent();
		Thread.sleep(3000);
	}

	//To click the review dropdown in RCSA approval page
	@Step
	public void to_click_the_review_dropdown_in_rcsa_approval_page() throws InterruptedException {
		
		$(By.id("ctl00_ctl00_buttons_buttons_ddlRecipients")).click();
	    Thread.sleep(3000);
	}

	//To select one reviewer in review dropdown in RCSA approval page
	@Step
	public void to_select_one_reviewer_in_review_dropdown_in_rcsa_approval_page() {
		
		$(By.xpath("//option[text()='Ayman El-Zoghby']")).click();
	    
	}

	//To click the RA save button in RCSA approval page
	@Step
	public void to_click_the_ra_save_button_in_rcsa_approval_page() {
		$(By.xpath("//input[@value='RA Save']")).click();
	    
	}

	//To click the history option in RCSA approval page
	@Step
	public void to_click_the_history_option_in_rcsa_approval_page() throws InterruptedException {
		$(By.xpath("(//input[@type='submit'])[8]")).click();
		Thread.sleep(3000);
	}

	//To validate history option in RCSA approval page
	@Step
	public void to_validate_history_option_in_rcsa_approval_page() throws InterruptedException {
		
		
	    for (int i = 1; i < 4; i++) {
	    	WebElementFacade result = $(By.xpath("(((//tr[@class='bodytextRow'])[5]/td)[5]/table/tbody/tr/td/span[@class='bodyText'])["+i+"]"));
	    	String text = result.getText();
	    	System.out.println(text);
	    	Thread.sleep(1000);
	    }
	}

}
