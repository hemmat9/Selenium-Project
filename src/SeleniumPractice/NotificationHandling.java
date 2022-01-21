package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class faceBookAccount {
    public static String URL = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();//this is how to block the notifications
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);//we need to pass the varible into the paramenter here

        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input#email")).sendKeys("9254355605");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("FhSe@KA011988", Keys.ENTER);

    }
}
