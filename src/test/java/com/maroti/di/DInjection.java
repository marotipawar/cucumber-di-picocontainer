package com.maroti.di;

import com.maroti.driver.WebDriverManager;
import com.maroti.page.RegisterPage;
import org.openqa.selenium.WebDriver;

public class DInjection {
    public WebDriver driver;
    public RegisterPage page;

    public DInjection() {
        this.driver = WebDriverManager.getDriver();
        this.page = new RegisterPage(driver);
    }
}
