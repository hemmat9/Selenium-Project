package com.syntax.class12.Pages;

import com.syntax.class12.Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {


   public WebElement userNameField = driver.findElement(By.xpath("//*[@name='txtUsername']"));
   public WebElement passwordField =driver.findElement(By.xpath("//*[@name='txtPassword']"));
   public WebElement loginBtn =  driver.findElement(By.xpath("//input[@name='Submit']"));

}
