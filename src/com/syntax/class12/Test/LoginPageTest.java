package com.syntax.class12.Test;

import com.syntax.class12.Pages.LoginPage;
import com.syntax.class12.TestBase.BaseClass;
import com.syntax.class12.Utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class LoginPageTest {

    public static void main(String[] args) {
        //open the browser and navigate to
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //locate the elements and sending keys

        LoginPage loginPage = new LoginPage();
        /*loginPage.userNameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginBtn.click();*/
        WebElement username = loginPage.userNameField;
        CommonMethods.sendText(username, "Admin");//how to use the sendText method we created


    }
}
