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

public class Oprisk_Libraries_Questionset_pages extends PageObject {

	//To Click the Question set option in Libraries
	@Step
	public void to_click_the_question_set_option_in_libraries() throws InterruptedException {
		Thread.sleep(3000);
		$(By.xpath("//a[text()='Question Set']")).click();
	    
	}

	//To validate the Manage Question Set page
	@Step
	public void to_validate_the_manage_question_set_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Manage Question Sets']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click the Add new button in Manage Question Set page
	@Step
	public void to_click_the_add_new_button_in_manage_question_set_page() {
	    $(By.xpath("//input[@value='Add New']")).click();
	}

	//To validate the Add question set page
	@Step
	public void to_validate_the_add_question_set_page() throws InterruptedException {
		Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//h1[text()='Add Question Set']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To enter the value in Question set box in Add question set page
	@Step
	public void to_enter_the_value_in_question_set_box_in_add_question_set_page() {
	    $(By.xpath("//textarea[@name='ctl00$content$txtLibraryName']")).sendKeys("Onesum");
	}

	//To click the Save button in Add question set page
	@Step
	public void to_click_the_save_button_in_add_question_set_page() {
	   $(By.xpath("//input[@value='Save']")).click();
	}

	//To validate the Edit Question set page
	@Step
	public void to_validate_the_edit_question_set_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Edit Question Set']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click the insert button in Edit Question set page
	@Step
	public void to_click_the_insert_button_in_edit_question_set_page() {
		$(By.xpath("//input[@type='image']")).click();
	    
	}

	//To validate the Add question page
	@Step
	public void to_validate_the_add_question_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Add Question']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To select the drop down option in choose an item type in Add question page
	@Step
	public void to_select_the_drop_down_option_in_choose_an_item_type_in_add_question_page() {
	    $(By.xpath("//select[@name='ctl00$content$cboItemType']")).selectByVisibleText("Choice - True/False");
	}

	//To validate the Add question with choose an item type in Add question page
	@Step
	public void to_validate_the_add_question_with_choose_an_item_type_in_add_question_page() throws InterruptedException {
		Thread.sleep(3000);
	   boolean displayed = $(By.xpath("//h1[text()='Add Question']")).isDisplayed();
	   Assert.assertTrue(displayed);
	   
	   
	}

	//To Enter value in question box in Add question page
	@Step
	public void to_enter_value_in_question_box_in_add_question_page() {
	   $(By.xpath("(//textarea[@class='TextareaStyle'])[1]")).sendKeys("test");
	}

	//To Enter value in question Alias box in Add question page
	@Step
	public void to_enter_value_in_question_alias_box_in_add_question_page() {
		$(By.xpath("(//textarea[@class='TextareaStyle'])[2]")).sendKeys("test");  
	}

	//To Enter value in Explanatory Text box in Add question page
	@Step
	public void to_enter_value_in_explanatory_text_box_in_add_question_page() throws InterruptedException {
	    getDriver().switchTo().frame(0);
		$(By.xpath("//body[@id='tinymce']")).sendKeys("test");
		getDriver().switchTo().defaultContent();
		Thread.sleep(3000);
	}

	//To click the check box in Required default value in Add question page
	@Step
	public void to_click_the_check_box_in_required_default_value_in_add_question_page() {
	    $(By.xpath("(//input[@type='checkbox'])[1]")).click();
	}

	//To select dropdown option in display type in Add question page
	@Step
	public void to_select_dropdown_option_in_display_type_in_add_question_page() throws AWTException {
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	    $(By.xpath("//select[@name='ctl00$content$cboDisplayTypeTrueFalse']")).selectByVisibleText("Radio Buttons - Vertical");
	}

	//To click the check box in Allow additonal answer in Add question page
	@Step
	public void to_click_the_check_box_in_allow_additonal_answer_in_add_question_page() {
		 $(By.xpath("(//input[@type='checkbox'])[2]")).click();
	}

	//To Enter value in loader id box in in Add question page
	@Step
	public void to_enter_value_in_loader_id_box_in_in_add_question_page() {
	    $(By.xpath("(//input[@type='text'])[2]")).sendKeys("testers6");
	}

	//To select dropdown option source system in Add question page
	@Step
	public void to_select_dropdown_option_source_system_in_add_question_page() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	   $(By.xpath("//select[@name='ctl00$content$cboSourceSystem']")).selectByVisibleText("OneSumX");
	}

	//To click the save button in Add question page
	@Step
	public void to_click_the_save_button_in_add_question_page() throws InterruptedException {
		
		Thread.sleep(3000);
		
		$(By.xpath("//input[@value='Save']")).click();
	    
	}

	//To validate the Edit Question Set page with question paper
	@Step
	public void to_validate_the_edit_question_set_page_with_question_paper() throws InterruptedException {
		Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//h1[text()='Edit Question Set']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}
	

}
