package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_controlgap_Quickquery_pages extends PageObject {


	//To click the Quick query option
	@Step
	public void to_click_the_quick_query_option() throws InterruptedException {
		
		$(By.xpath("(//a[text()='Quick Query'])[2]")).click();
		Thread.sleep(3000);
	    
	}

	//To validate the issue Quick query page
	@Step
	public void to_validate_the_issue_quick_query_page() {
		boolean displayed = $(By.xpath("//h1[text()='Issues - Quick Query']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	 }

	//To click the issue id radio button in issue Quick query page
	@Step
	public void to_click_the_issue_id_radio_button_in_issue_quick_query_page() throws InterruptedException {
		$(By.xpath("(//input[@type='radio'])[4]")).click();
		Thread.sleep(3000);
	}

	//To Enter the id in the issue id box issue Quick query page
	@Step
	public void to_enter_the_id_in_the_issue_id_box_issue_quick_query_page() throws InterruptedException {
	    $(By.xpath("(//input[@type='text'])[1]")).sendKeys("206");
	    Thread.sleep(3000);
	}

	//To click the Run button issue Quick query page
	@Step
	public void to_click_the_run_button_issue_quick_query_page() throws InterruptedException {
		$(By.xpath("//input[@value='Run']")).click();
		Thread.sleep(3000);
	  
	}

	//To validate the id in the issue id box control gap management page
	@Step
	public void to_validate_the_id_in_the_issue_id_box_control_gap_management_page() throws InterruptedException {
	    boolean displayed = $(By.xpath("//h1[text()='Control Gap Management']")).isDisplayed();
	    Assert.assertTrue(displayed);
	    
	    for (int i = 1; i <=8; i++) {
	    	
	    	WebElement details = getDriver().findElement(By.xpath("//tr[@class='bodytextRow']/child::td["+i+"]"));
	    	String text = details.getText();
	    	System.out.println(text);
	    	Thread.sleep(1000);
			
		}
	    
		
	}

}
