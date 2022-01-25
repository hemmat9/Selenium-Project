package com.syntax.ReviewClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Deleting {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

//        login code     username:Admin  password :Hum@nhrm123
//        for username
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");

//        for password
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");

//        for login btn
        WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
//        click login btn
        loginBtn.click();

//        click on PIM
        WebElement PIM = driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        PIM.click();
//        click on EmployeeList
        WebElement EmployeeList = driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList"));
        EmployeeList.click();


        //iterate
        boolean notFound = true;
        while (notFound) {
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i < rows.size(); i++) {
                String rowtext = rows.get(i).getText();
                if (rowtext.contains("25677A")) {
                    System.out.println("index of this id : " + i);
                    WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td/input"));
                    checkbox.click();
                    WebElement delete = driver.findElement(By.xpath("//input[@class='delete']"));
                    delete.click();
                    notFound = false;
                    break;
                }
            }
            if (notFound) {
                WebElement nxtBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nxtBtn.click();
            }
        }
    }


}


