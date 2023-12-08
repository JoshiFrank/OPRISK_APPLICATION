package com.Oprisk.Pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepage_Loginfunction_pages extends PageObject {

	// To test the Login functionality

	// To click Login button
	@Step
	public void to_click_login_button() {

		$(By.xpath("//span[@class='wkicon_profile']")).click();

	}

	// To Validate the Login dropdown
	@Step
	public void to_validate_the_login_dropdown() throws InterruptedException {

		boolean displayed = $(By.xpath("//ul[@id='wk_member_nav_ul']")).isDisplayed();

		Thread.sleep(3000);

		for (int i = 1; i <= 6; i++) {
			WebElementFacade incidentlist = $(By.xpath("//ul[@id='wk_member_nav_ul']/child::li[" + i + "]"));
			String incidentlisttext = incidentlist.getText();
			System.out.println(incidentlisttext);

		}
	}

}
