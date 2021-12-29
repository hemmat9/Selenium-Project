package com.syntax.class09.HomeWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Task2 {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement userName = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.cssSelector("input#ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement logIn = driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button"));
        logIn.click();
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        for (int i = 1; i < rows.size(); i++) {

            String text = rows.get(i).getText();

            if (text.contains("MyMoney") && text.contains("US")) {
                List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
                checkBoxes.get(i - 1).click();
            }
        }
        driver.findElement(By.cssSelector("input#ctl00_MainContent_btnDelete")).click();
    }
    }
