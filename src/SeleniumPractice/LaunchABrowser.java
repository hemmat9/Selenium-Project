package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchABrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys("farhad.hemmat9@gmail.com");
        driver.findElement(By.cssSelector("input#continue")).click();
        driver.findElement(By.cssSelector("input#ap_password")).sendKeys("");
        driver.findElement(By.cssSelector("input#signInSubmit")).click();
        WebElement dropDown= driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
        dropDown.click();
        Select select = new Select(dropDown);
        select.selectByVisibleText("Computers");
        //driver.quit();

    }
}