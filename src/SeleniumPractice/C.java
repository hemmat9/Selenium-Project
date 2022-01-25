package SeleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class C {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
    public static WebDriver driver;

    public static void main(String[] args) {//find this employee 26287A, and delete it
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123", Keys.ENTER);
        driver.findElement(By.xpath("(//a[@class='firstLevelMenu'])[2]")).click();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();


        Boolean found = false;
        while (!found) {
            List<WebElement> elements = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
            for (int i = 0; i < elements.size(); i++) {
                String roxtext = elements.get(i).getText();
                if (roxtext.contains("26287A")) {
                    System.out.println("The index nuber: " + i);
                    WebElement checkBox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + (1 + i) + "]/td/input"));
                    checkBox.click();
                    WebElement delete = driver.findElement(By.cssSelector("input.delete"));
                    delete.click();
                    driver.findElement(By.cssSelector("input.btn")).click();
                    found = true;
                    break;
                }

            }
            if (!found) {
                WebElement nxtBtn = driver.findElement(By.xpath("(//a[@class='tiptip'])[3]"));
                nxtBtn.click();
            }

        }
    }
}