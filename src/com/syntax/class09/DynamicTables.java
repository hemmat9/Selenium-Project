package com.syntax.class09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {

    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //get all the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

        for (int i = 1; i < rows.size(); i++) {//it is better to use the simple forloop here

            String rowText = rows.get(i).getText();
            System.out.println(rowText);

            //

            if (rowText.contains("ScreenSaver")) {

               List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
                checkboxes.get(i-1).click();


            }
        }

    }

}