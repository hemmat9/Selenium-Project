package com.syntax.class12.Pages;

import com.syntax.class12.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement username;
    @FindBy (id="txtPassword")
    public WebElement password;
    @FindBy (id="btnLogin")
    public WebElement loginBtn;



    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }


}
