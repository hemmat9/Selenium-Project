package com.syntax.HomeWorkClass12.Pages;

import com.syntax.HomeWorkClass12.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends CommonMethods {

    @FindBy (id="txtUsername")
    public WebElement username;
    @FindBy (id="txtPassword")
    public WebElement password;
    @FindBy (id="btnLogin")
    public WebElement loginbtn;
    @FindBy(xpath = "//a[text()='Welcome Admin']")
    public WebElement welcomeAdm;

    public DashBoardPage(){
        PageFactory.initElements(driver, this);

    }
}

