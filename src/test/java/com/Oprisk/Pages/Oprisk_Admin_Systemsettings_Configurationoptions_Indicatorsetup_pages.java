package com.Oprisk.Pages;


import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;


public class Oprisk_Admin_Systemsettings_Configurationoptions_Indicatorsetup_pages extends PageObject {


	// To click Dimension Types link in Settings page
	@Step
	public void to_click_dimension_types_link_in_settings_page() throws InterruptedException {
	   Thread.sleep(2000);
		$(By.xpath("//a[text()='Dimension Types']")).click();
	}

	//To validate List Dimension Types page
	@Step
	public void to_validate_list_dimension_types_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = $(By.xpath("//h1[text()='List Dimension Types']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click cancel button in List Dimension Types page
	@Step
	public void to_click_cancel_button_in_list_dimension_types_page() {
		$(By.xpath("//input[@value='Cancel']")).click();
	}
	
	
}
