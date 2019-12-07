package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageObject {
	
	
	
public WebDriver localDriver;
	
	public String loginName = null;
	public String password = null;
	
	public SignInPageObject(WebDriver remoteDriver)
	{
		localDriver = remoteDriver;
		
		PageFactory.initElements(localDriver, this);
		
		
	}
		
	
	@FindBy(xpath="//a[@href='#login']")
	WebElement lnkSignIn;
	

	
	@FindBy(xpath="//input[@class='inputField medium'][@name='principal']")
	WebElement txtBoxLoginName;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtBoxPassword;
	
	
	@FindBy(xpath ="//div[@class='actionButtonText']")
	WebElement btnSignIn;
	
	
	
	public void credentials(String loginName, String password)
	{
		
		lnkSignIn.click();
		txtBoxLoginName.sendKeys(loginName);
		txtBoxPassword.sendKeys(password);
		btnSignIn.click();
		
	}
	
	

}
