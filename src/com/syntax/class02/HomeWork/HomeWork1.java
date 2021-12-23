package com.syntax.class02.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Farhad");
        driver.findElement(By.id("customer.lastName")).sendKeys("Hemmat");
        driver.findElement(By.id("customer.address.street")).sendKeys("3233 Clayton Road");
        driver.findElement(By.id("customer.address.city")).sendKeys("Hayward");
        driver.findElement(By.id("customer.address.state")).sendKeys("CA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("98758");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("925-000-1111");
        driver.findElement(By.id("customer.ssn")).sendKeys("111111111");
        driver.findElement(By.id("customer.username")).sendKeys("FarhadHemmat");
        driver.findElement(By.id("customer.password")).sendKeys("Far12345");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Far12345");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();






    }
}
