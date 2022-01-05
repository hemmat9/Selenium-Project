package com.syntax.class12.Utils;

import com.syntax.class12.TestBase.BaseClass;
import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass {

    /**
    *sends text to a given Element
     * @param element ---> webElement
     * @param text ----> the text that you want to send
     */

    public static void sendText(WebElement element, String text){

        element.clear();
        element.sendKeys(text);

    }

    public void switchToFrame(int index){

        driver.switchTo().frame(index);
    }
}
