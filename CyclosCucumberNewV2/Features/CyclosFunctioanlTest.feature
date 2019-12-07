Feature: This feature file is to test the functionalities of Cyclos Website


@PayUser_DataTable
Scenario: Validate whether payment is being made to existing user is successful
Given Required website is launched also business user is able to loggin with the authorized credentials
When Following are the payment details
|User(quick search)|Amount|
|Nicola  Tesla |1|
|Hotel  Oasis|1|
|Henry  George|1|
Then System is able to make the desired payment

@PayUser_ScenarioOutline
Scenario Outline: Validate whether payment is being made to existing user is successful
Given Website launched also business user is able to loggin with the authorized credentials
When Data details are User(quick search) "<User(quick search)>"  Amount "<Amount>" system is able to make the payment
Then System is able to make the required payment
Examples:
|User(quick search)|Amount|
|Nicola  Tesla|2|
|Hotel  Oasis|2|
|Henry  George|2|


@PayUser_DataDrivenExternalSource
Scenario: Validate whether payment is being made to existing user is successful by fetching data from csv file
Given Launching the Cyclos website and using the account id with passowrd to gain access 
When Data data is being fetched from "./TestData/CyclosNew.csv"
Then Payment is being done by the system


