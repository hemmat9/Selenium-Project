package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();
        //when the element is not there in the DOM then implicit wait is used, but if the element is there it doesn't work so we should use Thread.sleep();
        driver.findElement(By.cssSelector("button#startButton")).click();
        Thread.sleep(6000);
        //declare a implicite wait for finding elements
        WebElement text=driver.findElement(By.xpath("//div[@id='finish']/h4"));
        System.out.println(text.getText());

    }
}