package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femaleRadioButton =driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        //femaleRadioButton.click();

        //check if the radio button is displayed or not?
        boolean isDisplayed =femaleRadioButton.isDisplayed();
        System.out.println("The Female radio is displayed on the webPage: "+isDisplayed);

        //check if the radio button is enabled
        boolean isEnabled= femaleRadioButton.isEnabled();
        System.out.println("The Female radio button is enabled on the WebPage: " + isEnabled);

        //check the female button is selected
        boolean isSelected =  femaleRadioButton.isSelected();
        System.out.println("The female radio button is selected: "+ isSelected);

        //select the female button only if it is Enabled
        if(isEnabled){
            femaleRadioButton.click();
        }
        isSelected=femaleRadioButton.isSelected();
        System.out.println("The female radio button is selected: "+ isSelected);

        driver.close();

    }
}
