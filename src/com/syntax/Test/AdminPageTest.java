package com.syntax.HomeWorkClass12.Test;

import com.syntax.HomeWorkClass12.Pages.AdminPage;
import com.syntax.HomeWorkClass12.Pages.DashBoardPage;
import com.syntax.HomeWorkClass12.Pages.LoginPageWithPF;
import com.syntax.HomeWorkClass12.TestBase.BaseClass;
import com.syntax.HomeWorkClass12.Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPageTest {

    public static void main(String[] args) {
        BaseClass.openWithUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPageWithPF loginPageWithPF = new LoginPageWithPF();
        WebElement user = loginPageWithPF.username;
        CommonMethods.sendText(user, "Admin");
        WebElement pass = loginPageWithPF.password;
        CommonMethods.sendText(pass, "Hum@nhrm123");
        WebElement loginbtn = loginPageWithPF.loginbtn;
        loginbtn.click();

        DashBoardPage dashBoardPage = new DashBoardPage();
        WebElement adminbtn = dashBoardPage.adminbtn;
        adminbtn.click();

        AdminPage adminPage = new AdminPage();
        WebElement employee = adminPage.employeeName;
        CommonMethods.sendText(employee, "coco5555");
        WebElement search = adminPage.searchbtn;
        search.click();
        CommonMethods.takeScreenShot("Admin Employee");


    }



}
