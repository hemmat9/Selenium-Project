package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.facebook.com");
        webDriver.manage().window().maximize();
         /* id, name, tagname, classname, linktext, partiallinktext, xpath, css */
        /*webDriver.findElement(By.id("email")).sendKeys("farhad.hemmat9@gmail.com");
        webDriver.findElement(By.name("pass")).sendKeys("Far12345");
        Thread.sleep(2000);
        webDriver.findElement(By.name("login")).click();
        webDriver.close();*/
       /* webDriver.findElement(By.linkText("Create new account")).click();*/
        webDriver.findElement(By.partialLinkText("Forgot")).click();








    }
}
