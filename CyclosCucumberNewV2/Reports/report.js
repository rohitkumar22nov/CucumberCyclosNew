$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CyclosFunctioanlTest.feature");
formatter.feature({
  "line": 1,
  "name": "This feature file is to test the functionalities of Cyclos Website",
  "description": "",
  "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Validate whether payment is being made to existing user is successful",
  "description": "",
  "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@PayUser_DataTable"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Required website is launched also business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Following are the payment details",
  "rows": [
    {
      "cells": [
        "User(quick search)",
        "Amount"
      ],
      "line": 8
    },
    {
      "cells": [
        "Nicola  Tesla",
        "1"
      ],
      "line": 9
    },
    {
      "cells": [
        "Hotel  Oasis",
        "1"
      ],
      "line": 10
    },
    {
      "cells": [
        "Henry  George",
        "1"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "System is able to make the desired payment",
  "keyword": "Then "
});
formatter.match({
  "location": "PayUserDataTableTC1.required_website_is_launched_also_business_user_is_able_to_loggin_with_the_authorized_credentials()"
});
formatter.result({
  "duration": 18325017000,
  "status": "passed"
});
formatter.match({
  "location": "PayUserDataTableTC1.following_are_the_payment_details(DataTable)"
});
formatter.result({
  "duration": 31154337900,
  "status": "passed"
});
formatter.match({
  "location": "PayUserDataTableTC1.system_is_able_to_make_the_desired_payment()"
});
formatter.result({
  "duration": 4360239400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Validate whether payment is being made to existing user is successful",
  "description": "",
  "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@PayUser_ScenarioOutline"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Website launched also business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Data details are User(quick search) \"\u003cUser(quick search)\u003e\"  Amount \"\u003cAmount\u003e\" system is able to make the payment",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "System is able to make the required payment",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful;",
  "rows": [
    {
      "cells": [
        "User(quick search)",
        "Amount"
      ],
      "line": 20,
      "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful;;1"
    },
    {
      "cells": [
        "Nicola  Tesla",
        "2"
      ],
      "line": 21,
      "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful;;2"
    },
    {
      "cells": [
        "Hotel  Oasis",
        "2"
      ],
      "line": 22,
      "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful;;3"
    },
    {
      "cells": [
        "Henry  George",
        "2"
      ],
      "line": 23,
      "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Validate whether payment is being made to existing user is successful",
  "description": "",
  "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@PayUser_ScenarioOutline"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Website launched also business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Data details are User(quick search) \"Nicola  Tesla\"  Amount \"2\" system is able to make the payment",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "System is able to make the required payment",
  "keyword": "Then "
});
formatter.match({
  "location": "PayUserScnOutlineTC2.website_launched_also_business_user_is_able_to_loggin_with_the_authorized_credentials()"
});
formatter.result({
  "duration": 18785614400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nicola  Tesla",
      "offset": 37
    },
    {
      "val": "2",
      "offset": 61
    }
  ],
  "location": "PayUserScnOutlineTC2.data_details_are_User_quick_search_Amount_system_is_able_to_make_the_payment(String,String)"
});
formatter.result({
  "duration": 22584303400,
  "status": "passed"
});
formatter.match({
  "location": "PayUserScnOutlineTC2.system_is_able_to_make_the_required_payment()"
});
formatter.result({
  "duration": 4347923200,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Validate whether payment is being made to existing user is successful",
  "description": "",
  "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@PayUser_ScenarioOutline"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Website launched also business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Data details are User(quick search) \"Hotel  Oasis\"  Amount \"2\" system is able to make the payment",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "System is able to make the required payment",
  "keyword": "Then "
});
formatter.match({
  "location": "PayUserScnOutlineTC2.website_launched_also_business_user_is_able_to_loggin_with_the_authorized_credentials()"
});
formatter.result({
  "duration": 22854863600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel  Oasis",
      "offset": 37
    },
    {
      "val": "2",
      "offset": 60
    }
  ],
  "location": "PayUserScnOutlineTC2.data_details_are_User_quick_search_Amount_system_is_able_to_make_the_payment(String,String)"
});
formatter.result({
  "duration": 16208301500,
  "status": "passed"
});
formatter.match({
  "location": "PayUserScnOutlineTC2.system_is_able_to_make_the_required_payment()"
});
formatter.result({
  "duration": 4334830400,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Validate whether payment is being made to existing user is successful",
  "description": "",
  "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@PayUser_ScenarioOutline"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Website launched also business user is able to loggin with the authorized credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Data details are User(quick search) \"Henry  George\"  Amount \"2\" system is able to make the payment",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "System is able to make the required payment",
  "keyword": "Then "
});
formatter.match({
  "location": "PayUserScnOutlineTC2.website_launched_also_business_user_is_able_to_loggin_with_the_authorized_credentials()"
});
formatter.result({
  "duration": 21778400800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Henry  George",
      "offset": 37
    },
    {
      "val": "2",
      "offset": 61
    }
  ],
  "location": "PayUserScnOutlineTC2.data_details_are_User_quick_search_Amount_system_is_able_to_make_the_payment(String,String)"
});
formatter.result({
  "duration": 15922669200,
  "status": "passed"
});
formatter.match({
  "location": "PayUserScnOutlineTC2.system_is_able_to_make_the_required_payment()"
});
formatter.result({
  "duration": 4317686500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Validate whether payment is being made to existing user is successful by fetching data from csv file",
  "description": "",
  "id": "this-feature-file-is-to-test-the-functionalities-of-cyclos-website;validate-whether-payment-is-being-made-to-existing-user-is-successful-by-fetching-data-from-csv-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@PayUser_DataDrivenExternalSource"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Launching the Cyclos website and using the account id with passowrd to gain access",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Data data is being fetched from \"./TestData/CyclosNew.csv\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Payment is being done by the system",
  "keyword": "Then "
});
formatter.match({
  "location": "PayUserCSVdataTC3.launching_the_Cyclos_website_and_using_the_account_id_with_passowrd_to_gain_access()"
});
formatter.result({
  "duration": 19333519700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "./TestData/CyclosNew.csv",
      "offset": 33
    }
  ],
  "location": "PayUserCSVdataTC3.data_data_is_being_fetched_from(String)"
});
formatter.result({
  "duration": 37601346800,
  "status": "passed"
});
formatter.match({
  "location": "PayUserCSVdataTC3.payment_is_being_done_by_the_system()"
});
formatter.result({
  "duration": 4349239900,
  "status": "passed"
});
});