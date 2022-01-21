package com.syntax.HomeWorkClass12.Pages;

import com.syntax.HomeWorkClass12.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPF extends CommonMethods {

@FindBy (id="txtUsername")
    public WebElement username;
@FindBy (id="txtPassword")
    public WebElement password;
@FindBy (id="btnLogin")
    public WebElement loginbtn;


public LoginPageWithPF(){

    PageFactory.initElements(driver,this);

    }
}
