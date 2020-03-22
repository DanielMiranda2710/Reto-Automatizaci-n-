#Author: danielmiranda47@gmail.com

Feature: successful purchase
  As a web user
  I want to buy some hp computer
  to my work

  Scenario: successful registration
    Given that user wants to register correctly
    When he writes his data correctly
    Then he should see his username in the navbar

  Scenario: successful purchase
    Given that user wants to buy some hp computer
    When he logs in and added the product to the shopping cart
    Then he should see the product added in the shopping cart