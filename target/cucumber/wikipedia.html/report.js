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
  "name": "A List of homes that matches the specification should be printed",
  "keyword": "Then "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesTheSpecificationShouldBePrinted()"
});
formatter.result({
  "status": "passed"
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
  "name": "Search about home with specfic number of bed rooms",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about home with 3 bed rooms",
  "keyword": "When "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.iSearchAboutHomeWithBedRooms(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A List of homes that matches the specification should be printed",
  "keyword": "Then "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesTheSpecificationShouldBePrinted()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected: java.util.ArrayList\u003c[Home [area\u003d150.0 ,price\u003d510 ,no_of_bedrooms\u003d3 ,lease_length\u003d6]]\u003e but was: java.util.ArrayList\u003c[Home [area\u003d150.0 ,price\u003d510 ,no_of_bedrooms\u003d3 ,lease_length\u003d6]]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesTheSpecificationShouldBePrinted(SearchHomeSteps.java:60)\r\n\tat ✽.A List of homes that matches the specification should be printed(file:///C:/Users/hp/eclipse-workspace/fall2020Project2ndAssignment/use_cases/Search.feature:18)\r\n",
  "status": "failed"
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
  "name": "Search about home with specfic number of bathrooms",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about home with 2 bathrooms",
  "keyword": "When "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.iSearchAboutHomeWithBathrooms(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A List of homes that matches the specification should be printed",
  "keyword": "Then "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesTheSpecificationShouldBePrinted()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected: java.util.ArrayList\u003c[Home [area\u003d150.0 ,price\u003d510 ,no_of_bedrooms\u003d3 ,lease_length\u003d6], Home [area\u003d120.0 ,price\u003d230 ,no_of_bedrooms\u003d4 ,lease_length\u003d12]]\u003e but was: java.util.ArrayList\u003c[Home [area\u003d150.0 ,price\u003d510 ,no_of_bedrooms\u003d3 ,lease_length\u003d6], Home [area\u003d120.0 ,price\u003d230 ,no_of_bedrooms\u003d4 ,lease_length\u003d12]]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesTheSpecificationShouldBePrinted(SearchHomeSteps.java:60)\r\n\tat ✽.A List of homes that matches the specification should be printed(file:///C:/Users/hp/eclipse-workspace/fall2020Project2ndAssignment/use_cases/Search.feature:21)\r\n",
  "status": "failed"
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
  "name": "Search about home that allows pets",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about home that allows pets",
  "keyword": "When "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.iSearchAboutHomeThatAllowsPets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A List of homes that matches the specification should be printed",
  "keyword": "Then "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesTheSpecificationShouldBePrinted()"
});
formatter.result({
  "status": "passed"
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
  "name": "Search about home with specfic lease length",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about home with 6 months of lease",
  "keyword": "When "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.iSearchAboutHomeWithMonthsOfLease(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A List of homes that matches the specification should be printed",
  "keyword": "Then "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesTheSpecificationShouldBePrinted()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected: java.util.ArrayList\u003c[Home [area\u003d150.0 ,price\u003d510 ,no_of_bedrooms\u003d3 ,lease_length\u003d6]]\u003e but was: java.util.ArrayList\u003c[Home [area\u003d150.0 ,price\u003d510 ,no_of_bedrooms\u003d3 ,lease_length\u003d6]]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesTheSpecificationShouldBePrinted(SearchHomeSteps.java:60)\r\n\tat ✽.A List of homes that matches the specification should be printed(file:///C:/Users/hp/eclipse-workspace/fall2020Project2ndAssignment/use_cases/Search.feature:27)\r\n",
  "status": "failed"
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
  "name": "Search about home with with a specific amentie",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about home that has an elevator",
  "keyword": "When "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.iSearchAboutHomeThatHasAnElevator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A List of homes that matches the specification should be printed",
  "keyword": "Then "
});
formatter.match({
  "location": "fall2020Project2ndAssignTest.SearchHomeSteps.aListOfHomesThatMatchesTheSpecificationShouldBePrinted()"
});
formatter.result({
  "status": "passed"
});
});