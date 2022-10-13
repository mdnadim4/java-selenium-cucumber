package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPages {
    WebDriver driver;

    public RegistrationPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register;
    @FindBy(id="gender-male")
    WebElement maleGender;
    @FindBy(id="FirstName")
    WebElement firstName;
    @FindBy(id="LastName")
    WebElement lastName;
    @FindBy(className = "DateOfBirthDay")
    WebElement day;
    @FindBy(className = "DateOfBirthMonth")
    WebElement month;
    @FindBy(className = "DateOfBirthYear")
    WebElement year;
    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Company")
    WebElement company;
    @FindBy(id = "Password")
    WebElement password;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPass;
    @FindBy(id = "register-button")
    WebElement registerBtn;

    public void setGender() {
        maleGender.click();
    }
    public void setFirstName(String firstname) {
        firstName.sendKeys(firstname);
    }
    public void setLastname(String lastname) {
        lastName.sendKeys(lastname);
    }
    public void setEmail(String emailAddress) {
        email.sendKeys(emailAddress);
    }
    public void setCompany(String companyName) {
        company.sendKeys(companyName);
    }
    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }
    public void setConfirmPass(String confirmPwd) {
        confirmPass.sendKeys(confirmPwd);
    }
    public void clickToRegisterBtn() {
        registerBtn.click();
    }


}
