package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class staleElementException {
    public static String url = "https://chercher.tech/practice/stale-element";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //find the refresh btn
        WebElement refresh = driver.findElement(By.cssSelector("button#refresh-button"));
        // wait eleven seconds and then click on it
        Thread.sleep(11000);
        // in order to handle exception locate it again
        driver.findElement(By.cssSelector("button#refresh-button"));
        //click on it
        refresh.click();
    }
}