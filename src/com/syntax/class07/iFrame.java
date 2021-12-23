package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();//if we have to locate a frame we must use the switchTo() to turn the focus of selenium onto the frames located inside the webpage.
        //switch to frame1
        driver.switchTo().frame("frame1");
        //locate the element
        WebElement text1=  driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is : "+ text1.getText());

        driver.switchTo().defaultContent();//if we are locating next frame we have to switch the focus to the main webpage as frame 2 doesn't lie inside fram1.

        //swith to frame 2
        driver.switchTo().frame("frame2");
        //locate the element
        WebElement text2=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is : " + text2.getText());

        //if we want to locate any other element on the main page we have to switch the focus to default.
        driver.switchTo().defaultContent();

    }
}
