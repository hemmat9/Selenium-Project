package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com/");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));//findElement(s) as we have multiple with a tag that is why we have to use findElements.
        //as there are multiple elements so we have to store it in list of WebElements.
        System.out.println("The size of list : " + links.size());

        for (WebElement link : links) {

            String linkText = link.getText();
            if (!linkText.isEmpty()) {//to print those links which are not empty

                System.out.println(linkText);//why there are spaces between links in the console, because there are lots of Webelemnts without text.

                //to print the text with the links, then we have to use the method .getAttribute to have the value of a particuler in the tag

              String linkAddress=  link.getAttribute("href");
                System.out.println(linkAddress);


                System.out.println("-----------------------------------------");
            }

        }
    }
}