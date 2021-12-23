package com.syntax.class04.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”");
        driver.manage().window().maximize();
        WebElement login =driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input"));
        login.sendKeys("Admin");
        WebElement pass =driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
        pass.sendKeys("Hum@nhrm1");
        WebElement lgBtn=driver.findElement(By.xpath("//div[@id='divLoginButton']/child::input"));
        lgBtn.click();
        Thread.sleep(3000);
        WebElement resutl =driver.findElement(By.xpath("//div[@id='divLoginButton']/child::span"));
        System.out.println(resutl.getText());
        driver.close();



    }
}
