Feature: Login
  As a web user
  I want to login in sahitest
  to purchase the books

  @login
  Scenario Outline: Login sucessful
    Given that <username> wants to start session
    When she enter user <username> and password <password>
    Then she should see the books available in the screen

    Examples:
    |username|password|
    |test|secret|

  @login2
  Scenario Outline: Login failed with invalid password
    Given that <username> wants to start session with invalid data
    When she enter user <username> and invalid password <password>
    Then she should see error message Invalid username or password in the screen

    Examples:
    |username|password|
    |test|123456|
    |logi|secret|
    |test||
    ||123456|
    |||
