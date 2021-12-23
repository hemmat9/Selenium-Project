package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg'][@onclick='myConfirmFunction()']")).click();
        Alert confAlert = driver.switchTo().alert();
        System.out.println(confAlert.getText());
        confAlert.accept();
        driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg'][@onclick='myPromptFunction()']")).click();
        Alert prompAlert = driver.switchTo().alert();
        prompAlert.sendKeys("Farhad");
        Thread.sleep(2000);
        prompAlert.accept();
        driver.close();

    }
}
