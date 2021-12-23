package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        //enable the alert
       driver.findElement(By.cssSelector("button#alert")).click();;
       Thread.sleep(2000);
      Alert simpleAlert = driver.switchTo().alert();
      simpleAlert.accept();

      //handling a confirmation alert
        driver.findElement(By.cssSelector("button#confirm")).click();
        Thread.sleep(2000);
        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        confirmationAlert.dismiss();

        driver.findElement(By.cssSelector("button#prompt")).click();
        Thread.sleep(2000);
        Alert prompAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        prompAlert.sendKeys("asfsadfsadf");
        Thread.sleep(2000);
        prompAlert.accept();

    }
}
