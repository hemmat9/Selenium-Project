package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Amazon {
    public static String URL = "https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement helpWin = driver.findElement(By.xpath("//a[text()='Help']"));
        helpWin.click();
        WebElement privacyWin = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyWin.click();
        WebElement termWin = driver.findElement(By.xpath("//a[text()='Terms']"));
        termWin.click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("The size of window handles are : "+windowHandles.size());

        Iterator<String> iterator = driver.getWindowHandles().iterator();
        while(iterator.hasNext()){
        String next = iterator.next();
        driver.switchTo().window(next);

        String title = driver.getTitle();
        if(title.contains("Google Terms of Service")) {
            driver.switchTo();
            System.out.println(title);
            break;
        }
    }
      /* String singUpPage =  iterator.next();
       String helpPage =  iterator.next();
       String privacyPage = iterator.next();
       String termsPage = iterator.next();

        System.out.println("The handle for page singUpPage  : "+singUpPage);
        System.out.println("The handle for page helpPage    : "+helpPage);
        System.out.println("The handle for page privacyPage : "+privacyPage);
        System.out.println("The handle for page termsPage   : "+termsPage);

        driver.switchTo().window(helpPage);
        System.out.println(driver.getTitle());*/ //Switching to windows this way is not possible because window handles keep changing


}
}

