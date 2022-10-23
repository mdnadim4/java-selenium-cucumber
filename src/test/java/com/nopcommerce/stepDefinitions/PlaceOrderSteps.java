package com.nopcommerce.stepDefinitions;

import com.nopcommerce.pageObjects.PlaceOrderPages;
import com.nopcommerce.baseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PlaceOrderSteps extends BaseClass {

    PlaceOrderPages placeOrderPage = new PlaceOrderPages(driver);

    @Given("User go to the NopCommerce Home page")
    public void user_go_to_the_nop_commerce_home_page() {
        System.out.println("Step-1: User go to the NopCommerce Home page");
        placeOrderPage.navigate(baseURL);
    }
    @When("User click {string} option from {string} category")
    public void user_click_option_from_category(String option, String nav) {
        System.out.println("Step-2: User click on "+ option + "from category " + nav);
        placeOrderPage.electronicsNav();
        placeOrderPage.cellPhones();
    }
    @When("User click on the {string} for product details")
    public void user_click_on_the_for_product_details(String product) {
        System.out.println("Step-3: User click on the " + product + " for product details");
        placeOrderPage.nokiaLumia();
    }
    @When("User set the quantity number {int} in the quantity field")
    public void user_set_the_quantity_number_in_the_quantity_field(Integer quantity) {
        System.out.println("Step-4: User set the quantity number " + quantity + " in the quantity field");
        placeOrderPage.setQuantity(2);
    }
    @When("User click on the {string} button")
    public void user_click_on_the_button(String addToCart) {
        System.out.println("Step-5: User click on the " + addToCart + " button");
        placeOrderPage.addToCart();
    }
    @When("User go to the shipping cart page")
    public void user_go_to_the_shipping_cart_page() {
        System.out.println("Step-6: User go to the shipping cart page");
        placeOrderPage.shoppingCart();
        placeOrderPage.goToCartBtn();
    }
    @When("User accept terms conditions and click checkout button")
    public void user_accept_terms_conditions_and_click_checkout_button() {
        System.out.println("Step-7: User accept terms conditions and click checkout button");
        placeOrderPage.termsServices();
        placeOrderPage.checkout();
    }
    @When("User click checkout as guest button")
    public void user_click_checkout_as_guest_button() {
        System.out.println("Step-7: User click checkout as guest button");
        placeOrderPage.checkoutAsGuest();
    }
    @When("User input all the billing details and click continue")
    public void user_input_all_the_billing_details_and_click_continue() {
        System.out.println("Step-8: User input all the billing details and click continue");
        placeOrderPage.setBillFirstName("");
        placeOrderPage.setBillLastName("");
        placeOrderPage.setBillEmail("");
        placeOrderPage.setBillCompany("");
        placeOrderPage.setBillCountry();
        placeOrderPage.setBillState();
        placeOrderPage.setBillCity("");
        placeOrderPage.setBillAddress("");
        placeOrderPage.setBillZipCode("");
        placeOrderPage.setBillPhoneNumber("");
        placeOrderPage.setBillFaxNumber("");
        placeOrderPage.billContinueBtn();
    }
    @When("User select shipping method {string} and click continue")
    public void user_select_shipping_method_and_click_continue(String shippingMethod) {
        System.out.println("Step-9: User select shipping method " + shippingMethod +  " and click continue");
        placeOrderPage.nextDayAirBtn();
        placeOrderPage.continueBtn();
    }
    @When("User select payment method {string} and click continue")
    public void user_select_payment_method_and_click_continue(String paymentMethod) {
        System.out.println("Step-10: User select shipping method " + paymentMethod + " and click continue");
        placeOrderPage.creditCard();
        placeOrderPage.continueBtn();
    }
    @When("User select {string} card and input card information")
    public void user_select_card_and_input_card_information(String visa) {
        System.out.println("Step-11: User select " + visa + "card and input card information");
        placeOrderPage.selectCreditCard();
        placeOrderPage.cardHolderName("");
        placeOrderPage.cardNumber("");
        placeOrderPage.expireMonth();
        placeOrderPage.expireYear();
        placeOrderPage.cardCode("");
        placeOrderPage.continueBtn();
    }
    @When("User click confirm button to place the order")
    public void user_click_confirm_button_to_place_the_order() {
        System.out.println("Step-12: User click confirm button to place the order");
        placeOrderPage.confirmBtn();
    }
    @Then("Verify that the order place message {string} is displayed")
    public void verify_that_the_order_place_message_is_displayed(String msg) {
        System.out.println("Step-12: Verify that the order place message " + msg + " is displayed");
        String actual = placeOrderPage.thankYouMsg();
        String expected = "Your order has been successfully processed!";
        Assert.assertEquals(actual, expected);
    }
}
