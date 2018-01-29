$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProductList.feature");
formatter.feature({
  "line": 1,
  "name": "ProductList",
  "description": "",
  "id": "productlist",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Product list page should be displayed",
  "description": "",
  "id": "productlist;product-list-page-should-be-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter valid product details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I select search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Product list page should displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdef.i_am_in_homepage()"
});
formatter.result({
  "duration": 30061865797,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.i_enter_valid_product_details()"
});
formatter.result({
  "duration": 2325686367,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.i_select_search_button()"
});
formatter.result({
  "duration": 8207207511,
  "status": "passed"
});
formatter.match({
  "location": "ProductListStepdef.product_list_page_should_displayed()"
});
formatter.result({
  "duration": 332521573,
  "status": "passed"
});
});