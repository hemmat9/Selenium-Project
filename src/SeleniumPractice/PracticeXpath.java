package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("asdklfjask;ldfjskla;dfj");


        //identifying by attribute
        //syntax: //tagname[@attribute='abttribute value']

        //identifying by text
        //syntax: //tagname[text()='the text']
    }
}
