package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();


        WebElement parentFrame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(parentFrame);

        WebElement childFrame= driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(childFrame);

        WebElement childFrameText= driver.findElement(By.xpath("//p[text()='Child Iframe']"));

        System.out.println("The text in ChildFrame is: "+childFrameText.getText());


    }
}
