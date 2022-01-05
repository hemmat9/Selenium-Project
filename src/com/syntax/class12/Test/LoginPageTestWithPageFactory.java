package com.syntax.class12.Test;

import com.syntax.class12.Pages.LoginPageWithPageFactory;
import com.syntax.class12.TestBase.BaseClass;

public class LoginPageTestWithPageFactory {
    public static void main(String[] args) throws InterruptedException {

//      open the browser
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

//      create an object of loginwithpageFactory

        LoginPageWithPageFactory loginWPG = new LoginPageWithPageFactory();
        loginWPG.username.sendKeys("Admin");
        loginWPG.password.sendKeys("Hum@nhrm123");
        loginWPG.loginBtn.click();
        Thread.sleep(2000);
        BaseClass.tearDown();
    }
}
