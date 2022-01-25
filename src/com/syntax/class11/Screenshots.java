package com.syntax.class11;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshots {

    public void takeScreenshot(WebDriver driver, String filePath){

        TakesScreenshot tss = ((TakesScreenshot)driver);

        File sourceFile = tss.getScreenshotAs(OutputType.FILE);

        try{
            FileUtils.copyFile(sourceFile , new File(filePath));

        }catch(IOException e){

            e.printStackTrace();

        }
    }

}