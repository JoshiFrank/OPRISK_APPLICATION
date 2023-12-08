package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Dataloading_Datafeed_pages extends PageObject {

	//To Test Admin menu in Add Data Feed in Data Feeds in Data Loading Option

	//To click Data Feeds in Data Loading Option
	@Step
	public void to_click_data_feeds_in_data_loading_option() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Data Feeds']")).click();
	}

	//To validate List Data Feeds page
	@Step
	public void to_validate_list_data_feeds_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='List Data Feeds']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click Add data feed in List Data Feeds page
	@Step
	public void to_click_add_data_feed_in_list_data_feeds_page() {
	    
		$(By.xpath("//input[@value='Add Data Feed']")).click();
	}

	//To validate Add Data Feed page
	@Step
	public void to_validate_add_data_feed_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Add Data Feed']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To select dropdown in Data Feed Type option in Add Data Feed page
	@Step
	public void to_select_dropdown_in_data_feed_type_option_in_add_data_feed_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//a[@class='chosen-single'])[1]")).click();
		$(By.xpath("//li[text()='Libraries']")).click();
		
		
	}

	//To Enter value in Data Feed Code box in Data Feed Code
	@Step
	public void to_enter_value_in_data_feed_code_box_in_data_feed_code() throws InterruptedException {
		Thread.sleep(4000);
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("test1");
	}

	//To Enter value in Data Feed Name box in Data Feed Code
	@Step
	public void to_enter_value_in_data_feed_name_box_in_data_feed_code() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[3]")).sendKeys("test1");
	}

	//To Enter value in Data Feed Description box in Data Feed Code
	@Step
	public void to_enter_value_in_data_feed_description_box_in_data_feed_code() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//textarea[@class='bodyText']")).sendKeys("test1");
	}

	//To select dropdown in Data Feed Owner option in Add Data Feed page
	@Step
	public void to_select_dropdown_in_data_feed_owner_option_in_add_data_feed_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//a[@class='chosen-single'])[2]")).click();
		$(By.xpath("//li[text()='Joshi Franklin']")).click();
	}

	//To select dropdown in Source System option in Add Data Feed page
	@Step
	public void to_select_dropdown_in_source_system_option_in_add_data_feed_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//a[@class='chosen-single'])[3]")).click();
		$(By.xpath("//li[text()='OneSumX']")).click();
	}

	//To click check box in Call Method in Add Data Feed page
	@Step
	public void to_click_check_box_in_call_method_in_add_data_feed_page() {
	    $(By.xpath("(//input[@type='checkbox'])[2]")).click();
	}

	//To Enter value in Upload File Sub Folder box in Add Data Feed page
	@Step
	public void to_enter_value_in_upload_file_sub_folder_box_in_add_data_feed_page() {
	    $(By.xpath("(//input[@type='text'])[6]")).sendKeys("test1");
	}

	//To click choose file upload in Add Data Feed page
	@Step
	public void to_click_choose_file_upload_in_add_data_feed_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hp\\Desktop\\CWG folder\\New Text Document.txt");
	}
	

	//To click radio button in Loader Mode in Add Data Feed page
	@Step
	public void to_click_radio_button_in_loader_mode_in_add_data_feed_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='radio'])[1]")).click();
	}

	//To click radio button in Email Notifications in Add Data Feed page
	@Step
	public void to_click_radio_button_in_email_notifications_in_add_data_feed_page() {
	   
		$(By.xpath("(//input[@type='radio'])[4]")).click();
	}

	//To Enter value in Notes box in Add Data Feed page
	@Step
	public void to_enter_value_in_notes_box_in_add_data_feed_page() throws InterruptedException {
	    
		getDriver().switchTo().frame(0);
		$(By.id("tinymce")).sendKeys("test2");
		getDriver().switchTo().defaultContent();
		Thread.sleep(2000);
	}

	//To click Save button in Add Data Feed page
	@Step
	public void to_click_save_button_in_add_data_feed_page() {
	    $(By.xpath("//input[@value='Save']")).click();
	}

	//To validate Edit Data Feed page
	@Step
	public void to_validate_edit_data_feed_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Edit Data Feed']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button Edit Data Feed page
	@Step
	public void to_click_cancel_button_edit_data_feed_page() {
	    
		$(By.xpath("(//input[@value='Cancel'])[3]")).click();
	}
//--------------------------------------------------------------------------------------------------------------------------------------
	
	
	//To Test Admin menu in processed Files in Data Feeds in Data Loading Option
	
	//To click processed Files in List Data Feeds page
	@Step
	public void to_click_processed_files_in_list_data_feeds_page() throws InterruptedException {
		Thread.sleep(2000);
	   $(By.xpath("//input[@value='Processed Files']")).click();
	}

	//To select Arrow option under data feed name in List Processed Data Feed Files page
	@Step
	public void to_select_arrow_option_under_data_feed_name_in_list_processed_data_feed_files_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='image'])[2]")).click();
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='image'])[5]")).click();
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='image'])[8]")).click();
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='image'])[11]")).click();
	}

	//To click cancel button in List Processed Data Feed Files page
	@Step
	public void to_click_cancel_button_in_list_processed_data_feed_files_page() {
	    
		$(By.xpath("(//input[@value='Cancel'])[2]")).click();
	}
	
	
	
}
