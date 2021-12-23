package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class MultipleSelectDD {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

       WebElement satetsDD = driver.findElement(By.cssSelector("select#multi-select"));

       Select select = new Select(satetsDD);
//      check if the dropdown is mutliple
       boolean ismult= select.isMultiple();
        System.out.println(ismult);

        select.selectByIndex(2);
        select.selectByVisibleText("Texas");
        Thread.sleep(2000);
        select.selectByValue("Ohio");
        Thread.sleep(2000);
        select.deselectByIndex(2);
        select.deselectByVisibleText("Texas");


        // use Iterator to get all the option text and print it in the console
        List<WebElement> options = select.getOptions();
       Iterator <WebElement> iterator = select.getOptions().iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next().getText());

           }
       }
}

