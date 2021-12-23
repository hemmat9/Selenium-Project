package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        WebElement frame1 =driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        WebElement frame2 =driver.findElement(By.xpath("//a[text()=' Like us On Facebook ']"));
        frame1.click();
        frame2.click();
        System.out.println(driver.getWindowHandles().size());
        Set<String> handels= driver.getWindowHandles();
        Iterator<String> iterator = handels.iterator();
        String instagramHandle=iterator.next();
        String facebookHandle=iterator.next();

        System.out.println(instagramHandle);
        System.out.println(facebookHandle);

    }
}
