package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Control_controlsignoff_page extends PageObject {

	//To mouse hover to Control
	@Step
	public void to_mouse_hover_to_control() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Controls']")).click();
	}

	//To click the control signoff option
	@Step
	public void to_click_the_control_signoff_option() {
		$(By.xpath("(//a[text()='Control Signoff'])[1]")).click();
	    
	}

	//To validate the list control signoff page
	@Step
	public void to_validate_the_list_control_signoff_page() throws InterruptedException {
		Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='List Control Signoff']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To click Show check box in list control signoff page
	@Step
	public void to_click_show_check_box_in_list_control_signoff_page() {
	    $(By.xpath("//*[local-name()='label'][@class='chbox_label']")).click();
	    
	}

	//To click the strategy and innovation link in list control signoff page
	@Step
	public void to_click_the_strategy_and_innovation_link_in_list_control_signoff_page() throws InterruptedException {
		Thread.sleep(2000);
	   $(By.xpath("(//a[text()='Strategy & Innovation (STIN)'])[1]")).click();
	}

	//To validate the control signoff page
	@Step
	public void to_validate_the_control_signoff_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Control Signoff']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the Proceed To Approval in control signoff page
	@Step
	public void to_click_the_proceed_to_approval_in_control_signoff_page() {
		$(By.xpath("//input[@value='Proceed To Approval']")).click();
	   
	}

	//To validate the control signoff approval page
	@Step
	public void to_validate_the_control_signoff_approval_page() throws InterruptedException {
		Thread.sleep(2000);
		boolean displayed = $(By.xpath("//h1[text()='Control Signoff Approval']")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click the arrow button in Business Manager Approval Text in control signoff approval page
	@Step
	public void to_click_the_arrow_button_in_business_manager_approval_text_in_control_signoff_approval_page() {
	    $(By.xpath("//input[@type='image']")).click();
	}

	
	
}
