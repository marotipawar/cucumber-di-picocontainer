package com.maroti.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
    @FindBy(name = "firstName")
    protected WebElement firstName;
    @FindBy(name = "lastName")
    protected WebElement lastName;
    @FindBy(name = "phone")
    protected WebElement phone;
    @FindBy(name = "userName")
    protected WebElement email;
    @FindBy(name = "address1")
    protected WebElement address;
    @FindBy(name = "city")
    protected WebElement city;
    @FindBy(name = "state")
    protected WebElement state;
    @FindBy(name = "postalCode")
    protected WebElement postalCode;
    @FindBy(name = "country")
    protected WebElement country;
    @FindBy(name = "email")
    protected WebElement username;
    @FindBy(name = "password")
    protected WebElement password;
    @FindBy(name = "confirmPassword")
    protected WebElement cnfPassword;
    @FindBy(name = "submit")
    protected WebElement submitBtn;
    
}
