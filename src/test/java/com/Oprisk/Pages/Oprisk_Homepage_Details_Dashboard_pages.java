package com.Oprisk.Pages;

import java.awt.AWTException;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepage_Details_Dashboard_pages extends PageObject {

	// To click Dashboard option
		@Step
		public void to_click_dashboard_option() {
			
			$(By.xpath("(//input[@type='submit'])[8]")).click();

		}

		// To validate dashboard options
		@Step
		public void to_validate_dashboard_options() {
			
			boolean displayed = $(By.xpath("//table[@id='ctl00_content_NewDashboard_rdoOptions']/child::tbody")).isDisplayed();
			System.out.println(displayed);

		}

		// To click Create a new dashboard
		@Step
		public void to_click_create_a_new_dashboard() {
			
			$(By.xpath("(//input[@type='radio'])[1]")).click();

		}

		// To click Next button
		@Step
		public void to_click_next_button() {
			
			$(By.xpath("(//input[@type='submit'])[2]")).click();
			

		}

		// To validate dashboard layout page
		@Step
		public void to_validate_dashboard_layout_page() throws InterruptedException, AWTException {
			
			$(By.xpath("//table[@id='ctl00_content_NewDashboard_rdoLayouts']")).isDisplayed();
			Thread.sleep(3000);
			
			$(By.xpath("//input[@type='text']")).type("new dashboard");
			$(By.xpath("(//input[@type='radio'])[5]")).click();
			$(By.xpath("(//input[@type='submit'])[3]")).click();
			Thread.sleep(3000);
			
			
			$(By.xpath("(//span[text()='here'])[1]")).click();
			Thread.sleep(3000);
			
			
			getDriver().switchTo().frame("iframe-content");
			
		
			
			
			$(By.id("txtPTitle")).sendKeys("New");
			
			
			
			$(By.id("btnSave")).click();
			Thread.sleep(3000);
			
			getDriver().switchTo().defaultContent();
			
			Thread.sleep(2000);
			$(By.id("ctl00_btnDelete")).click();
			Thread.sleep(2000);
			
			$(By.xpath("//button[text()='OK']")).click();
			Thread.sleep(2000);
			
			
			$(By.name("ctl00$btnCancel")).click();
			Thread.sleep(2000);
			
			

		}

		// Navigate to back
		@Step
		public void navigate_to_back() {
			
			getDriver().navigate().back();

		}

		// To click Cancel button
		@Step
		public void to_click_cancel_button() {
			
			$(By.xpath("(//input[@value='Cancel'])[2]")).click();

		}

		// To validate Workspace
		@Step
		public void to_validate_workspace() {
			
			$(By.xpath("//h1[text()='Workspace']")).isDisplayed();

		}
}