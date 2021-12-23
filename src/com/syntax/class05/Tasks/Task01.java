package com.syntax.class05.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (WebElement link : links) {
            String linkText = link.getText();
            if (!linkText.isEmpty()) {
                System.out.println(linkText);

                String linkAddress = link.getAttribute("href");
                System.out.println(linkAddress);
                System.out.println("--------------------------------");
            }

        }

    }


}

