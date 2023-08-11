package com.maroti.steps;

import com.maroti.di.DInjection;
import com.maroti.driver.WebDriverManager;
import com.maroti.model.Register;
import com.maroti.page.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterSteps {
    private RegisterPage registerPage;
    private WebDriver driver;

    public RegisterSteps(DInjection inject) {
        this.driver=inject.driver;
        this.registerPage = inject.page;
    }

    @Given("open guru99 application")
    public void open_guru99_application(){
    }
    @When("click on register link")
    public void click_on_register_link() {

    }
    @When("enter the required details of user")
    public void enter_the_required_details_of_user(List<Register> reg) {
        registerPage.register(reg.get(0));
        System.out.println(reg);
    }
    @Then("click on register buttton")
    public void click_on_register_buttton() {

    }
}
