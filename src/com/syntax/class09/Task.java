package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,12);
        WebElement btn = driver.findElement(By.cssSelector("button#checkbox"));
        btn.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector("button#checkbox")));
        WebElement checkBox= driver.findElement(By.cssSelector("input#ch"));
        checkBox.click();


    }
}
