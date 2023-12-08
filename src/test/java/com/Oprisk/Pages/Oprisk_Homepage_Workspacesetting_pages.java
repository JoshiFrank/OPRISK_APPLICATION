package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepage_Workspacesetting_pages extends PageObject {

	// To Click workspace settings
	@Step
	public void to_click_workspace_settings() {
		$(By.xpath("(//a[text()='Workspace Settings'])[1]")).click();

	}

	// To Validate the workspace settings
	@Step
	public void to_validate_the_workspace_settings() {

		boolean displayed = $(By.xpath("(//h1[text()='Workspace Settings'])[1]")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// To validate the individual settings
	@Step
	public void to_validate_the_individual_settings() {
		String text = $(By.xpath("//span[text()='Risk Assessments']")).getText();

		System.out.println(text);

		Assert.assertEquals("Risk Assessments", text);
		String text2 = $(By.xpath("//span[text()='Control Signoff']")).getText();
		Assert.assertEquals("Control Signoff", text2);
		System.err.println(text2);
		String text3 = $(By.xpath("//span[text()='Incident/Loss Events']")).getText();
		Assert.assertEquals("Incident/Loss Events", text3);
		System.err.println(text3);
		String text4 = $(By.xpath("//span[text()='Issues']")).getText();
		Assert.assertEquals("Issues", text4);
		System.err.println(text4);
		String text5 = $(By.xpath("//span[text()='Actions']")).getText();
		Assert.assertEquals("Actions", text5);
		System.out.println(text5);
		String text6 = $(By.xpath("//span[text()='Key Risk Indicators (KRIs)']")).getText();
		Assert.assertEquals("Key Risk Indicators (KRIs)", text6);
		System.out.println(text6);
		String text7 = $(By.xpath("//span[text()='Surveys']")).getText();
		Assert.assertEquals("Surveys", text7);
		System.out.println(text7);
		String text8 = $(By.xpath("//span[text()='Document Attestations']")).getText();
		Assert.assertEquals("Document Attestations", text8);
		System.out.println(text8);
		String text9 = $(By.xpath("//span[text()='Clarifications']")).getText();
		Assert.assertEquals("Clarifications", text9);
		System.err.println(text9);

	}

	// To click Save in workspace settings
	@Step
	public void to_click_save_in_workspace_settings() {
		$(By.id("btnSave")).click();

	}

	// To click OK
	@Step
	public void to_click_ok() {
		$(By.xpath("//button[text()='OK']")).click();

	}

	// To click Cancel in workspace settings
	@Step
	public void to_click_cancel_in_workspace_settings() {
		$(By.id("btnCancel")).click();

	}

}
