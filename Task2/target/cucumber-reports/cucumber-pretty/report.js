$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login1.feature");
formatter.feature({
  "line": 1,
  "name": "Sample Test Page",
  "description": "",
  "id": "sample-test-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Sample Login Page",
  "description": "",
  "id": "sample-test-page;sample-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch google chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"\u003csource\u003e\" and \"\u003cdestination\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "title of login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "take the screen shot the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "sample-test-page;sample-login-page;",
  "rows": [
    {
      "cells": [
        "source",
        "destination"
      ],
      "line": 11,
      "id": "sample-test-page;sample-login-page;;1"
    },
    {
      "cells": [
        "Brussels, Belgium (BRU-Brussels - National)",
        "New York, New York"
      ],
      "line": 12,
      "id": "sample-test-page;sample-login-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Sample Login Page",
  "description": "",
  "id": "sample-test-page;sample-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch google chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"Brussels, Belgium (BRU-Brussels - National)\" and \"New York, New York\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "title of login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "take the screen shot the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Brussels, Belgium (BRU-Brussels - National)",
      "offset": 13
    },
    {
      "val": "New York, New York",
      "offset": 63
    }
  ],
  "location": "LoginStepDefinition.enter_keyword(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});