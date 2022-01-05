package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class B {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList")).click();
        //List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
        //WebElement nextBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]")); //next Button
        //18315

        boolean found=false;
        while(!found){
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
        for (int i = 0; i < tableRows.size(); i++) {

            String txt= tableRows.get(i).getText();
            if(txt.contains("18315")){
                System.out.println(txt);
                found=true;
                break;
            }

        }
        if(!found){
            WebElement nextBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
        nextBtn.click();
    }
}}}