package com.StepDefinTestCases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;
import com.ObjectRepository.PayUserPageObject;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayUserCSVdataTC3 {

public WebDriver driver;	
	
	
	@Given("^Launching the Cyclos website and using the account id with passowrd to gain access$")
	public void launching_the_Cyclos_website_and_using_the_account_id_with_passowrd_to_gain_access()
	{
		BaseClass baseclass = new BaseClass();
		
		driver=baseclass.baseSetupAndLogin();
		
	}

	@When("^Data data is being fetched from \"([^\"]*)\"$")
	public void data_data_is_being_fetched_from(String path) throws IOException, InterruptedException  
	
	{
		System.out.println("path is: "+ "" + path);
	
		
		
	//	 String csvFile = "/Users/mkyong/csv/country3.csv";

		BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);

               String User = data[0];
               String Amount = data[1];
              System.out.println("User [User = " + data[0] + " , Amount=" + data[1] + "]");
              //  System.out.println("User [code= " + data[0]);
              
              System.out.println(User);
              System.out.println(Amount);
                 
              driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
              PayUserPageObject payuser = new PayUserPageObject(driver);
              
              payuser.paymentUserQuickSearch(User, Amount);
              

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

		
		
		
		
		
	}

	@Then("^Payment is being done by the system$")
	public void payment_is_being_done_by_the_system() throws InterruptedException 
	{
	
		PayUserPageObject payuser = new PayUserPageObject(driver);
    	payuser.paymentVerification();
    	
    	driver.close();
    	
		
	}
	
	
}
