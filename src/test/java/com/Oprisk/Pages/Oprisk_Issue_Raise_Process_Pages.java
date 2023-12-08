package com.Oprisk.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Issue_Raise_Process_Pages extends PageObject{

	
	//To validate the plus issue button
	@Step
	public void to_validate_the_plus_issue_button() {
		
		boolean displayed = $(By.xpath("//span[contains(text(),'Issue')]")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the plus issue button
	@Step
	public void to_click_the_plus_issue_button() throws InterruptedException {

		$(By.xpath("//span[contains(text(),'Issue')]")).click();
		Thread.sleep(2000);
	}

	//To click the views option straight line
	@Step
	public void to_click_the_views_option_straight_line() throws InterruptedException {
		
		//button[contains(@title,'List View')]
		$(By.xpath("//button[contains(@title,'List View')]")).click();
		Thread.sleep(2000);
	}

	//To click the number two link
	@Step
	public void to_click_the_number_two_link() throws InterruptedException {

		$(By.xpath("//a[contains(text(),'2')]")).click();
		Thread.sleep(2000);
	}

	//To click the twenty Strategy & Innovation \\(STIN)
	@Step
	public void to_click_the_twenty_strategy_innovation_stin() {
		
		$(By.xpath("(//input[contains(@type,'radio')])[9]")).click();
	  
	}

	//To click proceed button
	@Step
	public void to_click_proceed_button() throws InterruptedException {
		
		$(By.xpath("//input[contains(@value,'Proceed')]")).click();
		Thread.sleep(4000);
	 
	}

	//To validate the new issue path in Strategy & Innovation issue page
	@Step
	public void to_validate_the_new_issue_path_in_strategy_innovation_issue_page() throws InterruptedException {
		
		$(By.xpath("//input[@value='Raise New Issue']")).click();
		Thread.sleep(2000);
		String text = $(By.xpath("//span[@title='Organisation Unit']")).getText();
	    System.out.println(text);
	}

	//To enter the Title in title box in Strategy & Innovation issue page {string}
	@Step
	public void to_enter_the_title_in_title_box_in_strategy_innovation_issue_page(String string) {
		
		$(By.xpath("//textarea[@class='bodyText']")).sendKeys(string);

	}

	//To enter the issue details in Strategy & Innovation issue page {string}
	@Step
	public void to_enter_the_issue_details_in_strategy_innovation_issue_page(String string) {
		
		getDriver().switchTo().frame(0);
				$(By.xpath("(//body[@id='tinymce'])[1]")).sendKeys(string);
		getDriver().switchTo().defaultContent();
	}

	//To validate the priority options in Strategy & Innovation issue page
	@Step
	public void to_validate_the_priority_options_in_strategy_innovation_issue_page() throws InterruptedException {
		$(By.xpath("(//a[@class='chosen-single'])[1]")).click();
		Thread.sleep(4000);
	   List<WebElement> prioritylist = getDriver().findElements(By.xpath("(//ul[@class='select2-results'])//li"));
	   
	   for (WebElement webElement : prioritylist) {
		   String text = webElement.getText();
		   System.out.println(text);
	}
	}

	//To select the priority in Strategy & Innovation issue page
	@Step
	public void to_select_the_priority_in_strategy_innovation_issue_page() {
		
		$(By.xpath("((//ul[@class='chosen-results'])[1]/li)[3]")).click();
	

	}

	//to validate the responsibility in Strategy & Innovation issue page
	@Step
	public void to_validate_the_responsibility_in_strategy_innovation_issue_page() throws InterruptedException, AWTException {
	 
		$(By.xpath("(//span[@class='select2-arrow'])[1]")).click();
		
			
		
		Thread.sleep(4000);
	   List<WebElement> responsibility = getDriver().findElements(By.xpath("(//ul[@class='select2-results'])/li"));
	   
	   for (WebElement webElementss : responsibility) {
		   String text2 = webElementss.getText();
		   System.out.println(text2);
	}
	   Thread.sleep(2000);
	   $(By.xpath("//div[text()='Gehane Adel']")).click();
	   Thread.sleep(4000);
	}

	//To select the select link in Strategy & Innovation issue page
	@Step
	public void to_select_the_select_link_in_strategy_innovation_issue_page() throws InterruptedException {
		
		$(By.xpath("(//a[contains(text(),'Select')])[1]")).click();
		Thread.sleep(3000);
	   
	}

	//To select the oadelakin id in responsibility select section
	@Step
	public void to_select_the_oadelakin_id_in_responsibility_select_section() {

		$(By.xpath("(//input[@type='radio'])[6]")).click();
	}

	//To click the select button in responsibility select section
	@Step
	public void to_click_the_select_button_in_responsibility_select_section() throws InterruptedException {
		
		$(By.xpath("(//input[@type='submit' and @value='Select'])")).click();
		Thread.sleep(3000);
	}

	//to select the issue sensitivity in Strategy & Innovation issue page
	@Step
	public void to_select_the_issue_sensitivity_in_strategy_innovation_issue_page() throws InterruptedException {
		
		$(By.xpath("(//a[@class='chosen-single'])[2]")).click();
		$(By.xpath("(//li[text()='Standard'])")).click();
		Thread.sleep(3000);
	   
	}

	//To select target closure date in Strategy & Innovation issue page
	@Step
	public void to_select_target_closure_date_in_strategy_innovation_issue_page() throws InterruptedException {
		
		$(By.xpath("(//input[@type='image'])")).click();
		$(By.xpath("(//div[text()='29'])[2]")).click();
		Thread.sleep(2000);
	 
	}

	//To enter department ref in Strategy & Innovation issue page {string}
	@Step
	public void to_enter_department_ref_in_strategy_innovation_issue_page(String string) {

		$(By.xpath("(//input[@type='text' and @class='bodyText'])[2]")).sendKeys(string);
	}

	//To enter department comment in Strategy & Innovation issue page {string}
	@Step
	public void to_enter_department_comment_in_strategy_innovation_issue_page(String string) throws AWTException {
	   
		Robot as=new Robot();
		as.keyPress(KeyEvent.VK_TAB);
		as.keyRelease(KeyEvent.VK_TAB);
		as.keyPress(KeyEvent.VK_T);
		as.keyRelease(KeyEvent.VK_T);
		as.keyPress(KeyEvent.VK_E);
		as.keyRelease(KeyEvent.VK_E);
		as.keyPress(KeyEvent.VK_S);
		as.keyRelease(KeyEvent.VK_S);
		as.keyPress(KeyEvent.VK_T);
		as.keyRelease(KeyEvent.VK_T);
		
	}

	//To validate the interested person option list
	@Step
	public void to_validate_the_interested_person_option_list() throws InterruptedException, AWTException {
	    
		
		$(By.xpath("(//span[@class='select2-arrow'])[2]")).click();
		Thread.sleep(3000);
		Robot as=new Robot();
		for (int i = 1; i <= 10; i++) {
			as.keyPress(KeyEvent.VK_DOWN);
			as.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		
	   List<WebElement> interestedperson = getDriver().findElements(By.xpath("(//ul[@class='select2-results'])/li"));
	   
	   for (WebElement webElements : interestedperson) {
		   String text1 = webElements.getText();
		   System.out.println(text1);
		   
	}
	}

	//To select Ahmed Magdi in person option list in Strategy & Innovation issue page
	@Step
	public void to_select_ahmed_magdi_in_person_option_list_in_strategy_innovation_issue_page() {
		
	    $(By.xpath("(//div[text()='Ahmed Magdi'])")).click();
	}

	//To select save button in Strategy & Innovation issue page
	@Step
	public void to_select_save_button_in_strategy_innovation_issue_page() throws InterruptedException {
		
		$(By.xpath("(//input[@type='submit' and @value='Save'])[3]")).click();
		Thread.sleep(4000);
		
	    
	}

	//to validate the Details of the Strategy & Innovation issue
	@Step
	public void to_validate_the_details_of_the_strategy_innovation_issue() throws AWTException, InterruptedException {
	    
		Robot as=new Robot();
		for (int i = 1; i <= 40; i++) {
			as.keyPress(KeyEvent.VK_TAB);
			as.keyRelease(KeyEvent.VK_TAB);
			
		}
		
		
	}

	//To select accept button in Strategy & Innovation issue
	@Step
	public void to_select_accept_button_in_strategy_innovation_issue() throws InterruptedException {
		
		$(By.xpath("(//input[@type='submit' and @value='Accept'])")).click();
		Thread.sleep(4000);
	    
	}


	//to click home pagre button from Strategy & Innovation issue
	@Step
	public void to_click_home_pagre_button_from_strategy_innovation_issue() throws InterruptedException {
	    $(By.xpath("(//a[@title='Go to home' and @tabindex='1'])")).click();
	    Thread.sleep(3000);
	}

	//To click the issues option in Home page
	public void to_click_the_issues_option_in_home_page() {
		
		$(By.xpath("(//div[text()='Issues'])")).click();
	    
	}

	//to validate New issue status in Home page
	@Step
	public void to_validate_new_issue_status_in_home_page() throws InterruptedException {
	    Thread.sleep(6000);
	    
	    String text = $(By.xpath("//a[text()='Test1']/parent::td/../child::td")).getText();
	    System.out.println("the new id is = "+ text);
	}
	}
	
	

