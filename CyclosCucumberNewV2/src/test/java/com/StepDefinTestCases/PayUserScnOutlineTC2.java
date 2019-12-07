package com.StepDefinTestCases;



import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;
import com.ObjectRepository.PayUserPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayUserScnOutlineTC2 {

public 	WebDriver driver;
	
	@Given("^Website launched also business user is able to loggin with the authorized credentials$")
	public void website_launched_also_business_user_is_able_to_loggin_with_the_authorized_credentials() 
	
	{
		BaseClass baseclass = new BaseClass();
		
		driver=baseclass.baseSetupAndLogin();
		
	}

	@When("^Data details are User\\(quick search\\) \"([^\"]*)\"  Amount \"([^\"]*)\" system is able to make the payment$")
	public void data_details_are_User_quick_search_Amount_system_is_able_to_make_the_payment(String quickUser, String Amount) throws InterruptedException 
	
	{
	
		PayUserPageObject payuser = new PayUserPageObject(driver);
		
		
		payuser.paymentUserQuickSearch(quickUser, Amount);
		
		
    
		
	}
	
	
	
	@Then("^System is able to make the required payment$")
	public void system_is_able_to_make_the_required_payment() throws InterruptedException 
	{
	
		PayUserPageObject payuser = new PayUserPageObject(driver);
    	payuser.paymentVerification();
		
    	driver.close();
    	
	}
	
	
	
	
	
}
