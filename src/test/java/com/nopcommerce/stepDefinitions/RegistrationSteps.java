package com.nopcommerce.stepDefinitions;

import com.nopcommerce.baseClass.BaseClass;
import com.nopcommerce.pageObjects.RegistrationPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegistrationSteps extends BaseClass {

    RegistrationPages registrationPages = new RegistrationPages(driver);

    @Given("User go to the NopCommerce Home page")
    public void user_go_to_the_nop_commerce_home_page() {
        System.out.println("Step-1: User go to the NopCommerce Home page");
        registrationPages.navigate(baseURL);
    }
    @Given("User navigate to the Registration page")
    public void user_navigate_to_the_registration_page() {
        System.out.println("Step-2: User navigate to the Registration page");
        registrationPages.clickToRegisterBtn();
    }
    @When("User select the {word} as gender")
    public void user_select_the_as_gender(String genderType) {
        System.out.println("Step-3: User select the " + genderType + " as gender");
        if(genderType == "Male") {
            registrationPages.setMaleGender();
        }else if(genderType == "Female") {
            registrationPages.setFemaleGender();
        }
    }
    @When("User set first name and last name")
    public void user_set_first_name_and_last_name() {
        System.out.println("Step-4: User set first name and last name");
        registrationPages.setFirstName("Nadim");
        registrationPages.setLastname("Mahmud");
    }
    @When("User set {string} as date of birth")
    public void user_set_as_date_of_birth() {
        System.out.println("Step-5: User set {string} as date of birth");
        registrationPages.selectDay(5);
        registrationPages.selectMonth("December");
        registrationPages.selectMonth("1992");
    }
    @When("User set {string} as email")
    public void user_set_as_email(String dynamicEmail) {
        System.out.println("Step-5: User set " + dynamicEmail + "as email");
        registrationPages.setEmail(dynamicEmail);
    }
    @When("User set {string} as company details")
    public void user_set_as_company_details(String companyName) {
        System.out.println("Step-6: User set " + companyName + "as company details");
        registrationPages.setCompany(companyName);
    }
    @When("User set Newsletter option as {string}")
    public void user_set_newsletter_option_as(String string) {

    }
    @When("User set {string} as password and confirm password again")
    public void user_set_as_password_and_confirm_password_again(String password) {
        System.out.println("Step-8: User set " + password + " as password and confirm password again");
        registrationPages.setPassword(password);
        registrationPages.setConfirmPass(password);
    }
    @When("User click on the Register button")
    public void user_click_on_the_register_button() {
        System.out.println("Step-9: User click on the Register button");
        registrationPages.clickToRegisterBtn();
    }
    @Then("Verify that the new account registration message {string} is displayed")
    public void verify_that_the_new_account_registration_message_is_displayed(String msg) {
        System.out.println("Step-10: Verify the registration message " + msg + " is displayed");
        String actual = registrationPages.regSuccessMsg();
        String expected = "Your registration completed";
        Assert.assertEquals(actual,expected);
    }
}
