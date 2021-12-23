package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        // task is to open up a newtab and a new window
        // switch to new tab and get the text

        //find button new tab
        WebElement newTab = driver.findElement(By.cssSelector("button#tabButton"));

        //find new window button
        WebElement newWindow = driver.findElement(By.cssSelector("button#windowButton"));

        //click on the newtab and window btn
        newWindow.click();
        newTab.click();

        // print the handle of the main page/home page/parent page
        // getwindowHandle returns us the handle of current window so no sets
        String parentHandle = driver.getWindowHandle();
        System.out.println("parent window handle: " + parentHandle);

        // to switch to newtab and get the text
        // 1. get all handles
        Set<String> allHandles = driver.getWindowHandles();

        // 2.find the desried handle i.e of newtab by iterating through the set
        Iterator<String> it = allHandles.iterator();
        // 3.iterating over each handle to see if it is the desried one

        while (it.hasNext()) {
            String handler = it.next();
            driver.switchTo().window(handler);
            // now get the currentURL and check if it is the desired tab or not
            if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {

                System.out.println("The Url for new tab is " + driver.getCurrentUrl());
                break;
            }

            }
        // succesful switch

        WebElement text = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());

        // click on new window message button

        // driver.switchTo().defaultContent();
        driver.switchTo().window(parentHandle);
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();

        driver.quit();
    }
    }
