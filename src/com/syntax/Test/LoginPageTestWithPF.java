package com.syntax.Test;

import com.syntax.Pages.LoginPageWithPF;
import com.syntax.TestBase.BaseClass;
import com.syntax.Utils.CommonMethods;
import com.syntax.TestBase.BaseClass;
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
