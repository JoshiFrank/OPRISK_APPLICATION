package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_RiskFramework_Indicatorstatements_pages extends PageObject {

	//To click the Indicator Statements in Risk Framework option
	@Step
	public void to_click_the_indicator_statements_in_risk_framework_option() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Indicator Statements']")).click();
	}

	//To validate the List Indicator Statements page
	@Step
	public void to_validate_the_list_indicator_statements_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='List Indicator Statements']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click the New Standard Statement button in List Indicator Statements page
	@Step
	public void to_click_the_new_standard_statement_button_in_list_indicator_statements_page() {
		$(By.xpath("//input[@value='New Standard Statement']")).click();
	}

	//To validate the Add Indicator Statement page
	@Step
	public void to_validate_the_add_indicator_statement_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Add Indicator Statement']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To Enter the value in title in Add Indicator Statement page
	@Step
	public void to_enter_the_value_in_title_in_add_indicator_statement_page() {
		$(By.xpath("(//input[@type='text'])[1]")).sendKeys("test");
	}

	//To Enter the value in Description in Add Indicator Statement page
	@Step
	public void to_enter_the_value_in_description_in_add_indicator_statement_page() {
		$(By.xpath("(//textarea[@class='bodyText'])[1]")).sendKeys("test");
	}

	//To Enter the value in Introduction Title Text in Add Indicator Statement page
	@Step
	public void to_enter_the_value_in_introduction_title_text_in_add_indicator_statement_page() {
		$(By.xpath("(//textarea[@class='bodyText'])[2]")).sendKeys("test");
	}

	//To Enter the value in Appendix Title Text in Add Indicator Statement page
	@Step
	public void to_enter_the_value_in_appendix_title_text_in_add_indicator_statement_page() {
		$(By.xpath("(//textarea[@class='bodyText'])[3]")).sendKeys("test");
	}

	//To Select dropdown in Periodicity option in Add Indicator Statement page
	@Step
	public void to_select_dropdown_in_periodicity_option_in_add_indicator_statement_page() {
		$(By.xpath("(//select[@class='bodyText'])[2]")).selectByVisibleText("Daily");
	}

	//To click the Save button in Add Indicator Statement page
	@Step
	public void to_click_the_save_button_in_add_indicator_statement_page() {
		$(By.xpath("//input[@value='Save']")).click();
	}

	//To validate Edit Indicator Statement page
	@Step
	public void to_validate_edit_indicator_statement_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Edit Indicator Statement']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To Enter value in sub heading name in Edit Indicator Statement page
	@Step
	public void to_enter_value_in_sub_heading_name_in_edit_indicator_statement_page() {
		$(By.xpath("(//input[@type='text'])[3]")).sendKeys("test");
	}

	//To click the Save button in Edit Indicator Statement page
	@Step
	public void to_click_the_save_button_in_edit_indicator_statement_page() {
		
		$(By.xpath("//input[@value='Save']")).click();
	}

	//To click the cancel button in Edit Indicator Statement page
	@Step
	public void to_click_the_cancel_button_in_edit_indicator_statement_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@value='Cancel'])[3]")).click();
	}

	//To validate result in List Indicator Statements
	@Step
	public void to_validate_result_in_list_indicator_statements() throws InterruptedException {
		Thread.sleep(2000);
		
		boolean displayed = $(By.xpath("//h1[text()='List Indicator Statements']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}
	
	
//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	// To Test Admin menu Indicator Statements New Dimension Statement in Risk Framework option
	
		//To click the New Dimension Statement button in List Indicator Statements page
	    @Step
		public void to_click_the_new_dimension_statement_button_in_list_indicator_statements_page() throws InterruptedException {
	    	Thread.sleep(2000);
		    $(By.xpath("//input[@value='New Dimension Statement']")).click();
		}

		//To validate the Select Statement Dimension Type page
	    @Step
		public void to_validate_the_select_statement_dimension_type_page() throws InterruptedException {
	    	Thread.sleep(2000);
		   boolean displayed = $(By.xpath("//h1[text()='Select Statement Dimension Type']")).isDisplayed();
		   Assert.assertTrue(displayed);
		}

		//To click radio button in organisation unit in Select Statement Dimension Type page
	    @Step
		public void to_click_radio_button_in_organisation_unit_in_select_statement_dimension_type_page() {
		   $(By.xpath("//input[@type='radio']")).click();
		}

		//To click the proceed button in Select Statement Dimension Type page
	    @Step
		public void to_click_the_proceed_button_in_select_statement_dimension_type_page() {
		    $(By.xpath("//input[@value='Proceed']")).click();
		}

		//To validate the Add Organisation Unit Statement page
	    @Step
		public void to_validate_the_add_organisation_unit_statement_page() throws InterruptedException {
	    	Thread.sleep(2000);
		    boolean displayed = $(By.xpath("//h1[text()='Add Organisation Unit Statement']")).isDisplayed();
		    Assert.assertTrue(displayed);
		}

		//To Enter the value in title in Add Organisation Unit Statement page
	    @Step
		public void to_enter_the_value_in_title_in_add_organisation_unit_statement_page() {
	    	$(By.xpath("(//input[@type='text'])[1]")).sendKeys("test");
		}

		//To Enter the value in Description in Add Organisation Unit Statement page
	    @Step
		public void to_enter_the_value_in_description_in_add_organisation_unit_statement_page() {
	    	$(By.xpath("(//textarea[@class='bodyText'])[1]")).sendKeys("test");
		}

		//To Enter the value in Introduction Title Text in Add Organisation Unit Statement page
	    @Step
		public void to_enter_the_value_in_introduction_title_text_in_add_organisation_unit_statement_page() {
	    	$(By.xpath("(//textarea[@class='bodyText'])[2]")).sendKeys("test");
		}

		//To Enter the value in Appendix Title Text in Add Organisation Unit Statement page
	    @Step
		public void to_enter_the_value_in_appendix_title_text_in_add_organisation_unit_statement_page() {
	    	$(By.xpath("(//textarea[@class='bodyText'])[3]")).sendKeys("test");
		}

		//To Select dropdown in Periodicity option in Add Organisation Unit Statement page
	    @Step
		public void to_select_dropdown_in_periodicity_option_in_add_organisation_unit_statement_page() {
	    	$(By.xpath("(//select[@class='bodyText'])[2]")).selectByVisibleText("Daily");
		}

		//To click the Save button in Add Organisation Unit Statement page
	    @Step
		public void to_click_the_save_button_in_add_organisation_unit_statement_page() {
		    $(By.xpath("//input[@value='Save']")).click();
		}

		//To validate Edit Indicator Statement page with sub heading
	    @Step
		public void to_validate_edit_indicator_statement_page_with_sub_heading() throws InterruptedException {
	    	Thread.sleep(2000);
		    boolean displayed = $(By.xpath("//h1[text()='Edit Indicator Statement']")).isDisplayed();
		    Assert.assertTrue(displayed);
		    
		    String text = $(By.xpath("//span[text()='AFREXIMBANK']")).getText();
		    System.out.println(text);
		    
		}

		//To click the cancel button in Edit Indicator Statement page with sub heading
	    @Step
		public void to_click_the_cancel_button_in_edit_indicator_statement_page_with_sub_heading() throws InterruptedException {
	    	Thread.sleep(2000);
	    	$(By.xpath("(//input[@value='Cancel'])[3]")).click();
	    	
		}
	
//----------------------------------------------------------------------------------------------------------------------------------------------
	    
	  //To Test Admin menu Indicator Statements New Register Statement in Risk Framework option
		
		//To click the New Register Statement button in List Indicator Statements page
	    @Step
		public void to_click_the_new_register_statement_button_in_list_indicator_statements_page() {
		    $(By.xpath("//input[@value='New Register Statement']")).click();
		}

		//To validate Select Indicator Register Heading page
	    @Step
		public void to_validate_select_indicator_register_heading_page() throws InterruptedException {
	    	Thread.sleep(2000);
		   boolean displayed = $(By.xpath("//h1[text()='Select Indicator Register Heading']")).isDisplayed();
		   Assert.assertTrue(displayed);
		}

		//To click radio button in Indicator Library in Select Indicator Register Heading page
	    @Step
		public void to_click_radio_button_in_indicator_library_in_select_indicator_register_heading_page() {
		    $(By.xpath("//input[@type='radio']")).click();
		}

		//To click Save button in Select Indicator Register Heading page
	    @Step
		public void to_click_save_button_in_select_indicator_register_heading_page() {
		    $(By.xpath("//input[@value='Save']")).click();
		}

		//To validate Add Indicator Library Statement page
	    @Step
		public void to_validate_add_indicator_library_statement_page() throws InterruptedException {
	    	Thread.sleep(2000);
		    boolean displayed = $(By.xpath("//h1[text()='Add Indicator Library Statement']")).isDisplayed();
		    Assert.assertTrue(displayed);
		}

		//To Enter the value in title in Add Indicator Library Statement page
	    @Step
		public void to_enter_the_value_in_title_in_add_indicator_library_statement_page() {
	    	$(By.xpath("(//input[@type='text'])[1]")).sendKeys("test");
		}

		//To Enter the value in Description in Add Indicator Library Statement page
	    @Step
		public void to_enter_the_value_in_description_in_add_indicator_library_statement_page() {
	    	$(By.xpath("(//textarea[@class='bodyText'])[1]")).sendKeys("test");
		}

		//To Enter the value in Introduction Title Text in Add Indicator Library Statement page
	    @Step
		public void to_enter_the_value_in_introduction_title_text_in_add_indicator_library_statement_page() {
	    	$(By.xpath("(//textarea[@class='bodyText'])[2]")).sendKeys("test");
		}

		//To Enter the value in Appendix Title Text in Add Indicator Library Statement page
	    @Step
		public void to_enter_the_value_in_appendix_title_text_in_add_indicator_library_statement_page() {
	    	$(By.xpath("(//textarea[@class='bodyText'])[3]")).sendKeys("test");
		}

		//To Select dropdown in Periodicity option in Add Indicator Library Statement page
	    @Step
		public void to_select_dropdown_in_periodicity_option_in_add_indicator_library_statement_page() {
	    	$(By.xpath("(//select[@class='bodyText'])[2]")).selectByVisibleText("Daily");
		}

		//To click the Save button in Add Indicator Library Statement page
	    @Step
		public void to_click_the_save_button_in_add_indicator_library_statement_page() throws InterruptedException {
	    	  $(By.xpath("//input[@value='Save']")).click();
	    	  Thread.sleep(2000);
		}

		//To click the cancel button in Edit Indicator Statement page with sub heading name
	    @Step
		public void to_click_the_cancel_button_in_edit_indicator_statement_page_with_sub_heading_name() throws InterruptedException {
	    	
	    	$(By.xpath("(//input[@value='Cancel'])[3]"));
		 Thread.sleep(4000);
		 
		 
		}
	   
	    
	    
	
}
