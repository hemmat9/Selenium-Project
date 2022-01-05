package com.syntax.class12.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;


     /**This method will navigate to website given the URL
     @param url*/


    public static void openWithSpecificUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

    }
    /**
     this method will quit the opened browser
    */
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}