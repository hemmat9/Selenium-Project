package com.syntax.ReviewClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class class01 {
    public static String url="https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //click on the facebook to open up a new facebook tab/ window
        WebElement fb = driver.findElement(By.xpath("//a[text()='Terms']"));
        fb.click();
        String mainPageHandle = driver.getWindowHandle();
        System.out.println("The handle for current page is : "+mainPageHandle);
        Set<String> allHandles = driver.getWindowHandles();

        Iterator<String> it = allHandles.iterator();
        while(it.hasNext()){
            String hanlde = it.next();
            driver.switchTo().window(hanlde);

            if(driver.getCurrentUrl().equalsIgnoreCase("Privacy & Terms")){
                System.out.println(driver.getTitle());
                break;
            }
        }
        driver.findElement(By.xpath("(//a[text()='Overview'])[1]")).click();
        driver.switchTo().defaultContent();



        }
    }

