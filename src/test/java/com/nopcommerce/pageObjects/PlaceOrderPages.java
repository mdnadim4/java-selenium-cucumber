package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPages {

    WebDriver driver;

    public PlaceOrderPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Electronics")
    WebElement electronicsNav;
    @FindBy(partialLinkText = "Cell phones")
    WebElement cellPhones;
    @FindBy(partialLinkText = "Nokia Lumia 1020")
    WebElement nokiaLumia;
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantity;
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCart;
    @FindBy(partialLinkText = "Shopping cart")
    WebElement shoppingCart;
    @FindBy(partialLinkText = "Go to cart")
    WebElement goToCartBtn;
    @FindBy(id = "termsofservice")
    WebElement termsServices;
    @FindBy(id = "checkout")
    WebElement checkout;
    @FindBy(partialLinkText = "Checkout as Guest")
    WebElement checkoutAsGuest;
    @FindBy(id="BillingNewAddress_FirstName")
    WebElement billFirstName;
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement billLastName;
    @FindBy(id = "BillingNewAddress_Email")
    WebElement billEmail;
    @FindBy(id = "BillingNewAddress_Company")
    WebElement billCompany;
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement billCountry;
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement billState;
    @FindBy(id = "BillingNewAddress_City")
    WebElement billCity;
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement billAddress;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement billZipCode;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement billPhoneNumber;
    @FindBy(id = "BillingNewAddress_FaxNumber")
    WebElement billFaxNumber;
    @FindBy(partialLinkText = "Continue")
    WebElement billContinueBtn;
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAirBtn;
    @FindBy(id = "paymentmethod_1")
    WebElement creditCard;
    @FindBy(id = "CreditCardType")
    WebElement selectCreditCard;
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;
    @FindBy(id = "ExpireYear")
    WebElement expireYear;
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @FindBy(partialLinkText = "Confirm")
    WebElement confirmBtn;
    @FindBy(partialLinkText = "successfully processed!")
    WebElement thankYouMsg;

    public void navigate(String baseUrl) {
        driver.get(baseUrl);
    }
    public void electronicsNav() {
        electronicsNav.click();
    }
    public void cellPhones() {
        cellPhones.click();
    }
    public void nokiaLumia() {
        nokiaLumia.click();
    }
    public void setQuantity(int count) {
        quantity.sendKeys(count);
    }
    public void addToCart() {
        addToCart.click();
    }
    public void shoppingCart() {
        shoppingCart.click();
    }
    public void goToCartBtn() {
        goToCartBtn.click();
    }
    public void termsServices() {
        termsServices.click();
    }
    public void checkout() {
        checkout.click();
    }
    public void checkoutAsGuest() {
        checkoutAsGuest.click();
    }
    public void setBillFirstName(String billfirstname) {
        billFirstName.sendKeys(billfirstname);
    }
    public void setBillLastName(String billlastname) {
        billLastName.sendKeys(billlastname);
    }
    public void setBillEmail(String billemail) {
        billEmail.sendKeys(billemail);
    }
    public void setBillCompany(String billcompany) {
        billCompany.sendKeys(billcompany);
    }
    public void setBillCountry() {
        billCountry.click();
    }
    public void setBillState() {
        billState.click();
    }
    public void setBillCity(String city) {
        billCity.sendKeys(city);
    }
    public void setBillAddress(String billaddress) {
        billAddress.sendKeys(billaddress);
    }
    public void setBillZipCode(String zipcode) {
        billZipCode.sendKeys(zipcode);
    }
    public void setBillPhoneNumber(String phonenumber) {
        billPhoneNumber.sendKeys(phonenumber);
    }
    public void setBillFaxNumber(String faxnumber) {
        billFaxNumber.sendKeys(faxnumber);
    }
    public void billContinueBtn() {
        billContinueBtn.click();
    }
    public void nextDayAirBtn() {
        nextDayAirBtn.click();
    }
    public void creditCard() {
        creditCard.click();
    }
    public void selectCreditCard() {
        selectCreditCard.click();
    }
    public void cardHolderName(String cardholdername) {
        cardHolderName.sendKeys(cardholdername);
    }
    public void cardNumber(String cardnumber) {
        cardNumber.sendKeys(cardnumber);
    }
    public void expireMonth() {
        expireMonth.click();
    }
    public void expireYear() {
        expireYear.click();
    }
    public void cardCode(String cardcode) {
        cardCode.sendKeys(cardcode);
    }
    public void confirmBtn() {
        confirmBtn.click();
    }
    public WebElement thankYouMsg() {
        return thankYouMsg;
    }

}
