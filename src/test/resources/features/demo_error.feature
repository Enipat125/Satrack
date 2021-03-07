Feature: Demo errors
  As a web user
  I want to enter in the sahitest_demo
  to see error message

  @login
  Scenario: Error 500
    Given that user wants enter en the page sahitest_demo
    When she enter error pages and five hundred page
    Then she should see in screen http error five hundred
