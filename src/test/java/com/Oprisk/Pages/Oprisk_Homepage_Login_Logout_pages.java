package com.Oprisk.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Oprisk_Homepage_Login_Logout_pages  extends PageObject {
	
	
	//To click Logout option in login functionality
	@Step
	public void to_click_logout_option_in_login_functionality() {
		$(By.xpath("//a[text()='Logout']")).click();
		
	    
	}

	//To validate logout option page
	@Step
	public void to_validate_logout_option_page() {
		String text = $(By.xpath("//h1[text()='Log out']")).getText();
		Assert.assertEquals("Log out", text);
		System.out.println(text);
		
	    
	}

	//To click Cancel in logout page in login functionality
	@Step
	public void to_click_cancel_in_logout_page_in_login_functionality() {
		$(By.id("btnCancel")).click();
	    
	}

	
	    
	

}
