package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchingBrowser {

    public static void main(String[] args) {
        //WebDriver driver = new WebDriver(); we can not do that coz WebDriver is an interface and we can not create objects of and interface
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");//only windows user should specify .exe, not mac users
        WebDriver driver = new FirefoxDriver();//WebDriver is an interface//ChromeDriver extends RemoteWebDriver

        driver.get("https://www.google.com");// we have to type the address of the website or URL, calling a get method to get to a particular website
        driver.getCurrentUrl(); // this method returns the URL of this web browser
        String url= driver.getCurrentUrl();//returns the current url in the browser
        System.out.println("The current URL loaded in browser is : "+ url);
        driver.getTitle();//this method returns the title of the page
        String title=  driver.getTitle();
        System.out.println("The current title of the page is : " +title);
        driver.close();

    }
}
