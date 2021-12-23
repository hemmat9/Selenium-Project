package com.syntax.class04.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.findElement(By.cssSelector("input[name*='first']")).sendKeys("Farhad");
        driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("Hemmat");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("farhad.hemmat9@gmail.com");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("999-999-9999");
        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("3000 Clayton");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Concord");
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("94519");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("www.clayton.com");
        driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("I love Selenium classes");

    }
}
