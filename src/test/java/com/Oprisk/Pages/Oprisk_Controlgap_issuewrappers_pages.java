package com.Oprisk.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Controlgap_issuewrappers_pages extends PageObject{
	
	//To click the issue wrappers option
	@Step
	public void to_click_the_issue_wrappers_option() throws InterruptedException {
	    $(By.xpath("(//a[text()='Issue Wrappers'])[1]")).click();
	    Thread.sleep(3000);
	}

	//To validate the issue wrappers page
	@Step
	public void to_validate_the_issue_wrappers_page() {
		boolean displayed = $(By.xpath("//h1[text()='Issue Wrappers']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click the Add new button issue wrappers page
	@Step
	public void to_click_the_add_new_button_issue_wrappers_page() throws InterruptedException {
	    $(By.xpath("//input[@value='Add New']")).click();
	    Thread.sleep(3000);
	}

	//To validate the issue wrappers select senior organisation unit
	@Step
	public void to_validate_the_issue_wrappers_select_senior_organisation_unit() {
	   boolean displayed = $(By.xpath("//h1[text()='Issue Wrappers - Select Senior Organisation Unit']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To click the office of the president icon in issue wrappers select senior organisation unit
	@Step
	public void to_click_the_office_of_the_president_icon_in_issue_wrappers_select_senior_organisation_unit() throws InterruptedException {
		$(By.id("ctl00_content_ucLazyTree_ucLazyTreen1")).click();
		Thread.sleep(3000);
	}

	//To click the president icon in issue wrappers select senior organisation unit
	@Step
	public void to_click_the_president_icon_in_issue_wrappers_select_senior_organisation_unit() {
		$(By.id("ctl00_content_ucLazyTree_ucLazyTreen2")).click();
	}

	//To click the radio button of risk management in issue wrappers select senior organisation unit
	@Step
	public void to_click_the_radio_button_of_risk_management_in_issue_wrappers_select_senior_organisation_unit() {
	    $(By.xpath("(//input[@type='radio'])[12]")).click();
	}

	//To click the proceed button in issue wrappers select senior organisation unit
	@Step
	public void to_click_the_proceed_button_in_issue_wrappers_select_senior_organisation_unit() throws InterruptedException {
	    $(By.xpath("//input[@value='Proceed']")).click();
	    Thread.sleep(3000);
	}

	//To validate the Add issue wrappers page
	@Step
	public void to_validate_the_add_issue_wrappers_page() {
		boolean displayed = $(By.xpath("//h1[text()='Add Issue Wrapper']")).isDisplayed();
		Assert.assertTrue(displayed);
	   
	}

	//To Enter the value in wrapper Title box in Add issue wrappers page
	@Step
	public void to_enter_the_value_in_wrapper_title_box_in_add_issue_wrappers_page() throws InterruptedException {
		Thread.sleep(3000);
	    $(By.xpath("(//input[@type='text'])[1]")).sendKeys("onesum");
	}

	//To Enter the value in wrapper Reference box in Add issue wrappers page
	@Step
	public void to_enter_the_value_in_wrapper_reference_box_in_add_issue_wrappers_page() {
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("test");
	}

	//To Enter the value in wrapper Notes box in Add issue wrappers page
	@Step
	public void to_enter_the_value_in_wrapper_notes_box_in_add_issue_wrappers_page() throws InterruptedException {
		getDriver().switchTo().frame(0);
		$(By.id("tinymce")).sendKeys("Hi Team");
		getDriver().switchTo().defaultContent();
		Thread.sleep(2000);
	}

	//To select dropdown option in Originator Type in Add issue wrappers page
	@Step
	public void to_select_dropdown_option_in_originator_type_in_add_issue_wrappers_page() throws InterruptedException {
	    $(By.xpath("//a[@class='chosen-single chosen-default']")).click();
	    $(By.xpath("//li[text()='Business']")).click();
	    Thread.sleep(3000);
	}

	//To click the Save button in Add issue wrappers page
	@Step
	public void to_click_the_save_button_in_add_issue_wrappers_page() throws InterruptedException {
		$(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(3000);
	   
	}

	//To validate the Edit issue wrapper page
	@Step
	public void to_validate_the_edit_issue_wrapper_page() {
	    boolean displayed = $(By.xpath("//h1[text()='Edit Issue Wrapper']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the Add new reference button in Edit issue wrapper page
	@Step
	public void to_click_the_add_new_reference_button_in_edit_issue_wrapper_page() throws InterruptedException {
	    $(By.xpath("//input[@value='Add New Reference']")).click();
	    Thread.sleep(3000);
	}

	//To validate the Add new reference popup page
	@Step
	public void to_validate_the_add_new_reference_popup_page() throws InterruptedException {
		boolean displayed = $(By.xpath("//span[text()='Add New Reference']")).isDisplayed();
		Assert.assertTrue(displayed);
		Thread.sleep(3000);
	}

	//To click the choose file in Add new reference page
	@Step
	public void to_click_the_choose_file_in_add_new_reference_page() throws AWTException, InterruptedException {
	    
		Thread.sleep(5000);
		
		
		$(By.xpath("//input[@type='file']")).
		sendKeys("C:\\Users\\hp\\Downloads\\Issue Wrappers_31_Oct_2023_11_36_13.xlsx");
		
		/*
		 * String link="C:\\Users\\hp\\Downloads"; StringSelection selection=new
		 * StringSelection(link);
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		 * Robot robo=new Robot(); robo.keyPress(KeyEvent.VK_CONTROL);
		 * robo.keyPress(KeyEvent.VK_V); Thread.sleep(5000);
		 * robo.keyRelease(KeyEvent.VK_V); robo.keyRelease(KeyEvent.VK_CONTROL);
		 * Thread.sleep(5000); robo.keyPress(KeyEvent.VK_ENTER);
		 * robo.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(5000);
		 */
		
	}

	//To Enter the value in Reference Source System box in Add new reference page
	@Step
	public void to_enter_the_value_in_reference_source_system_box_in_add_new_reference_page() throws InterruptedException {
	    $(By.xpath("(//input[@type='text'])[9]")).sendKeys("test");
	    Thread.sleep(3000);
	}

	//To Enter the value in Reference Description box in Add new reference page
	@Step
	public void to_enter_the_value_in_reference_description_box_in_add_new_reference_page() throws InterruptedException {
	    $(By.xpath("(//textarea[@class='bodyText'])[2]")).sendKeys("test");
	    Thread.sleep(3000);
	}

	//To click the check bok in Shared in Add new reference page
	@Step
	public void to_click_the_check_bok_in_shared_in_add_new_reference_page() throws InterruptedException {
	    $(By.xpath("(//input[@type='checkbox'])[3]")).click();
	    Thread.sleep(3000);
	}

	//To Enter the value in Loader Id box in Add new reference page
	@Step
	public void to_enter_the_value_in_loader_id_box_in_add_new_reference_page() throws InterruptedException {
	   $(By.xpath("(//input[@type='text'])[10]")).sendKeys("test5");
	   Thread.sleep(3000);
	}

	//To select dropdown option in Source System in Add new reference page
	@Step
	public void to_select_dropdown_option_in_source_system_in_add_new_reference_page() throws InterruptedException, AWTException {
		
		
		
		 Thread.sleep(5000);
		 
	// $(By.xpath("//*[@id='ctl00_ctl00_content_content_ucDocList_ddlSourceSystem_chkInput_chosen']/a/span")).click();
	    
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 
	 $(By.xpath("(//span[text()='--None--'])[1]")).click();
	   
	    
	    $(By.xpath("//li[text()='OneSumX']")).click();
	    Thread.sleep(3000);
	}

	//To click the Attach and close in Add new reference page
	@Step
	public void to_click_the_attach_and_close_in_add_new_reference_page() throws InterruptedException {
		$(By.xpath("//input[@value='Attach & Close']")).click();
		Thread.sleep(3000);
	    
	}

	//to click the save button in Edit issue wrapper page
	@Step
	public void to_click_the_save_button_in_edit_issue_wrapper_page() {
	   $(By.xpath("//input[@value='Save']")).click();
	   
	   
	}
//-----------------------------------------------------------------------------------------------------
	
	
	
	//To Test the issue wrappers Add Existing page functionality
	
	//To click the onesum under the title in issue wrappers page
	@Step
	public void to_click_the_onesum_under_the_title_in_issue_wrappers_page() throws InterruptedException {
		Thread.sleep(3000);
	   $(By.xpath("(//a[text()='onesum'])[2]")).click();
	   
	}

	//To click the Add Existing reference button in Edit issue wrapper page
	@Step
	public void to_click_the_add_existing_reference_button_in_edit_issue_wrapper_page() throws InterruptedException {
		Thread.sleep(3000);
	   $(By.xpath("//input[@value='Add Existing Reference']")).click();
	   
	}

	//To validate the Search Reference library page
	@Step
	public void to_validate_the_search_reference_library_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Search Reference Library']")).isDisplayed();
		Assert.assertTrue(displayed);
	   
	}

	//To click the required checkbox under the Reference source system
	@Step
	public void to_click_the_required_checkbox_under_the_reference_source_system() throws InterruptedException {
		Thread.sleep(3000);
		$(By.xpath("(//input[@type='checkbox'])[3]")).click();
	   
	}

	//To click the save button in Search Reference library page
	@Step
	public void to_click_the_save_button_in_search_reference_library_page() throws InterruptedException {
		Thread.sleep(3000);
	    $(By.xpath("//input[@value='Save']")).click();
	}

	//To validate the  uploaded file in Edit issue wrapper page
	@Step
	public void to_validate_the_uploaded_file_in_edit_issue_wrapper_page() throws InterruptedException {
		Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//span[text()='Uploaded Files']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	
	
	
	
	
	
	
}
