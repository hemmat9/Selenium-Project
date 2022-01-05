package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class tablesWithPagination {
    public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //print the row that contains the student name "Archy J"
        //     1. locate the table rows using xpath

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        //     1.2 locate the next button on the table
        WebElement nxtBtn = driver.findElement(By.xpath("//a[@class='next_link']"));

        //2. Iterate over the list and see if the desired row is there or not

        boolean found=false;
        while (!found) {
            for (WebElement tablerow : tableRows) {

                String textOfRow = tablerow.getText();
                if (textOfRow.contains("Archy J")) {
                    System.out.println(textOfRow);
                    found=true;
                    break;
                }
            }
            if(!found){
                nxtBtn.click();

            }
        }
    }
}