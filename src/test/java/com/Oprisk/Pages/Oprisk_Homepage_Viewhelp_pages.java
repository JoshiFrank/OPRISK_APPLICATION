package com.Oprisk.Pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepage_Viewhelp_pages extends PageObject {

	// view help functionality

	// To click View Help box
	@Step
	public void to_click_view_help_box() throws InterruptedException {

		Thread.sleep(3000);
		

		getDriver().get(
				"https://oprisk-uat.afreximbank.net/AppA/Help/Online%20Help/Default.htm#BusinessUserGuide/Viewing%20the%20Workspace.htm");
		
	}

	// To validate the OneSumX GRC page opened
	@Step
	public void to_validate_the_one_sum_x_grc_page_opened() {
		$(By.xpath("(//img[@alt='Logo'])[1]")).isDisplayed();

	}

	// To click OneSumX Grc option
	@Step
	public void to_click_one_sum_x_grc_option() {

		$(By.xpath("//a[contains(text(),'Introduction to OneSumX GRC')]")).click();
	}

	// To validate OneSumX Grc option dropdown
	@Step
	public void to_validate_one_sum_x_grc_option_dropdown() throws InterruptedException {

		for (int i = 2; i <= 10; i++) {
			WebElementFacade incidentlist = $(By.xpath("(//li/div/span/a)[" + i + "]"));
			String incidentlisttext = incidentlist.getText();
			System.out.println(incidentlisttext);
		}
		Thread.sleep(2000);
	}

	// To click the Using the OneSumX GRC Interface option
	@Step
	public void to_click_the_using_the_one_sum_x_grc_interface_option() {
		$(By.xpath("//a[contains(text(),'Using the OneSumX GRC Interface')]")).click();

	}

	// To validate Using the OneSumX GRC Interface option dropdown
	@Step
	public void to_validate_using_the_one_sum_x_grc_interface_option_dropdown() throws InterruptedException {

		for (int i = 1; i <=3; i++) {
			WebElementFacade incidentlist = $(By.xpath("(//li[@data-mc-id='0']/child::ul/li)[" + i + "]"));
			String incidentlisttext = incidentlist.getText();
			System.out.println(incidentlisttext);
		}
		Thread.sleep(2000);
	}

	// To click the Configuring OneSumX GRC option
	@Step
	public void to_click_the_configuring_one_sum_x_grc_option() {
		$(By.xpath("//a[contains(text(),'Configuring OneSumX GRC')]")).click();
	}

	// To validate Configuring OneSumX GRC option dropdown
	@Step
	public void to_validate_configuring_one_sum_x_grc_option_dropdown() throws InterruptedException {

		for (int i = 1; i <= 10; i++) {
			if (i==4) {
				
				$(By.xpath("//a[text()='Defining Incident Templates']")).click();
			}
			WebElementFacade incidentlist = $(By.xpath("(//li[@data-mc-id='1']/child::ul/li)[" + i + "]"));
			String incidentlisttext = incidentlist.getText();
			System.out.println(incidentlisttext);
		}
		Thread.sleep(2000);
	}

	// To click the Using the OneSumX GRC option
	@Step
	public void to_click_the_using_the_one_sum_x_grc_option() {
		$(By.xpath("//a[contains(text(),'Using OneSumX GRC')]")).click();
	}

	// To validate Using the OneSumX GRC option dropdown
	@Step
	public void to_validate_using_the_one_sum_x_grc_option_dropdown() throws InterruptedException {
		// li[@data-mc-id='2']/child::ul/li
		for (int i = 1; i <= 10; i++) {
			WebElementFacade incidentlist = $(By.xpath("(//li[@data-mc-id='2']/child::ul/li)[" + i + "]"));
			String incidentlisttext = incidentlist.getText();
			System.out.println(incidentlisttext);
		}
		Thread.sleep(2000);
	}

	// To click Managing Programs option
	@Step
	public void to_click_managing_programs_option() {
		$(By.xpath("//a[contains(text(),'Managing Programs')]")).click();
	}

	// To validate Managing Programs option interface
	@Step
	public void to_validate_managing_programs_option_interface() throws InterruptedException {
		for (int i = 1; i <= 8; i++) {
			WebElementFacade incidentlist = $(By.xpath("(//li[@data-mc-id='3']/child::ul/li)[" + i + "]"));
			String incidentlisttext = incidentlist.getText();
			System.out.println(incidentlisttext);
		}
		Thread.sleep(2000);

	}

	// To click OneSumX GRC Reference option
	@Step
	public void to_click_one_sum_x_grc_reference_option() {
		$(By.xpath("//a[contains(text(),'OneSumX GRC Reference')]")).click();
	}

	// To validate OneSumX GRC Reference option dropdown
	@Step
	public void to_validate_one_sum_x_grc_reference_option_dropdown() throws InterruptedException {

		for (int i = 1; i <= 11; i++) {
			WebElementFacade incidentlist = $(By.xpath("(//li[@data-mc-id='4']/child::ul/li)[" + i + "]"));
			String incidentlisttext = incidentlist.getText();
			System.out.println(incidentlisttext);
		}

		getDriver().navigate().back();
		Thread.sleep(20000);
	}

}
