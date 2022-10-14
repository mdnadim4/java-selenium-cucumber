package com.nopcommerce.stepDefinitions;

import com.nopcommerce.pageObjects.PlaceOrderPages;
import com.nopcommerce.testCases.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.nopcommerce.testCases.BaseClass.driver;

public class PlaceOrderSteps extends BaseClass {

    PlaceOrderPages placeOrderPage = new PlaceOrderPages(driver);

    @Given("User go to the NopCommerce Home page")
    public void user_go_to_the_nop_commerce_home_page() {
        placeOrderPage.navigate(baseURL);
    }
    @When("User click {string} option from {string} category")
    public void user_click_option_from_category(String string, String string2) {
        placeOrderPage.electronicsNav();
        placeOrderPage.cellPhones();
    }
    @When("User click on the {string} for product details")
    public void user_click_on_the_for_product_details(String string) {
        placeOrderPage.nokiaLumia();
    }
    @When("User set the quantity number {int} in the quantity field")
    public void user_set_the_quantity_number_in_the_quantity_field(Integer int1) {
        placeOrderPage.setQuantity(2);
    }
    @When("User click on the {string} button")
    public void user_click_on_the_button(String string) {
        placeOrderPage.addToCart();
    }
    @When("User go to the shipping cart page")
    public void user_go_to_the_shipping_cart_page() {
        placeOrderPage.shoppingCart();
        placeOrderPage.goToCartBtn();
    }
    @When("User accept terms conditions and click checkout button")
    public void user_accept_terms_conditions_and_click_checkout_button() {
        placeOrderPage.termsServices();
        placeOrderPage.checkout();
    }
    @When("User click checkout as guest button")
    public void user_click_checkout_as_guest_button() {
        placeOrderPage.checkoutAsGuest();
    }
    @When("User input all the billing details and click continue")
    public void user_input_all_the_billing_details_and_click_continue() {

    }
    @When("User select shipping method {string} and click continue")
    public void user_select_shipping_method_and_click_continue(String string) {

    }
    @When("User select payment method {string} and click continue")
    public void user_select_payment_method_and_click_continue(String string) {

    }
    @When("User select {string} card and input card information")
    public void user_select_card_and_input_card_information(String string) {

    }
    @When("User click confirm button to place the order")
    public void user_click_confirm_button_to_place_the_order() {

    }
    @Then("Verify that the order place message {string} is displayed")
    public void verify_that_the_order_place_message_is_displayed(String string) {

    }
}
