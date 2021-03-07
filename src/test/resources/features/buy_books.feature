Feature: buy
  As a web user
  I want to buy a books in sahitest
  to learn programing

  @buy
  Scenario Outline: buy sucessful
    Given that the <username> with <password> wants to buy books
    When he buy core Java quantity <quantityJava>, ruby for rail quantity <quantityRuby>  and Python Cookbook quantity <quantityPython>
    Then she should see in the screen total buy value <totalBuyValue>

    Examples:
    |username|password|quantityJava|quantityRuby|quantityPython|totalBuyValue|
    |test|secret|3|5|2|2600|