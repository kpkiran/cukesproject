$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/search.feature");
formatter.feature({
  "name": "Search and place an order",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for items and validate results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@seleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on greenkart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDefinition.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for Cucumber vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDefinition.user_searched_for_something_vegetable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Cucumber\" resutls are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinition.something_resutls_are_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search for items and move to checkout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on greenkart landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User searched for \u003cName\u003e vegetable",
  "keyword": "When "
});
formatter.step({
  "name": "added items to cart",
  "keyword": "And "
});
formatter.step({
  "name": "user proceeds to checkout page",
  "keyword": "And "
});
formatter.step({
  "name": "verify selected \u003cName\u003e items are displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name"
      ]
    },
    {
      "cells": [
        "Brinjal"
      ]
    },
    {
      "cells": [
        "Beetroot"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for items and move to checkout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on greenkart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDefinition.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for Brinjal vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDefinition.user_searched_for_something_vegetable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "added items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefinition.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proceeds to checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefinition.user_proceeds_to_checkout_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected Brinjal items are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinition.verify_selected_items_are_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for items and move to checkout page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@seleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on greenkart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDefinition.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for Beetroot vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDefinition.user_searched_for_something_vegetable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "added items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefinition.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proceeds to checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefinition.user_proceeds_to_checkout_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected Beetroot items are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinition.verify_selected_items_are_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});