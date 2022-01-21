package com.syntax.HomeWorkClass12.Pages;

import com.syntax.HomeWorkClass12.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends CommonMethods {

    @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement employeeName;
    @FindBy (xpath = "(//input[@type='button'])[3]")
    public WebElement searchbtn;


    public AdminPage(){

        PageFactory.initElements(driver, this);
    }

}
