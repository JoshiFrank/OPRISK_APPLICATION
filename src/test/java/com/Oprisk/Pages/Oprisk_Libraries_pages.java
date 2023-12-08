package com.Oprisk.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Libraries_pages extends PageObject{

	
	

	//To mouse hover to Libraries
	@Step
	public void to_mouse_hover_to_libraries() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Libraries']")).click();
	    
	}

	//To click the Risk option in Libraries
	@Step
	public void to_click_the_risk_option_in_libraries() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Risk']")).click();
	    
	}

	//To validate the Maintain Risk register page
	@Step
	public void to_validate_the_maintain_risk_register_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Maintain Risk Register']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}
	//To print the Group wide risk name in Maintain Risk register page
	@Step
	public void to_print_the_group_wide_risk_name_in_maintain_risk_register_page() throws InterruptedException {

		
		List<WebElement> findElements = getDriver().findElements(By.xpath("//span[@class='list-entity-risk-icon']//a"));
		
		for (int i = 0; i <findElements.size() ; i++) {
			
			WebElement webElement = findElements.get(i);
			
			String text = webElement.getText();
			
			System.out.println(text);
			Thread.sleep(2000);
		}
	}

	//To click the cancel button in Maintain Risk register page
	@Step
	public void to_click_the_cancel_button_in_maintain_risk_register_page() {
	   $(By.xpath("(//input[@value='Cancel'])[2]")).click();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	
	//To Test the Control fuction in Libraries
	
	//To Click the control option in Libraries
	@Step
	public void to_click_the_control_option_in_libraries() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("//a[text()='Control']")).click();
		
	    
	}

	//To validate the maintain control register page
	@Step
	public void to_validate_the_maintain_control_register_page() throws InterruptedException {
		Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='Maintain Control Register']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To click the Risk icon in maintain control register page
	@Step
	public void to_click_the_risk_icon_in_maintain_control_register_page() throws InterruptedException  {
		Thread.sleep(2000);
	    $(By.xpath("(//img[@title='Expand'])[26]")).click();
	}

	//To click the Risk management Down Arrow button
	@Step
	public void to_click_the_risk_management_down_arrow_button() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("(//span[@class='tree-hover-icon'])[30]")).click();
	}

	//To Click the Add Groupwide control option
	@Step
	public void to_click_the_add_groupwide_control_option() {
		
		$(By.xpath("//span[text()='Add Groupwide Control']")).click();
	    
	}

	//To validate the Add Groupwide control page
	@Step
	public void to_validate_the_add_groupwide_control_page() throws InterruptedException {
		Thread.sleep(4000);
		boolean displayed = $(By.xpath("//h1[text()='Add Groupwide Control']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To Enter value in Groupwide control name in New Groupwide control
	@Step
	public void to_enter_value_in_groupwide_control_name_in_new_groupwide_control() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("(//input[@type='text'])[1]")).sendKeys("OneSum");
	}

	//To Enter value in External reference in New Groupwide control
	@Step
	public void to_enter_value_in_external_reference_in_new_groupwide_control() {
	    $(By.xpath("(//input[@type='text'])[3]")).sendKeys("test");
	}

	//To Enter value in Control Description in New Groupwide control
	@Step
	public void to_enter_value_in_control_description_in_new_groupwide_control() {
	   $(By.xpath("(//textarea[@class='bodyText'])[1]")).sendKeys("test");
	}

	//To Enter value in Control Text in New Groupwide control
	@Step
	public void to_enter_value_in_control_text_in_new_groupwide_control() {
      $(By.xpath("(//textarea[@class='bodyText'])[2]")).sendKeys("test");

	}

	//To select the Dropdown in Control Category New Groupwide control
	@Step
	public void to_select_the_dropdown_in_control_category_new_groupwide_control() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("(//a[@class='chosen-single'])[1]")).click();
	    Thread.sleep(2000);
	    $(By.xpath("//li[text()='Preventative Manual']")).click();
	    
	}

	//To select the Dropdown in Control Classification New Groupwide control
	@Step
	public void to_select_the_dropdown_in_control_classification_new_groupwide_control() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//a[@class='chosen-single'])[2]")).click();
		Thread.sleep(2000);
		$(By.xpath("//li[text()='Key']")).click();
	}

	//To select the Dropdown in Frequency in New Groupwide control
	@Step
	public void to_select_the_dropdown_in_frequency_in_new_groupwide_control() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//a[@class='chosen-single'])[3]")).click();
		Thread.sleep(2000);
		$(By.xpath("//li[text()='Annually']")).click();
	}

	//To select the Dropdown in Start Month in New Groupwide control
	@Step
	public void to_select_the_dropdown_in_start_month_in_new_groupwide_control() throws AWTException, InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//span[text()='Select An Option']")).click();
	    Thread.sleep(2000);
	    
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    
	    $(By.xpath("//li[text()='November']")).click();
	}

	//To click the Save button in New Groupwide control
	@Step
	public void to_click_the_save_button_in_new_groupwide_control() throws InterruptedException {
		Thread.sleep(2000);
		
		$(By.xpath("//input[@value='Save']")).click();
	    
	}

	//To Validate Edit Groupwild control page
	@Step
	public void to_validate_edit_groupwild_control_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Edit Groupwide Control']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To Enter the loader id in Edit Groupwild control page
	@Step
	public void to_enter_the_loader_id_in_edit_groupwild_control_page() throws InterruptedException {
		Thread.sleep(2000);
		$(By.xpath("(//input[@type='text'])[8]")).sendKeys("test1");
	    
	}

	//To select the Dropdown in Source System in Edit Groupwild control page
	@Step
	public void to_select_the_dropdown_in_source_system_in_edit_groupwild_control_page() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		
		   Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_PAGE_DOWN);
		    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		   
	    $(By.xpath("(//a[@class='chosen-single'])[5]")).click();
	    
	    Thread.sleep(2000);
	    
	    $(By.xpath("//li[text()='OneSumX']")).click();
	}

	//To click the Save button in Edit Groupwild control page
	@Step
	public void to_click_the_save_button_in_edit_groupwild_control_page() throws InterruptedException {
		Thread.sleep(2000);
		
		$(By.xpath("//input[@value='Save']")).click();
	}

	
	
	
}
