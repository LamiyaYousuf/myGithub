package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {
	
	public SeleniumPageFactory(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//*[@name='username']")
	 private WebElement UserName;
	
	@FindBy (xpath="//*[@name='password']")
	 private WebElement Password;
	
	@FindBy (xpath="//*[@type='submit']")
	 private WebElement Loginbutton;
	
	@FindBy (xpath="//*[text()='Log Out']")
	private WebElement logoutbutton;
	 
	@FindBy (xpath="//*[text()='An internal error has occurred and has been logged.']")
	private WebElement errorMsgWithinvalidCredential;
	 
	@FindBy (xpath="//*[text()='The username and password could not be verified.']")
	private WebElement errorMsgWithNullCredential;
	
	
	public WebElement getErrorMsgWithNullCredential() {
		return errorMsgWithNullCredential;
	}

	public WebElement getErrorMsgWithinvalidCredential() {
		return errorMsgWithinvalidCredential;
	}
	
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	 
	 
	 

}
