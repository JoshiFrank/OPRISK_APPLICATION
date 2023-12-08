package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepage_Login_Changepass_pages  extends PageObject{
	
	
	//To click Product Ext Password
	@Step
	public void to_click_product_ext_password() {
		$(By.xpath("//a[text()='Product Ext. password']")).click();
		
		
	    
	}

	//To validate Change password
	@Step
	public void to_validate_change_password() {
		boolean displayed = $(By.xpath("//h1[text()='Change Password']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}
	

	//To click cancel in change password
	@Step
	public void to_click_cancel_in_change_password() {
		$(By.xpath("//input[@name='ChangePwd$ChangePasswordContainerID$CancelPushButton']")).click();
	    
	}
	
	

}
