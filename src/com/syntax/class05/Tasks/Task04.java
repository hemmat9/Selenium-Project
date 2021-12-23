package com.syntax.class05.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class Task04 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ebay.com/");
        Thread.sleep(3000);
        WebElement  gateg =driver.findElement(By.cssSelector("select#gh-cat"));
        gateg.click();
        System.out.println(gateg.getSize());
        List<WebElement> gatagory=driver.findElements(By.xpath("//option[@value]"));

        for (WebElement gatagories:gatagory) {
            String str =gatagories.getText();
            System.out.println(str);
        }
        WebElement comptabts = driver.findElement(By.xpath("//*[@id='gh-cat']/option[12]"));
        comptabts.click();
        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.click();
        System.out.println(driver.getTitle());
        driver.quit();










    }
}
