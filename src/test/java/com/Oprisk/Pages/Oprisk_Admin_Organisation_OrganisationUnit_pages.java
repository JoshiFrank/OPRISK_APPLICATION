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

public class Oprisk_Admin_Organisation_OrganisationUnit_pages extends PageObject {

	//To click the Admin menu option in home page
	@Step
	public void to_click_the_admin_menu_option_in_home_page() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//span[@class='wkicon_admin']")).click();
	}

	//To mouse hover to organisation option
	@Step
	public void to_mouse_hover_to_organisation_option() {
	    $(By.xpath("//a[text()='Organisation']")).click();
	}

	//To click the organisation unit in organisation option
	@Step
	public void to_click_the_organisation_unit_in_organisation_option() {
	    $(By.xpath("//a[text()='Organisation Unit']")).click();
	}

	//To validate the Maintain Organisation Unit page
	@Step
	public void to_validate_the_maintain_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Maintain Organisation Unit']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the arrow button in office of the president in Maintain Organisation Unit page
	@Step
	public void to_click_the_arrow_button_in_office_of_the_president_in_maintain_organisation_unit_page() {
	    $(By.id("ctl00_content_ltOUTree_ucLazyTreen1")).click();
	}

	//To click the arrow button in the president in Maintain Organisation Unit page
	@Step
	public void to_click_the_arrow_button_in_the_president_in_maintain_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.id("ctl00_content_ltOUTree_ucLazyTreen2")).click();
	}

	//To click the down arrow button in Risk management in Maintain Organisation Unit page
	@Step
	public void to_click_the_down_arrow_button_in_risk_management_in_maintain_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("(//span[@class='tree-hover-icon'])[13]")).click();
	}

	//To click the Add organisation unit in Maintain Organisation Unit page
	@Step
	public void to_click_the_add_organisation_unit_in_maintain_organisation_unit_page() {
	   $(By.xpath("//span[text()='Add Organisation Unit']")).click();
	}

	//To validate the Add Organisation Unit page
	@Step
	public void to_validate_the_add_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Add Organisation Unit']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Enter value in Organisation Unit Code in Add Organisation Unit page
	@Step
	public void to_enter_value_in_organisation_unit_code_in_add_organisation_unit_page() {
	    $(By.xpath("(//input[@type='text'])[1]")).sendKeys("test1");
	}

	//To Enter value in Organisation Unit Name in Add Organisation Unit page
	@Step
	public void to_enter_value_in_organisation_unit_name_in_add_organisation_unit_page() {
		$(By.xpath("(//input[@type='text'])[2]")).sendKeys("test1");
	}

	//To Enter value in Organisation Unit Description in Add Organisation Unit page
	@Step
	public void to_enter_value_in_organisation_unit_description_in_add_organisation_unit_page() {
	    $(By.xpath("//textarea[@class='bodyText']")).sendKeys("test1");
	}

	//To select dropdown option in owner in Add Organisation Unit page
	@Step
	public void to_select_dropdown_option_in_owner_in_add_organisation_unit_page() {
	   $(By.xpath("(//span[@class='select2-arrow'])[1]")).click();
	   $(By.xpath("(//div[text()='Joshi Franklin'])[2]")).click();
	}

	//To select dropdown option in Risk manager in Add Organisation Unit page
	@Step
	public void to_select_dropdown_option_in_risk_manager_in_add_organisation_unit_page() {
		$(By.xpath("(//span[@class='select2-arrow'])[2]")).click();
		$(By.xpath("(//div[text()='Joshi Franklin'])[2]")).click();
	}

	//To Enter value in External Link in Add Organisation Unit page
	@Step
	public void to_enter_value_in_external_link_in_add_organisation_unit_page() {
	    $(By.xpath("(//input[@type='text'])[8]")).sendKeys("test1");
	}
	//To Enter value in Objectives in Add Organisation Unit page
	@Step
	public void to_enter_value_in_objectives_in_add_organisation_unit_page() {
		getDriver().switchTo().frame(0);
	    $(By.id("tinymce")).sendKeys("test1");
	    getDriver().switchTo().defaultContent();
	}

	//To Enter value in Background in Add Organisation Unit page
	@Step
	public void to_enter_value_in_background_in_add_organisation_unit_page() throws AWTException {
	    
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}

	//To Enter value in Planning in Add Organisation Unit page
	@Step
	public void to_enter_value_in_planning_in_add_organisation_unit_page() throws AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);

	}

	//To click the Save button in Add Organisation Unit page
	@Step
	public void to_click_the_save_button_in_add_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("(//input[@value='Save'])[2]")).click();
	}

	//To validate the Manage Organisation Unit page
	@Step
	public void to_validate_the_manage_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Manage Organisation Unit']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To Enter the value in Loader id in Manage Organisation Unit page
	@Step
	public void to_enter_the_value_in_loader_id_in_manage_organisation_unit_page() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("(//input[@type='text'])[13]")).sendKeys("test4");
	}

	//To Select dropdown in source system in Manage Organisation Unit page
	@Step
	public void to_select_dropdown_in_source_system_in_manage_organisation_unit_page() throws AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    $(By.xpath("(//a[@class='chosen-single'])[3]")).click();
	    $(By.xpath("//li[text()='OneSumX']")).click();
	    }

	//To click the Save button in Manage Organisation Unit page
	@Step
	public void to_click_the_save_button_in_manage_organisation_unit_page() {
		 $(By.xpath("(//input[@value='Save'])[2]")).click();
	}

	//To click the Risk and control map option in Risks
	@Step
	public void to_click_the_risk_and_control_map_option_in_risks() throws InterruptedException {
		Thread.sleep(2000);
	    $(By.xpath("//a[text()='Risk & Control Maps']")).click();
	}

	//To validate the Maintain Risk Map page
	@Step
	public void to_validate_the_maintain_risk_map_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//h1[text()='Maintain Risk Map - Select Organisation Unit']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the arrow button in office of the president in Maintain Risk Map page
	@Step
	public void to_click_the_arrow_button_in_office_of_the_president_in_maintain_risk_map_page() {
	    $(By.id("ctl00_content_treeLazy_ucLazyTreen1")).click();
	}

	//To click the arrow button in the president in Maintain Risk Map page
	@Step
	public void to_click_the_arrow_button_in_the_president_in_maintain_risk_map_page() throws InterruptedException {
		Thread.sleep(2000);
	   $(By.id("ctl00_content_treeLazy_ucLazyTreen2")).click();
	}

	//To click the arrow button in Risk Management in Maintain Risk Map page
	@Step
	public void to_click_the_arrow_button_in_risk_management_in_maintain_risk_map_page() throws InterruptedException {
		Thread.sleep(2000);
	   $(By.id("ctl00_content_treeLazy_ucLazyTreen12")).click();
	}

	//To validate the result Risk Management in Maintain Risk Map page
	@Step
	public void to_validate_the_result_risk_management_in_maintain_risk_map_page() throws InterruptedException {
		Thread.sleep(2000);
	    boolean displayed = $(By.xpath("//span[text()='Risk Management (RIMA)']")).isDisplayed();
	    Assert.assertTrue(displayed);
	}
	
}
