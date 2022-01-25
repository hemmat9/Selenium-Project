package com.syntax.Test;

import com.syntax.Pages.DashBoardPage;
import com.syntax.Pages.LoginPageWithPF;
import com.syntax.TestBase.BaseClass;
import com.syntax.Utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class DashBoardPageTest {
    public static void main(String[] args) throws InterruptedException {

        BaseClass.openWithUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPageWithPF login = new LoginPageWithPF();
        WebElement user = login.username;
        CommonMethods.sendText(user, "Admin");
        WebElement pass = login.password;
        CommonMethods.sendText(pass, "Hum@nhrm123");
        login.loginbtn.click();

        DashBoardPage dashBoardPage = new DashBoardPage();
        WebElement message = dashBoardPage.welcomeAdm;
        CommonMethods.printText(message);
        CommonMethods.takeScreenShot("Dash board");
        Thread.sleep(2000);
        BaseClass.tearDown();
    }
}
