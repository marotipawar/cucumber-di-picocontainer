package com.maroti.page;

import com.maroti.locators.RegisterLocators;
import com.maroti.model.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends RegisterLocators {
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void register(Register register){
        firstName.sendKeys(register.getFirstName());
        lastName.sendKeys(register.getLastName());
        email.sendKeys(register.getEmail());
        phone.sendKeys(register.getPhone());
        address.sendKeys(register.getAddress());
        city.sendKeys(register.getCity());
        state.sendKeys(register.getState());
        postalCode.sendKeys(register.getPostalCode());
        Select select = new Select(country);
        select.selectByVisibleText(register.getCountry());
        username.sendKeys(register.getUsername());
        password.sendKeys(register.getPassword());
        cnfPassword.sendKeys(register.getCnfPassword());
    }

    public void submitRegisterInformation(){


    }
}














