package com.syntax.class05.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        WebElement createAcct =  driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAcct.click();
        Thread.sleep(2000);
        WebElement fName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
        fName.sendKeys("Farhad");
        WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lName.sendKeys("Hemmat");
        WebElement emailAdd = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        emailAdd.sendKeys("farhad.hemmat9@gmail.com");
        WebElement reEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        reEmail.sendKeys("farhad.hemmat9@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("input#password_step_input"));
        password.sendKeys("Far@123456");
        WebElement months = driver.findElement(By.cssSelector("select#month"));
        Select select = new Select(months);
        select.selectByVisibleText("Sep");
        WebElement day = driver.findElement(By.cssSelector("select#day"));
        Select select1 = new Select(day);
        select1.selectByValue("9");
        WebElement year = driver.findElement(By.cssSelector("select#year"));
        Select select2 = new Select(year);
        select2.selectByValue("1988");
        WebElement sex = driver.findElement(By.xpath("//input[@value='2']"));
        sex.click();
        WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign Up'][@name='websubmit']"));
        Thread.sleep(3000);
        signUp.click();


    }
}
