package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.syntaxprojects.com");

        driver.findElement(By.xpath("//a[contains(@id,'btn_b')]")).click();
        Thread.sleep(2000);//we need to give it some sleep to load
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();//finding elements with two values class and text
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Farhad");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
