package com.maroti.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverManager {
    private static WebDriver driver;
    private static WebDriverManager manager;

    private WebDriverManager() {
            driver = new ChromeDriver() {{
            get("https://demo.guru99.com/test/newtours/register.php");
            manage().window().maximize();
            manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        }};

    }

    public static WebDriverManager setup() {

        if (manager == null) {
            manager = new WebDriverManager();
            return manager;
        }
        return manager;
    }

    public static WebDriver getDriver() {
        setup();
        return driver;
    }
}
