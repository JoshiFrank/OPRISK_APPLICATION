package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Admin_Organisation_Productlines_pages extends PageObject {

	//To click the product lines in organisation option
	@Step
	public void to_click_the_product_lines_in_organisation_option() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Product Lines']")).click();
	}

	//To Validate the Maintain Product Lines pages
	@Step
	public void to_validate_the_maintain_product_lines_pages() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Maintain Product Lines']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the All product lines link in Maintain Product Lines pages
	@Step
	public void to_click_the_all_product_lines_link_in_maintain_product_lines_pages() {
	    $(By.xpath("//span[text()='All Product Lines']")).click();
	}

	//To validate the Edit Product Line page
	@Step
	public void to_validate_the_edit_product_line_page() throws InterruptedException {
		Thread.sleep(2000);
	   boolean displayed = $(By.xpath("//h1[text()='Edit Product Line']")).isDisplayed();
	   Assert.assertTrue(displayed);
	}

	//To click Save button in Edit Product Line page
	@Step
	public void to_click_save_button_in_edit_product_line_page() {
	   $(By.xpath("//input[@value='Save']")).click();
	}

	
}
