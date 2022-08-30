#Language: en
#Author: Brayant Gamboa Betancur
@RegressionTest @ShoppingTest
Feature: shopping with user in website

  Background:
    Given the user selects the register option in the menu main
    When A user enters their data to create their account
    Then the system create the user successful

  Scenario: The user shopping in website
    Given the user selects the option in menu popular items
    When A user select items in the page for purchase
    Then make the purchase successfully


