$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Assignment.feature");
formatter.feature({
  "name": "elearning application signup",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Signin to elearning application and send mail",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Assignment2"
    }
  ]
});
formatter.step({
  "name": "User navigates to elearning application",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter \"\u003cUsername\u003e\" Username and \"\u003cPass\u003e\" Pass",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Inbox and compose button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enter mail details \"\u003csendTo\u003e\" as sendTo \"\u003cSubject\u003e\" as Subject \"\u003cMessage\u003e\" as Message and mail body and send it successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Pass",
        "sendTo",
        "Subject",
        "Message"
      ]
    },
    {
      "cells": [
        "test534",
        "test127",
        "abc",
        "test",
        "Hi Its Working"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Signin to elearning application and send mail",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Assignment2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to elearning application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinationclass.user_navigates_to_elearning_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"test534\" Username and \"test127\" Pass",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinationclass.user_enter_Username_and_Pass(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Inbox and compose button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_Inbox_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter mail details \"abc\" as sendTo \"test\" as Subject \"Hi Its Working\" as Message and mail body and send it successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinationclass.user_enter_mail_details_as_sendTo_as_Subject_as_Message_and_mail_body_and_send_it_successfully(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});