package com.syntax.HomeWorkClass12.Pages;

import com.syntax.HomeWorkClass12.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends CommonMethods {


    @FindBy(xpath = "//a[text()='Welcome Admin']")
    public WebElement welcomeAdm;

    @FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
    public WebElement adminbtn;

    public DashBoardPage(){
        PageFactory.initElements(driver, this);

    }
}

