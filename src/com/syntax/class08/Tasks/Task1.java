package com.syntax.class08.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement btn = driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        btn.click();
        Set<String> allHandles = driver.getWindowHandles();

        Iterator<String> it = allHandles.iterator();
        while (it.hasNext()) {
            String title = it.next();
            driver.switchTo().window(title);
            if (title.contains("Instagram login")) {

            }

        }
        System.out.println(driver.getTitle());

    }
}
