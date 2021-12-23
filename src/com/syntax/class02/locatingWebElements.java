package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingWebElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
       driver.findElement(By.id("email")).sendKeys("farhad.hemmat@yahoo.com"); // here the locator is id
       // driver.findElement(By.name("email")).sendKeys("9254355605"); //we can locate by any locator here the locator is name
        driver.findElement(By.name("pass")).sendKeys("fasfadf");
        //driver.findElement(By.name("login")).click();
        //driver.findElement(By.linkText("Forgot password?")).click();
        //driver.findElement(By.partialLinkText("Forgotten")).click();//gives me error??????????? i should use forgot word





    }

}
