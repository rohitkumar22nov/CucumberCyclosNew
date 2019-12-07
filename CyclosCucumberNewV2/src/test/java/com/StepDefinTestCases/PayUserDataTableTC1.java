package com.StepDefinTestCases;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.Base.BaseClass;
import com.ObjectRepository.PayUserPageObject;


import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayUserDataTableTC1<ITestResult> {
	
	public WebDriver driver;
	public Scenario scenario;
	
	@Given("^Required website is launched also business user is able to loggin with the authorized credentials$")
	public void required_website_is_launched_also_business_user_is_able_to_loggin_with_the_authorized_credentials()
	{
		
		BaseClass baseclass = new BaseClass();
		driver=baseclass.baseSetupAndLogin();
		
	}

	@When("^Following are the payment details$")
	public void following_are_the_payment_details(DataTable dt) throws InterruptedException 
	{
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		PayUserPageObject payuser = new PayUserPageObject(driver);
		
		List<Map <String, String>> data = dt.asMaps(String.class, String.class);
		
		
		for(int i=0; i<data.size(); i++)
			try {
				{
					
		

					String quickUser = data.get(i).get("User(quick search)"); 
					
						
					String amountPay = data.get(i).get("Amount");
					
					
							
					payuser.paymentUserQuickSearch(quickUser, amountPay);

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Then("^System is able to make the desired payment$")
	public void system_is_able_to_make_the_desired_payment() throws InterruptedException  
	{
	
				
		PayUserPageObject payuser = new PayUserPageObject(driver);
    	payuser.paymentVerification();
		
			
		

		BaseClass baseclass = new BaseClass();
		
	//	baseclass.screenShots(scenario);
		
		
		driver.close();
		
	}


		
	

}
