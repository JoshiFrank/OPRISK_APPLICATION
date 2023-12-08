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

public class Oprisk_Admin_Dataloading_Documenttransferconfiguration_pages extends PageObject {

	//To click Document Transfer Configuration in Data Loading Option
	@Step
	public void to_click_document_transfer_configuration_in_data_loading_option() throws InterruptedException {
	    Thread.sleep(2000);
		$(By.xpath("//a[text()='Document Transfer Configuration']")).click();
	}

	//To validate Manage Document Transfer Configuration page
	@Step
	public void to_validate_manage_document_transfer_configuration_page() throws InterruptedException {
		 Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Manage Document Transfer Configuration']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click Add new button in Manage Document Transfer Configuration page
	@Step
	public void to_click_add_new_button_in_manage_document_transfer_configuration_page() {
		
		$(By.xpath("//input[@value='Add New']")).click();
	 }

	//To validate Add Document Transfer Configuration page
	@Step
	public void to_validate_add_document_transfer_configuration_page() throws InterruptedException {
		 Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Add Document Transfer Configuration']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To Enter value Document Source Name box in Add Document Transfer Configuration page
	@Step
	public void to_enter_value_document_source_name_box_in_add_document_transfer_configuration_page() throws InterruptedException {
		 Thread.sleep(1000);
		$(By.xpath("(//input[@type='text'])[1]")).sendKeys("test");
	}

	//To Enter value Description box in Add Document Transfer Configuration page
	@Step
	public void to_enter_value_description_box_in_add_document_transfer_configuration_page() throws InterruptedException {
		 Thread.sleep(1000);
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("test");
	}

	//To Select dropdown in type option in Add Document Transfer Configuration page
	@Step
	public void to_select_dropdown_in_type_option_in_add_document_transfer_configuration_page() throws InterruptedException {
		 Thread.sleep(1000);
		$(By.xpath("//select[@class='bodyText cddlType']")).selectByVisibleText("Policies and Procedures");
	}

	//To Enter value Destination Folder box in Add Document Transfer Configuration page
	@Step
	public void to_enter_value_destination_folder_box_in_add_document_transfer_configuration_page() throws InterruptedException {
		 Thread.sleep(1000);
		$(By.xpath("(//input[@type='text'])[3]")).sendKeys("test");
	}

	//To Select dropdown in Protocol option in Add Document Transfer Configuration page
	@Step
	public void to_select_dropdown_in_protocol_option_in_add_document_transfer_configuration_page() throws InterruptedException {
		 Thread.sleep(1000);
		$(By.xpath("(//select[@class='bodyText'])[2]")).selectByVisibleText("DLL");
	}

	//To Enter value URL box in Add Document Transfer Configuration page
	@Step
	public void to_enter_value_url_box_in_add_document_transfer_configuration_page() throws InterruptedException {
	    
		 Thread.sleep(1000);
		$(By.xpath("(//input[@type='text'])[5]")).sendKeys("test");
	}

	//To Enter value User Name box in Add Document Transfer Configuration page
	@Step
	public void to_enter_value_user_name_box_in_add_document_transfer_configuration_page() throws InterruptedException, AWTException {
		
		$(By.xpath("(//input[@type='text'])[6]")).click();
		Thread.sleep(1000);
		$(By.xpath("(//input[@type='text'])[6]")).clear();
		 Thread.sleep(1000);
		$(By.xpath("(//input[@type='text'])[6]")).sendKeys("test");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	//To Enter value User Password box in Add Document Transfer Configuration page
	@Step
	public void to_enter_value_user_password_box_in_add_document_transfer_configuration_page() throws InterruptedException, AWTException {
	    
		Thread.sleep(2000);
		//$(By.xpath("(//input[@type='password'])[1]")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		
	}

	//To Enter value Certificate Name box in Add Document Transfer Configuration page
	@Step
	public void to_enter_value_certificate_name_box_in_add_document_transfer_configuration_page() throws AWTException {
		$(By.xpath("(//input[@type='text'])[8]")).sendKeys("test");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	//To Enter value File Password box in Add Document Transfer Configuration page
	@Step
	public void to_enter_value_file_password_box_in_add_document_transfer_configuration_page() throws AWTException {

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
	}

	//To Select dropdown in Direction option in Add Document Transfer Configuration page
	@Step
	public void to_select_dropdown_in_direction_option_in_add_document_transfer_configuration_page() {
	    $(By.xpath("(//select[@class='bodyText'])[3]")).selectByVisibleText("Outbound");
	}
	
	//To select choose file in Add Document Transfer Configuration page
	@Step
	public void to_select_choose_file_in_add_document_transfer_configuration_page() throws InterruptedException {
		 Thread.sleep(3000);
		$(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hp\\Desktop\\CWG folder\\New Text Document.txt");
	}

	//To Select dropdown in Run At option in Add Document Transfer Configuration page
	@Step
	public void to_select_dropdown_in_run_at_option_in_add_document_transfer_configuration_page() throws InterruptedException {
		 Thread.sleep(1000);
		$(By.xpath("(//select[@class='bodyText'])[4]")).selectByVisibleText("10:00");
	}

	//To click save button in Add Document Transfer Configuration page
	@Step
	public void to_click_save_button_in_add_document_transfer_configuration_page() throws InterruptedException {
	    
		$(By.xpath("(//input[@value='Save'])[2]")).click();
		 Thread.sleep(3000);
	}
	
	
}
