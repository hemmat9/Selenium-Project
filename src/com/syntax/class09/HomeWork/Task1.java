package com.syntax.class09.HomeWork;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Task1 {

    public static String url="https://chercher.tech/practice/explicit-wait";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement btn = driver.findElement(By.cssSelector("button#alert"));
        btn.click();
        WebDriverWait wait = new WebDriverWait(driver, 12);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert simpleAlert= driver.switchTo().alert();
        simpleAlert.accept();

        WebElement btn2=  driver.findElement(By.cssSelector("button#display-other-button"));
        btn2.click();
        System.out.println(btn2.isEnabled());


    }
}
