package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
       WebElement singleCheckbox =driver.findElement(By.xpath("//*[@id='isAgeSelected']"));
       singleCheckbox.click();
       Thread.sleep(2000);
       singleCheckbox.click();

       //check all the text boxes.
// select a xpath that has common attribute value for all the checkboxes.
        List<WebElement> checkBoxes =driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //print the size
        int size= checkBoxes.size();
        System.out.println("The total number of checkboxes: "+size);
        for (WebElement checkBox:checkBoxes) {
            String valueofAttribute = checkBox.getAttribute("value");
            if (valueofAttribute.equalsIgnoreCase("Option-3")) {//we can use the method contains too
                //click on the check box whose value is option-3
                checkBox.click();

            }
        }
    }
}
