package com.syntax.Utils;
import com.syntax.TestBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class CommonMethods extends BaseClass {

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void takeScreenShot(String fileName){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("screenshot/POM/"+fileName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void printText(WebElement element){
        System.out.println("The text of this webElement is: "+element.getText());
    }

    public static void deletingEmployeefromHRMS(String str){
        Boolean found = false;
        while (!found) {
            List<WebElement> elements = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
            for (int i = 0; i < elements.size(); i++) {
                String roxtext = elements.get(i).getText();
                if (roxtext.contains(str)) {
                    System.out.println("The index nuber: " + i);
                    WebElement checkBox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + (1 + i) + "]/td/input"));
                    checkBox.click();
                    WebElement delete = driver.findElement(By.cssSelector("input.delete"));
                    delete.click();
                    driver.findElement(By.cssSelector("input.btn")).click();
                    found = true;
                    break;
                }

            }
            if (!found) {
                WebElement nxtBtn = driver.findElement(By.xpath("(//a[@class='tiptip'])[3]"));
                nxtBtn.click();
            }

        }
    }
}