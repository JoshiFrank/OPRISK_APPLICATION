package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Dataloading_Dataloaders_pages extends PageObject {

	// To mouse hover to Data Loading Option
	@Step
	public void to_mouse_hover_to_data_loading_option() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Data Loading']")).click();
	}

	// To click Data Loaders in Data Loading Option
	@Step
	public void to_click_data_loaders_in_data_loading_option() {
		$(By.xpath("(//a[text()='Data Loaders'])[1]")).click();
	}

	// To validate Data Loaders page
	@Step
	public void to_validate_data_loaders_page() throws InterruptedException {
		Thread.sleep(4000);
		boolean displayed = $(By.xpath("//h1[text()='Data Loaders']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To Select dropdown in Data Loader option in Data Loaders page
	@Step
	public void to_select_dropdown_in_data_loader_option_in_data_loaders_page() {
		$(By.xpath("(//select[@class='bodyText'])[1]")).selectByVisibleText("Libraries");
	}

	// To Select dropdown in Load Type option in Data Loaders page
	@Step
	public void to_select_dropdown_in_load_type_option_in_data_loaders_page() {
		$(By.xpath("(//select[@class='bodyText'])[2]")).selectByVisibleText("OneSumX - Control Register, Controls");
	}

	// To click choose file to upload file in Data Loaders page
	@Step
	public void to_click_choose_file_to_upload_file_in_data_loaders_page() throws InterruptedException {
		Thread.sleep(4000);

		$(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hp\\Desktop\\CWG folder\\New Text Document.txt");
	}

	// To click upload button in Data Loaders page
	@Step
	public void to_click_upload_button_in_data_loaders_page() {
		$(By.xpath("//input[@value='Upload']")).click();

	}

	// To validate Library Data Loader page
	@Step
	public void to_validate_library_data_loader_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='Library Data Loader']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click here link in Library Data Loader page
	@Step
	public void to_click_here_link_in_library_data_loader_page() {
		$(By.xpath("//a[text()='here']")).click();
	}

	// To validate List Processed Data Feed Files page
	@Step
	public void to_validate_list_processed_data_feed_files_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='List Processed Data Feed Files']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu Assign Loader Ids Data Loading Option

	// To click Assign Loader Ids in Data Loading Option
	@Step
	public void to_click_assign_loader_ids_in_data_loading_option() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//a[text()='Assign Loader Ids'])[1]")).click();
	}

	// To validate Assign Loader Ids page
	@Step
	public void to_validate_assign_loader_ids_page() throws InterruptedException {

		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Assign Loader Ids']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To Select dropdown in Data Loader option in Assign Loader Ids page
	@Step
	public void to_select_dropdown_in_data_loader_option_in_assign_loader_ids_page() {

		$(By.xpath("(//select[@class='bodyText'])[1]")).selectByVisibleText("Libraries");

	}

	// To Select dropdown in Load Type option in Assign Loader Ids page
	@Step
	public void to_select_dropdown_in_load_type_option_in_assign_loader_ids_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("(//select[@class='bodyText'])[2]")).selectByVisibleText("OneSumX - Test Register, Tests");
	}

	// To click choose file to upload file in Assign Loader Ids page
	@Step
	public void to_click_choose_file_to_upload_file_in_assign_loader_ids_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hp\\Desktop\\CWG folder\\New Text Document.txt");
	}

	// To click upload button in Assign Loader Ids page
	@Step
	public void to_click_upload_button_in_assign_loader_ids_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//input[@value='Upload']")).click();
	}

	// To click here link in Assign Loader Ids page
	@Step
	public void to_click_here_link_in_assign_loader_ids_page() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//a[text()='here']")).click();
		Thread.sleep(4000);
	}

//------------------------------------------------------------------------------------------------------------------------------------------------

	// To Test Admin menu Manage import files Data Loading Option

	// To click Manage import files in Data Loading Option
    @Step
	public void to_click_manage_import_files_in_data_loading_option() throws InterruptedException {
    	
    	Thread.sleep(2000);

    	$(By.xpath("//a[text()='Manage Import Files']")).click();
	}

	//To validate Imported Metrics page
    @Step
	public void to_validate_imported_metrics_page() throws InterruptedException {
    	
    	Thread.sleep(2000);

    	boolean displayed = $(By.xpath("//h1[text()='Imported Metrics']")).isDisplayed();
    	Assert.assertTrue(displayed);
    	
    	Thread.sleep(2000);
    	String text = $(By.xpath("//span[text()='There are no Metric Instance Files to be deleted.']")).getText();
    	System.out.println(text);
	}

	//To click cancel button in Imported Metrics page
    @Step
	public void to_click_cancel_button_in_imported_metrics_page() throws InterruptedException {

    	Thread.sleep(2000);
    	$(By.xpath("//input[@value='Cancel']")).click();
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
  //To Test Admin menu Indicator value loader Data Loading Option
	
	//To click Indicator value loader in Data Loading Option
    @Step
	public void to_click_indicator_value_loader_in_data_loading_option() throws InterruptedException {
    	Thread.sleep(2000);
	    $(By.xpath("(//a[text()='Indicator Value Loader'])[1]")).click();
	}

	//To validate Indicator Value Loader page
    @Step
	public void to_validate_indicator_value_loader_page() throws InterruptedException {
    	Thread.sleep(3000);
    	boolean displayed = $(By.xpath("//h1[text()='Indicator Value Loader']")).isDisplayed();
    	Assert.assertTrue(displayed);
	}

	//To select dropdown feeder system option in Indicator Value Loader page
    @Step
	public void to_select_dropdown_feeder_system_option_in_indicator_value_loader_page() throws InterruptedException {
    	Thread.sleep(2000);
    	$(By.xpath("//select[@class='bodyText']")).selectByVisibleText("Internal ARCLogics Data Feed");
	}

	//To click choose file in Indicator Value Loader page
    @Step
	public void to_click_choose_file_in_indicator_value_loader_page() throws InterruptedException {
    	Thread.sleep(3000);
    	$(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hp\\Desktop\\CWG folder\\New Text Document.txt");
	}

	//To click save button in Indicator Value Loader page
    @Step
	public void to_click_save_button_in_indicator_value_loader_page() throws InterruptedException {
    	Thread.sleep(3000);
    	$(By.xpath("//input[@value='Save']")).click();
	}

	//To click cancel button in Indicator Value Loader page
    @Step
	public void to_click_cancel_button_in_indicator_value_loader_page() throws InterruptedException {
    	Thread.sleep(3000);
    	$(By.xpath("//input[@value='Cancel']")).click();
	}
	
    
    
    
    
    
}
