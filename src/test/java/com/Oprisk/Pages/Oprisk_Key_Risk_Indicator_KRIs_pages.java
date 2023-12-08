package com.Oprisk.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Key_Risk_Indicator_KRIs_pages extends PageObject {

	// To MouseOver on the Key Risk indicators\\(KRIs) option in the home page
	@Step
	public void to_mouse_over_on_the_key_risk_indicators_kr_is_option_in_the_home_page() throws InterruptedException {

		$(By.xpath("//a[text()='Key Risk Indicators (KRIs)']")).click();

		Thread.sleep(4000);

	}

	// To Click the Periodic Key Risk indicators\\(KRIs) link
	@Step
	public void to_click_the_periodic_key_risk_indicators_kr_is_link() throws InterruptedException {

		$(By.xpath("//a[text()='Periodic Key Risk Indicators (KRIs)']")).click();
		Thread.sleep(4000);

	}

	// validate the List Periodic Key Risk Indicators \\(KRIs) page
	@Step
	public void validate_the_list_periodic_key_risk_indicators_kr_is_page() throws InterruptedException {
		String text = $(By.xpath("//h1[text()='List Periodic Key Risk Indicators (KRIs)']")).getText();
		Assert.assertEquals("List Periodic Key Risk Indicators (KRIs)", text);
		System.out.println(text);
		Thread.sleep(4000);

	}

	// To click the check box of required indicator
	@Step
	public void to_click_the_check_box_of_required_indicator() throws InterruptedException {
		$(By.xpath("//label[text()='All Indicators']")).click();
		Thread.sleep(4000);

	}

	// Click the Not Recorded link under the value option which one you selected
	// indicator
	@Step
	public void click_the_not_recorded_link_under_the_value_option_which_one_you_selected_indicator()
			throws InterruptedException {
		$(By.xpath("(//a[text()='Not Recorded'])[1]")).click();
		Thread.sleep(4000);
	}

	// Validate the Enter indicator score popup
	@Step
	public void validate_the_enter_indicator_score_popup() throws InterruptedException {

		String text = $(By.xpath("//span[text()='Enter Indicator Score']")).getText();
		Assert.assertEquals("Enter Indicator Score", text);
		System.out.println(text);
		Thread.sleep(4000);
	}

	// Enter the value
	@Step
	public void enter_the_value() throws InterruptedException {
		$(By.xpath("(//input[@spellcheck='true'])[3]")).sendKeys("0");
		Thread.sleep(4000);

	}

	// Select the Score from the dropdown
	@Step
	public void select_the_score_from_the_dropdown() throws InterruptedException {

		// $(By.id("ctl00_content_scoreList")).selectByIndex(2);
		$(By.id("ctl00_content_scoreList_chosen")).click();
		Thread.sleep(4000);
		$(By.xpath("//li[text()='Red']")).click();

		System.out.println("selectisdone");

		Thread.sleep(4000);

	}

	// Enter the comment in the text box
	@Step
	public void enter_the_comment_in_the_text_box() throws InterruptedException, AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		/*
		 * getDriver().switchTo().frame("ctl00_content_rtbComment_tbRTF_ifr");
		 * 
		 * System.out.println("framehandle");
		 */

		Thread.sleep(4000);
		$(By.xpath(
				"(//iframe[@title='Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help'])[2]"))
				.sendKeys("kohli");
		//getDriver().switchTo().defaultContent();
		Thread.sleep(4000);

	}

	// Click Save & Next button
	@Step
	public void click_save_next_button() throws InterruptedException {

		$(By.xpath("//input[@value='Save & Next']")).click();
		Thread.sleep(4000);
	}

	// To click cancel button
	@Step
	public void to_click_cancel_button() throws InterruptedException {
		$(By.xpath("(//input[@value='Cancel'])[1]")).click();
		Thread.sleep(4000);
	}

	// To click submit button
	@Step
	public void to_click_submit_button() throws InterruptedException {
		$(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(4000);
	}

	// To click Approve button
	@Step
	public void to_click_approve_button() throws InterruptedException {
		$(By.xpath("//input[@value='Approve']")).click();
		Thread.sleep(4000);
	}

	// Validate the selected indicator status is submitted
	@Step
	public void validate_the_selected_indicator_status_is_submitted() throws InterruptedException {
		String text = $(By.xpath("(//td[text()='Submitted'])[1]")).getText();
		Assert.assertEquals("Submitted", text);
		System.out.println(text);
		Thread.sleep(3000);
	}

}
