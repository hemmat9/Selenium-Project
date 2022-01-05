package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class paginationPractice {
    public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //print the row that contains the student name "Archy J"
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        WebElement nxtBtn = driver.findElement(By.xpath("//a[@class='next_link']"));

        boolean found = false;
        while (!found) {
            for (WebElement table : tableRows) {
                String str = table.getText();
                if (str.contains("Archy J")) {
                    System.out.println(str);
                    found = true;
                    break;
                }
            }
            if (!found)
                nxtBtn.click();
        }
    }
}
