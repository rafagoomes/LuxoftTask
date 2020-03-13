$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/sample.feature");
formatter.feature({
  "name": "Validate UBS Page features",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Tag"
    },
    {
      "name": "ChromeTest"
    }
  ]
});
formatter.scenario({
  "name": "Fill Get In Touch Form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Tag"
    },
    {
      "name": "ChromeTest"
    }
  ]
});
formatter.step({
  "name": "Open Chrome and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "TestRunner.Steps.navigateToUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Wealth Management page",
  "keyword": "And "
});
formatter.match({
  "location": "TestRunner.Steps.clickOnWealthManagement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Get In Touch Form",
  "keyword": "And "
});
formatter.match({
  "location": "TestRunner.Steps.navigateToGetInTouch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fulfill form fields",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TestRunner.Steps.fillForm(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on reset button",
  "keyword": "Then "
});
formatter.match({
  "location": "TestRunner.Steps.resetFillForm()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Do a search on UBS in Society Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to UBS In Society",
  "keyword": "And "
});
formatter.step({
  "name": "UBS in Society page is opened",
  "keyword": "When "
});
formatter.step({
  "name": "I Search for \u0027\u003cCountry\u003e\u0027 content",
  "keyword": "And "
});
formatter.step({
  "name": "I check if search results has \u0027\u003cExpectedResult\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Country",
        "ExpectedResult"
      ]
    },
    {
      "cells": [
        "Brazil",
        "Found 2 results for applied filters"
      ]
    },
    {
      "cells": [
        "Argentina",
        "Sorry, there are no results matching your criteria."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Do a search on UBS in Society Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Tag"
    },
    {
      "name": "ChromeTest"
    }
  ]
});
formatter.step({
  "name": "Open Chrome and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "TestRunner.Steps.navigateToUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to UBS In Society",
  "keyword": "And "
});
formatter.match({
  "location": "TestRunner.Steps.navigateToUbsInSociety()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "UBS in Society page is opened",
  "keyword": "When "
});
formatter.match({
  "location": "TestRunner.Steps.validateUbsInSocietyPageIsOpened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Search for \u0027Brazil\u0027 content",
  "keyword": "And "
});
formatter.match({
  "location": "TestRunner.Steps.searchForCountry(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if search results has \u0027Found 2 results for applied filters\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TestRunner.Steps.checkSearchResult(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Do a search on UBS in Society Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Tag"
    },
    {
      "name": "ChromeTest"
    }
  ]
});
formatter.step({
  "name": "Open Chrome and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "TestRunner.Steps.navigateToUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to UBS In Society",
  "keyword": "And "
});
formatter.match({
  "location": "TestRunner.Steps.navigateToUbsInSociety()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "UBS in Society page is opened",
  "keyword": "When "
});
formatter.match({
  "location": "TestRunner.Steps.validateUbsInSocietyPageIsOpened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Search for \u0027Argentina\u0027 content",
  "keyword": "And "
});
formatter.match({
  "location": "TestRunner.Steps.searchForCountry(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if search results has \u0027Sorry, there are no results matching your criteria.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TestRunner.Steps.checkSearchResult(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});