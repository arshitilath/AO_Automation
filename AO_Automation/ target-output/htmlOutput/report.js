$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/aspir/git/AO_Automation/AO_Automation/src/test/java/com/ao/features/AOTest.feature");
formatter.feature({
  "name": "Perform search for washing machines of a particular brand on AO.com and filter out product results based on colour feauture",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for washing machines",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigates to AO.COM Site",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductSearchTest.initialize_the_browser_with_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters washing machine in search products edit box and clicks on search icon",
  "keyword": "When "
});
formatter.match({
  "location": "ProductSearchTest.user_enters_washing_machine_in_search_products_edit_box_and_clicks_on_search_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that user is on washing machines results page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSearchTest.verify_that_user_is_returned_with_results_of_washing_machines()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on a \"Hotpoint\" brand under the shop for top brands list",
  "keyword": "When "
});
formatter.match({
  "location": "ProductSearchTest.user_clicks_on_a_brand_under_the_shop_for_top_brands_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify if the user is navigated to the lister page of selected brand",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSearchTest.verify_if_the_user_is_navigated_to_the_lister_page_of_that_brand()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User uses filter navigation on the left to filter products by \"White\" colour feature",
  "keyword": "When "
});
formatter.match({
  "location": "ProductSearchTest.user_uses_filter_navigation_on_the_left_to_filter_products_by_a_feature(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the results are successfully filtered based on selected colour",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSearchTest.verify_the_results_are_successfully_filtered_based_on_colour()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browsers",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSearchTest.close_browsers()"
});
formatter.result({
  "status": "passed"
});
});