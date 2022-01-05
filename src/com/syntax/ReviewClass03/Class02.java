package com.syntax.ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement checkBox = driver.findElement(By.xpath("//input[@value='Option-1']"));
        if(checkBox.isSelected()){
            System.out.println("it is already selected");
        }else {
            checkBox.click();
        }
        Thread.sleep(3000);
        driver.quit();
    }
}