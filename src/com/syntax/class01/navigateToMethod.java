package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateToMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);//if it is red then click on the bulb and selet the "interruptedException"
        driver.navigate().to("http://www.amazon.com");//first the navigater goes to facebook.com then it goes to Amazon.com, it lets you to go forward and backward
        Thread.sleep(2000);//this static method is delaying the process
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close();//difference between close and quit: closes the current tab, quits the whole browser



    }

}
