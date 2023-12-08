package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import groovyjarjarantlr4.v4.runtime.tree.xpath.XPath;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepage_login_About_pages  extends PageObject {

	
	//To click About in Login functionality
	@Step
	public void to_click_about_in_login_functionality() {
		$(By.xpath("//a[text()='About']")).click();
	    
	}

	//To validate the about functionality
	@Step
	public void to_validate_the_about_functionality() {
		String text = $(By.xpath("//h1[text()='About OneSumX']")).getText();
		Assert.assertEquals("About OneSumX", text);
		System.out.println(text);
		
	    
	}

	//To print the about details in login functionality
	@Step
	public void to_print_the_about_details_in_login_functionality() {
		
		String text = $(By.xpath("//span[text()='Login ID']")).getText();
		Assert.assertEquals("Login ID", text);
		System.out.println(text);
		String text2 = $(By.xpath("//span[text()='Username']")).getText();
		Assert.assertEquals("Username", text2);
		System.out.println(text2);
		String text3 = $(By.xpath("//span[text()='User Role(s)']")).getText();
		Assert.assertEquals("User Role(s)", text3);
		System.out.println(text3);
		String text4 = $(By.xpath("(//span[text()='OneSumX'])[2]")).getText();
		Assert.assertEquals("OneSumX", text4);
		System.out.println(text4);
		String text5 = $(By.xpath("//span[text()='Reporting Services']")).getText();
		Assert.assertEquals("Reporting Services", text5);
		System.out.println(text5);
		String text6 = $(By.xpath("//span[text()='OneSumX Services']")).getText();
		Assert.assertEquals("OneSumX Services", text6);
		System.out.println(text6);
	   
	}

	//To click Cancel in About in login functionality
	@Step
	public void to_click_cancel_in_about_in_login_functionality() {
		$(By.id("btnCancel")).click();
	    
	}
}
