package com.Oprisk.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepage_pages extends PageObject {
	public Robot ra;

	@Step
	// octa verification
	public void oktaverification() throws AWTException, InterruptedException {
		String username = "jfranklin";
		StringSelection selection = new StringSelection(username);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		ra = new Robot();
		ra.keyPress(KeyEvent.VK_CONTROL);
		ra.keyPress(KeyEvent.VK_V);

		Thread.sleep(4000);
		ra.keyRelease(KeyEvent.VK_V);
		ra.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(4000);
		ra.keyPress(KeyEvent.VK_TAB);
		ra.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		String password = "Winter@22";
		StringSelection selection1 = new StringSelection(password);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null);
		ra.keyPress(KeyEvent.VK_CONTROL);
		ra.keyPress(KeyEvent.VK_V);
		ra.keyRelease(KeyEvent.VK_V);
		ra.keyRelease(KeyEvent.VK_CONTROL);

		for (int i = 0; i < 2; i++) {
			ra.keyPress(KeyEvent.VK_TAB);
			ra.keyRelease(KeyEvent.VK_TAB);
		}
		ra.keyPress(KeyEvent.VK_ENTER);
		ra.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(6000);
		ra.keyPress(KeyEvent.VK_TAB);
		ra.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		ra.keyPress(KeyEvent.VK_ENTER);
		ra.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(30000);

	}

	// To open the OneSumX application
	@Step
	public void to_open_the_one_sum_x_application() {
		getDriver().get("https://oprisk-uat.afreximbank.net/");
		getDriver().manage().window().maximize();

	}

	// To validate the OneSumX logo
	@Step
	public void to_validate_onesumx_logo() {

		boolean displayed = $(By.xpath("//span[text()='OneSumX']")).isDisplayed();

		Assert.assertTrue(displayed);

	}

	// To validate the required workspace options present
	@Step
	public void to_validate_required_workspaceoptions() {

		boolean displayed = $(By.xpath("//div[contains(text(),'Risk Assessments')]")).isDisplayed();

		Assert.assertTrue(displayed);

		boolean displayed1 = $(By.xpath("//div[contains(text(),'Control Signoff')]")).isDisplayed();

		Assert.assertTrue(displayed1);

		boolean displayed2 = $(By.xpath("//div[contains(text(),'Incident/Loss Events')]")).isDisplayed();

		Assert.assertTrue(displayed2);

		boolean displayed3 = $(By.xpath("//div[contains(text(),'Issues')]")).isDisplayed();

		Assert.assertTrue(displayed3);

		boolean displayed4 = $(By.xpath("//div[contains(text(),'Actions')]")).isDisplayed();

		Assert.assertTrue(displayed4);

		boolean displayed5 = $(By.xpath("//div[contains(text(),'Key Risk Indicators')]")).isDisplayed();

		Assert.assertTrue(displayed5);

		boolean displayed6 = $(By.xpath("//div[contains(text(),'Surveys')]")).isDisplayed();

		Assert.assertTrue(displayed6);

		boolean displayed7 = $(By.xpath("//div[text()='Document Attestations']")).isDisplayed();

		Assert.assertTrue(displayed7);

		boolean displayed8 = $(By.xpath("//div[contains(text(),'Clarifications')]")).isDisplayed();

		Assert.assertTrue(displayed8);

	}

	

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// To Test the Details option- dashboard in Login dropdown

	
}
