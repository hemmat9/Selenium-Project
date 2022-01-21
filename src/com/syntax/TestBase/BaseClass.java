package com.syntax.HomeWorkClass12.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;//we have to make it instance and make it public and static to have it across all the classes


    public static void openWithUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}