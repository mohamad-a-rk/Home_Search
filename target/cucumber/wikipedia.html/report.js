$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:use_cases/Search.feature");
formatter.feature({
  "name": "Search about suitable home",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these homes are contained in the system",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.theseHomesAreContainedInTheSystem(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search about home with less than a specific price",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about home with price less than 400",
  "keyword": "When "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.iSearchAboutHomeWithPriceLessThan(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A list of homes that matches the price specification should be returned and printed on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole()"
});
formatter.result({
  "status": "passed"
});
});