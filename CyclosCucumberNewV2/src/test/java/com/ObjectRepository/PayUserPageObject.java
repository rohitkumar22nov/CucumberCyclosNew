package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.BaseClass;

public class PayUserPageObject {

	
public WebDriver localDriver;
	
public String paymentMessage;

	public PayUserPageObject(WebDriver remoteDriver)
	{
		localDriver = remoteDriver;
		
			
		PageFactory.initElements(localDriver, this);
		
	
		
	}

	
	
	@FindBy(xpath="//a[@href='#banking.transactions.payment-user-to-user']")
	WebElement btnPayUser;
	
	
	@FindBy(xpath ="//input[@class='inputField large']")
	WebElement txtBoxUser_quickSearch;
	

	@FindBy(xpath="/html/body/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/table/tbody/tr[4]/td[2]/div/div/div[2]/img")
	WebElement radioContact;
	

	@FindBy(xpath="//div[@class='selectionLabel'][contains(text(),'Please')]")
	WebElement drpDownContact;
	
	@FindBy(xpath ="//input[@class='inputField large rightAligned']")
	WebElement txtBoxAmount;
	
	@FindBy(xpath ="/html/body/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/table/tbody/tr[23]/td/div/div[3]/button/div")
	WebElement btnSubmit;
	// ---  "//div[text()='Submit']"
	
	
	
	@FindBy(xpath="//div[text()='Confirm']")
	WebElement btnConfirm;
	
	
	@FindBy(xpath="//div[contains(text(),'successful')]")
	WebElement msgPaymentSuccessful;
	

	
	@FindBy(xpath="//div[text()='New payment']")
	WebElement btnNewPayment;
	
//	@FindBy(xpath="//div[@class='notificationText notificationText-singleLine']")
//	WebElement msgNotification;

	
	public void paymentToUser(String Amount)
	{
		
		btnPayUser.click();
		radioContact.click();
		
		
		Select dropDown = new Select(drpDownContact);
		dropDown.selectByIndex(2);
		
		
		txtBoxAmount.sendKeys();
		btnSubmit.click();
		
		
	}
	
	public PayUserPageObject(String Amount)
	{
		System.out.println("constructor created as code was showing error");
	}	
	
	
	
	public void paymentUserQuickSearch(String quickUser, String Amount) throws InterruptedException
	{
		
		
		btnPayUser.click();
		txtBoxUser_quickSearch.sendKeys(quickUser);
	Thread.sleep(3000);
		txtBoxAmount.sendKeys(Amount);
		btnSubmit.click();	
		
		Thread.sleep(4000);

		
		btnConfirm.click();
		String paymentMessage =	msgPaymentSuccessful.getText();
		
		
	}
	

	
	public void paymentVerification() throws InterruptedException
	{
		
			
		String paymentMessage =	msgPaymentSuccessful.getText();
		
		System.out.println(paymentMessage);
		
		if(paymentMessage.contentEquals("The payment was successful"))
		{
			System.out.println("Test Passed - Payment made." + " " + paymentMessage);
		}	
		else
		{
			System.out.println("Test Failed - Payment NOT done");
		}
		
		
		Thread.sleep(4000);
		
		btnNewPayment.click();
		
	}
	
	
	
	
}
