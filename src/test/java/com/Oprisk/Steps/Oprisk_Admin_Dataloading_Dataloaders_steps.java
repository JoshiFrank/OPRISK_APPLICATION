package com.Oprisk.Steps;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Admin_Dataloading_Dataloaders_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Admin_Dataloading_Dataloaders_steps {
	
	
	@Managed
	WebDriver driver;
	
	@Steps
	Oprisk_Admin_Dataloading_Dataloaders_pages dlp;

	@When("To mouse hover to Data Loading Option")
	public void to_mouse_hover_to_data_loading_option() throws InterruptedException {
	    dlp.to_mouse_hover_to_data_loading_option();
	}

	@When("To click Data Loaders in Data Loading Option")
	public void to_click_data_loaders_in_data_loading_option() {
	   dlp.to_click_data_loaders_in_data_loading_option(); 
	}

	@Then("To validate Data Loaders page")
	public void to_validate_data_loaders_page() throws InterruptedException {
	    dlp.to_validate_data_loaders_page();
	}

	@When("To Select dropdown in Data Loader option in Data Loaders page")
	public void to_select_dropdown_in_data_loader_option_in_data_loaders_page() {
	  dlp.to_select_dropdown_in_data_loader_option_in_data_loaders_page();  
	}

	@When("To Select dropdown in Load Type option in Data Loaders page")
	public void to_select_dropdown_in_load_type_option_in_data_loaders_page() {
	   dlp.to_select_dropdown_in_load_type_option_in_data_loaders_page(); 
	}

	@When("To click choose file to upload file in Data Loaders page")
	public void to_click_choose_file_to_upload_file_in_data_loaders_page() throws InterruptedException {
	    dlp.to_click_choose_file_to_upload_file_in_data_loaders_page();
	}

	@When("To click upload button in Data Loaders page")
	public void to_click_upload_button_in_data_loaders_page() {
	   dlp.to_click_upload_button_in_data_loaders_page();
	}

	@Then("To validate Library Data Loader page")
	public void to_validate_library_data_loader_page() throws InterruptedException {
	   dlp.to_validate_library_data_loader_page(); 
	}

	@When("To click here link in Library Data Loader page")
	public void to_click_here_link_in_library_data_loader_page() {
	   dlp.to_click_here_link_in_library_data_loader_page(); 
	}

	@Then("To validate List Processed Data Feed Files page")
	public void to_validate_list_processed_data_feed_files_page() throws InterruptedException {
	   dlp.to_validate_list_processed_data_feed_files_page();
	}

//---------------------------------------------------------------------------------------------------------------------------------------------
	
	// To Test Admin menu Assign Loader Ids Data Loading Option
	
			@When("To click Assign Loader Ids in Data Loading Option")
			public void to_click_assign_loader_ids_in_data_loading_option() throws InterruptedException {
			   dlp.to_click_assign_loader_ids_in_data_loading_option();
			}

			@Then("To validate Assign Loader Ids page")
			public void to_validate_assign_loader_ids_page() throws InterruptedException {
			    dlp.to_validate_assign_loader_ids_page();
			}

			@When("To Select dropdown in Data Loader option in Assign Loader Ids page")
			public void to_select_dropdown_in_data_loader_option_in_assign_loader_ids_page() {
			   dlp.to_select_dropdown_in_data_loader_option_in_assign_loader_ids_page(); 
			}

			@When("To Select dropdown in Load Type option in Assign Loader Ids page")
			public void to_select_dropdown_in_load_type_option_in_assign_loader_ids_page() throws InterruptedException {
			   dlp.to_select_dropdown_in_load_type_option_in_assign_loader_ids_page(); 
			}

			@When("To click choose file to upload file in Assign Loader Ids page")
			public void to_click_choose_file_to_upload_file_in_assign_loader_ids_page() throws InterruptedException {
			    dlp.to_click_choose_file_to_upload_file_in_assign_loader_ids_page();
			}

			@When("To click upload button in Assign Loader Ids page")
			public void to_click_upload_button_in_assign_loader_ids_page() throws InterruptedException {
			    dlp.to_click_upload_button_in_assign_loader_ids_page();
			}

			@When("To click here link in Assign Loader Ids page")
			public void to_click_here_link_in_assign_loader_ids_page() throws InterruptedException {
			    dlp.to_click_here_link_in_assign_loader_ids_page();
			}
//---------------------------------------------------------------------------------------------------------------------------------------------
		
			// To Test Admin menu Manage import files Data Loading Option
			
			@When("To click Manage import files in Data Loading Option")
			public void to_click_manage_import_files_in_data_loading_option() throws InterruptedException {
				
				dlp.to_click_manage_import_files_in_data_loading_option();
			}

			@Then("To validate Imported Metrics page")
			public void to_validate_imported_metrics_page() throws InterruptedException {
			   dlp.to_validate_imported_metrics_page();
			}

			@When("To click cancel button in Imported Metrics page")
			public void to_click_cancel_button_in_imported_metrics_page() throws InterruptedException {
			   dlp.to_click_cancel_button_in_imported_metrics_page(); 
			}
//---------------------------------------------------------------------------------------------------------------------------------------------------------
			
			//To Test Admin menu Indicator value loader Data Loading Option
			
			@When("To click Indicator value loader in Data Loading Option")
			public void to_click_indicator_value_loader_in_data_loading_option() throws InterruptedException {
			 
				dlp.to_click_indicator_value_loader_in_data_loading_option();
				
			}

			@Then("To validate Indicator Value Loader page")
			public void to_validate_indicator_value_loader_page() throws InterruptedException {
			    dlp.to_validate_indicator_value_loader_page();
			}

			@When("To select dropdown feeder system option in Indicator Value Loader page")
			public void to_select_dropdown_feeder_system_option_in_indicator_value_loader_page() throws InterruptedException {
			    dlp.to_select_dropdown_feeder_system_option_in_indicator_value_loader_page();
			}

			@When("To click choose file in Indicator Value Loader page")
			public void to_click_choose_file_in_indicator_value_loader_page() throws InterruptedException {
			    dlp.to_click_choose_file_in_indicator_value_loader_page();
			}

			@When("To click save button in Indicator Value Loader page")
			public void to_click_save_button_in_indicator_value_loader_page() throws InterruptedException {
			    dlp.to_click_save_button_in_indicator_value_loader_page();
			}

			@When("To click cancel button in Indicator Value Loader page")
			public void to_click_cancel_button_in_indicator_value_loader_page() throws InterruptedException {
			    dlp.to_click_cancel_button_in_indicator_value_loader_page();
			}
			
	
}
