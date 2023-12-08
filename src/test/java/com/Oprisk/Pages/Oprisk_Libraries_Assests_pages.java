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

public class Oprisk_Libraries_Assests_pages extends PageObject {
	
	
	//To Click the Assets option in Libraries
	@Step
	public void to_click_the_assets_option_in_libraries() throws InterruptedException {
		Thread.sleep(3000);
	    $(By.xpath("//a[text()='Assets']")).click();
	}

	//To validate the Maintain Assets Library page
	@Step
	public void to_validate_the_maintain_assets_library_page() throws InterruptedException {
		Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//h1[text()='Maintain Assets Library']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the Add New button in Maintain Assets Library page
	@Step
	public void to_click_the_add_new_button_in_maintain_assets_library_page() {
	   $(By.xpath("//input[@value='Add New']")).click();
	}

	//To validate the Select Asset Type page
	@Step
	public void to_validate_the_select_asset_type_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Select Asset Type']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click the plus button in key asset option in Select Asset Type page
	@Step
	public void to_click_the_plus_button_in_key_asset_option_in_select_asset_type_page() {
	    $(By.xpath("(//img[@title='Add Asset'])[1]")).click();
	}

	//To validate the Add key Assets page
	@Step
	public void to_validate_the_add_key_assets_page() throws InterruptedException {
		Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//h1[text()='Add Key Asset']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Enter the value in Key Asset Name in Add key Assets page
	@Step
	public void to_enter_the_value_in_key_asset_name_in_add_key_assets_page() {
	    $(By.xpath("(//input[@type='text'])[1]")).sendKeys("test");
	}

	//To select the dropdown in Asset class in Add key Assets page
	@Step
	public void to_select_the_dropdown_in_asset_class_in_add_key_assets_page() throws InterruptedException {
	    $(By.xpath("(//a[@class='chosen-single'])[1]")).click();
	    Thread.sleep(1000);
	    $(By.xpath("//li[text()='Operating System']")).click();
	}

	//To select the dropdown in Asset type in Add key Assets page
	@Step
	public void to_select_the_dropdown_in_asset_type_in_add_key_assets_page() throws InterruptedException {
	   
		$(By.xpath("(//a[@class='chosen-single'])[2]")).click();
		  Thread.sleep(1000);
		 $(By.xpath("//li[text()='Third Party Installed']")).click();
		
	}

	//To Enter the value in Asset purpose in Add key Assets page
	@Step
	public void to_enter_the_value_in_asset_purpose_in_add_key_assets_page() {
	    
		getDriver().switchTo().frame(0);
		$(By.id("tinymce")).sendKeys("test");
		getDriver().switchTo().defaultContent();
		
	}

	//To select the dropdown in Asset status in Add key Assets page
	@Step
	public void to_select_the_dropdown_in_asset_status_in_add_key_assets_page() throws InterruptedException {
	   
		$(By.xpath("(//a[@class='chosen-single'])[3]")).click();
		  Thread.sleep(1000);
		$(By.xpath("//li[text()='Active']")).click();
		
	}

	//To select the dropdown in Asset owner in Add key Assets page
	@Step
	public void to_select_the_dropdown_in_asset_owner_in_add_key_assets_page() {
		
		$(By.xpath("(//a[@class='chosen-single'])[4]")).click();
		$(By.xpath("//li[text()='Joshi Franklin']")).click();
	    
	}

	//To select the dropdown in Asset scale in Add key Assets page
	@Step
	public void to_select_the_dropdown_in_asset_scale_in_add_key_assets_page() {
		
		$(By.xpath("(//a[@class='chosen-single'])[5]")).click();
		$(By.xpath("//li[text()='Global']")).click();
	    
	}

	//To Enter the value in Asset notes in Add key Assets page
	@Step
	public void to_enter_the_value_in_asset_notes_in_add_key_assets_page() throws AWTException {
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	    
	}

	//To click the save button in Add key Assets page
	@Step
	public void to_click_the_save_button_in_add_key_assets_page() {
	    $(By.xpath("(//input[@value='Save'])[2]")).click();
	}

	//To validate the Edit key Assets page
	@Step
	public void to_validate_the_edit_key_assets_page() throws InterruptedException {
		  Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//h1[text()='Edit Key Asset']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Enter the value in loader id in Edit key Assets page
	@Step
	public void to_enter_the_value_in_loader_id_in_edit_key_assets_page() {
		$(By.xpath("(//input[@type='text'])[8]")).sendKeys("tester5");
	    
	}

	//To select the dropdown in source system in Edit key Assets page
	@Step
	public void to_select_the_dropdown_in_source_system_in_edit_key_assets_page() throws AWTException {
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    $(By.xpath("(//a[@class='chosen-single'])[6]")).click();
	    $(By.xpath("//li[text()='OneSumX']")).click();
	}

	//To click the Save button in Edit key Assets page
	@Step
	public void to_click_the_save_button_in_edit_key_assets_page() {
		$(By.xpath("(//input[@value='Save'])[2]")).click();
	}

	//To click the cancel button in Edit key Assets page
	@Step
	public void to_click_the_cancel_button_in_edit_key_assets_page() {
	   $(By.xpath("(//input[@value='Cancel'])[4]")).click();
	}

	
	//To validate result with Maintain Assets Library page
	@Step
	public void to_validate_result_with_maintain_assets_library_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Assets Library']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}


}
