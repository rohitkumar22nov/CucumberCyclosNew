package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

		@RunWith(Cucumber.class)
		@CucumberOptions(
			
		
features="Features",
       tags = {"@PayUser_DataTable, @PayUser_ScenarioOutline, @PayUser_DataDrivenExternalSource"},
        glue= {"com.StepDefinTestCases"},
      format= {"pretty", "html:Reports",
        		"json:Reports/cucumber.json",
        		"junit:Reports/cucumber.xml"
        		},
         //strict=false,
		 monochrome=true
		// dryRun = true
		)



public class PayUserRunner {

}
