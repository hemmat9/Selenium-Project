package com.syntax.HomeWorkClass12.Test;

import com.syntax.HomeWorkClass12.Pages.LoginPageWithPF;
import com.syntax.HomeWorkClass12.TestBase.BaseClass;
import com.syntax.HomeWorkClass12.Utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class LoginPageTestWithPF {
    public static void main(String[] args) throws InterruptedException {

        BaseClass.openWithUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        LoginPageWithPF login = new LoginPageWithPF();
        WebElement user =login.username;
        CommonMethods.sendText(user, "Admin");
        WebElement pass = login.password;
        CommonMethods.sendText(pass, "H@nhrm123");
        login.loginbtn.click();
        CommonMethods.takeScreenShot("Login page");

    }
}
