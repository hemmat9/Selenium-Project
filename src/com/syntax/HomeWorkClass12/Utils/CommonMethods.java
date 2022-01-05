package com.syntax.HomeWorkClass12.Utils;

import com.syntax.HomeWorkClass12.TestBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void takeScreenShot(){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("screenshot/SyntaxHRMS/adminlogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void printText(WebElement element){
        System.out.println("The text of this webElement is: "+element.getText());
    }
}