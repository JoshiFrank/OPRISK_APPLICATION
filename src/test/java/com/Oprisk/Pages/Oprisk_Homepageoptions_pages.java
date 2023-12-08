package com.Oprisk.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepageoptions_pages extends PageObject {

	// To validate the home option
	@Step
	public void to_validate_homeoption() {

		WebElementFacade home = $(By.xpath("(//a[contains(text(),'Home')])[1]"));
		Actions as = new Actions(getDriver());
		as.moveToElement(home).build().perform();
		for (int i = 1; i <= 7; i++) {
			WebElementFacade homelist = $(
					By.xpath("((//a[contains(text(),'Home')])[1]/following-sibling::ul//li/a)[" + i + "]"));
			String homelisttext = homelist.getText();
			System.out.println(homelisttext);
		}

	}

	// To validate the risks option
	@Step
	public void to_validate_the_risks_option() {

		WebElementFacade risk = $(By.xpath("(//a[contains(text(),'Risks')])[1]"));
		Actions as = new Actions(getDriver());
		as.moveToElement(risk).build().perform();
		for (int i = 1; i <= 3; i++) {
			WebElementFacade homelist = $(
					By.xpath("((//a[contains(text(),'Risks')])[1]/following-sibling::ul/li/a)[" + i + "]"));
			String risklisttext = homelist.getText();
			System.out.println(risklisttext);
		}

	}

	// To validate the controls option
	@Step
	public void to_validate_controls_option() {

		WebElementFacade control = $(By.xpath("(//a[contains(text(),'Controls')])[1]"));
		Actions as = new Actions(getDriver());
		as.moveToElement(control).build().perform();
		for (int i = 1; i <= 1; i++) {
			WebElementFacade controllist = $(
					By.xpath("((//a[contains(text(),'Controls')])[1]/following-sibling::ul/li/a)[" + i + "]"));
			String controllisttext = controllist.getText();
			System.out.println(controllisttext);
		}

	}

	// To validate the Control Gap Management option
	@Step
	public void to_validate_controlgapmanagement_option() {

		WebElementFacade controlgap = $(By.xpath("(//a[contains(text(),'Control Gap Management')])[1]"));
		Actions as = new Actions(getDriver());
		as.moveToElement(controlgap).build().perform();
		for (int i = 1; i <= 4; i++) {
			WebElementFacade controlgaplist = $(By.xpath(
					"((//a[contains(text(),'Control Gap Management')])[1]/following-sibling::ul/li/a)[" + i + "]"));
			String controlgaplisttext = controlgaplist.getText();
			System.out.println(controlgaplisttext);
		}

	}

	// To validate the incidents/Losses option
	@Step
	public void to_validate_incidentslosses_option() {

		WebElementFacade incident = $(By.xpath("(//a[contains(text(),'Incidents')])[1]"));
		Actions as = new Actions(getDriver());
		as.moveToElement(incident).build().perform();
		for (int i = 1; i <= 3; i++) {
			WebElementFacade incidentlist = $(
					By.xpath("((//a[contains(text(),'Incidents')])[1]/following-sibling::ul/li/a)[" + i + "]"));
			String incidentlisttext = incidentlist.getText();
			System.out.println(incidentlisttext);
		}

	}

	// To validate the Libraries option
	@Step
	public void to_validate_libraries_option() {

		WebElementFacade library = $(By.xpath("(//a[contains(text(),'Libraries')])[1]"));
		Actions as = new Actions(getDriver());
		as.moveToElement(library).build().perform();
		for (int i = 1; i <= 4; i++) {
			WebElementFacade librarylist = $(
					By.xpath("((//a[contains(text(),'Libraries')])[1]/following-sibling::ul/li/a)[" + i + "]"));
			String librarylisttext = librarylist.getText();
			System.out.println(librarylisttext);
		}

	}

}
