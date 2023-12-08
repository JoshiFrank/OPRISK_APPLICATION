package com.Oprisk.Steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.Oprisk.Pages.Oprisk_Homepage_pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class Oprisk_Homepage_steps {

	Robot ra;

	@Managed
	WebDriver driver;

	@Steps
	Oprisk_Homepage_pages hp;

	@Given("To open the OneSumX application")
	public void to_open_the_one_sum_x_application() throws AWTException, InterruptedException {

		driver.get(
				"https://oprisk-uat.afreximbank.net/AppA/UI/Workspace.aspx?r2055=b7b53743-0c10-40a3-82ba-de2a4530dec4");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		hp.oktaverification();

	}

	@Then("To validate the OneSumX logo")
	public void to_validate_the_one_sum_x_logo() {

		hp.to_validate_onesumx_logo();
	}

	@Then("To validate the required workspace options present")
	public void to_validate_the_required_workspace_options_present() {

		hp.to_validate_required_workspaceoptions();

	}

	
	//////////////////////////////////////////////////////////////////////////////////////

	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

}
