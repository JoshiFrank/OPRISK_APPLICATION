package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Risk_ControlSelf_Assesment_Pages extends PageObject {

//To MouseOver on the Risks option in home page
	public void to_mouse_over_on_the_risks_option_in_home_page() {

		WebElementFacade risk = $(By.xpath("(//a[contains(text(),'Risks')])[1]"));
		Actions as = new Actions(getDriver());
		as.moveToElement(risk).build().perform();

	}

//To click the Risk & Self-Assesment(RCSA) link
	@Step
	public void to_click_the_risk_self_assesment_rcsa_link() {

		$(By.linkText("Risk & Control Self-Assessment (RCSA)")).click();
	}

//Validate the Risk & Self-Assesment(RCSA) page")
	@Step
	public void validate_the_risk_self_assesment_rcsa_page() {

		boolean displayed = $(By.xpath("//h1[text()='List Risk & Control Self-Assessment (RCSA)']")).isDisplayed();

		Assert.assertTrue(displayed);

	}

//To Click Opratinal Risk Link
	@Step
	public void to_click_opratinal_risk_link() throws InterruptedException {
		
		Thread.sleep(2000);

		$(By.linkText("Operational Risk")).click();
	}

//Validate the Risk & Self-Assesment Control view page
	@Step
	public void validate_the_risk_self_assesment_control_view_page() {

		boolean displayed = $(By.xpath("//h1[text()='Risk & Control Self-Assessment (RCSA) - Control View']"))
				.isDisplayed();
		Assert.assertTrue(displayed);
	}

//Click Professional movers option
	@Step
	public void click_professional_movers_option() throws InterruptedException {
		
		
		$(By.id("ctl00_content_genList_GenericGridView_glRow_0_ctl00")).click();
		Thread.sleep(2000);
		
		$(By.xpath("(//tr[@class='bodytextRow'])[1]")).click();
	}

//To Click proceed To Approval button
	@Step
	public void to_click_proceed_to_approval_button() {

		$(By.name("ctl00$buttons$btnApprove")).click();

	}

//Validate the Risk Approval page
	@Step
	public void validate_the_risk_approval_page() {

		boolean displayed = $(By.xpath("//h1[text()='Risk & Control Self-Assessment (RCSA) Approval']")).isDisplayed();

		Assert.assertTrue(displayed);
	}

}
