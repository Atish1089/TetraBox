$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BoxLogin.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author       :  TetraNoodle"
    },
    {
      "line": 2,
      "value": "#Scenario     :  Login and Logout from Box app"
    },
    {
      "line": 3,
      "value": "#Application  :  Box"
    }
  ],
  "line": 4,
  "name": "Box loginlogout",
  "description": "",
  "id": "box-loginlogout",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 25,
  "name": "Box Loginlogout negative scenario",
  "description": "",
  "id": "box-loginlogout;box-loginlogout-negative-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@login123"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I want to navigate to box website",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "page with title \"Box | Login\" should open",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user enter \"\u003cuser\u003e\" username",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Click on Next button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User should be able to enter \"\u003cpassword\u003e\" password",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "error message \"\u003cmessage\u003e\" is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "box-loginlogout;box-loginlogout-negative-scenario;",
  "rows": [
    {
      "cells": [
        "user",
        "password",
        "message"
      ],
      "line": 35,
      "id": "box-loginlogout;box-loginlogout-negative-scenario;;1"
    },
    {
      "cells": [
        "abc@def.com",
        "12345",
        "Login Credentials"
      ],
      "line": 36,
      "id": "box-loginlogout;box-loginlogout-negative-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8130510868,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Box Loginlogout negative scenario",
  "description": "",
  "id": "box-loginlogout;box-loginlogout-negative-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@login123"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I want to navigate to box website",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "page with title \"Box | Login\" should open",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user enter \"abc@def.com\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Click on Next button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User should be able to enter \"12345\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "error message \"Login Credentials\" is displayed",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BoxLoginLogoutSteps.navigateToBox()"
});
formatter.result({
  "duration": 3206617525,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Box | Login",
      "offset": 17
    }
  ],
  "location": "BoxLoginLogoutSteps.veriifyPageTitle(String)"
});
formatter.result({
  "duration": 23964627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@def.com",
      "offset": 12
    }
  ],
  "location": "BoxLoginLogoutSteps.enterUserName(String)"
});
formatter.result({
  "duration": 127520441,
  "status": "passed"
});
formatter.match({
  "location": "BoxLoginLogoutSteps.clickNext()"
});
formatter.result({
  "duration": 2234020940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 30
    }
  ],
  "location": "BoxLoginLogoutSteps.enterPassword(String)"
});
formatter.result({
  "duration": 66719171,
  "status": "passed"
});
formatter.match({
  "location": "BoxLoginLogoutSteps.clickLoginButton()"
});
formatter.result({
  "duration": 2474560313,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Credentials",
      "offset": 15
    }
  ],
  "location": "BoxLoginLogoutSteps.getErrorMessage(String)"
});
formatter.result({
  "duration": 92813736,
  "error_message": "org.junit.ComparisonFailure: Password not match expected:\u003c[Invalid ]Login Credentials\u003e but was:\u003c[]Login Credentials\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.stepDefinations.BoxLoginLogoutSteps.getErrorMessage(BoxLoginLogoutSteps.java:94)\r\n\tat ✽.Then error message \"Login Credentials\" is displayed(BoxLogin.feature:32)\r\n",
  "status": "failed"
});
});