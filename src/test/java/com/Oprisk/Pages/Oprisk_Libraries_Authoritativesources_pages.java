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

public class Oprisk_Libraries_Authoritativesources_pages extends PageObject {

	
	//To Click the Authoritative source option in Libraries
	@Step
	public void to_click_the_authoritative_source_option_in_libraries() throws InterruptedException {
		Thread.sleep(3000);
	   $(By.xpath("(//a[text()='Authoritative Source'])[1]")).click();
	}

	//To validate the Authoritative source list page
	@Step
	public void to_validate_the_authoritative_source_list_page() throws InterruptedException {
		Thread.sleep(3000);
	   boolean displayed = $(By.xpath("//h1[text()='Authoritative Source List']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To click the New Authoritative Source button in Authoritative source list page
	@Step
	public void to_click_the_new_authoritative_source_button_in_authoritative_source_list_page() {
	    $(By.xpath("//input[@value='New Authoritative Source']")).click();
	}

	//To validate the Add Authoritative Source page
	@Step
	public void to_validate_the_add_authoritative_source_page() throws InterruptedException {
		Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//h1[text()='Add Authoritative Source']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To select Dropdown option in Authoritative Source Type in Add Authoritative Source page
	@Step
	public void to_select_dropdown_option_in_authoritative_source_type_in_add_authoritative_source_page() {
	    $(By.xpath("(//a[@class='chosen-single'])[1]")).click();
	    
	    $(By.xpath("//li[text()='Company Document']")).click();
	}

	//To Enter value in Authoritative Source Name in Add Authoritative Source page
	@Step
	public void to_enter_value_in_authoritative_source_name_in_add_authoritative_source_page() {
	    $(By.xpath("(//input[@type='text'])[2]")).sendKeys("test1");
	}

	//To Enter value in Authoritative Source Title in Add Authoritative Source page
	@Step
	public void to_enter_value_in_authoritative_source_title_in_add_authoritative_source_page() {
		 $(By.xpath("(//input[@type='text'])[3]")).sendKeys("test1");
	}

	//To Enter value in Heading in Add Authoritative Source page
	@Step
	public void to_enter_value_in_heading_in_add_authoritative_source_page() {
		 $(By.xpath("(//input[@type='text'])[4]")).sendKeys("test1");
	}

	//To Enter value in common name in Add Authoritative Source page
	@Step
	public void to_enter_value_in_common_name_in_add_authoritative_source_page() {
		 $(By.xpath("(//input[@type='text'])[5]")).sendKeys("test1");
	}

	//To Enter value in codify in Add Authoritative Source page
	@Step
	public void to_enter_value_in_codify_in_add_authoritative_source_page() {
		 $(By.xpath("(//input[@type='text'])[6]")).sendKeys("test1");
	}

	//To Enter value in Authoritative Source Description in Add Authoritative Source page
	@Step
	public void to_enter_value_in_authoritative_source_description_in_add_authoritative_source_page() throws InterruptedException {
	    $(By.xpath("//textarea[@class='bodyText']")).sendKeys("test");
	    Thread.sleep(3000);
	}

	//To select Dropdown option in Status in Add Authoritative Source page
	@Step
	public void to_select_dropdown_option_in_status_in_add_authoritative_source_page() throws AWTException {
		 $(By.xpath("(//a[@class='chosen-single'])[2]")).click();
		 

		   Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_PAGE_DOWN);
		   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 
		    $(By.xpath("//li[text()='Proposed']")).click();
	}

	//To select Dropdown option in Responsible person in Add Authoritative Source page
	@Step
	public void to_select_dropdown_option_in_responsible_person_in_add_authoritative_source_page() throws AWTException {
	   $(By.xpath("(//input[@type='text'])[10]")).click();
	   
	   $(By.xpath("(//div[text()='Joshi Franklin'])[2]")).click();
	   
	}

	//To Enter value in originator in Add Authoritative Source page
	@Step
	public void to_enter_value_in_originator_in_add_authoritative_source_page() {
		$(By.xpath("(//input[@type='text'])[13]")).sendKeys("test");
	}

	//To Enter value in issuer in Add Authoritative Source page
	@Step
	public void to_enter_value_in_issuer_in_add_authoritative_source_page() throws InterruptedException {
		$(By.xpath("(//input[@type='text'])[14]")).sendKeys("test");
		Thread.sleep(2000);
	}

	//To Select a Issued Date in Add Authoritative Source page
	@Step
	public void to_select_a_issued_date_in_add_authoritative_source_page() throws AWTException {
		Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_PAGE_DOWN);
		   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		
	   $(By.xpath("(//input[@class='calendar-icon'])[1]")).click();
	   $(By.xpath("(//div[text()='8'])[1]")).click();
	}

	//To Select a Effective Date in Add Authoritative Source page
	@Step
	public void to_select_a_effective_date_in_add_authoritative_source_page() throws InterruptedException {
		Thread.sleep(2000);
		// $(By.xpath("(//input[@class='calendar-icon'])[2]")).click();
		   $(By.xpath("(//input[@type='text'])[17]")).sendKeys("09 Nov 2023");
		   
	}

	//To Select a Rescinded Date in Add Authoritative Source page
	@Step
	public void to_select_a_rescinded_date_in_add_authoritative_source_page() throws InterruptedException {
		Thread.sleep(2000);
		// $(By.xpath("(//input[@class='calendar-icon'])[3]")).click();
		 $(By.xpath("(//input[@type='text'])[18]")).sendKeys("09 Nov 2023");
	}

	//To click save button in Add Authoritative Source page
	@Step
	public void to_click_save_button_in_add_authoritative_source_page() {
	    $(By.xpath("(//input[@value='Save'])[2]")).click();
	}

	//To validate the Edit Authoritative Source page
	@Step
	public void to_validate_the_edit_authoritative_source_page() throws InterruptedException {
		Thread.sleep(4000);
	    boolean displayed = $(By.xpath("//h1[text()='Edit Authoritative Source']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Enter the value in Loader Id in Edit Authoritative Source page
	@Step
	public void to_enter_the_value_in_loader_id_in_edit_authoritative_source_page() throws AWTException {
		
		 Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_PAGE_DOWN);
		   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		
	    $(By.xpath("(//input[@type='text'])[22]")).sendKeys("tested5");
	    
	}

	//To select Dropdown option in Source System in Edit Authoritative Source page
	@Step
	public void to_select_dropdown_option_in_source_system_in_edit_authoritative_source_page() throws AWTException {
	    
		 $(By.xpath("(//a[@class='chosen-single'])[5]")).click();
		 
		 $(By.xpath("//li[text()='OneSumX']")).click();
		
	}

	//To click save button in Edit Authoritative Source page
	@Step
	public void to_click_save_button_in_edit_authoritative_source_page() {
	    $(By.xpath("(//input[@value='Save'])[2]")).click();
	}

	//To click cancel button in Edit Authoritative Source page
	@Step
	public void to_click_cancel_button_in_edit_authoritative_source_page() {
	    $(By.xpath("(//input[@value='Cancel'])[2]")).click();
	    
	}

	//To validate result  Authoritative source list page
	@Step
	public void to_validate_result_authoritative_source_list_page() throws InterruptedException {
		Thread.sleep(3000);
		 boolean displayed = $(By.xpath("//h1[text()='Authoritative Source List']")).isDisplayed();
		    Assert.assertTrue(displayed);
	}
	
}
