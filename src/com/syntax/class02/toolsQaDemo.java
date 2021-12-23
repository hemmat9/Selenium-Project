package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsQaDemo {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");//returns webElement
        WebElement textBox =driver.findElement(By.name("form-control"));
        textBox.sendKeys("dsfasdfasfsaf");//it didn't go to the desired web element"Current address", coz it had exactly another webelement by that value
    }
}