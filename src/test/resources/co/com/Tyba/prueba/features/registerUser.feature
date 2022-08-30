#Language: en
#Author: Brayant Gamboa Betancur
@RegressionTest @ResgisterUser
Feature: Register user in website


  Background:
    Given the user selects the register option in the menu main

  @CreateSuccessful
  Scenario: A user wants to register successful
    When A user enters their data to create their account
    Then the system create the user successful


  @ConfirmPasswordIncorrect
  Scenario: A user wants to register but the password does not match
    When A user enters confirm password a wrong
    Then the system cannot register it

  @EmailInvalid
  Scenario: A user type email with an invalid format
    When A user enters an invalid format email
    Then the system going to notify her email invalid