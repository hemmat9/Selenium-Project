package com.syntax.class02.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Jane");
        driver.findElement(By.name("lastname")).sendKeys("Doe");
        driver.findElement(By.name("reg_email__")).sendKeys("Jane.doe@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Jane.doe@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("JaneDoe1234");
        driver.findElement(By.id("month")).sendKeys("Jan");
        driver.findElement(By.id("day")).sendKeys("1");
        driver.findElement(By.id("year")).sendKeys("1980");
        driver.findElement(By.name("sex")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();
        driver.close();


    }
}
