package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	SeleniumPageFactory pf;
	SoftAssert sa;
	
	
	@Given("open browser")
	public void open_browser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	    
	}

	@Given("go to para bank application")
	public void go_to_para_bank_application() {
	   driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("put valid username")
	public void put_valid_username() {
		pf = new SeleniumPageFactory(driver);
		pf.getUserName().sendKeys("manha");
		
	   //driver.findElement(By.xpath("")).sendKeys("");
	}

	@When("put valid password")
	public void put_valid_password() {
	  pf.getPassword().sendKeys("manha1234");  
	}

	@When("click login button")
	public void click_login_button() {
	   pf.getLoginbutton().click();
	}

	@Then("login should pass logout button should visible")
	public void login_should_pass_logout_button_should_visible() {
		pf = new SeleniumPageFactory(driver);
		//pf.getLogoutbutton().isDisplayed();
		
		//driver.findElement(By.xpath("//*[text()='Log Out']"));
	    sa = new SoftAssert();
	    sa.assertTrue(pf.getLogoutbutton().isDisplayed());
	    sa.assertAll();
	    driver.quit();
	}

	@When("put invalid username")
	public void put_invalid_username() {
		pf = new SeleniumPageFactory(driver);
		pf.getUserName().sendKeys("bjhsgdjqw");   
	}

	@When("put invalid password")
	public void put_invalid_password() {
		pf.getPassword().sendKeys("ghshuya"); 
	}

	@Then("login should fail and error msg contains an internal error has occured and has been logged")
	public void login_should_fail_and_error_msg_contains_an_internal_error_has_occured_and_has_been_logged() {
		sa = new SoftAssert();
	    sa.assertTrue(pf. getErrorMsgWithinvalidCredential().isDisplayed());
	    sa.assertAll();
	    driver.quit();
	}

	@When("put null username")
	public void put_null_username() {
		pf = new SeleniumPageFactory(driver);
		pf.getUserName().sendKeys(""); 
	}

	@When("put null password")
	public void put_null_password() {
		pf.getPassword().sendKeys("");
	}

	@Then("login should fail and error msg contains please enter a username and password")
	public void login_should_fail_and_error_msg_contains_please_enter_a_username_and_password() {
		sa = new SoftAssert();
	    sa.assertTrue(pf. getErrorMsgWithNullCredential().isDisplayed());
	    sa.assertAll();
	    driver.quit();
	}



}
