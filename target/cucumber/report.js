$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios billing login functionality validation",
  "description": "",
  "id": "techfios-billing-login-functionality-validation",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "User is on the techfios loginpage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 6,
  "name": "User should login with valid credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User enter username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be on \"Dashboard\" page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "User is on the techfios loginpage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "User should login with valid credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User enter username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enter password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User clicks signin button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be on \"Dashboard\" page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "User is on the techfios loginpage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 22,
  "name": "User should login with invalid userid",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-login-with-invalid-userid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User enter username as \"demo1@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user enter password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User clicks signin button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User should be on \"Dashboard\" page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "User should not be able to login with credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-not-be-able-to-login-with-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@otherScenario"
    },
    {
      "line": 29,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User enter username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user enter password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User clicks signin button",
  "keyword": "And "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-not-be-able-to-login-with-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 37,
      "id": "techfios-billing-login-functionality-validation;user-should-not-be-able-to-login-with-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123"
      ],
      "line": 38,
      "id": "techfios-billing-login-functionality-validation;user-should-not-be-able-to-login-with-credentials;;2"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc1234"
      ],
      "line": 39,
      "id": "techfios-billing-login-functionality-validation;user-should-not-be-able-to-login-with-credentials;;3"
    },
    {
      "cells": [
        "demo@techfios.com",
        ""
      ],
      "line": 40,
      "id": "techfios-billing-login-functionality-validation;user-should-not-be-able-to-login-with-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "User is on the techfios loginpage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 38,
  "name": "User should not be able to login with credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-not-be-able-to-login-with-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@smoke"
    },
    {
      "line": 29,
      "name": "@otherScenario"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User enter username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user enter password as \"abc123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User clicks signin button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "User is on the techfios loginpage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 39,
  "name": "User should not be able to login with credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-not-be-able-to-login-with-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@smoke"
    },
    {
      "line": 29,
      "name": "@otherScenario"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User enter username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user enter password as \"abc1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User clicks signin button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "User is on the techfios loginpage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 40,
  "name": "User should not be able to login with credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-not-be-able-to-login-with-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@smoke"
    },
    {
      "line": 29,
      "name": "@otherScenario"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User enter username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user enter password as \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User clicks signin button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});