package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.getTitle();
        String title = driver.getTitle();
        System.out.println(title);
        driver.getCurrentUrl();
        String url = driver.getCurrentUrl();
        System.out.println("The url of this browser is: "+ url);
        driver.manage().window().maximize();
        driver.close();
    }
}
