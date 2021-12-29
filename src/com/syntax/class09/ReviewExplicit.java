package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ReviewExplicit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement btn = driver.findElement(By.cssSelector("button#enable-button"));
        btn.click();
        WebDriverWait wait = new WebDriverWait(driver, 12);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));
        //print wether the button is enabled or disabled
        System.out.println(btn.isEnabled());
        WebElement btn2 = driver.findElement(By.cssSelector("button#disable"));
        System.out.println(btn2.isEnabled());
        btn2.click();


    }
}