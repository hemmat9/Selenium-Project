package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();

        //declare a implicite wait for finding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement getNewUser=driver.findElement(By.cssSelector("button#save"));
        getNewUser.click();
        //get user first name
        WebElement fName= driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        System.out.println(fName.getText());
    }
}