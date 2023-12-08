package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepage_Details_pages extends PageObject {
	
	
	// To click Details option in Login dropdown
		@Step
		public void to_click_details_option_in_login_dropdown() {

			$(By.xpath("//a[text()='Details']")).click();

		}

		// To validate Personal Details page
		@Step
		public void to_validate_personal_details_page() {
			$(By.xpath("//h1[text()='Person Details']")).isDisplayed();
		}

		// To validate username details
		@Step
		public void to_validate_username_details() {
			boolean displayed = $(By.xpath("//span[text()='Joshi Franklin [jfranklin]']")).isDisplayed();
			System.out.println(displayed);

		}

		// To validate Details option
		@Step
		public void to_validate_details_option() {
			boolean displayed = $(By.xpath("//span[text()='Details']")).isDisplayed();
			
			Assert.assertTrue(displayed);

		}

		// To Validate Authorization option
		@Step
		public void to_validate_authorization_option() {
			boolean displayed = $(By.xpath("//span[text()='Authorisation']")).isDisplayed();
			Assert.assertTrue(displayed);
		}

		// To Validate Usergroups option
		@Step
		public void to_validate_usergroups_option() {
			boolean displayed = $(By.xpath("(//span[text()='User Groups'])[1]")).isDisplayed();
			Assert.assertTrue(displayed);

		}

		// To click Save button
		@Step
		public void to_click_save_button() {
			$(By.xpath("//input[@name='ctl00$ctl00$btnSave']")).click();

		}


}
