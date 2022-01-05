package SeleniumPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class pagination {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123", Keys.ENTER);
        driver.findElement(By.xpath("(//a[@class='firstLevelMenu'])[2]")).click();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
        //26339A
        // List<WebElement> table = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
        //locating next button
        //WebElement nxtbtn = driver.findElement(By.xpath("(//a[@class='tiptip'])[3]"));

        boolean found = false;
        while (!found) {
            List<WebElement> table = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
            for (int i = 0; i < table.size(); i++) {

                String text = table.get(i).getText();
                if (text.contains("26339A")) {
                    System.out.println(text);
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td/input"));
                    checkBox.click();
                    found = true;
                    break;
                }

            }
            if (!found) {
                WebElement nxtbtn = driver.findElement(By.xpath("(//a[@class='tiptip'])[3]"));
                nxtbtn.click();
            }

        }
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshotAs, new File("Farhad/hrms/employee.png"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

}



