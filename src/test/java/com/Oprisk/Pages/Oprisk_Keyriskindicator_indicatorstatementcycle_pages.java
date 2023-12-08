package com.Oprisk.Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Keyriskindicator_indicatorstatementcycle_pages extends PageObject {

	//To Click the Indicator Statement cycle
	@Step
	public void to_click_the_indicator_statement_cycle() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("(//a[text()='Indicator Statement Cycles'])[1]")).click();
	}

	//To validate the Indicator Statement cycle page
	@Step
	public void to_validate_the_indicator_statement_cycle_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Indicator Statement Cycles']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Select dropdown in All option in Indicator Statement cycle page
	@Step
	public void to_select_dropdown_in_all_option_in_indicator_statement_cycle_page() {
	    $(By.xpath("//a[@class='chosen-single']")).click();
	    
	    $(By.xpath("//li[text()='Statement']")).click();
	    
	    for (int i = 1; i <=12; i++) {
	    	
	    	WebElement findElement = getDriver().findElement(By.xpath("//ul[@class='chosen-results']/li["+i+"]"));
	    	String text = findElement.getText();
	    	System.out.println(text);
			
		}
	    
	    
	    
	}
	
	
	

	//To click the Add new button in Indicator Statement cycle page
	@Step
	public void to_click_the_add_new_button_in_indicator_statement_cycle_page() {
	    $(By.xpath("//input[@value='Add New']")).click();
	}

	//To validate Initiate Indicator Statement Cycle page
	@Step
	public void to_validate_initiate_indicator_statement_cycle_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Initiate Indicator Statement Cycle']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}
}
