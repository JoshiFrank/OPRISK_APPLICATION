package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Home_Reports_pages extends PageObject {

	// To click the Home option in Homepage
	@Step
	public void to_click_the_home_option_in_homepage() throws InterruptedException {

		$(By.xpath("(//a[text()='Home'])[1]")).click();
		Thread.sleep(3000);
	}

	// To click the Reports option in Home
	@Step
	public void to_click_the_reports_option_in_home() throws InterruptedException {

		$(By.xpath("(//a[text()='Reports'])[1]")).click();
		Thread.sleep(3000);

	}

	// To validate the Reports page
	@Step
	public void to_validate_the_reports_page() throws InterruptedException {

		boolean displayed = $(By.xpath("(//h1[text()='Reports'])")).isDisplayed();
		Assert.assertTrue(displayed);
		Thread.sleep(2000);

	}

	// To click Filter icon
	@Step
	public void to_click_filter_icon() throws InterruptedException {

		$(By.xpath("(//span[@class='wkicon_filter'])[1]/../..")).click();
		Thread.sleep(5000);

	}

	// To validate the Reports option
	@Step
	public void to_validate_the_reports_option() throws InterruptedException {

		try {

			for (int i = 1; i <= 11; i++) {

				WebElementFacade incidentlist = $(By.xpath(
						"(//div[@style='display:block;']/child::table//tbody/tr/td/following-sibling::td/following-sibling::td/span/img/following-sibling::input/following-sibling::span)["
								+ i + "]"));
				String incidentlisttext = incidentlist.getText();
				System.out.println(incidentlisttext);
				Thread.sleep(1000);
			}

		} catch (Exception e) {

			for (int i = 1; i <= 5; i++) {

				WebElementFacade incidentlist = $(By.xpath(
						"(//div[@style='display:block;']/child::table//tbody/tr/td/following-sibling::td/following-sibling::td/span/img/following-sibling::input/following-sibling::span)["
								+ i + "]"));
				String incidentlisttext = incidentlist.getText();
				System.out.println(incidentlisttext);
				Thread.sleep(1000);

			}

		}
	}

	////////////////////////////////////////////////////////////////////////////////////

	// Filter down arrow

	//"To click Filters arrow
	@Step
	public void to_click_filters_arrow() {
		
		$(By.xpath("//button[@title='Manage Saved Filters']")).click();
		
	}

	//To click My application reports
	@Step
	public void to_click_my_application_reports() throws InterruptedException {
		
		$(By.xpath("//a[text()='My Application Reports']")).click();
		Thread.sleep(4000);
	}

	//To validate My application reports
	@Step
	public void to_validate_my_application_reports() {
		
		boolean displayed = $(By.xpath("//strong[text()='My Application Reports']")).isDisplayed();
		Assert.assertTrue(displayed);
	
	}

	//To click My Data Extracts
	@Step
	public void to_click_my_data_extracts() throws InterruptedException {
		
		$(By.xpath("//a[text()='My Data Extracts']")).click();
		Thread.sleep(4000);
	}

	//To validate My Data Extracts
	@Step
	public void to_validate_my_data_extracts() {
		boolean displayed = $ (By.xpath("//strong[text()='My Data Extracts']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}

	//"To Click My user reports
	@Step
	public void to_click_my_user_reports() throws InterruptedException {
		$(By.xpath("//a[text()='My User Reports']")).click();
		Thread.sleep(4000);
	}

	//To validate my user reports
	@Step
	public void to_validate_my_user_reports() {
		boolean displayed = $(By.xpath("//strong[text()='My User Reports']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}

	//"To Click Sample user reports
	@Step
	public void to_click_sample_user_reports() throws InterruptedException {
		
		$(By.xpath("//a[text()='Sample User Reports']")).click();
		Thread.sleep(4000);
	}

	//"To validate Sample user reports
	@Step
	public void to_validate_sample_user_reports() {
		
		boolean displayed = $(By.xpath("//strong[text()='Sample User Reports']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}

}
