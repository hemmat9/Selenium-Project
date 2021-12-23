package com.syntax.class05.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userField= driver.findElement(By.cssSelector("input#txtUsername"));
        userField.sendKeys("Admin");
        WebElement logBtn = driver.findElement(By.cssSelector("input.button"));
        logBtn.click();
        WebElement text= driver.findElement(By.cssSelector("span#spanMessage"));
        System.out.println(text.getText());
    }
}
