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

public class Oprisk_Libraries_Indicator_pages extends PageObject {

	//To Click the indicator option in Libraries
	@Step
	public void to_click_the_indicator_option_in_libraries() throws InterruptedException {
	   Thread.sleep(2000);
		$(By.xpath("//a[text()='Indicator']")).click();
	}

	//To validate the Maintain indicator register page
	@Step
	public void to_validate_the_maintain_indicator_register_page() throws InterruptedException {
		 Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Maintain Indicator Register']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click  Down arrow button in Operational Risk Indicators related to Clients Products and Business Practices Failures
	@Step
	public void to_click_down_arrow_button_in_operational_risk_indicators_related_to_clients_products_and_business_practices_failures() {
	   $(By.xpath("(//span[@class='tree-hover-icon'])[2]")).click();
	}

	//To click the Add  headline indicator option
	@Step
	public void to_click_the_add_headline_indicator_option() {
		
		$(By.xpath("//span[text()='Add Headline Indicator']")).click();
	   
	}

	//To Validate Create Headline Indicator  page
	@Step
	public void to_validate_create_headline_indicator_page() throws InterruptedException {
		 Thread.sleep(3000);
	    boolean displayed = $(By.xpath("//h1[text()='Create Headline Indicator - Headline Details - (Step 1)']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Enter value in Headline Indicator Name box in Create Headline Indicator  page
	@Step
	public void to_enter_value_in_headline_indicator_name_box_in_create_headline_indicator_page() {
	    $(By.xpath("(//textarea[@class='bodyText'])[1]")).sendKeys("onesumx");
	}

	//To Enter value in Description box in Create Headline Indicator  page
	@Step
	public void to_enter_value_in_description_box_in_create_headline_indicator_page() {
	   $(By.xpath("(//textarea[@class='bodyText'])[2]")).sendKeys("test");
	}

	//To Enter value in Headline Indicator Reference box in Create Headline Indicator  page
	@Step
	public void to_enter_value_in_headline_indicator_reference_box_in_create_headline_indicator_page() {
	   $(By.xpath("(//input[@type='text'])[2]")).sendKeys("test");
	}

	//To select the dropdown option in Periodicity in Create Headline Indicator  page
	@Step
	public void to_select_the_dropdown_option_in_periodicity_in_create_headline_indicator_page() throws InterruptedException {
	  $(By.xpath("(//select[@class='bodyText'])[1]")).selectByVisibleText("Daily");
	  Thread.sleep(3000);
	  
		
	}

	//To select the dropdown option in Provider in Create Headline Indicator  page
	@Step
	public void to_select_the_dropdown_option_in_provider_in_create_headline_indicator_page() throws InterruptedException {
		  $(By.xpath("(//a[@class='chosen-single'])[1]")).click();
		  Thread.sleep(2000);
		    $(By.xpath("//li[text()='Joshi Franklin']")).click();
	    
	}

	//To select the dropdown option in Approver in Create Headline Indicator  page
	@Step
	public void to_select_the_dropdown_option_in_approver_in_create_headline_indicator_page() throws InterruptedException {
		 $(By.xpath("(//a[@class='chosen-single'])[2]")).click();
		  Thread.sleep(2000);
		    $(By.xpath("(//li[text()='Joshi Franklin'])[2]")).click();
	}

	//To select the dropdown option in Overseer in Create Headline Indicator  page
	@Step
	public void to_select_the_dropdown_option_in_overseer_in_create_headline_indicator_page() throws InterruptedException {
	    
		$(By.xpath("(//a[@class='chosen-single'])[3]")).click();
		  Thread.sleep(2000);
		$(By.xpath("(//li[text()='Joshi Franklin'])[3]")).click();
		
		  Thread.sleep(3000);
		
		
	}

	//To select the dropdown option in Overseer Alter Notification in Create Headline Indicator  page
	@Step
	public void to_select_the_dropdown_option_in_overseer_alter_notification_in_create_headline_indicator_page() throws InterruptedException {
	   $(By.xpath("(//select[@class='bodyText'])[5]")).selectByVisibleText("Greater Than");
	   Thread.sleep(2000);
	   $(By.xpath("(//select[@class='bodyText'])[6]")).selectByVisibleText("Green");
	}

	//To Select the Completion Date in Create Headline Indicator  page
	@Step
	public void to_select_the_completion_date_in_create_headline_indicator_page() {
		$(By.xpath("//input[@type='image']")).click();
		$(By.xpath("(//div[text()='6'])[1]")).click();
	    
	}

	//To select the dropdown option in Collection Method in Create Headline Indicator  page
	@Step
	public void to_select_the_dropdown_option_in_collection_method_in_create_headline_indicator_page() throws InterruptedException {
		$(By.xpath("(//a[@class='chosen-single'])[4]")).click();
		$(By.xpath("//li[text()='Datafeed']")).click();
		Thread.sleep(3000);
	}

	//To Enter value in Data Feed Mnemonic box in Create Headline Indicator  page
	@Step
	public void to_enter_value_in_data_feed_mnemonic_box_in_create_headline_indicator_page() throws InterruptedException {
	    $(By.xpath("(//input[@type='text'])[8]")).sendKeys("test9");
	    Thread.sleep(2000);
	}

	//To select the dropdown option in Aggregation Method in Create Headline Indicator  page
	@Step
	public void to_select_the_dropdown_option_in_aggregation_method_in_create_headline_indicator_page() throws AWTException {
		
		$(By.xpath("(//a[@class='chosen-single'])[5]")).click();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		$(By.xpath("//li[text()='Count']")).click();
	}

	//To click the next button in Create Headline Indicator  page
	@Step
	public void to_click_the_next_button_in_create_headline_indicator_page() throws InterruptedException {
	    $(By.xpath("//input[@value='Next >']")).click();
	    Thread.sleep(3000);
	}

	//To Validate the Select Scoring Method And Define Thresholds page
	@Step
	public void to_validate_the_select_scoring_method_and_define_thresholds_page() throws InterruptedException {
		  Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='Create Headline Indicator - Select Scoring Method And Define Thresholds - (Step 2)']")).isDisplayed();
	
	   Assert.assertTrue(displayed);
	   
	}

	//To select dropdown option in Indicator Scoring Methodology in Select Scoring Method And Define Thresholds page
	@Step
	public void to_select_dropdown_option_in_indicator_scoring_methodology_in_select_scoring_method_and_define_thresholds_page() throws InterruptedException {
	    $(By.xpath("(//select[@class='bodyText'])[9]")).selectByVisibleText("Red\\Amber\\Green\\Amber\\Red");
	    Thread.sleep(2000);
	}

	//To click check box in Inherit Headline Indicator Threshold in Select Scoring Method And Define Thresholds page
	@Step
	public void to_click_check_box_in_inherit_headline_indicator_threshold_in_select_scoring_method_and_define_thresholds_page() throws InterruptedException {
	  $(By.xpath("(//input[@type='checkbox'])[1]")).click();
	  Thread.sleep(2000);
	}

	//To click the next button in Select Scoring Method And Define Thresholds page
	@Step
	public void to_click_the_next_button_in_select_scoring_method_and_define_thresholds_page() {
		$(By.xpath("//input[@value='Next >']")).click();
	}

	//To Validate the Select Dimension Types page
	@Step
	public void to_validate_the_select_dimension_types_page() throws InterruptedException {
		  Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='Create Headline Indicator - Select Dimension Types - (Step 3)']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To click the check box in Dimension Types in Select Dimension Types page
	@Step
	public void to_click_the_check_box_in_dimension_types_in_select_dimension_types_page() {
		 $(By.xpath("(//input[@type='checkbox'])[2]")).click();
	}

	//To click the next button in Select Dimension Types page
	@Step
	public void to_click_the_next_button_in_select_dimension_types_page() {
		$(By.xpath("//input[@value='Next >']")).click();
	}

	//To validate the Select Indicator Dimension Values page
	@Step
	public void to_validate_the_select_indicator_dimension_values_page() throws InterruptedException {
		  Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Create Headline Indicator - Select Indicator Dimension Values - (Step 4)']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the Arrow button in office of the President in Select Indicator Dimension Values page
	@Step
	public void to_click_the_arrow_button_in_office_of_the_president_in_select_indicator_dimension_values_page() {
	   $(By.xpath("//img[@title='Expand Office of the President']")).click();
	}

	//To click the Arrow button the President in Select Indicator Dimension Values page
	@Step
	public void to_click_the_arrow_button_the_president_in_select_indicator_dimension_values_page() {
	    $(By.xpath("//img[@title='Expand The President']")).click();
	}

	//To click the check box in Risk management option in Select Indicator Dimension Values page
	@Step
	public void to_click_the_check_box_in_risk_management_option_in_select_indicator_dimension_values_page() {
	    $(By.xpath("(//input[@type='checkbox'])[55]")).click();
	}

	//To click the next button in Select Indicator Dimension Values page
	@Step
	public void to_click_the_next_button_in_select_indicator_dimension_values_page() {
		$(By.xpath("//input[@value='Next >']")).click();
	    
	}

	//To validate the Review Indicators page
	@Step
	public void to_validate_the_review_indicators_page() throws InterruptedException {
		  Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Create Headline Indicator - Review Indicators - (Step 5)']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click the save button in Review Indicators page
	@Step
	public void to_click_the_save_button_in_review_indicators_page() {
		$(By.xpath("//input[@value='Save']")).click();
	   
	}

	//To validate the Edit headline indicator page
	@Step
	public void to_validate_the_edit_headline_indicator_page() throws InterruptedException {
		  Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Edit Headline Indicator']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click the check box in onesum Edit headline indicator page
	@Step
	public void to_click_the_check_box_in_onesum_edit_headline_indicator_page() throws InterruptedException {
		  Thread.sleep(2000);
		$(By.xpath("(//input[@type='checkbox'])[4]")).click();
	    
	}

	//to click the save button in Edit headline indicator page
	@Step
	public void to_click_the_save_button_in_edit_headline_indicator_page() {
		$(By.xpath("(//input[@value='Save'])[2]")).click();
	}
	
	
	
	
}
