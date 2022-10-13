@placeOrder
Feature: Nopcommerce place order feature Test

  @test-2
  Scenario: User should be able to successfully place order as a guest user
    Given User go to the NopCommerce Home page
    When User click "Cell phones" option from "Electronics" category
    And User click on the "Nokia Lumia 1020" for product details
    And User set the quantity number 2 in the quantity field
    And User click on the "ADD TO CARD" button
    And User go to the shipping cart page
    And User accept terms conditions and click checkout button
    And User click checkout as guest button
    And User input all the billing details and click continue
    And User select shipping method "Next Day Air" and click continue
    And User select payment method "Credit Card" and click continue
    And User select "Visa" card and input card information
    And User click confirm button to place the order
    Then Verify that the order place message "Your order has been successfully processed!" is displayed
