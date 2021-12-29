package com.syntax.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Class1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/selenium/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement firstName= driver.findElement(By.xpath("//*[@name='firstName']"));
        firstName.clear();
        firstName.sendKeys("Farhad");

        WebElement lastName= driver.findElement(By.xpath("//*[@name='lastName']"));
        lastName.clear();
        lastName.sendKeys("Hemmat");

        WebElement phone = driver.findElement(By.cssSelector("input[name='phone']"));
        phone.clear();
        phone.sendKeys("54685554674");

        WebElement email = driver.findElement(By.cssSelector("input#userName"));
        email.clear();
        email.sendKeys("abc@123.com");

        WebElement address= driver.findElement(By.xpath("//*[@name='address1']"));
        address.clear();
        address.sendKeys("Karachi");

        WebElement city= driver.findElement(By.cssSelector("input[name='city']"));
        city.clear();
        city.sendKeys("Concord");

        WebElement state= driver.findElement(By.xpath("//*[@name='state']"));
        state.clear();
        state.sendKeys("Lahor");

        WebElement postalCode= driver.findElement(By.xpath("//*[@name='postalCode']"));
        postalCode.clear();
        postalCode.sendKeys("45454");

        WebElement country = driver.findElement(By.xpath("//*[@name='country']"));
        Select select = new Select(country);
        select.selectByVisibleText("UNITED STATES");

        WebElement userName = driver.findElement(By.cssSelector("input#email"));
        userName.clear();
        userName.sendKeys("Farhad123");

        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        password.clear();
        password.sendKeys("Test@123");

        WebElement confPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        confPassword.clear();
        confPassword.sendKeys("Test@123");

        WebElement submintBtn = driver.findElement(By.xpath("//input[@name='submit']"));
        submintBtn.click();

        WebElement notification = driver.findElement(By.cssSelector("td p:nth-child(2) font"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        if(notification.isDisplayed()){
            System.out.println("Task done");
        }else{
            System.out.println("work more and fix it");
        }

        driver.quit();


    }
}
