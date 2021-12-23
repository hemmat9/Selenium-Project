package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.getCurrentUrl();
        String url = driver.getCurrentUrl();
        System.out.println("This is the web address of facebook page: "+ url);
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.manage().window().fullscreen();
        driver.close();


    }
}