package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Dataloading_Datafeed_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Dataloading_Datafeed_steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Dataloading_Datafeed_pages dfd;

   // To Test Admin menu in Add Data Feed in Data Feeds in Data Loading Option	
	
	@When("To click Data Feeds in Data Loading Option")
	public void to_click_data_feeds_in_data_loading_option() throws InterruptedException {
	   dfd.to_click_data_feeds_in_data_loading_option();
	}

	@Then("To validate List Data Feeds page")
	public void to_validate_list_data_feeds_page() throws InterruptedException {
	  dfd.to_validate_list_data_feeds_page();  
	}

	@When("To click Add data feed in List Data Feeds page")
	public void to_click_add_data_feed_in_list_data_feeds_page() {
	   dfd.to_click_add_data_feed_in_list_data_feeds_page(); 
	}

	@Then("To validate Add Data Feed page")
	public void to_validate_add_data_feed_page() throws InterruptedException {
	    dfd.to_validate_add_data_feed_page();
	}

	@When("To select dropdown in Data Feed Type option in Add Data Feed page")
	public void to_select_dropdown_in_data_feed_type_option_in_add_data_feed_page() throws InterruptedException {
	    dfd.to_select_dropdown_in_data_feed_type_option_in_add_data_feed_page();
	}

	@When("To Enter value in Data Feed Code box in Data Feed Code")
	public void to_enter_value_in_data_feed_code_box_in_data_feed_code() throws InterruptedException {
	    dfd.to_enter_value_in_data_feed_code_box_in_data_feed_code();
	}

	@When("To Enter value in Data Feed Name box in Data Feed Code")
	public void to_enter_value_in_data_feed_name_box_in_data_feed_code() throws InterruptedException {
	    dfd.to_enter_value_in_data_feed_name_box_in_data_feed_code();
	}

	@When("To Enter value in Data Feed Description box in Data Feed Code")
	public void to_enter_value_in_data_feed_description_box_in_data_feed_code() throws InterruptedException {
	   dfd.to_enter_value_in_data_feed_description_box_in_data_feed_code();
	}

	@When("To select dropdown in Data Feed Owner option in Add Data Feed page")
	public void to_select_dropdown_in_data_feed_owner_option_in_add_data_feed_page() throws InterruptedException {
	    dfd.to_select_dropdown_in_data_feed_owner_option_in_add_data_feed_page();
	}

	@When("To select dropdown in Source System option in Add Data Feed page")
	public void to_select_dropdown_in_source_system_option_in_add_data_feed_page() throws InterruptedException {
	    dfd.to_select_dropdown_in_source_system_option_in_add_data_feed_page();
	}

	@When("To click check box in Call Method in Add Data Feed page")
	public void to_click_check_box_in_call_method_in_add_data_feed_page() {
	    dfd.to_click_check_box_in_call_method_in_add_data_feed_page();
	}

	@When("To Enter value in Upload File Sub Folder box in Add Data Feed page")
	public void to_enter_value_in_upload_file_sub_folder_box_in_add_data_feed_page() {
	    dfd.to_enter_value_in_upload_file_sub_folder_box_in_add_data_feed_page();
	}

	@When("To click choose file upload in Add Data Feed page")
	public void to_click_choose_file_upload_in_add_data_feed_page() throws InterruptedException {
	    dfd.to_click_choose_file_upload_in_add_data_feed_page();
	}

	@When("To click radio button in Loader Mode in Add Data Feed page")
	public void to_click_radio_button_in_loader_mode_in_add_data_feed_page() throws InterruptedException {
	    dfd.to_click_radio_button_in_loader_mode_in_add_data_feed_page();
	}

	@When("To click radio button in Email Notifications in Add Data Feed page")
	public void to_click_radio_button_in_email_notifications_in_add_data_feed_page() {
	   dfd.to_click_radio_button_in_email_notifications_in_add_data_feed_page();
	}

	@When("To Enter value in Notes box in Add Data Feed page")
	public void to_enter_value_in_notes_box_in_add_data_feed_page() throws InterruptedException {
	  dfd.to_enter_value_in_notes_box_in_add_data_feed_page();  
	}

	@When("To click Save button in Add Data Feed page")
	public void to_click_save_button_in_add_data_feed_page() {
	    dfd.to_click_save_button_in_add_data_feed_page();
	}

	@Then("To validate Edit Data Feed page")
	public void to_validate_edit_data_feed_page() throws InterruptedException {
	    dfd.to_validate_edit_data_feed_page();
	}

	@When("To click cancel button Edit Data Feed page")
	public void to_click_cancel_button_edit_data_feed_page() {
	    dfd.to_click_cancel_button_edit_data_feed_page();
	}
//------------------------------------------------------------------------------------------------------------------------------------------	
	
	//To Test Admin menu in processed Files in Data Feeds in Data Loading Option
	
	@When("To click processed Files in List Data Feeds page")
	public void to_click_processed_files_in_list_data_feeds_page() throws InterruptedException {
	   dfd.to_click_processed_files_in_list_data_feeds_page();
	}

	@When("To select Arrow option under data feed name in List Processed Data Feed Files page")
	public void to_select_arrow_option_under_data_feed_name_in_list_processed_data_feed_files_page() throws InterruptedException {
	   dfd.to_select_arrow_option_under_data_feed_name_in_list_processed_data_feed_files_page(); 
	}

	@When("To click cancel button in List Processed Data Feed Files page")
	public void to_click_cancel_button_in_list_processed_data_feed_files_page() {
	    dfd.to_click_cancel_button_in_list_processed_data_feed_files_page();
	}

	
}
