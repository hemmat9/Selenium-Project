package com.syntax.HomeWorkClass12.Test;

import com.syntax.HomeWorkClass12.Pages.DashBoardPage;
import com.syntax.HomeWorkClass12.Pages.LoginPageWithPF;
import com.syntax.HomeWorkClass12.TestBase.BaseClass;
import com.syntax.HomeWorkClass12.Utils.CommonMethods;

public class DashBoardPageTest {
    public static void main(String[] args) throws InterruptedException {

        BaseClass.openWithUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        DashBoardPage boardPage = new DashBoardPage();
        boardPage.username.sendKeys("Admin");
        boardPage.password.sendKeys("Hum@nhrm123");
        boardPage.loginbtn.click();
        CommonMethods.printText(boardPage.welcomeAdm);
        Thread.sleep(2000);
        BaseClass.tearDown();
    }
}
