package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
        WebElement textbox =driver.findElement(By.cssSelector("input#sum1"));
        textbox.sendKeys("11");
        driver.findElement(By.cssSelector("input#sum2")).sendKeys("15");
        driver.findElement(By.cssSelector("button[onclick$='total()'")).click();
        Thread.sleep(3000);
        WebElement result =driver.findElement(By.cssSelector("span#displayvalue"));

        System.out.println(result.getText());
    }
}
