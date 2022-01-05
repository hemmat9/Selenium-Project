package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //find the drop-down
       WebElement days= driver.findElement(By.cssSelector("select#select-demo"));

       //use the select class to select from dropdown
      Select select = new Select(days);
      //selecting by index
     /* select.selectByIndex(1);

      Thread.sleep(2000);

      select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByIndex(7);*/


        //select by visible text
       /* select.selectByVisibleText("Thursday");*/


        //select by value
        select.selectByValue("Wednesday");
        List<WebElement> alloptions=select.getOptions();
        int size= alloptions.size();
        System.out.println(size);

        for (int i = 0; i < size; i++) {

            String optionText= alloptions.get(i).getText();
            if(optionText.contains("Wednesday"))
            System.out.println(optionText);
        }

    }
}
