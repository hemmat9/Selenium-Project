package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createNewAccoutn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccoutn.click();
    }
}
