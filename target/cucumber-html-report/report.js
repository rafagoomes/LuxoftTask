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
  "name": "Open Wealth Management page",
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
  "keyword": "When "
});
formatter.match({
  "location": "TestRunner.Steps.clickOnWealthManagement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Multi Family Page is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "TestRunner.Steps.validateMultiFamilyPageIsOpened()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "keyword": "When "
});
formatter.match({
  "location": "TestRunner.Steps.fillForm()"
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
formatter.scenario({
  "name": "Do a search on UBS in Society Page",
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
  "name": "I Search for Brazil content",
  "keyword": "And "
});
formatter.match({
  "location": "TestRunner.Steps.searchForBrazilContent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check if search results has expected result",
  "keyword": "Then "
});
formatter.match({
  "location": "TestRunner.Steps.checkSearchResult()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});